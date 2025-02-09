package com.mypackage.demoMysql.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypackage.demoMysql.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
//	Optional<User> findByUsernameOrEmail(String username, String email);
User findByUsername(String username);
}


