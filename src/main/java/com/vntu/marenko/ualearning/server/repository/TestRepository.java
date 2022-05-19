package com.vntu.marenko.ualearning.server.repository;

import com.vntu.marenko.ualearning.server.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {
}
