package com.vntu.marenko.ualearning.server.repository;

import com.vntu.marenko.ualearning.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
