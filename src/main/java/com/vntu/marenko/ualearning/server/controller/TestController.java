package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.CreateTestRequest;
import com.vntu.marenko.ualearning.server.dto.TestDescription;
import com.vntu.marenko.ualearning.server.dto.TestDto;
import com.vntu.marenko.ualearning.server.service.TestService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    private final TestService testService;

    private final MapperFacade mapper;

    public TestController(TestService testService, MapperFacade mapper) {
        this.testService = testService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<TestDescription> getTestDescriptions() {
        return  mapper.mapAsList(testService.getAllTests(), TestDescription.class);
    }

    @GetMapping("/tag/{tagId}")
    public List<TestDescription> getTestDescriptionsForTag(@PathVariable int tagId) {
        return  mapper.mapAsList(testService.getTestsWithTag(tagId), TestDescription.class);
    }

    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable int id) {
        return mapper.map(testService.getTest(id), TestDto.class);
    }

    @PostMapping
    public TestDto createTest(@RequestBody CreateTestRequest request) {
        return mapper.map(testService.createTest(request), TestDto.class);
    }
}
