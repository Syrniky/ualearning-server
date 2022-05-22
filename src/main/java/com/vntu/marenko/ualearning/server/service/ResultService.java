package com.vntu.marenko.ualearning.server.service;

import com.vntu.marenko.ualearning.server.dto.ResultDescription;
import com.vntu.marenko.ualearning.server.dto.ResultDto;
import com.vntu.marenko.ualearning.server.dto.SubmitResultRequest;

import java.util.List;

public interface ResultService {

    ResultDto getResult(int id);

    ResultDto submitResult(SubmitResultRequest request);

    List<ResultDescription> getResultsForUser(String userId);
}
