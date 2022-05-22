package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.model.Test;
import com.vntu.marenko.ualearning.server.repository.TestRepository;
import com.vntu.marenko.ualearning.server.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test getTest(int id) {
        return testRepository.getById(id);
    }
}
