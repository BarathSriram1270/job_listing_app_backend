package com.barath.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.barath.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}
