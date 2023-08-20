package com.cisco.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.userservice.entities.User;

public interface UserRepository extends JpaRepository<User,String>
{
    //if you want to implement any custom method or query
    //write
}
