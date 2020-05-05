package com.onome.code.config;
/*
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import net.sf.ehcache.config.CacheConfiguration;

@Configuration
@EnableCaching
public class APIConfig extends CachingConfigurerSupport {
	
	
/*@Bean
public APIFilter aPIFilter() {
	return new APIFilter();
}

 @Bean	
 public net.sf.ehcache.CacheManager ehCacheManager(){
	CacheConfiguration recordCache = new CacheConfiguration();
    recordCache.setName("record-cache");
	recordCache.setMemoryStoreEvictionPolicy("LRU");
	recordCache.setMaxEntriesLocalHeap(1000);
	recordCache.setTimeToLiveSeconds(120);
	
	CacheConfiguration userCache = new CacheConfiguration();
    recordCache.setName("user-cache");
	recordCache.setMemoryStoreEvictionPolicy("LRU");
	recordCache.setMaxEntriesLocalHeap(1000);
	recordCache.setTimeToLiveSeconds(360);
	
	net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
	config.addCache(recordCache);
	config.addCache(userCache);
	return net.sf.ehcache.CacheManager.newInstance(config);
 }
 
 @Bean
 @Override
 public CacheManager cacheManager() {
	return new EhCacheCacheManager(ehCacheManager());
	}


}*/
