package com.bbva.i18n;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HelloRepository extends MongoRepository<Hello, String>{

	public Hello findByLang(String lang);
}
