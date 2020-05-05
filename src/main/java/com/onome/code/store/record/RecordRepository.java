package com.onome.code.store.record;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends MongoRepository<Record,String> {

	@Query("{username:?0}")
	 List<Record> findByUsername(String username);
	
	@Query("{store:?0}")
	 List<Record> findByStore(String store);
}
