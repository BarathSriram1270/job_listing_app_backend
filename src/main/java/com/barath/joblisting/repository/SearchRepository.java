package com.barath.joblisting.repository;

import com.barath.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRepository extends MongoRepository<Post, String>, SearchRepositoryCustom {
    // keep it clean here; move findByText to custom interface
}
