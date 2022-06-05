package com.vntu.marenko.ualearning.server.repository;

import com.vntu.marenko.ualearning.server.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {
}
