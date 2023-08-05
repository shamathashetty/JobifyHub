package com.project.joblisting.repository;
import com.project.joblisting.model.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
//to fetch the data
public interface PostRepository extends MongoRepository<Post,String> {


}
