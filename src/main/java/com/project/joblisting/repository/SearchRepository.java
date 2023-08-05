package com.project.joblisting.repository;

import com.project.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);

}
