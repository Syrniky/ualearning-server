package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.ResultDescription;
import com.vntu.marenko.ualearning.server.dto.ResultDto;
import com.vntu.marenko.ualearning.server.dto.SubmitResultRequest;
import com.vntu.marenko.ualearning.server.service.ResultService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("result")
public class ResultController {

    private final ResultService resultService;

    private final MapperFacade mapper;

    public ResultController(ResultService resultService, MapperFacade mapper) {
        this.resultService = resultService;
        this.mapper = mapper;
    }

    @GetMapping("{id}")
    public ResultDto getResult(@PathVariable int id) {
        return resultService.getResult(id);
    }

    @PostMapping
    public ResultDto submitTest(@RequestBody SubmitResultRequest request) {
        return resultService.submitResult(request);
    }

    @GetMapping("/user/{id}")
    public List<ResultDescription> getResultsForUser(@PathVariable String id) {
        return resultService.getResultsForUser(id);
    }
}
