package com.ellenmateus.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ellenmateus.workshopmongo.domain.Post;
import com.ellenmateus.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	

	
	
}

