package com.oussama.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oussama.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

		User findByUsername(String username);

}
