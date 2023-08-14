package com.mongodb.repository;

import com.mongodb.entitiy.User;
import org.springframework.data.mongodb.repository.MongoRepository;
//Spring 2.0 dan sonra @Repository annatation u kullanmaya gerek kalmadı.
public interface UserRepository extends MongoRepository<User,String> {
     User getUserById(String id);
     User removeById(String id);
     void deleteAllBy();

}
