package com.barath.joblisting.repository;

import com.barath.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface SearchRepository extends MongoRepository<Post, String> {

    @Query("{ '$text': { '$search': ?0 } }")
    List<Post> findByText(String text);
}
