package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.dto.CreateTestRequest;
import com.vntu.marenko.ualearning.server.model.Test;
import com.vntu.marenko.ualearning.server.repository.TagRepository;
import com.vntu.marenko.ualearning.server.repository.TestRepository;
import com.vntu.marenko.ualearning.server.service.TestService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    private final TagRepository tagRepository;

    private final MapperFacade mapper;

    public TestServiceImpl(TestRepository testRepository,
                           TagRepository tagRepository,
                           MapperFacade mapper) {
        this.testRepository = testRepository;
        this.tagRepository = tagRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public List<Test> getTestsWithTag(int tagId) {
        return testRepository.findAllByTags(tagRepository.getReferenceById(tagId));
    }

    @Override
    public Test getTest(int id) {
        return testRepository.getReferenceById(id);
    }

    @Override
    public Test createTest(CreateTestRequest testRequest) {
        Test testToSave = mapper.map(testRequest, Test.class);
        testToSave.setTags(tagRepository.findAllById(testRequest.getTags()));
        return testRepository.save(testToSave);
    }
}
