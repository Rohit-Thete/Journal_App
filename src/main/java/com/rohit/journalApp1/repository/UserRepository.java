package com.rohit.journalApp1.repository;

import com.rohit.journalApp1.entity.JournalEntry;
import com.rohit.journalApp1.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);
}
