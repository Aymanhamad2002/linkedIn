package com.linkedin.features.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkedin.features.authentication.entities.User;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
	Optional<User>findByEmail(String email);

}
