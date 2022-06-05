package com.vntu.marenko.ualearning.server.repository;

import com.vntu.marenko.ualearning.server.model.Tag;
import com.vntu.marenko.ualearning.server.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Integer> {

    List<Test> findAllByTags(Tag tag);
}
