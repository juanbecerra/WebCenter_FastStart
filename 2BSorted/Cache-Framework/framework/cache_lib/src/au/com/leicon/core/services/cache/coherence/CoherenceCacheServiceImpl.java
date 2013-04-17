package au.com.leicon.core.services.cache.coherence;

import au.com.leicon.core.services.cache.CacheService;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class CoherenceCacheServiceImpl implements CacheService {

    @SuppressWarnings("compatibility:-3123171296804492046")
    private static final long serialVersionUID = 1L;
    
    private String cacheName = null;
    
    private long timeToLiveInMilliSecconds = 300000; // Default 5 minutes
    
    private NamedCache cache = null;
    
    private boolean inited = false;

    public CoherenceCacheServiceImpl(String cacheName, long timeToLiveInMilliSecconds) {
        this.cacheName = cacheName;
        this.timeToLiveInMilliSecconds = timeToLiveInMilliSecconds;
        initCache();
    }

    public void removeEntry(Object entryKey) {
        getCache().remove(entryKey);
    }

    public boolean contains(Object entryKey) {
        return getCache().containsKey(entryKey);
    }

    public Object get(Object key) {
        return getCache().get(key);
    }

    public Object[] getKeys() {
        return getCache().keySet().toArray();
    }

    public Object put(Object key, Object value) {
        return getCache().put(key, value, getTimeToLiveInMilliSecconds ());
    }

    public int size() {
        return getCache().size();
    }

    public void initCache() {
        if (!isInited()) {
            cache = CacheFactory.getCache (getCacheName());
            inited = true;
        }
    }

    public void destroyCache() {
        getCache().release ();
        getCache ().destroy ();        
    }

    public String getCacheName() {
        return cacheName;
    }

    public boolean isInited() {
        return inited;
    }

    public NamedCache getCache() {
        return cache;
    }

    public long getTimeToLiveInMilliSecconds() {
        return timeToLiveInMilliSecconds;
    }
}
