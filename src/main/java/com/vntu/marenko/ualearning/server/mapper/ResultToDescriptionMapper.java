package com.vntu.marenko.ualearning.server.mapper;

import com.vntu.marenko.ualearning.server.component.MarkComputer;
import com.vntu.marenko.ualearning.server.dto.ResultDescription;
import com.vntu.marenko.ualearning.server.model.Result;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

@Component
public class ResultToDescriptionMapper extends CustomMapper<Result, ResultDescription> {

    private final MarkComputer markComputer;

    public ResultToDescriptionMapper(MarkComputer markComputer) {
        this.markComputer = markComputer;
    }

    @Override
    public void mapAtoB(Result result, ResultDescription resultDescription, MappingContext context) {
        super.mapAtoB(result, resultDescription, context);
        resultDescription.setId(result.getId());
        resultDescription.setTestId(result.getTest().getId());
        resultDescription.setTestName(result.getTest().getNameTest());
        resultDescription.setMark(markComputer.compute(result));
    }
}
