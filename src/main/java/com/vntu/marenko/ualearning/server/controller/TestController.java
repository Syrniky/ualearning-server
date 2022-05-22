package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.TestDescription;
import com.vntu.marenko.ualearning.server.dto.TestDto;
import com.vntu.marenko.ualearning.server.model.Test;
import com.vntu.marenko.ualearning.server.service.TestService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable int id) {
        return mapper.map(testService.getTest(id), TestDto.class);
    }
}
