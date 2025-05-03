package com.barath.joblisting.repository;

import com.barath.joblisting.model.Post;
import java.util.List;

public interface SearchRepositoryCustom {
    List<Post> findByText(String text);
}
