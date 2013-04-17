package au.com.leicon.core;

import au.com.leicon.core.services.cache.CacheService;

import au.com.leicon.core.services.cache.coherence.CoherenceCacheServiceImpl;

import java.util.Date;

public class TestCacheService {
    
    private static CacheService cacheService = new CoherenceCacheServiceImpl("ESS_CACHE", 10);
    
    public TestCacheService() {
        super();
    }
    
    public void print () {
        for (int i = 0; i < 10; i++) {
            System.out.println ("\n" + System.currentTimeMillis());
            Object retObjec = getCacheService().get("ichan");
            
            System.out.println ("DEBUG1: retObjec:" + retObjec);
            if (null == retObjec) {
                System.out.println ("DEBUG2.1: Object Value is NULL");
                // go for web service
                retObjec  = "Ivan Chan";
                System.out.println ("DEBUG2.2: Going for WebService Call");
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println ("DEBUG2.3: Putting value into Cache");
                getCacheService().put("ichan", retObjec);
            }
        }
    }
    
    public static void main (String [] args) {
        System.out.println ("START");
        
        TestCacheService abc = new TestCacheService ();
        abc.print();
        
        System.out.println ("END");
    }

    public static CacheService getCacheService() {
        return cacheService;
    }
}
