package com.example.rentcloud.autherizationserver.repository;

import com.example.rentcloud.autherizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String name);
}
