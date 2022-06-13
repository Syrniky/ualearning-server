package com.vntu.marenko.ualearning.server.service;

import com.vntu.marenko.ualearning.server.dto.CreateTestRequest;
import com.vntu.marenko.ualearning.server.model.Test;

import java.util.List;

public interface TestService {

    List<Test> getAllTests();

    List<Test> getTestsWithTag(int tagId);

    Test getTest(int id);

    Test createTest(CreateTestRequest testRequest);
}
