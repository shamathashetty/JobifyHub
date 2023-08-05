package com.project.joblisting.repository;

import com.mongodb.client.MongoClient;
import com.project.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.bson.Document;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.AggregateIterable;


@Component
public class SearchRepositoryImpemetation implements SearchRepository {
    @Autowired
    MongoClient client;

    @Autowired

    MongoConverter converter;

    public List<Post> findByText(String text) {
        final List<Post> posts =new ArrayList<>();
        MongoDatabase database = client.getDatabase("Myproject");
        MongoCollection<Document> collection = database.getCollection("Myproject");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
        new Document("index", "default")
                .append("text", new Document("query", text)
                                                .append("path", Arrays.asList("desc", "techs")))),
                new Document("$sort", new Document("exp", -1L))));

        result.forEach(doc -> posts.add(converter.read(Post.class,doc)));
        return posts;
    }
}
