package com.vntu.marenko.ualearning.server.mapper;

import com.vntu.marenko.ualearning.server.component.MarkComputer;
import com.vntu.marenko.ualearning.server.dto.*;
import com.vntu.marenko.ualearning.server.model.*;
import ma.glasnost.orika.*;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public MapperFacade createMapper(MarkComputer markComputer,
                                     SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper,
                                     ResultToDescriptionMapper resultToDescriptionMapper) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(UserRequest.class, User.class);
        mapperFactory.classMap(User.class, UserDto.class);

        mapperFactory.classMap(Test.class, TestDescription.class);

        mapperFactory.classMap(Answer.class, AnswerDto.class);
        mapperFactory.classMap(Question.class, QuestionDto.class);
        mapperFactory.classMap(Test.class, TestDto.class);
        mapperFactory.classMap(Tag.class, TagDto.class);

        mapperFactory.classMap(Result.class, ResultDto.class)
                     .byDefault()
                     .customize(new ResultDomainToDtoMapper(markComputer))
                     .register();
        mapperFactory.classMap(SubmitResultRequest.class, Result.class)
                     .customize(submitResultRequestToDomainMapper)
                     .register();
        mapperFactory.classMap(Result.class, ResultDescription.class)
                     .customize(resultToDescriptionMapper)
                     .register();

        return mapperFactory.getMapperFacade();
    }

    private static class ResultDomainToDtoMapper extends CustomMapper<Result, ResultDto> {

        private final MarkComputer markComputer;

        private ResultDomainToDtoMapper(MarkComputer markComputer) {
            this.markComputer = markComputer;
        }

        @Override
        public void mapAtoB(Result result, ResultDto resultDto, MappingContext context) {
            super.mapAtoB(result, resultDto, context);
            resultDto.setMark(markComputer.compute(result));
        }
    }
}
