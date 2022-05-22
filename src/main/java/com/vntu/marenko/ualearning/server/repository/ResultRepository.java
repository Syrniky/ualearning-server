package com.vntu.marenko.ualearning.server.repository;

import com.vntu.marenko.ualearning.server.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Integer> {

    List<Result> getByUserLogin(String userLogin);
}
