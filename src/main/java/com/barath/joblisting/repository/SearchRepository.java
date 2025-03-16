package com.barath.joblisting.repository;

import java.util.List;

import com.barath.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
