// Package Information
package au.com.leicon.core.services.cache;

// J2EE specific Import Information
import java.io.Serializable;

/**
 * Cache Service Interface
 * 
 * @author paz.periasamy
 */
public interface CacheService extends Serializable {

    /**
     * Remove specific entry from specific cache.
     * @param entryKey containing the Entry Key
     */
    public void removeEntry (Object entryKey);

    /**
     * Determines if a specific entry exists in specific cache.
     * @param entryKey containing the Entry Key
     * @return boolean true if the object associated with that key exists in the
     *         cache, false otherwise.
     */
    public boolean contains (Object entryKey);

    /**
     * Retrieve an entry in the Cache. Returns null if the entry does not exist
     * or has expired or if the cache is not enabled. Otherwise, it returns the
     * Value associated with the key and moves the entry to the top of the LRU
     * list (making it the most recently used object.
     * 
     * @param key -
     *            The key of a key/value pair to check for existence in the
     *            cache.
     * @return Object the value of the key/value pair asslciated with the key,
     *         or null if the entry does not exist or has expired.
     */
    public Object get (Object key);

    /**
     * Method to get all the Cache keys stored in the caches
     * 
     * @return Object [] containing the Object array of cache keys
     */
    public Object[] getKeys ();

    /**
     * Put a value into the cache. Neither the key nor the value can be null
     * 
     * @param key -
     *            key of the entry to create
     * @param value -
     *            the value to associate with the key
     * @return Object the previous value for the key
     */
    public Object put (Object key, Object value);

    /**
     * Size of the cache. This returns the size of the internal map. This may or
     * may not match the size of the collection returned from the values method.
     * The values method will strip out all expired values.
     * 
     * @return int The number of entries in the cache
     */
    public int size ();
    
    /**
     * Method to Initialize Cache
     */
    public void initCache();

    /**
     * Method to destory cache
     */
    public void destroyCache();


}

