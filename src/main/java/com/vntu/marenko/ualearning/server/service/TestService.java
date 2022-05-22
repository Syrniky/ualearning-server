package com.vntu.marenko.ualearning.server.service;

import com.vntu.marenko.ualearning.server.model.Test;

import java.util.List;

public interface TestService {

    List<Test> getAllTests();

    Test getTest(int id);
}
