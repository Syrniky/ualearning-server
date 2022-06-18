package com.vntu.marenko.ualearning.server;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository0 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig1 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = submitResultRequestToDomainMapper6.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper10 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper11 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean12 = createPostRequestToPostMapper11.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = null;
        ma.glasnost.orika.MapperFacade mapperFacade14 = mapperConfig1.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2, submitResultRequestToDomainMapper6, resultToDescriptionMapper10, createPostRequestToPostMapper11, postToDtoMapper13);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository15 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository16 = null;
        ma.glasnost.orika.MapperFacade mapperFacade17 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository18 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto19 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl20 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean21 = answerDto19.equals((java.lang.Object) markComputerImpl20);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl22 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository16, mapperFacade17, userRepository18, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl20);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl23 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository0, mapperFacade14, userRepository15, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl20);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository24 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl25 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository24);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper26 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig27 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl28 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository29 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository30 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository31 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper32 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository29, testRepository30, answerRepository31);
        ma.glasnost.orika.MapperFacade mapperFacade33 = null;
        submitResultRequestToDomainMapper32.setMapperFacade(mapperFacade33);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType35 = submitResultRequestToDomainMapper32.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper36 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper37 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean38 = createPostRequestToPostMapper37.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper39 = null;
        ma.glasnost.orika.MapperFacade mapperFacade40 = mapperConfig27.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl28, submitResultRequestToDomainMapper32, resultToDescriptionMapper36, createPostRequestToPostMapper37, postToDtoMapper39);
        postToDtoMapper26.setMapperFacade(mapperFacade40);
        com.vntu.marenko.ualearning.server.controller.UserController userController42 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl25, mapperFacade40);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController43 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl23, mapperFacade40);
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(resultType35);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + false + "'", boolean38, false);
        org.junit.Assert.assertNotNull(mapperFacade40);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper0 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig1 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = submitResultRequestToDomainMapper6.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper10 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper11 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean12 = createPostRequestToPostMapper11.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = null;
        ma.glasnost.orika.MapperFacade mapperFacade14 = mapperConfig1.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2, submitResultRequestToDomainMapper6, resultToDescriptionMapper10, createPostRequestToPostMapper11, postToDtoMapper13);
        postToDtoMapper0.setMapperFacade(mapperFacade14);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType16 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType17 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType18 = postToDtoMapper0.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType19 = postToDtoMapper0.getBType();
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertNotNull(postType16);
        org.junit.Assert.assertNotNull(postType17);
        org.junit.Assert.assertNotNull(postDtoType18);
        org.junit.Assert.assertNotNull(postDtoType19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto1 = null;
        resultDto0.setTest(testDto1);
        java.lang.String str3 = resultDto0.toString();
        java.lang.String str4 = resultDto0.toString();
        com.vntu.marenko.ualearning.server.model.Result result5 = new com.vntu.marenko.ualearning.server.model.Result();
        result5.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user8 = new com.vntu.marenko.ualearning.server.model.User();
        user8.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test11 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean12 = user8.equals((java.lang.Object) test11);
        user8.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result5.setUser(user8);
        int int16 = user8.getAge();
        user8.setLogin("");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto19 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto20 = null;
        resultDto19.setTest(testDto20);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto22 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl23 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean24 = answerDto22.equals((java.lang.Object) markComputerImpl23);
        int int25 = answerDto22.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto26 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto26.setText("hi!");
        java.lang.String str29 = answerDto26.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto30 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl31 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean32 = answerDto30.equals((java.lang.Object) markComputerImpl31);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto33 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl34 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean35 = answerDto33.equals((java.lang.Object) markComputerImpl34);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray36 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto22, answerDto26, answerDto30, answerDto33 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList37 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList37, answerDtoArray36);
        resultDto19.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList37);
        com.vntu.marenko.ualearning.server.dto.TestDto testDto40 = resultDto19.getTest();
        long long41 = resultDto19.getMark();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto42 = resultDto19.getTest();
        boolean boolean43 = user8.equals((java.lang.Object) resultDto19);
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto44 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto44.setId(100);
        resultDto44.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto49 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto49.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto52 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl53 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean54 = answerDto52.equals((java.lang.Object) markComputerImpl53);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto55 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto56 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl57 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean58 = answerDto56.equals((java.lang.Object) markComputerImpl57);
        int int59 = answerDto56.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto60 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl61 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean62 = answerDto60.equals((java.lang.Object) markComputerImpl61);
        int int63 = answerDto60.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto64 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto64.setText("hi!");
        java.lang.String str67 = answerDto64.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray68 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto52, answerDto55, answerDto56, answerDto60, answerDto64 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList69 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList69, answerDtoArray68);
        questionDto49.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList69);
        resultDto44.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList69);
        resultDto19.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList69);
        resultDto0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0)" + "'", str3, "ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0)" + "'", str4, "ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(answerDtoArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(testDto40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(testDto42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(answerDtoArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper0 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType1 = createPostRequestToPostMapper0.getBType();
        com.vntu.marenko.ualearning.server.model.Post post2 = new com.vntu.marenko.ualearning.server.model.Post();
        post2.setText("");
        java.lang.String str5 = post2.toString();
        post2.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest8 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest8.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext11 = null;
        createPostRequestToPostMapper0.mapBtoA(post2, createPostRequest8, mappingContext11);
        com.vntu.marenko.ualearning.server.model.Post post13 = new com.vntu.marenko.ualearning.server.model.Post();
        post13.setText("");
        java.lang.String str16 = post13.toString();
        java.lang.Integer int17 = post13.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest18 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str19 = createPostRequest18.getUsername();
        java.lang.String str20 = createPostRequest18.toString();
        ma.glasnost.orika.MappingContext mappingContext21 = null;
        createPostRequestToPostMapper0.mapBtoA(post13, createPostRequest18, mappingContext21);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository23 = null;
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository25 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer26 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl27 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository23, mapperFacade24, userRepository25, markComputer26);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean29 = createPostRequestToPostMapper28.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig30 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl31 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository32 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository33 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository34 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper35 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository32, testRepository33, answerRepository34);
        ma.glasnost.orika.MapperFacade mapperFacade36 = null;
        submitResultRequestToDomainMapper35.setMapperFacade(mapperFacade36);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType38 = submitResultRequestToDomainMapper35.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper39 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper40 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean41 = createPostRequestToPostMapper40.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper42 = null;
        ma.glasnost.orika.MapperFacade mapperFacade43 = mapperConfig30.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl31, submitResultRequestToDomainMapper35, resultToDescriptionMapper39, createPostRequestToPostMapper40, postToDtoMapper42);
        createPostRequestToPostMapper28.setMapperFacade(mapperFacade43);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController45 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl27, mapperFacade43);
        com.vntu.marenko.ualearning.server.service.UserService userService46 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper47 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig48 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl49 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository50 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository51 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository52 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper53 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository50, testRepository51, answerRepository52);
        ma.glasnost.orika.MapperFacade mapperFacade54 = null;
        submitResultRequestToDomainMapper53.setMapperFacade(mapperFacade54);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType56 = submitResultRequestToDomainMapper53.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper57 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper58 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean59 = createPostRequestToPostMapper58.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper60 = null;
        ma.glasnost.orika.MapperFacade mapperFacade61 = mapperConfig48.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl49, submitResultRequestToDomainMapper53, resultToDescriptionMapper57, createPostRequestToPostMapper58, postToDtoMapper60);
        postToDtoMapper47.setMapperFacade(mapperFacade61);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController63 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService46, mapperFacade61);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController64 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl27, mapperFacade61);
        createPostRequestToPostMapper0.setMapperFacade(mapperFacade61);
        java.lang.Boolean boolean66 = createPostRequestToPostMapper0.favorsExtension();
        java.lang.Boolean boolean67 = createPostRequestToPostMapper0.favorsExtension();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType68 = createPostRequestToPostMapper0.getBType();
        ma.glasnost.orika.Mapper[] mapperArray70 = new ma.glasnost.orika.Mapper[0];
        @SuppressWarnings("unchecked")
        ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[] objMapperArray71 = (ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[]) mapperArray70;
        // The following exception was thrown during execution in test generation
        try {
            createPostRequestToPostMapper0.setUsedMappers((ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[]) mapperArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not be called for a user custom mapper.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(postType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str5, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str16, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str20, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(resultType38);
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + false + "'", boolean41, false);
        org.junit.Assert.assertNotNull(mapperFacade43);
        org.junit.Assert.assertNotNull(resultType56);
        org.junit.Assert.assertEquals("'" + boolean59 + "' != '" + false + "'", boolean59, false);
        org.junit.Assert.assertNotNull(mapperFacade61);
        org.junit.Assert.assertEquals("'" + boolean66 + "' != '" + false + "'", boolean66, false);
        org.junit.Assert.assertEquals("'" + boolean67 + "' != '" + false + "'", boolean67, false);
        org.junit.Assert.assertNotNull(postType68);
        org.junit.Assert.assertNotNull(mapperArray70);
        org.junit.Assert.assertNotNull(objMapperArray71);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        com.vntu.marenko.ualearning.server.model.User user1 = new com.vntu.marenko.ualearning.server.model.User();
        user1.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test4 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean5 = user1.equals((java.lang.Object) test4);
        result0.setUser(user1);
        com.vntu.marenko.ualearning.server.model.Test test7 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int8 = test7.getId();
        java.lang.Integer int9 = test7.getId();
        test7.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        result0.setTest(test7);
        test7.setNameTest("AnswerDto(id=0, text=Tag(id=null, name=null))");
        java.lang.Integer int15 = test7.getCompletedCounter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.vntu.marenko.ualearning.server.model.Question question0 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str1 = question0.getText();
        question0.setText("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=[])");
        question0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.Integer int3 = post0.getId();
        java.util.Date date4 = post0.getTimestamp();
        java.lang.String str5 = post0.toString();
        java.util.Date date6 = post0.getTimestamp();
        java.util.Date date7 = post0.getTimestamp();
        java.lang.String str8 = post0.getText();
        java.util.Date date9 = null;
        post0.setTimestamp(date9);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str5, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto0.setId(100);
        boolean boolean3 = resultDto0.isSubmitted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        userDto0.setSurname("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        userDto0.setLogin("Tag(id=null, name=null)");
        userDto0.setInstitution("ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        int int9 = userDto0.getRating();
        userDto0.setEmail("TestDescription(id=0, nameTest=TagDto(id=0, name=null))");
        int int12 = userDto0.getAge();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer0.setId((java.lang.Integer) 0);
        boolean boolean3 = answer0.isCorrect();
        answer0.setText("LoginRequest(login=Tag(id=null, name=null), password=null)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.vntu.marenko.ualearning.server.model.Test test0 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int1 = test0.getId();
        java.lang.Integer int2 = test0.getId();
        test0.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int5 = test0.getCompletedCounter();
        java.lang.Integer int6 = test0.getCompletedCounter();
        java.lang.Integer int7 = test0.getCompletedCounter();
        com.vntu.marenko.ualearning.server.model.Question question8 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str9 = question8.getText();
        java.lang.Integer int10 = question8.getId();
        boolean boolean11 = test0.equals((java.lang.Object) question8);
        java.lang.String str12 = question8.toString();
        question8.setText("User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Question(id=null, text=null, answers=null)" + "'", str12, "Question(id=null, text=null, answers=null)");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl1 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean2 = answerDto0.equals((java.lang.Object) markComputerImpl1);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto3 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto3.setId((int) (byte) -1);
        boolean boolean6 = answerDto0.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = answerDto0.toString();
        java.lang.String str8 = answerDto0.getText();
        answerDto0.setText("TestDescription(id=0, nameTest=TagDto(id=0, name=null))");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AnswerDto(id=0, text=null)" + "'", str7, "AnswerDto(id=0, text=null)");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.vntu.marenko.ualearning.server.model.Test test0 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int1 = test0.getId();
        java.lang.Integer int2 = test0.getId();
        test0.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int5 = test0.getCompletedCounter();
        java.lang.String str6 = test0.toString();
        java.lang.String str7 = test0.getNameTest();
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList8 = test0.getTags();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null)" + "'", str6, "Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(tagList8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean4 = user0.equals((java.lang.Object) test3);
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList5 = test3.getTags();
        com.vntu.marenko.ualearning.server.model.Test test6 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int7 = test6.getId();
        java.lang.Integer int8 = test6.getId();
        test6.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository11 = null;
        ma.glasnost.orika.MapperFacade mapperFacade12 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository13 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer14 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl15 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository11, mapperFacade12, userRepository13, markComputer14);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper16 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean17 = createPostRequestToPostMapper16.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig18 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl19 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository22 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper23 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository20, testRepository21, answerRepository22);
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade24);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType26 = submitResultRequestToDomainMapper23.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper27 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean29 = createPostRequestToPostMapper28.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper30 = null;
        ma.glasnost.orika.MapperFacade mapperFacade31 = mapperConfig18.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl19, submitResultRequestToDomainMapper23, resultToDescriptionMapper27, createPostRequestToPostMapper28, postToDtoMapper30);
        createPostRequestToPostMapper16.setMapperFacade(mapperFacade31);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController33 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl15, mapperFacade31);
        boolean boolean34 = test6.equals((java.lang.Object) resultController33);
        boolean boolean35 = test3.equals((java.lang.Object) test6);
        java.lang.String str36 = test3.getDescriptionTest();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(tagList5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(resultType26);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(mapperFacade31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto0.setId(100);
        resultDto0.setId((int) (byte) 10);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList5 = resultDto0.getAnswers();
        org.junit.Assert.assertNull(answerDtoList5);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.vntu.marenko.ualearning.server.service.UserService userService0 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository2 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl3 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository1, tagRepository2);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper4 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig5 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl6 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository7 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository8 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository9 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper10 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository7, testRepository8, answerRepository9);
        ma.glasnost.orika.MapperFacade mapperFacade11 = null;
        submitResultRequestToDomainMapper10.setMapperFacade(mapperFacade11);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType13 = submitResultRequestToDomainMapper10.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper14 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper15 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean16 = createPostRequestToPostMapper15.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper17 = null;
        ma.glasnost.orika.MapperFacade mapperFacade18 = mapperConfig5.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl6, submitResultRequestToDomainMapper10, resultToDescriptionMapper14, createPostRequestToPostMapper15, postToDtoMapper17);
        postToDtoMapper4.setMapperFacade(mapperFacade18);
        com.vntu.marenko.ualearning.server.controller.TestController testController20 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade18);
        ma.glasnost.orika.MapperFacade mapperFacade21 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController22 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade21);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper23 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType24 = createPostRequestToPostMapper23.getBType();
        com.vntu.marenko.ualearning.server.model.Post post25 = new com.vntu.marenko.ualearning.server.model.Post();
        post25.setText("");
        java.lang.String str28 = post25.toString();
        post25.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest31 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest31.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext34 = null;
        createPostRequestToPostMapper23.mapBtoA(post25, createPostRequest31, mappingContext34);
        com.vntu.marenko.ualearning.server.model.Post post36 = new com.vntu.marenko.ualearning.server.model.Post();
        post36.setText("");
        java.lang.String str39 = post36.toString();
        java.lang.Integer int40 = post36.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest41 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str42 = createPostRequest41.getUsername();
        java.lang.String str43 = createPostRequest41.toString();
        ma.glasnost.orika.MappingContext mappingContext44 = null;
        createPostRequestToPostMapper23.mapBtoA(post36, createPostRequest41, mappingContext44);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository46 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository47 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository48 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper49 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository46, testRepository47, answerRepository48);
        ma.glasnost.orika.MapperFacade mapperFacade50 = null;
        submitResultRequestToDomainMapper49.setMapperFacade(mapperFacade50);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType52 = submitResultRequestToDomainMapper49.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper53 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig54 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl55 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository56 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository57 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository58 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper59 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository56, testRepository57, answerRepository58);
        ma.glasnost.orika.MapperFacade mapperFacade60 = null;
        submitResultRequestToDomainMapper59.setMapperFacade(mapperFacade60);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType62 = submitResultRequestToDomainMapper59.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper63 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper64 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean65 = createPostRequestToPostMapper64.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper66 = null;
        ma.glasnost.orika.MapperFacade mapperFacade67 = mapperConfig54.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl55, submitResultRequestToDomainMapper59, resultToDescriptionMapper63, createPostRequestToPostMapper64, postToDtoMapper66);
        postToDtoMapper53.setMapperFacade(mapperFacade67);
        submitResultRequestToDomainMapper49.setMapperFacade(mapperFacade67);
        createPostRequestToPostMapper23.setMapperFacade(mapperFacade67);
        com.vntu.marenko.ualearning.server.controller.TestController testController71 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade67);
        com.vntu.marenko.ualearning.server.controller.UserController userController72 = new com.vntu.marenko.ualearning.server.controller.UserController(userService0, mapperFacade67);
        org.junit.Assert.assertNotNull(resultType13);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertNotNull(mapperFacade18);
        org.junit.Assert.assertNotNull(postType24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str28, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str39, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str43, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(resultType52);
        org.junit.Assert.assertNotNull(resultType62);
        org.junit.Assert.assertEquals("'" + boolean65 + "' != '" + false + "'", boolean65, false);
        org.junit.Assert.assertNotNull(mapperFacade67);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean4 = user0.equals((java.lang.Object) test3);
        user0.setRating((long) (-1));
        com.vntu.marenko.ualearning.server.dto.UserDto userDto7 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto7.setInstitution("");
        java.lang.String str10 = userDto7.getInstitution();
        userDto7.setName("SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        userDto7.setAge((int) ' ');
        boolean boolean15 = user0.equals((java.lang.Object) userDto7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        userDto0.setSurname("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        userDto0.setLogin("Tag(id=null, name=null)");
        java.lang.String str7 = userDto0.getLogin();
        userDto0.setRating((int) (short) 10);
        java.lang.String str10 = userDto0.getInstitution();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tag(id=null, name=null)" + "'", str7, "Tag(id=null, name=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto2 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto2.setId((int) '#');
        boolean boolean5 = userRequest0.equals((java.lang.Object) '#');
        userRequest0.setEmail("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        int int8 = userRequest0.getAge();
        userRequest0.setSurname("Tag(id=10, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        userRequest0.setEmail("Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository2 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper3 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository0, testRepository1, answerRepository2);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType4 = submitResultRequestToDomainMapper3.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper5 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig6 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl7 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository8 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository9 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository10 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper11 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository8, testRepository9, answerRepository10);
        ma.glasnost.orika.MapperFacade mapperFacade12 = null;
        submitResultRequestToDomainMapper11.setMapperFacade(mapperFacade12);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType14 = submitResultRequestToDomainMapper11.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper15 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper16 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean17 = createPostRequestToPostMapper16.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper18 = null;
        ma.glasnost.orika.MapperFacade mapperFacade19 = mapperConfig6.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl7, submitResultRequestToDomainMapper11, resultToDescriptionMapper15, createPostRequestToPostMapper16, postToDtoMapper18);
        postToDtoMapper5.setMapperFacade(mapperFacade19);
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade19);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository22 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl23 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository22);
        com.vntu.marenko.ualearning.server.controller.PostController postController24 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade19, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl23);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest25 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str26 = createPostRequest25.getUsername();
        createPostRequest25.setText("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.String str29 = createPostRequest25.getText();
        createPostRequest25.setUsername("User(login=null, password=TagDto(id=1, name=null), name=null, surname=null, age=0, institution=null, email=null, rating=100)");
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.PostDto postDto32 = postController24.createPost(createPostRequest25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType4);
        org.junit.Assert.assertNotNull(resultType14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(mapperFacade19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)" + "'", str29, "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setRating((int) (byte) -1);
        java.lang.String str3 = userDto0.getInstitution();
        userDto0.setName("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=[])");
        userDto0.setAge((int) (short) 0);
        java.lang.String str8 = userDto0.getEmail();
        userDto0.setRating((int) (short) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.getPassword();
        java.lang.String str4 = userRequest0.getEmail();
        userRequest0.setSurname("UserRequest(login=LoginRequest(login=Tag(id=null, name=null), password=null), password=Question(id=null, text=null, answers=null), name=null, surname=null, age=0, institution=null, email=null)");
        java.lang.String str7 = userRequest0.getEmail();
        java.lang.String str8 = userRequest0.getInstitution();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.vntu.marenko.ualearning.server.dto.PostDto postDto0 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        int int1 = postDto0.getId();
        postDto0.setId((int) (byte) -1);
        java.lang.String str4 = postDto0.getLogin();
        postDto0.setTimestamp("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        java.util.List<java.lang.String> strList7 = postDto0.getLikes();
        int int8 = postDto0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto1 = null;
        resultDto0.setTest(testDto1);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList3 = resultDto0.getAnswers();
        long long4 = resultDto0.getMark();
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList5 = resultDto0.getAnswers();
        long long6 = resultDto0.getMark();
        resultDto0.setMark((long) (short) 100);
        int int9 = resultDto0.getId();
        org.junit.Assert.assertNull(answerDtoList3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(answerDtoList5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository0 = null;
        ma.glasnost.orika.MapperFacade mapperFacade1 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository2 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer3 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl4 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository0, mapperFacade1, userRepository2, markComputer3);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper5 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean6 = createPostRequestToPostMapper5.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig7 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl8 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository9 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository10 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository11 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper12 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository9, testRepository10, answerRepository11);
        ma.glasnost.orika.MapperFacade mapperFacade13 = null;
        submitResultRequestToDomainMapper12.setMapperFacade(mapperFacade13);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType15 = submitResultRequestToDomainMapper12.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper16 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper17 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean18 = createPostRequestToPostMapper17.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper19 = null;
        ma.glasnost.orika.MapperFacade mapperFacade20 = mapperConfig7.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl8, submitResultRequestToDomainMapper12, resultToDescriptionMapper16, createPostRequestToPostMapper17, postToDtoMapper19);
        createPostRequestToPostMapper5.setMapperFacade(mapperFacade20);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController22 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl4, mapperFacade20);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository23 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl24 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository23);
        com.vntu.marenko.ualearning.server.controller.PostController postController25 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade20, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl24);
        com.vntu.marenko.ualearning.server.model.Tag tag26 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str27 = tag26.toString();
        java.lang.String str28 = tag26.getName();
        java.lang.Integer int29 = tag26.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper30 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper31 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType32 = createPostRequestToPostMapper31.getBType();
        com.vntu.marenko.ualearning.server.model.Post post33 = new com.vntu.marenko.ualearning.server.model.Post();
        post33.setText("");
        java.lang.String str36 = post33.toString();
        post33.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest39 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest39.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext42 = null;
        createPostRequestToPostMapper31.mapBtoA(post33, createPostRequest39, mappingContext42);
        com.vntu.marenko.ualearning.server.model.Post post44 = new com.vntu.marenko.ualearning.server.model.Post();
        post44.setText("");
        java.lang.String str47 = post44.toString();
        java.lang.Integer int48 = post44.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest49 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str50 = createPostRequest49.getUsername();
        java.lang.String str51 = createPostRequest49.toString();
        ma.glasnost.orika.MappingContext mappingContext52 = null;
        createPostRequestToPostMapper31.mapBtoA(post44, createPostRequest49, mappingContext52);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper54 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType55 = createPostRequestToPostMapper54.getBType();
        com.vntu.marenko.ualearning.server.model.Post post56 = new com.vntu.marenko.ualearning.server.model.Post();
        post56.setText("");
        java.lang.String str59 = post56.toString();
        post56.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest62 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest62.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext65 = null;
        createPostRequestToPostMapper54.mapBtoA(post56, createPostRequest62, mappingContext65);
        ma.glasnost.orika.MappingContext mappingContext67 = null;
        createPostRequestToPostMapper30.mapAtoB(createPostRequest49, post56, mappingContext67);
        boolean boolean69 = tag26.equals((java.lang.Object) createPostRequest49);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.PostDto postDto70 = postController25.createPost(createPostRequest49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(resultType15);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertNotNull(mapperFacade20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Tag(id=null, name=null)" + "'", str27, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(postType32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str36, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str47, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str51, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str59, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.vntu.marenko.ualearning.server.model.Question question0 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int1 = question0.getId();
        java.util.List<com.vntu.marenko.ualearning.server.model.Answer> answerList2 = null;
        question0.setAnswers(answerList2);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository5 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository6 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper7 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository4, testRepository5, answerRepository6);
        ma.glasnost.orika.MapperFacade mapperFacade8 = null;
        submitResultRequestToDomainMapper7.setMapperFacade(mapperFacade8);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType10 = submitResultRequestToDomainMapper7.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade11 = null;
        submitResultRequestToDomainMapper7.setMapperFacade(mapperFacade11);
        com.vntu.marenko.ualearning.server.model.User user13 = new com.vntu.marenko.ualearning.server.model.User();
        user13.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository16 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository17 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository18 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper19 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository16, testRepository17, answerRepository18);
        ma.glasnost.orika.MapperFacade mapperFacade20 = null;
        submitResultRequestToDomainMapper19.setMapperFacade(mapperFacade20);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType22 = submitResultRequestToDomainMapper19.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade23 = null;
        submitResultRequestToDomainMapper19.setMapperFacade(mapperFacade23);
        boolean boolean25 = user13.equals((java.lang.Object) submitResultRequestToDomainMapper19);
        com.vntu.marenko.ualearning.server.model.Result result26 = new com.vntu.marenko.ualearning.server.model.Result();
        result26.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user29 = new com.vntu.marenko.ualearning.server.model.User();
        user29.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test32 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean33 = user29.equals((java.lang.Object) test32);
        user29.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result26.setUser(user29);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest37 = null;
        ma.glasnost.orika.MappingContext mappingContext38 = null;
        submitResultRequestToDomainMapper19.mapBtoA(result26, submitResultRequest37, mappingContext38);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest40 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest40.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int43 = submitResultRequest40.getTestId();
        ma.glasnost.orika.MappingContext mappingContext44 = null;
        submitResultRequestToDomainMapper7.mapBtoA(result26, submitResultRequest40, mappingContext44);
        com.vntu.marenko.ualearning.server.model.Question question46 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str47 = question46.getText();
        java.lang.Integer int48 = question46.getId();
        com.vntu.marenko.ualearning.server.service.TestService testService49 = null;
        ma.glasnost.orika.MapperFacade mapperFacade50 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController51 = new com.vntu.marenko.ualearning.server.controller.TestController(testService49, mapperFacade50);
        boolean boolean52 = question46.equals((java.lang.Object) testController51);
        com.vntu.marenko.ualearning.server.model.Result result53 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int54 = result53.getId();
        com.vntu.marenko.ualearning.server.model.Test test55 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int56 = test55.getId();
        java.lang.Integer int57 = test55.getId();
        result53.setTest(test55);
        java.lang.Integer int59 = result53.getId();
        com.vntu.marenko.ualearning.server.model.Result result60 = new com.vntu.marenko.ualearning.server.model.Result();
        result60.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user63 = new com.vntu.marenko.ualearning.server.model.User();
        user63.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test66 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean67 = user63.equals((java.lang.Object) test66);
        user63.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result60.setUser(user63);
        com.vntu.marenko.ualearning.server.model.Question question71 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int72 = question71.getId();
        java.lang.Integer int73 = question71.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer74 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer75 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer75.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray78 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer74, answer75 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList79 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList79, answerArray78);
        question71.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList79);
        result60.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList79);
        result53.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList79);
        question46.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList79);
        result26.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList79);
        question0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList79);
        java.lang.String str87 = question0.toString();
        java.lang.Integer int88 = question0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(submitResultRequestType10);
        org.junit.Assert.assertNotNull(submitResultRequestType22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(int72);
        org.junit.Assert.assertNull(int73);
        org.junit.Assert.assertNotNull(answerArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Question(id=null, text=null, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])" + "'", str87, "Question(id=null, text=null, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])");
        org.junit.Assert.assertNull(int88);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str1 = questionDto0.getText();
        int int2 = questionDto0.getId();
        com.vntu.marenko.ualearning.server.model.User user3 = new com.vntu.marenko.ualearning.server.model.User();
        user3.setInstitution("hi!");
        java.lang.String str6 = user3.toString();
        java.lang.String str7 = user3.getEmail();
        java.lang.String str8 = user3.getEmail();
        boolean boolean9 = questionDto0.equals((java.lang.Object) str8);
        com.vntu.marenko.ualearning.server.model.Tag tag10 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str11 = tag10.toString();
        java.lang.String str12 = tag10.getName();
        java.lang.Integer int13 = tag10.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper14 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper15 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType16 = createPostRequestToPostMapper15.getBType();
        com.vntu.marenko.ualearning.server.model.Post post17 = new com.vntu.marenko.ualearning.server.model.Post();
        post17.setText("");
        java.lang.String str20 = post17.toString();
        post17.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest23 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest23.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext26 = null;
        createPostRequestToPostMapper15.mapBtoA(post17, createPostRequest23, mappingContext26);
        com.vntu.marenko.ualearning.server.model.Post post28 = new com.vntu.marenko.ualearning.server.model.Post();
        post28.setText("");
        java.lang.String str31 = post28.toString();
        java.lang.Integer int32 = post28.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest33 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str34 = createPostRequest33.getUsername();
        java.lang.String str35 = createPostRequest33.toString();
        ma.glasnost.orika.MappingContext mappingContext36 = null;
        createPostRequestToPostMapper15.mapBtoA(post28, createPostRequest33, mappingContext36);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper38 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType39 = createPostRequestToPostMapper38.getBType();
        com.vntu.marenko.ualearning.server.model.Post post40 = new com.vntu.marenko.ualearning.server.model.Post();
        post40.setText("");
        java.lang.String str43 = post40.toString();
        post40.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest46 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest46.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext49 = null;
        createPostRequestToPostMapper38.mapBtoA(post40, createPostRequest46, mappingContext49);
        ma.glasnost.orika.MappingContext mappingContext51 = null;
        createPostRequestToPostMapper14.mapAtoB(createPostRequest33, post40, mappingContext51);
        boolean boolean53 = tag10.equals((java.lang.Object) createPostRequest33);
        boolean boolean54 = questionDto0.equals((java.lang.Object) tag10);
        java.lang.Integer int55 = tag10.getId();
        java.lang.String str56 = tag10.getName();
        tag10.setId((java.lang.Integer) 52);
        tag10.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str6, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Tag(id=null, name=null)" + "'", str11, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(postType16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str20, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str31, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str35, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str43, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.vntu.marenko.ualearning.server.dto.TestDto testDto0 = new com.vntu.marenko.ualearning.server.dto.TestDto();
        java.lang.String str1 = testDto0.toString();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto2 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str3 = tagDto2.toString();
        java.lang.String str4 = tagDto2.getName();
        com.vntu.marenko.ualearning.server.model.User user5 = new com.vntu.marenko.ualearning.server.model.User();
        long long6 = user5.getRating();
        user5.setLogin("hi!");
        boolean boolean9 = tagDto2.equals((java.lang.Object) user5);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto10 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str11 = tagDto10.toString();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto12 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto12.setId(1);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto15 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str16 = tagDto15.toString();
        java.lang.String str17 = tagDto15.getName();
        com.vntu.marenko.ualearning.server.model.Test test18 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int19 = test18.getId();
        java.lang.Integer int20 = test18.getId();
        test18.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList23 = test18.getTags();
        boolean boolean24 = tagDto15.equals((java.lang.Object) tagList23);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto25 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto25.setId(1);
        boolean boolean29 = tagDto25.equals((java.lang.Object) (-1L));
        int int30 = tagDto25.getId();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto31 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto31.setId(1);
        java.lang.String str34 = tagDto31.getName();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto35 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str36 = tagDto35.toString();
        java.lang.String str37 = tagDto35.getName();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto38 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str39 = tagDto38.toString();
        java.lang.String str40 = tagDto38.getName();
        com.vntu.marenko.ualearning.server.model.Test test41 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int42 = test41.getId();
        java.lang.Integer int43 = test41.getId();
        test41.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList46 = test41.getTags();
        boolean boolean47 = tagDto38.equals((java.lang.Object) tagList46);
        com.vntu.marenko.ualearning.server.dto.TagDto[] tagDtoArray48 = new com.vntu.marenko.ualearning.server.dto.TagDto[] { tagDto2, tagDto10, tagDto12, tagDto15, tagDto25, tagDto31, tagDto35, tagDto38 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.TagDto> tagDtoList49 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.TagDto>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.TagDto>) tagDtoList49, tagDtoArray48);
        testDto0.setTags((java.util.List<com.vntu.marenko.ualearning.server.dto.TagDto>) tagDtoList49);
        testDto0.setCompletedCounter((java.lang.Integer) 100);
        java.lang.String str54 = testDto0.getDescriptionTest();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto55 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str56 = questionDto55.getText();
        int int57 = questionDto55.getId();
        questionDto55.setId(10);
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto60 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto60.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto63 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl64 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean65 = answerDto63.equals((java.lang.Object) markComputerImpl64);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto66 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto67 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl68 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean69 = answerDto67.equals((java.lang.Object) markComputerImpl68);
        int int70 = answerDto67.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto71 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl72 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean73 = answerDto71.equals((java.lang.Object) markComputerImpl72);
        int int74 = answerDto71.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto75 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto75.setText("hi!");
        java.lang.String str78 = answerDto75.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray79 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto63, answerDto66, answerDto67, answerDto71, answerDto75 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList80 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList80, answerDtoArray79);
        questionDto60.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList80);
        questionDto60.setId((int) (short) -1);
        int int85 = questionDto60.getId();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto86 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str87 = questionDto86.getText();
        int int88 = questionDto86.getId();
        questionDto86.setId(10);
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto91 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str92 = questionDto91.getText();
        com.vntu.marenko.ualearning.server.dto.QuestionDto[] questionDtoArray93 = new com.vntu.marenko.ualearning.server.dto.QuestionDto[] { questionDto55, questionDto60, questionDto86, questionDto91 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.QuestionDto> questionDtoList94 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.QuestionDto>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.QuestionDto>) questionDtoList94, questionDtoArray93);
        testDto0.setQuestions((java.util.List<com.vntu.marenko.ualearning.server.dto.QuestionDto>) questionDtoList94);
        java.lang.String str97 = testDto0.getDescriptionTest();
        int int98 = testDto0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)" + "'", str1, "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TagDto(id=0, name=null)" + "'", str3, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TagDto(id=0, name=null)" + "'", str11, "TagDto(id=0, name=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "TagDto(id=0, name=null)" + "'", str16, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(tagList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "TagDto(id=0, name=null)" + "'", str36, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "TagDto(id=0, name=null)" + "'", str39, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNull(tagList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tagDtoArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(answerDtoArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(questionDtoArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.getEmail();
        com.vntu.marenko.ualearning.server.model.Result result4 = new com.vntu.marenko.ualearning.server.model.Result();
        result4.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user7 = new com.vntu.marenko.ualearning.server.model.User();
        user7.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test10 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean11 = user7.equals((java.lang.Object) test10);
        user7.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result4.setUser(user7);
        com.vntu.marenko.ualearning.server.model.Question question15 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int16 = question15.getId();
        java.lang.Integer int17 = question15.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer18 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer19 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer19.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray22 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer18, answer19 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList23 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList23, answerArray22);
        question15.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList23);
        result4.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList23);
        boolean boolean27 = userRequest0.equals((java.lang.Object) answerList23);
        userRequest0.setSurname("");
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest30 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest30.setUserLogin("ResultDescription(id=null, testId=100, testName=null, mark=0)");
        boolean boolean33 = userRequest0.equals((java.lang.Object) submitResultRequest30);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(answerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto1 = null;
        resultDto0.setTest(testDto1);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto3 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl4 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean5 = answerDto3.equals((java.lang.Object) markComputerImpl4);
        int int6 = answerDto3.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto7 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto7.setText("hi!");
        java.lang.String str10 = answerDto7.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto11 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl12 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean13 = answerDto11.equals((java.lang.Object) markComputerImpl12);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto14 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl15 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean16 = answerDto14.equals((java.lang.Object) markComputerImpl15);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray17 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto3, answerDto7, answerDto11, answerDto14 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList18 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList18, answerDtoArray17);
        resultDto0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList18);
        com.vntu.marenko.ualearning.server.dto.TestDto testDto21 = resultDto0.getTest();
        int int22 = resultDto0.getId();
        int int23 = resultDto0.getId();
        com.vntu.marenko.ualearning.server.dto.UserDto userDto24 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto24.setRating((int) (byte) -1);
        java.lang.String str27 = userDto24.getInstitution();
        int int28 = userDto24.getRating();
        resultDto0.setUser(userDto24);
        int int30 = userDto24.getRating();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(answerDtoArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(testDto21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setInstitution("hi!");
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getEmail();
        user0.setPassword("User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)");
        user0.setRating(1L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str3, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag0.setName("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        com.vntu.marenko.ualearning.server.model.User user3 = new com.vntu.marenko.ualearning.server.model.User();
        user3.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository6 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository7 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository8 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper9 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository6, testRepository7, answerRepository8);
        ma.glasnost.orika.MapperFacade mapperFacade10 = null;
        submitResultRequestToDomainMapper9.setMapperFacade(mapperFacade10);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType12 = submitResultRequestToDomainMapper9.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade13 = null;
        submitResultRequestToDomainMapper9.setMapperFacade(mapperFacade13);
        boolean boolean15 = user3.equals((java.lang.Object) submitResultRequestToDomainMapper9);
        com.vntu.marenko.ualearning.server.model.Result result16 = new com.vntu.marenko.ualearning.server.model.Result();
        result16.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user19 = new com.vntu.marenko.ualearning.server.model.User();
        user19.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test22 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean23 = user19.equals((java.lang.Object) test22);
        user19.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result16.setUser(user19);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest27 = null;
        ma.glasnost.orika.MappingContext mappingContext28 = null;
        submitResultRequestToDomainMapper9.mapBtoA(result16, submitResultRequest27, mappingContext28);
        com.vntu.marenko.ualearning.server.model.User user30 = result16.getUser();
        com.vntu.marenko.ualearning.server.model.User user31 = result16.getUser();
        boolean boolean32 = tag0.equals((java.lang.Object) result16);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto33 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl34 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean35 = answerDto33.equals((java.lang.Object) markComputerImpl34);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto36 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto36.setId((int) (byte) -1);
        boolean boolean39 = answerDto33.equals((java.lang.Object) (byte) -1);
        int int40 = answerDto33.getId();
        boolean boolean41 = result16.equals((java.lang.Object) answerDto33);
        com.vntu.marenko.ualearning.server.model.Result result42 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int43 = result42.getId();
        com.vntu.marenko.ualearning.server.model.Test test44 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int45 = test44.getId();
        java.lang.Integer int46 = test44.getId();
        result42.setTest(test44);
        java.lang.Integer int48 = result42.getId();
        com.vntu.marenko.ualearning.server.model.Test test49 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int50 = test49.getId();
        java.lang.Integer int51 = test49.getId();
        test49.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int54 = test49.getCompletedCounter();
        java.lang.Integer int55 = test49.getCompletedCounter();
        result42.setTest(test49);
        com.vntu.marenko.ualearning.server.model.User user57 = result42.getUser();
        com.vntu.marenko.ualearning.server.model.Test test58 = result42.getTest();
        com.vntu.marenko.ualearning.server.model.Test test59 = result42.getTest();
        java.lang.Integer int60 = result42.getId();
        boolean boolean61 = answerDto33.equals((java.lang.Object) result42);
        boolean boolean63 = answerDto33.equals((java.lang.Object) "SubmitResultRequest(userLogin=null, testId=0, answers=[1, 10, -1])");
        org.junit.Assert.assertNotNull(submitResultRequestType12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNull(user57);
        org.junit.Assert.assertNotNull(test58);
        org.junit.Assert.assertNotNull(test59);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper0 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig1 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = submitResultRequestToDomainMapper6.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper10 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper11 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean12 = createPostRequestToPostMapper11.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = null;
        ma.glasnost.orika.MapperFacade mapperFacade14 = mapperConfig1.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2, submitResultRequestToDomainMapper6, resultToDescriptionMapper10, createPostRequestToPostMapper11, postToDtoMapper13);
        postToDtoMapper0.setMapperFacade(mapperFacade14);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType16 = postToDtoMapper0.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade17 = null;
        postToDtoMapper0.setMapperFacade(mapperFacade17);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository19 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl20 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository19);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository21 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper22 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig23 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl24 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository25 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository27 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper28 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository25, testRepository26, answerRepository27);
        ma.glasnost.orika.MapperFacade mapperFacade29 = null;
        submitResultRequestToDomainMapper28.setMapperFacade(mapperFacade29);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType31 = submitResultRequestToDomainMapper28.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper32 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper33 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean34 = createPostRequestToPostMapper33.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper35 = null;
        ma.glasnost.orika.MapperFacade mapperFacade36 = mapperConfig23.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl24, submitResultRequestToDomainMapper28, resultToDescriptionMapper32, createPostRequestToPostMapper33, postToDtoMapper35);
        postToDtoMapper22.setMapperFacade(mapperFacade36);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository38 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig39 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl40 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository41 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository42 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository43 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper44 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository41, testRepository42, answerRepository43);
        ma.glasnost.orika.MapperFacade mapperFacade45 = null;
        submitResultRequestToDomainMapper44.setMapperFacade(mapperFacade45);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType47 = submitResultRequestToDomainMapper44.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper48 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper49 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean50 = createPostRequestToPostMapper49.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper51 = null;
        ma.glasnost.orika.MapperFacade mapperFacade52 = mapperConfig39.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl40, submitResultRequestToDomainMapper44, resultToDescriptionMapper48, createPostRequestToPostMapper49, postToDtoMapper51);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl53 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository54 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository55 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository56 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper57 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository54, testRepository55, answerRepository56);
        ma.glasnost.orika.MapperFacade mapperFacade58 = null;
        submitResultRequestToDomainMapper57.setMapperFacade(mapperFacade58);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType60 = submitResultRequestToDomainMapper57.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper61 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig62 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl63 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository64 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository65 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository66 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper67 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository64, testRepository65, answerRepository66);
        ma.glasnost.orika.MapperFacade mapperFacade68 = null;
        submitResultRequestToDomainMapper67.setMapperFacade(mapperFacade68);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType70 = submitResultRequestToDomainMapper67.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper71 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper72 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean73 = createPostRequestToPostMapper72.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper74 = null;
        ma.glasnost.orika.MapperFacade mapperFacade75 = mapperConfig62.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl63, submitResultRequestToDomainMapper67, resultToDescriptionMapper71, createPostRequestToPostMapper72, postToDtoMapper74);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper76 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade77 = mapperConfig39.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl53, submitResultRequestToDomainMapper57, resultToDescriptionMapper61, createPostRequestToPostMapper72, postToDtoMapper76);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl78 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository21, mapperFacade36, userRepository38, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl53);
        com.vntu.marenko.ualearning.server.controller.UserController userController79 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl20, mapperFacade36);
        postToDtoMapper0.setMapperFacade(mapperFacade36);
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertNotNull(postType16);
        org.junit.Assert.assertNotNull(resultType31);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + false + "'", boolean34, false);
        org.junit.Assert.assertNotNull(mapperFacade36);
        org.junit.Assert.assertNotNull(resultType47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + false + "'", boolean50, false);
        org.junit.Assert.assertNotNull(mapperFacade52);
        org.junit.Assert.assertNotNull(resultType60);
        org.junit.Assert.assertNotNull(resultType70);
        org.junit.Assert.assertEquals("'" + boolean73 + "' != '" + false + "'", boolean73, false);
        org.junit.Assert.assertNotNull(mapperFacade75);
        org.junit.Assert.assertNotNull(mapperFacade77);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.Integer int3 = post0.getId();
        java.util.Date date4 = post0.getTimestamp();
        java.lang.Integer int5 = post0.getId();
        post0.setText("Result(id=null, user=null, test=null, submitted=false, answers=null)");
        java.lang.Integer int8 = post0.getId();
        java.lang.String str9 = post0.getText();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Result(id=null, user=null, test=null, submitted=false, answers=null)" + "'", str9, "Result(id=null, user=null, test=null, submitted=false, answers=null)");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.vntu.marenko.ualearning.server.dto.PostDto postDto0 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto0.setId(0);
        postDto0.setText("Tag(id=-1, name=null)");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        user0.setAge((int) '4');
        user0.setEmail("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.String str7 = user0.getSurname();
        user0.setEmail("LoginRequest(login=null, password=null)");
        java.lang.String str10 = user0.getSurname();
        user0.setAge((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean4 = user0.equals((java.lang.Object) test3);
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList5 = test3.getTags();
        com.vntu.marenko.ualearning.server.model.Test test6 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int7 = test6.getId();
        java.lang.Integer int8 = test6.getId();
        test6.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository11 = null;
        ma.glasnost.orika.MapperFacade mapperFacade12 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository13 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer14 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl15 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository11, mapperFacade12, userRepository13, markComputer14);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper16 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean17 = createPostRequestToPostMapper16.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig18 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl19 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository22 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper23 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository20, testRepository21, answerRepository22);
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade24);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType26 = submitResultRequestToDomainMapper23.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper27 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean29 = createPostRequestToPostMapper28.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper30 = null;
        ma.glasnost.orika.MapperFacade mapperFacade31 = mapperConfig18.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl19, submitResultRequestToDomainMapper23, resultToDescriptionMapper27, createPostRequestToPostMapper28, postToDtoMapper30);
        createPostRequestToPostMapper16.setMapperFacade(mapperFacade31);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController33 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl15, mapperFacade31);
        boolean boolean34 = test6.equals((java.lang.Object) resultController33);
        boolean boolean35 = test3.equals((java.lang.Object) test6);
        java.lang.String str36 = test6.getDescriptionTest();
        com.vntu.marenko.ualearning.server.model.User user37 = new com.vntu.marenko.ualearning.server.model.User();
        user37.setEmail("hi!");
        long long40 = user37.getRating();
        com.vntu.marenko.ualearning.server.dto.TestDescription testDescription41 = new com.vntu.marenko.ualearning.server.dto.TestDescription();
        testDescription41.setNameTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        testDescription41.setId((-1));
        boolean boolean46 = user37.equals((java.lang.Object) (-1));
        java.lang.String str47 = user37.getPassword();
        user37.setPassword("UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        boolean boolean50 = test6.equals((java.lang.Object) user37);
        user37.setPassword("Result(id=-1, user=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null), rating=35), test=Test(id=0, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), submitted=false, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(tagList5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(resultType26);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(mapperFacade31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str36, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto1 = null;
        resultDto0.setTest(testDto1);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto3 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl4 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean5 = answerDto3.equals((java.lang.Object) markComputerImpl4);
        int int6 = answerDto3.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto7 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto7.setText("hi!");
        java.lang.String str10 = answerDto7.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto11 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl12 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean13 = answerDto11.equals((java.lang.Object) markComputerImpl12);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto14 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl15 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean16 = answerDto14.equals((java.lang.Object) markComputerImpl15);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray17 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto3, answerDto7, answerDto11, answerDto14 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList18 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList18, answerDtoArray17);
        resultDto0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList18);
        com.vntu.marenko.ualearning.server.dto.TestDto testDto21 = resultDto0.getTest();
        int int22 = resultDto0.getId();
        resultDto0.setSubmitted(true);
        com.vntu.marenko.ualearning.server.dto.TestDto testDto25 = new com.vntu.marenko.ualearning.server.dto.TestDto();
        int int26 = testDto25.getId();
        testDto25.setDescriptionTest("ResultDescription(id=null, testId=100, testName=null, mark=0)");
        resultDto0.setTest(testDto25);
        com.vntu.marenko.ualearning.server.model.Result result30 = new com.vntu.marenko.ualearning.server.model.Result();
        result30.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user33 = new com.vntu.marenko.ualearning.server.model.User();
        user33.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test36 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean37 = user33.equals((java.lang.Object) test36);
        user33.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result30.setUser(user33);
        int int41 = user33.getAge();
        user33.setLogin("");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto44 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto45 = null;
        resultDto44.setTest(testDto45);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto47 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl48 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean49 = answerDto47.equals((java.lang.Object) markComputerImpl48);
        int int50 = answerDto47.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto51 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto51.setText("hi!");
        java.lang.String str54 = answerDto51.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto55 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl56 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean57 = answerDto55.equals((java.lang.Object) markComputerImpl56);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto58 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl59 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean60 = answerDto58.equals((java.lang.Object) markComputerImpl59);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray61 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto47, answerDto51, answerDto55, answerDto58 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList62 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList62, answerDtoArray61);
        resultDto44.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList62);
        com.vntu.marenko.ualearning.server.dto.TestDto testDto65 = resultDto44.getTest();
        long long66 = resultDto44.getMark();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto67 = resultDto44.getTest();
        boolean boolean68 = user33.equals((java.lang.Object) resultDto44);
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto69 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto69.setId(100);
        resultDto69.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto74 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto74.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto77 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl78 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean79 = answerDto77.equals((java.lang.Object) markComputerImpl78);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto80 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto81 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl82 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean83 = answerDto81.equals((java.lang.Object) markComputerImpl82);
        int int84 = answerDto81.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto85 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl86 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean87 = answerDto85.equals((java.lang.Object) markComputerImpl86);
        int int88 = answerDto85.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto89 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto89.setText("hi!");
        java.lang.String str92 = answerDto89.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray93 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto77, answerDto80, answerDto81, answerDto85, answerDto89 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList94 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList94, answerDtoArray93);
        questionDto74.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList94);
        resultDto69.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList94);
        resultDto44.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList94);
        resultDto0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList94);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(answerDtoArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(testDto21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(answerDtoArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(testDto65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNull(testDto67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertNotNull(answerDtoArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository2 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper3 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig4 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl5 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository6 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository7 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository8 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper9 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository6, testRepository7, answerRepository8);
        ma.glasnost.orika.MapperFacade mapperFacade10 = null;
        submitResultRequestToDomainMapper9.setMapperFacade(mapperFacade10);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType12 = submitResultRequestToDomainMapper9.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper13 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper14 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean15 = createPostRequestToPostMapper14.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper16 = null;
        ma.glasnost.orika.MapperFacade mapperFacade17 = mapperConfig4.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl5, submitResultRequestToDomainMapper9, resultToDescriptionMapper13, createPostRequestToPostMapper14, postToDtoMapper16);
        postToDtoMapper3.setMapperFacade(mapperFacade17);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository19 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig20 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl21 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository22 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository23 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository24 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper25 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository22, testRepository23, answerRepository24);
        ma.glasnost.orika.MapperFacade mapperFacade26 = null;
        submitResultRequestToDomainMapper25.setMapperFacade(mapperFacade26);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType28 = submitResultRequestToDomainMapper25.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper29 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper30 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean31 = createPostRequestToPostMapper30.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper32 = null;
        ma.glasnost.orika.MapperFacade mapperFacade33 = mapperConfig20.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl21, submitResultRequestToDomainMapper25, resultToDescriptionMapper29, createPostRequestToPostMapper30, postToDtoMapper32);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl34 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository35 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository36 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository37 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper38 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository35, testRepository36, answerRepository37);
        ma.glasnost.orika.MapperFacade mapperFacade39 = null;
        submitResultRequestToDomainMapper38.setMapperFacade(mapperFacade39);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType41 = submitResultRequestToDomainMapper38.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper42 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig43 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl44 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository45 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository46 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository47 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper48 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository45, testRepository46, answerRepository47);
        ma.glasnost.orika.MapperFacade mapperFacade49 = null;
        submitResultRequestToDomainMapper48.setMapperFacade(mapperFacade49);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType51 = submitResultRequestToDomainMapper48.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper52 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper53 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean54 = createPostRequestToPostMapper53.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper55 = null;
        ma.glasnost.orika.MapperFacade mapperFacade56 = mapperConfig43.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl44, submitResultRequestToDomainMapper48, resultToDescriptionMapper52, createPostRequestToPostMapper53, postToDtoMapper55);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper57 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade58 = mapperConfig20.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl34, submitResultRequestToDomainMapper38, resultToDescriptionMapper42, createPostRequestToPostMapper53, postToDtoMapper57);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl59 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository2, mapperFacade17, userRepository19, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl34);
        com.vntu.marenko.ualearning.server.controller.UserController userController60 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade17);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper61 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig62 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl63 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository64 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository65 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository66 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper67 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository64, testRepository65, answerRepository66);
        ma.glasnost.orika.MapperFacade mapperFacade68 = null;
        submitResultRequestToDomainMapper67.setMapperFacade(mapperFacade68);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType70 = submitResultRequestToDomainMapper67.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper71 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper72 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean73 = createPostRequestToPostMapper72.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper74 = null;
        ma.glasnost.orika.MapperFacade mapperFacade75 = mapperConfig62.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl63, submitResultRequestToDomainMapper67, resultToDescriptionMapper71, createPostRequestToPostMapper72, postToDtoMapper74);
        postToDtoMapper61.setMapperFacade(mapperFacade75);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController77 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade75);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository78 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl79 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository78);
        com.vntu.marenko.ualearning.server.controller.PostController postController80 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade75, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl79);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.PostDto postDto82 = postController80.getPost((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
        org.junit.Assert.assertNotNull(resultType28);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNotNull(mapperFacade33);
        org.junit.Assert.assertNotNull(resultType41);
        org.junit.Assert.assertNotNull(resultType51);
        org.junit.Assert.assertEquals("'" + boolean54 + "' != '" + false + "'", boolean54, false);
        org.junit.Assert.assertNotNull(mapperFacade56);
        org.junit.Assert.assertNotNull(mapperFacade58);
        org.junit.Assert.assertNotNull(resultType70);
        org.junit.Assert.assertEquals("'" + boolean73 + "' != '" + false + "'", boolean73, false);
        org.junit.Assert.assertNotNull(mapperFacade75);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto2 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        int int3 = postDto2.getId();
        java.lang.String str4 = postDto2.getTimestamp();
        java.lang.String str5 = postDto2.getTimestamp();
        postDto2.setId((int) ' ');
        boolean boolean8 = userRequest0.equals((java.lang.Object) postDto2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository0 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig1 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = submitResultRequestToDomainMapper6.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper10 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper11 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean12 = createPostRequestToPostMapper11.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = null;
        ma.glasnost.orika.MapperFacade mapperFacade14 = mapperConfig1.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2, submitResultRequestToDomainMapper6, resultToDescriptionMapper10, createPostRequestToPostMapper11, postToDtoMapper13);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository15 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository16 = null;
        ma.glasnost.orika.MapperFacade mapperFacade17 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository18 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto19 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl20 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean21 = answerDto19.equals((java.lang.Object) markComputerImpl20);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl22 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository16, mapperFacade17, userRepository18, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl20);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl23 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository0, mapperFacade14, userRepository15, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl20);
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        com.vntu.marenko.ualearning.server.controller.ResultController resultController25 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl23, mapperFacade24);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository27 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl28 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository27);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository29 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig30 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl31 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository32 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository33 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository34 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper35 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository32, testRepository33, answerRepository34);
        ma.glasnost.orika.MapperFacade mapperFacade36 = null;
        submitResultRequestToDomainMapper35.setMapperFacade(mapperFacade36);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType38 = submitResultRequestToDomainMapper35.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper39 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper40 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean41 = createPostRequestToPostMapper40.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper42 = null;
        ma.glasnost.orika.MapperFacade mapperFacade43 = mapperConfig30.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl31, submitResultRequestToDomainMapper35, resultToDescriptionMapper39, createPostRequestToPostMapper40, postToDtoMapper42);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository44 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository45 = null;
        ma.glasnost.orika.MapperFacade mapperFacade46 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository47 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto48 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl49 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean50 = answerDto48.equals((java.lang.Object) markComputerImpl49);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl51 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository45, mapperFacade46, userRepository47, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl49);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl52 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository29, mapperFacade43, userRepository44, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl49);
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository53 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository54 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl55 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository53, tagRepository54);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper56 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig57 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl58 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository59 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository60 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository61 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper62 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository59, testRepository60, answerRepository61);
        ma.glasnost.orika.MapperFacade mapperFacade63 = null;
        submitResultRequestToDomainMapper62.setMapperFacade(mapperFacade63);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType65 = submitResultRequestToDomainMapper62.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper66 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper67 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean68 = createPostRequestToPostMapper67.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper69 = null;
        ma.glasnost.orika.MapperFacade mapperFacade70 = mapperConfig57.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl58, submitResultRequestToDomainMapper62, resultToDescriptionMapper66, createPostRequestToPostMapper67, postToDtoMapper69);
        postToDtoMapper56.setMapperFacade(mapperFacade70);
        com.vntu.marenko.ualearning.server.controller.TestController testController72 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl55, mapperFacade70);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController73 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl52, mapperFacade70);
        com.vntu.marenko.ualearning.server.controller.UserController userController74 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl28, mapperFacade70);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository75 = null;
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl76 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper77 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl76);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl78 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository26, mapperFacade70, userRepository75, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl76);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController79 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl23, mapperFacade70);
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(resultType38);
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + false + "'", boolean41, false);
        org.junit.Assert.assertNotNull(mapperFacade43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(resultType65);
        org.junit.Assert.assertEquals("'" + boolean68 + "' != '" + false + "'", boolean68, false);
        org.junit.Assert.assertNotNull(mapperFacade70);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setRating(0);
        java.lang.String str3 = userDto0.getLogin();
        userDto0.setInstitution("LoginRequest(login=null, password=TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=100, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)]))");
        userDto0.setEmail("ResultDto(id=100, user=UserDto(login=LoginRequest(login=null, password=null), name=null, surname=null, age=0, institution=null, email=null, rating=-1), test=null, submitted=false, answers=null, mark=0)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.getEmail();
        userRequest0.setLogin("CreatePostRequest(text=ResultDescription(id=0, testId=null, testName=null, mark=1), username=null)");
        java.lang.String str6 = userRequest0.getEmail();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto7 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto7.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto10 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto11 = null;
        resultDto10.setTest(testDto11);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto13 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl14 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean15 = answerDto13.equals((java.lang.Object) markComputerImpl14);
        int int16 = answerDto13.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto17 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto17.setText("hi!");
        java.lang.String str20 = answerDto17.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto21 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl22 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean23 = answerDto21.equals((java.lang.Object) markComputerImpl22);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto24 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl25 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean26 = answerDto24.equals((java.lang.Object) markComputerImpl25);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray27 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto13, answerDto17, answerDto21, answerDto24 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList28 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList28, answerDtoArray27);
        resultDto10.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList28);
        questionDto7.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList28);
        com.vntu.marenko.ualearning.server.model.User user32 = new com.vntu.marenko.ualearning.server.model.User();
        user32.setEmail("hi!");
        user32.setSurname("hi!");
        user32.setInstitution("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        boolean boolean39 = questionDto7.equals((java.lang.Object) user32);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList40 = questionDto7.getAnswers();
        boolean boolean41 = userRequest0.equals((java.lang.Object) answerDtoList40);
        userRequest0.setAge(35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(answerDtoArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(answerDtoList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag0.setName("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.Integer int3 = tag0.getId();
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest4 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str5 = userRequest4.getName();
        java.lang.String str6 = userRequest4.getName();
        java.lang.String str7 = userRequest4.getPassword();
        userRequest4.setLogin("TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        userRequest4.setPassword("QuestionDto(id=10, text=ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0), answers=null)");
        userRequest4.setLogin("CreatePostRequest(text=null, username=null)");
        boolean boolean14 = tag0.equals((java.lang.Object) "CreatePostRequest(text=null, username=null)");
        java.lang.String str15 = tag0.toString();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))" + "'", str15, "Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setEmail("hi!");
        user0.setSurname("hi!");
        long long5 = user0.getRating();
        java.lang.String str6 = user0.getLogin();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getInstitution();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository1 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl2 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository0, tagRepository1);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper3 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig4 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl5 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository6 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository7 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository8 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper9 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository6, testRepository7, answerRepository8);
        ma.glasnost.orika.MapperFacade mapperFacade10 = null;
        submitResultRequestToDomainMapper9.setMapperFacade(mapperFacade10);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType12 = submitResultRequestToDomainMapper9.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper13 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper14 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean15 = createPostRequestToPostMapper14.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper16 = null;
        ma.glasnost.orika.MapperFacade mapperFacade17 = mapperConfig4.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl5, submitResultRequestToDomainMapper9, resultToDescriptionMapper13, createPostRequestToPostMapper14, postToDtoMapper16);
        postToDtoMapper3.setMapperFacade(mapperFacade17);
        com.vntu.marenko.ualearning.server.controller.TestController testController19 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade17);
        ma.glasnost.orika.MapperFacade mapperFacade20 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController21 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade20);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper22 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean23 = createPostRequestToPostMapper22.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig24 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl25 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository28 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper29 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository26, testRepository27, answerRepository28);
        ma.glasnost.orika.MapperFacade mapperFacade30 = null;
        submitResultRequestToDomainMapper29.setMapperFacade(mapperFacade30);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType32 = submitResultRequestToDomainMapper29.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper33 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper34 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean35 = createPostRequestToPostMapper34.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper36 = null;
        ma.glasnost.orika.MapperFacade mapperFacade37 = mapperConfig24.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl25, submitResultRequestToDomainMapper29, resultToDescriptionMapper33, createPostRequestToPostMapper34, postToDtoMapper36);
        createPostRequestToPostMapper22.setMapperFacade(mapperFacade37);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository39 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository40 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository41 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper42 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository39, testRepository40, answerRepository41);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType43 = submitResultRequestToDomainMapper42.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper44 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig45 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl46 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository47 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository48 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository49 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper50 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository47, testRepository48, answerRepository49);
        ma.glasnost.orika.MapperFacade mapperFacade51 = null;
        submitResultRequestToDomainMapper50.setMapperFacade(mapperFacade51);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType53 = submitResultRequestToDomainMapper50.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper54 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper55 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean56 = createPostRequestToPostMapper55.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper57 = null;
        ma.glasnost.orika.MapperFacade mapperFacade58 = mapperConfig45.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl46, submitResultRequestToDomainMapper50, resultToDescriptionMapper54, createPostRequestToPostMapper55, postToDtoMapper57);
        postToDtoMapper44.setMapperFacade(mapperFacade58);
        submitResultRequestToDomainMapper42.setMapperFacade(mapperFacade58);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository61 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl62 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository61);
        com.vntu.marenko.ualearning.server.controller.PostController postController63 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade58, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl62);
        com.vntu.marenko.ualearning.server.controller.PostController postController64 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade37, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl62);
        com.vntu.marenko.ualearning.server.controller.TestController testController65 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.dto.TestDescription> testDescriptionList67 = testController65.getTestDescriptionsForTag((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(resultType32);
        org.junit.Assert.assertEquals("'" + boolean35 + "' != '" + false + "'", boolean35, false);
        org.junit.Assert.assertNotNull(mapperFacade37);
        org.junit.Assert.assertNotNull(resultType43);
        org.junit.Assert.assertNotNull(resultType53);
        org.junit.Assert.assertEquals("'" + boolean56 + "' != '" + false + "'", boolean56, false);
        org.junit.Assert.assertNotNull(mapperFacade58);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int4 = test3.getId();
        java.lang.Integer int5 = test3.getId();
        test3.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int8 = test3.getCompletedCounter();
        result0.setTest(test3);
        com.vntu.marenko.ualearning.server.model.Test test10 = result0.getTest();
        com.vntu.marenko.ualearning.server.model.User user11 = result0.getUser();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto12 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto12.setId((int) (byte) 100);
        java.lang.String str15 = postDto12.getTimestamp();
        boolean boolean16 = result0.equals((java.lang.Object) postDto12);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(test10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper3 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType4 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType5 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType6 = resultToDescriptionMapper3.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType7 = resultToDescriptionMapper3.getAType();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper8 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean9 = createPostRequestToPostMapper8.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig10 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl11 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository13 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository14 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper15 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository12, testRepository13, answerRepository14);
        ma.glasnost.orika.MapperFacade mapperFacade16 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade16);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType18 = submitResultRequestToDomainMapper15.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper19 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper20 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean21 = createPostRequestToPostMapper20.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper22 = null;
        ma.glasnost.orika.MapperFacade mapperFacade23 = mapperConfig10.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl11, submitResultRequestToDomainMapper15, resultToDescriptionMapper19, createPostRequestToPostMapper20, postToDtoMapper22);
        createPostRequestToPostMapper8.setMapperFacade(mapperFacade23);
        resultToDescriptionMapper3.setMapperFacade(mapperFacade23);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController26 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade23);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository28 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository29 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper30 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository27, testRepository28, answerRepository29);
        ma.glasnost.orika.MapperFacade mapperFacade31 = null;
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade31);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType33 = submitResultRequestToDomainMapper30.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper34 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig35 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl36 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository37 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository38 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository39 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper40 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository37, testRepository38, answerRepository39);
        ma.glasnost.orika.MapperFacade mapperFacade41 = null;
        submitResultRequestToDomainMapper40.setMapperFacade(mapperFacade41);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType43 = submitResultRequestToDomainMapper40.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper44 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper45 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean46 = createPostRequestToPostMapper45.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper47 = null;
        ma.glasnost.orika.MapperFacade mapperFacade48 = mapperConfig35.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl36, submitResultRequestToDomainMapper40, resultToDescriptionMapper44, createPostRequestToPostMapper45, postToDtoMapper47);
        postToDtoMapper34.setMapperFacade(mapperFacade48);
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade48);
        com.vntu.marenko.ualearning.server.service.UserService userService51 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper52 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig53 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl54 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository55 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository56 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository57 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper58 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository55, testRepository56, answerRepository57);
        ma.glasnost.orika.MapperFacade mapperFacade59 = null;
        submitResultRequestToDomainMapper58.setMapperFacade(mapperFacade59);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType61 = submitResultRequestToDomainMapper58.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper62 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper63 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean64 = createPostRequestToPostMapper63.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper65 = null;
        ma.glasnost.orika.MapperFacade mapperFacade66 = mapperConfig53.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl54, submitResultRequestToDomainMapper58, resultToDescriptionMapper62, createPostRequestToPostMapper63, postToDtoMapper65);
        postToDtoMapper52.setMapperFacade(mapperFacade66);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController68 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService51, mapperFacade66);
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade66);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController70 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade66);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository71 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig72 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl73 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository74 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository75 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository76 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper77 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository74, testRepository75, answerRepository76);
        ma.glasnost.orika.MapperFacade mapperFacade78 = null;
        submitResultRequestToDomainMapper77.setMapperFacade(mapperFacade78);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType80 = submitResultRequestToDomainMapper77.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper81 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper82 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean83 = createPostRequestToPostMapper82.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper84 = null;
        ma.glasnost.orika.MapperFacade mapperFacade85 = mapperConfig72.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl73, submitResultRequestToDomainMapper77, resultToDescriptionMapper81, createPostRequestToPostMapper82, postToDtoMapper84);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository86 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository87 = null;
        ma.glasnost.orika.MapperFacade mapperFacade88 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository89 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto90 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl91 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean92 = answerDto90.equals((java.lang.Object) markComputerImpl91);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl93 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository87, mapperFacade88, userRepository89, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl91);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl94 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository71, mapperFacade85, userRepository86, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl91);
        com.vntu.marenko.ualearning.server.controller.UserController userController95 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade85);
        org.junit.Assert.assertNotNull(resultType4);
        org.junit.Assert.assertNotNull(resultType5);
        org.junit.Assert.assertNotNull(resultDescriptionType6);
        org.junit.Assert.assertNotNull(resultType7);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(resultType18);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertNotNull(mapperFacade23);
        org.junit.Assert.assertNotNull(resultType33);
        org.junit.Assert.assertNotNull(resultType43);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + false + "'", boolean46, false);
        org.junit.Assert.assertNotNull(mapperFacade48);
        org.junit.Assert.assertNotNull(resultType61);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
        org.junit.Assert.assertNotNull(mapperFacade66);
        org.junit.Assert.assertNotNull(resultType80);
        org.junit.Assert.assertEquals("'" + boolean83 + "' != '" + false + "'", boolean83, false);
        org.junit.Assert.assertNotNull(mapperFacade85);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper2 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType3 = createPostRequestToPostMapper2.getBType();
        com.vntu.marenko.ualearning.server.model.Post post4 = new com.vntu.marenko.ualearning.server.model.Post();
        post4.setText("");
        java.lang.String str7 = post4.toString();
        post4.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest10 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest10.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext13 = null;
        createPostRequestToPostMapper2.mapBtoA(post4, createPostRequest10, mappingContext13);
        java.lang.Boolean boolean15 = createPostRequestToPostMapper2.favorsExtension();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository16 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig17 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl18 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository19 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository21 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper22 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository19, testRepository20, answerRepository21);
        ma.glasnost.orika.MapperFacade mapperFacade23 = null;
        submitResultRequestToDomainMapper22.setMapperFacade(mapperFacade23);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType25 = submitResultRequestToDomainMapper22.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper26 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper27 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean28 = createPostRequestToPostMapper27.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper29 = null;
        ma.glasnost.orika.MapperFacade mapperFacade30 = mapperConfig17.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl18, submitResultRequestToDomainMapper22, resultToDescriptionMapper26, createPostRequestToPostMapper27, postToDtoMapper29);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository31 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository32 = null;
        ma.glasnost.orika.MapperFacade mapperFacade33 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository34 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto35 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl36 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean37 = answerDto35.equals((java.lang.Object) markComputerImpl36);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl38 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository32, mapperFacade33, userRepository34, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl36);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl39 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository16, mapperFacade30, userRepository31, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl36);
        createPostRequestToPostMapper2.setMapperFacade(mapperFacade30);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController41 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade30);
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest42 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str43 = loginRequest42.toString();
        java.lang.String str44 = loginRequest42.getLogin();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = authorisationController41.login(loginRequest42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(postType3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str7, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(resultType25);
        org.junit.Assert.assertEquals("'" + boolean28 + "' != '" + false + "'", boolean28, false);
        org.junit.Assert.assertNotNull(mapperFacade30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str43, "LoginRequest(login=null, password=null)");
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        java.lang.String str3 = userDto0.getInstitution();
        java.lang.String str4 = userDto0.getInstitution();
        userDto0.setSurname("Test(id=null, nameTest=null, descriptionTest=TestDescription(id=-1, nameTest=TagDto(id=0, name=null)), completedCounter=null, questions=null, tags=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto0.setText("hi!");
        int int3 = answerDto0.getId();
        answerDto0.setText("Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.vntu.marenko.ualearning.server.model.Test test0 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int1 = test0.getId();
        java.lang.Integer int2 = test0.getId();
        test0.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository5 = null;
        ma.glasnost.orika.MapperFacade mapperFacade6 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository7 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer8 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl9 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository5, mapperFacade6, userRepository7, markComputer8);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper10 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean11 = createPostRequestToPostMapper10.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig12 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl13 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository14 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository15 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository16 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper17 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository14, testRepository15, answerRepository16);
        ma.glasnost.orika.MapperFacade mapperFacade18 = null;
        submitResultRequestToDomainMapper17.setMapperFacade(mapperFacade18);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType20 = submitResultRequestToDomainMapper17.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper21 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper22 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean23 = createPostRequestToPostMapper22.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper24 = null;
        ma.glasnost.orika.MapperFacade mapperFacade25 = mapperConfig12.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl13, submitResultRequestToDomainMapper17, resultToDescriptionMapper21, createPostRequestToPostMapper22, postToDtoMapper24);
        createPostRequestToPostMapper10.setMapperFacade(mapperFacade25);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController27 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl9, mapperFacade25);
        boolean boolean28 = test0.equals((java.lang.Object) resultController27);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest29 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest29.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        submitResultRequest29.setTestId((int) (byte) 100);
        submitResultRequest29.setUserLogin("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        int int36 = submitResultRequest29.getTestId();
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.ResultDto resultDto37 = resultController27.submitTest(submitResultRequest29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNotNull(resultType20);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(mapperFacade25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig0 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl1 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository2 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository4 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper5 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository2, testRepository3, answerRepository4);
        ma.glasnost.orika.MapperFacade mapperFacade6 = null;
        submitResultRequestToDomainMapper5.setMapperFacade(mapperFacade6);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType8 = submitResultRequestToDomainMapper5.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper9 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper10 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean11 = createPostRequestToPostMapper10.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper12 = null;
        ma.glasnost.orika.MapperFacade mapperFacade13 = mapperConfig0.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl1, submitResultRequestToDomainMapper5, resultToDescriptionMapper9, createPostRequestToPostMapper10, postToDtoMapper12);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl14 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository15 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository16 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository17 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper18 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository15, testRepository16, answerRepository17);
        ma.glasnost.orika.MapperFacade mapperFacade19 = null;
        submitResultRequestToDomainMapper18.setMapperFacade(mapperFacade19);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType21 = submitResultRequestToDomainMapper18.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper22 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig23 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl24 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository25 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository27 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper28 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository25, testRepository26, answerRepository27);
        ma.glasnost.orika.MapperFacade mapperFacade29 = null;
        submitResultRequestToDomainMapper28.setMapperFacade(mapperFacade29);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType31 = submitResultRequestToDomainMapper28.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper32 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper33 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean34 = createPostRequestToPostMapper33.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper35 = null;
        ma.glasnost.orika.MapperFacade mapperFacade36 = mapperConfig23.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl24, submitResultRequestToDomainMapper28, resultToDescriptionMapper32, createPostRequestToPostMapper33, postToDtoMapper35);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper37 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade38 = mapperConfig0.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl14, submitResultRequestToDomainMapper18, resultToDescriptionMapper22, createPostRequestToPostMapper33, postToDtoMapper37);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper39 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType40 = createPostRequestToPostMapper39.getBType();
        com.vntu.marenko.ualearning.server.model.Post post41 = new com.vntu.marenko.ualearning.server.model.Post();
        post41.setText("");
        java.lang.String str44 = post41.toString();
        post41.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest47 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest47.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext50 = null;
        createPostRequestToPostMapper39.mapBtoA(post41, createPostRequest47, mappingContext50);
        com.vntu.marenko.ualearning.server.model.Post post52 = new com.vntu.marenko.ualearning.server.model.Post();
        post52.setText("");
        java.lang.String str55 = post52.toString();
        java.lang.Integer int56 = post52.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest57 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str58 = createPostRequest57.getUsername();
        java.lang.String str59 = createPostRequest57.toString();
        ma.glasnost.orika.MappingContext mappingContext60 = null;
        createPostRequestToPostMapper39.mapBtoA(post52, createPostRequest57, mappingContext60);
        java.lang.String str62 = createPostRequest57.toString();
        com.vntu.marenko.ualearning.server.model.Post post63 = new com.vntu.marenko.ualearning.server.model.Post();
        post63.setText("");
        java.lang.String str66 = post63.toString();
        post63.setUser("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext69 = null;
        createPostRequestToPostMapper33.mapAtoB(createPostRequest57, post63, mappingContext69);
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository71 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository72 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl73 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository71, tagRepository72);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper74 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig75 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl76 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository77 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository78 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository79 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper80 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository77, testRepository78, answerRepository79);
        ma.glasnost.orika.MapperFacade mapperFacade81 = null;
        submitResultRequestToDomainMapper80.setMapperFacade(mapperFacade81);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType83 = submitResultRequestToDomainMapper80.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper84 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper85 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean86 = createPostRequestToPostMapper85.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper87 = null;
        ma.glasnost.orika.MapperFacade mapperFacade88 = mapperConfig75.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl76, submitResultRequestToDomainMapper80, resultToDescriptionMapper84, createPostRequestToPostMapper85, postToDtoMapper87);
        postToDtoMapper74.setMapperFacade(mapperFacade88);
        com.vntu.marenko.ualearning.server.controller.TestController testController90 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl73, mapperFacade88);
        createPostRequestToPostMapper33.setMapperFacade(mapperFacade88);
        org.junit.Assert.assertNotNull(resultType8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNotNull(mapperFacade13);
        org.junit.Assert.assertNotNull(resultType21);
        org.junit.Assert.assertNotNull(resultType31);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + false + "'", boolean34, false);
        org.junit.Assert.assertNotNull(mapperFacade36);
        org.junit.Assert.assertNotNull(mapperFacade38);
        org.junit.Assert.assertNotNull(postType40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str44, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str55, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str59, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str62, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str66, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNotNull(resultType83);
        org.junit.Assert.assertEquals("'" + boolean86 + "' != '" + false + "'", boolean86, false);
        org.junit.Assert.assertNotNull(mapperFacade88);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.vntu.marenko.ualearning.server.model.Question question0 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str1 = question0.getText();
        java.lang.Integer int2 = question0.getId();
        com.vntu.marenko.ualearning.server.service.TestService testService3 = null;
        ma.glasnost.orika.MapperFacade mapperFacade4 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController5 = new com.vntu.marenko.ualearning.server.controller.TestController(testService3, mapperFacade4);
        boolean boolean6 = question0.equals((java.lang.Object) testController5);
        question0.setText("Result(id=null, user=User(login=null, password=null, name=null, surname=, age=0, institution=null, email=Post(id=null, text=, timestamp=null, user=null, likes=null), rating=0), test=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), submitted=false, answers=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper0 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType1 = createPostRequestToPostMapper0.getBType();
        com.vntu.marenko.ualearning.server.model.Post post2 = new com.vntu.marenko.ualearning.server.model.Post();
        post2.setText("");
        java.lang.String str5 = post2.toString();
        post2.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest8 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest8.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext11 = null;
        createPostRequestToPostMapper0.mapBtoA(post2, createPostRequest8, mappingContext11);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType13 = createPostRequestToPostMapper0.getBType();
        com.vntu.marenko.ualearning.server.service.UserService userService14 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper15 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig16 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl17 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository18 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository19 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository20 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper21 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository18, testRepository19, answerRepository20);
        ma.glasnost.orika.MapperFacade mapperFacade22 = null;
        submitResultRequestToDomainMapper21.setMapperFacade(mapperFacade22);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType24 = submitResultRequestToDomainMapper21.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper25 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper26 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean27 = createPostRequestToPostMapper26.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper28 = null;
        ma.glasnost.orika.MapperFacade mapperFacade29 = mapperConfig16.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl17, submitResultRequestToDomainMapper21, resultToDescriptionMapper25, createPostRequestToPostMapper26, postToDtoMapper28);
        postToDtoMapper15.setMapperFacade(mapperFacade29);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType31 = postToDtoMapper15.getBType();
        java.lang.Boolean boolean32 = postToDtoMapper15.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper33 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType34 = createPostRequestToPostMapper33.getBType();
        com.vntu.marenko.ualearning.server.model.Post post35 = new com.vntu.marenko.ualearning.server.model.Post();
        post35.setText("");
        java.lang.String str38 = post35.toString();
        post35.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest41 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest41.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext44 = null;
        createPostRequestToPostMapper33.mapBtoA(post35, createPostRequest41, mappingContext44);
        com.vntu.marenko.ualearning.server.model.Post post46 = new com.vntu.marenko.ualearning.server.model.Post();
        post46.setText("");
        java.lang.String str49 = post46.toString();
        java.lang.Integer int50 = post46.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest51 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str52 = createPostRequest51.getUsername();
        java.lang.String str53 = createPostRequest51.toString();
        ma.glasnost.orika.MappingContext mappingContext54 = null;
        createPostRequestToPostMapper33.mapBtoA(post46, createPostRequest51, mappingContext54);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository56 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository57 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository58 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper59 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository56, testRepository57, answerRepository58);
        ma.glasnost.orika.MapperFacade mapperFacade60 = null;
        submitResultRequestToDomainMapper59.setMapperFacade(mapperFacade60);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType62 = submitResultRequestToDomainMapper59.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper63 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig64 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl65 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository66 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository67 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository68 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper69 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository66, testRepository67, answerRepository68);
        ma.glasnost.orika.MapperFacade mapperFacade70 = null;
        submitResultRequestToDomainMapper69.setMapperFacade(mapperFacade70);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType72 = submitResultRequestToDomainMapper69.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper73 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper74 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean75 = createPostRequestToPostMapper74.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper76 = null;
        ma.glasnost.orika.MapperFacade mapperFacade77 = mapperConfig64.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl65, submitResultRequestToDomainMapper69, resultToDescriptionMapper73, createPostRequestToPostMapper74, postToDtoMapper76);
        postToDtoMapper63.setMapperFacade(mapperFacade77);
        submitResultRequestToDomainMapper59.setMapperFacade(mapperFacade77);
        createPostRequestToPostMapper33.setMapperFacade(mapperFacade77);
        postToDtoMapper15.setMapperFacade(mapperFacade77);
        com.vntu.marenko.ualearning.server.controller.UserController userController82 = new com.vntu.marenko.ualearning.server.controller.UserController(userService14, mapperFacade77);
        createPostRequestToPostMapper0.setMapperFacade(mapperFacade77);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType84 = createPostRequestToPostMapper0.getBType();
        org.junit.Assert.assertNotNull(postType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str5, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNotNull(postType13);
        org.junit.Assert.assertNotNull(resultType24);
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + false + "'", boolean27, false);
        org.junit.Assert.assertNotNull(mapperFacade29);
        org.junit.Assert.assertNotNull(postDtoType31);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + false + "'", boolean32, false);
        org.junit.Assert.assertNotNull(postType34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str38, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str49, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str53, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(resultType62);
        org.junit.Assert.assertNotNull(resultType72);
        org.junit.Assert.assertEquals("'" + boolean75 + "' != '" + false + "'", boolean75, false);
        org.junit.Assert.assertNotNull(mapperFacade77);
        org.junit.Assert.assertNotNull(postType84);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.vntu.marenko.ualearning.server.dto.TestDescription testDescription0 = new com.vntu.marenko.ualearning.server.dto.TestDescription();
        testDescription0.setNameTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        testDescription0.setNameTest("hi!");
        int int5 = testDescription0.getId();
        testDescription0.setId((int) (byte) 1);
        int int8 = testDescription0.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.vntu.marenko.ualearning.server.model.Question question0 = new com.vntu.marenko.ualearning.server.model.Question();
        question0.setText("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.String str3 = question0.getText();
        com.vntu.marenko.ualearning.server.model.Result result4 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int5 = result4.getId();
        com.vntu.marenko.ualearning.server.model.Test test6 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int7 = test6.getId();
        java.lang.Integer int8 = test6.getId();
        result4.setTest(test6);
        java.lang.Integer int10 = result4.getId();
        com.vntu.marenko.ualearning.server.model.Test test11 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int12 = test11.getId();
        java.lang.Integer int13 = test11.getId();
        test11.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int16 = test11.getCompletedCounter();
        java.lang.Integer int17 = test11.getCompletedCounter();
        result4.setTest(test11);
        com.vntu.marenko.ualearning.server.model.User user19 = result4.getUser();
        com.vntu.marenko.ualearning.server.model.Test test20 = result4.getTest();
        com.vntu.marenko.ualearning.server.model.Test test21 = result4.getTest();
        java.lang.Integer int22 = result4.getId();
        com.vntu.marenko.ualearning.server.model.Result result23 = new com.vntu.marenko.ualearning.server.model.Result();
        result23.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user26 = new com.vntu.marenko.ualearning.server.model.User();
        user26.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test29 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean30 = user26.equals((java.lang.Object) test29);
        user26.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result23.setUser(user26);
        com.vntu.marenko.ualearning.server.model.Question question34 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int35 = question34.getId();
        java.lang.Integer int36 = question34.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer37 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer38 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer38.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray41 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer37, answer38 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList42 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList42, answerArray41);
        question34.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList42);
        result23.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList42);
        result4.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList42);
        question0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList42);
        question0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)" + "'", str3, "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNotNull(test20);
        org.junit.Assert.assertNotNull(test21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(answerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType9 = submitResultRequestToDomainMapper6.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade10 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade10);
        boolean boolean12 = user0.equals((java.lang.Object) submitResultRequestToDomainMapper6);
        com.vntu.marenko.ualearning.server.model.Result result13 = new com.vntu.marenko.ualearning.server.model.Result();
        result13.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user16 = new com.vntu.marenko.ualearning.server.model.User();
        user16.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test19 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean20 = user16.equals((java.lang.Object) test19);
        user16.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result13.setUser(user16);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest24 = null;
        ma.glasnost.orika.MappingContext mappingContext25 = null;
        submitResultRequestToDomainMapper6.mapBtoA(result13, submitResultRequest24, mappingContext25);
        com.vntu.marenko.ualearning.server.model.User user27 = result13.getUser();
        com.vntu.marenko.ualearning.server.model.User user28 = result13.getUser();
        long long29 = user28.getRating();
        org.junit.Assert.assertNotNull(submitResultRequestType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository1 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl2 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository0, tagRepository1);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper3 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig4 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl5 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository6 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository7 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository8 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper9 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository6, testRepository7, answerRepository8);
        ma.glasnost.orika.MapperFacade mapperFacade10 = null;
        submitResultRequestToDomainMapper9.setMapperFacade(mapperFacade10);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType12 = submitResultRequestToDomainMapper9.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper13 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper14 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean15 = createPostRequestToPostMapper14.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper16 = null;
        ma.glasnost.orika.MapperFacade mapperFacade17 = mapperConfig4.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl5, submitResultRequestToDomainMapper9, resultToDescriptionMapper13, createPostRequestToPostMapper14, postToDtoMapper16);
        postToDtoMapper3.setMapperFacade(mapperFacade17);
        com.vntu.marenko.ualearning.server.controller.TestController testController19 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade17);
        ma.glasnost.orika.MapperFacade mapperFacade20 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController21 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade20);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper22 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean23 = createPostRequestToPostMapper22.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig24 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl25 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository28 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper29 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository26, testRepository27, answerRepository28);
        ma.glasnost.orika.MapperFacade mapperFacade30 = null;
        submitResultRequestToDomainMapper29.setMapperFacade(mapperFacade30);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType32 = submitResultRequestToDomainMapper29.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper33 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper34 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean35 = createPostRequestToPostMapper34.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper36 = null;
        ma.glasnost.orika.MapperFacade mapperFacade37 = mapperConfig24.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl25, submitResultRequestToDomainMapper29, resultToDescriptionMapper33, createPostRequestToPostMapper34, postToDtoMapper36);
        createPostRequestToPostMapper22.setMapperFacade(mapperFacade37);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository39 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository40 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository41 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper42 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository39, testRepository40, answerRepository41);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType43 = submitResultRequestToDomainMapper42.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper44 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig45 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl46 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository47 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository48 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository49 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper50 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository47, testRepository48, answerRepository49);
        ma.glasnost.orika.MapperFacade mapperFacade51 = null;
        submitResultRequestToDomainMapper50.setMapperFacade(mapperFacade51);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType53 = submitResultRequestToDomainMapper50.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper54 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper55 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean56 = createPostRequestToPostMapper55.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper57 = null;
        ma.glasnost.orika.MapperFacade mapperFacade58 = mapperConfig45.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl46, submitResultRequestToDomainMapper50, resultToDescriptionMapper54, createPostRequestToPostMapper55, postToDtoMapper57);
        postToDtoMapper44.setMapperFacade(mapperFacade58);
        submitResultRequestToDomainMapper42.setMapperFacade(mapperFacade58);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository61 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl62 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository61);
        com.vntu.marenko.ualearning.server.controller.PostController postController63 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade58, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl62);
        com.vntu.marenko.ualearning.server.controller.PostController postController64 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade37, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl62);
        com.vntu.marenko.ualearning.server.controller.TestController testController65 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.model.Test> testList67 = testServiceImpl2.getTestsWithTag((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(resultType32);
        org.junit.Assert.assertEquals("'" + boolean35 + "' != '" + false + "'", boolean35, false);
        org.junit.Assert.assertNotNull(mapperFacade37);
        org.junit.Assert.assertNotNull(resultType43);
        org.junit.Assert.assertNotNull(resultType53);
        org.junit.Assert.assertEquals("'" + boolean56 + "' != '" + false + "'", boolean56, false);
        org.junit.Assert.assertNotNull(mapperFacade58);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper0 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType1 = createPostRequestToPostMapper0.getBType();
        com.vntu.marenko.ualearning.server.model.Post post2 = new com.vntu.marenko.ualearning.server.model.Post();
        post2.setText("");
        java.lang.String str5 = post2.toString();
        post2.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest8 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest8.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext11 = null;
        createPostRequestToPostMapper0.mapBtoA(post2, createPostRequest8, mappingContext11);
        java.lang.Boolean boolean13 = createPostRequestToPostMapper0.favorsExtension();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository14 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository15 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl16 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository15);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository17 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig18 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl19 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository22 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper23 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository20, testRepository21, answerRepository22);
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade24);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType26 = submitResultRequestToDomainMapper23.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper27 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean29 = createPostRequestToPostMapper28.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper30 = null;
        ma.glasnost.orika.MapperFacade mapperFacade31 = mapperConfig18.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl19, submitResultRequestToDomainMapper23, resultToDescriptionMapper27, createPostRequestToPostMapper28, postToDtoMapper30);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository32 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository33 = null;
        ma.glasnost.orika.MapperFacade mapperFacade34 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository35 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto36 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl37 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean38 = answerDto36.equals((java.lang.Object) markComputerImpl37);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl39 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository33, mapperFacade34, userRepository35, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl37);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl40 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository17, mapperFacade31, userRepository32, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl37);
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository41 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository42 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl43 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository41, tagRepository42);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper44 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig45 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl46 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository47 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository48 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository49 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper50 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository47, testRepository48, answerRepository49);
        ma.glasnost.orika.MapperFacade mapperFacade51 = null;
        submitResultRequestToDomainMapper50.setMapperFacade(mapperFacade51);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType53 = submitResultRequestToDomainMapper50.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper54 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper55 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean56 = createPostRequestToPostMapper55.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper57 = null;
        ma.glasnost.orika.MapperFacade mapperFacade58 = mapperConfig45.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl46, submitResultRequestToDomainMapper50, resultToDescriptionMapper54, createPostRequestToPostMapper55, postToDtoMapper57);
        postToDtoMapper44.setMapperFacade(mapperFacade58);
        com.vntu.marenko.ualearning.server.controller.TestController testController60 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl43, mapperFacade58);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController61 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl40, mapperFacade58);
        com.vntu.marenko.ualearning.server.controller.UserController userController62 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl16, mapperFacade58);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository63 = null;
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl64 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper65 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl64);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl66 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository14, mapperFacade58, userRepository63, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl64);
        createPostRequestToPostMapper0.setMapperFacade(mapperFacade58);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.CreatePostRequest> createPostRequestType68 = createPostRequestToPostMapper0.getAType();
        org.junit.Assert.assertNotNull(postType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str5, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(resultType26);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(mapperFacade31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(resultType53);
        org.junit.Assert.assertEquals("'" + boolean56 + "' != '" + false + "'", boolean56, false);
        org.junit.Assert.assertNotNull(mapperFacade58);
        org.junit.Assert.assertNotNull(createPostRequestType68);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        java.lang.String str3 = userDto0.getInstitution();
        userDto0.setLogin("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.String str6 = userDto0.getEmail();
        userDto0.setEmail("AnswerDto(id=0, text=Tag(id=null, name=null))");
        java.lang.String str9 = userDto0.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AnswerDto(id=0, text=Tag(id=null, name=null))" + "'", str9, "AnswerDto(id=0, text=Tag(id=null, name=null))");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.toString();
        userRequest0.setLogin("Result(id=null, user=null, test=null, submitted=false, answers=null)");
        userRequest0.setLogin("Post(id=null, text=ResultDescription(id=0, testId=null, testName=null, mark=1), timestamp=null, user=null, likes=null)");
        userRequest0.setPassword("Question(id=35, text=null, answers=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)" + "'", str3, "UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto0 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto0.setId(1);
        int int3 = tagDto0.getId();
        tagDto0.setId((int) (short) -1);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto6 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str7 = tagDto6.toString();
        java.lang.String str8 = tagDto6.getName();
        java.lang.String str9 = tagDto6.getName();
        boolean boolean10 = tagDto0.equals((java.lang.Object) tagDto6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TagDto(id=0, name=null)" + "'", str7, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper3 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType4 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType5 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType6 = resultToDescriptionMapper3.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType7 = resultToDescriptionMapper3.getAType();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper8 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean9 = createPostRequestToPostMapper8.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig10 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl11 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository13 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository14 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper15 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository12, testRepository13, answerRepository14);
        ma.glasnost.orika.MapperFacade mapperFacade16 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade16);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType18 = submitResultRequestToDomainMapper15.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper19 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper20 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean21 = createPostRequestToPostMapper20.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper22 = null;
        ma.glasnost.orika.MapperFacade mapperFacade23 = mapperConfig10.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl11, submitResultRequestToDomainMapper15, resultToDescriptionMapper19, createPostRequestToPostMapper20, postToDtoMapper22);
        createPostRequestToPostMapper8.setMapperFacade(mapperFacade23);
        resultToDescriptionMapper3.setMapperFacade(mapperFacade23);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController26 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade23);
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest27 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str28 = loginRequest27.getPassword();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository29 = null;
        ma.glasnost.orika.MapperFacade mapperFacade30 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository31 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto32 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl33 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean34 = answerDto32.equals((java.lang.Object) markComputerImpl33);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl35 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository29, mapperFacade30, userRepository31, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl33);
        boolean boolean36 = loginRequest27.equals((java.lang.Object) resultServiceImpl35);
        loginRequest27.setPassword("TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=100, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)])");
        loginRequest27.setLogin("ResultDto(id=0, user=null, test=null, submitted=true, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = authorisationController26.login(loginRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType4);
        org.junit.Assert.assertNotNull(resultType5);
        org.junit.Assert.assertNotNull(resultDescriptionType6);
        org.junit.Assert.assertNotNull(resultType7);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(resultType18);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertNotNull(mapperFacade23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.getEmail();
        userRequest0.setLogin("CreatePostRequest(text=ResultDescription(id=0, testId=null, testName=null, mark=1), username=null)");
        java.lang.String str6 = userRequest0.getEmail();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto7 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto7.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto10 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto11 = null;
        resultDto10.setTest(testDto11);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto13 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl14 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean15 = answerDto13.equals((java.lang.Object) markComputerImpl14);
        int int16 = answerDto13.getId();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto17 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto17.setText("hi!");
        java.lang.String str20 = answerDto17.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto21 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl22 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean23 = answerDto21.equals((java.lang.Object) markComputerImpl22);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto24 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl25 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean26 = answerDto24.equals((java.lang.Object) markComputerImpl25);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray27 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto13, answerDto17, answerDto21, answerDto24 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList28 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList28, answerDtoArray27);
        resultDto10.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList28);
        questionDto7.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList28);
        com.vntu.marenko.ualearning.server.model.User user32 = new com.vntu.marenko.ualearning.server.model.User();
        user32.setEmail("hi!");
        user32.setSurname("hi!");
        user32.setInstitution("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        boolean boolean39 = questionDto7.equals((java.lang.Object) user32);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList40 = questionDto7.getAnswers();
        boolean boolean41 = userRequest0.equals((java.lang.Object) answerDtoList40);
        userRequest0.setInstitution("SubmitResultRequest(userLogin=null, testId=0, answers=[1, 10, -1])");
        userRequest0.setAge((-1));
        java.lang.String str46 = userRequest0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(answerDtoArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(answerDtoList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.Test test3 = result0.getTest();
        java.util.List<com.vntu.marenko.ualearning.server.model.Answer> answerList4 = result0.getAnswers();
        com.vntu.marenko.ualearning.server.model.Question question5 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str6 = question5.getText();
        java.lang.Integer int7 = question5.getId();
        com.vntu.marenko.ualearning.server.service.TestService testService8 = null;
        ma.glasnost.orika.MapperFacade mapperFacade9 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController10 = new com.vntu.marenko.ualearning.server.controller.TestController(testService8, mapperFacade9);
        boolean boolean11 = question5.equals((java.lang.Object) testController10);
        com.vntu.marenko.ualearning.server.model.Result result12 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int13 = result12.getId();
        com.vntu.marenko.ualearning.server.model.Test test14 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int15 = test14.getId();
        java.lang.Integer int16 = test14.getId();
        result12.setTest(test14);
        java.lang.Integer int18 = result12.getId();
        com.vntu.marenko.ualearning.server.model.Result result19 = new com.vntu.marenko.ualearning.server.model.Result();
        result19.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user22 = new com.vntu.marenko.ualearning.server.model.User();
        user22.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test25 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean26 = user22.equals((java.lang.Object) test25);
        user22.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result19.setUser(user22);
        com.vntu.marenko.ualearning.server.model.Question question30 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int31 = question30.getId();
        java.lang.Integer int32 = question30.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer33 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer34 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer34.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray37 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer33, answer34 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList38 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList38, answerArray37);
        question30.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList38);
        result19.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList38);
        result12.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList38);
        question5.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList38);
        result0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList38);
        com.vntu.marenko.ualearning.server.model.Test test45 = result0.getTest();
        org.junit.Assert.assertNull(test3);
        org.junit.Assert.assertNull(answerList4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(answerArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(test45);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl1 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean2 = answerDto0.equals((java.lang.Object) markComputerImpl1);
        int int3 = answerDto0.getId();
        java.lang.String str4 = answerDto0.toString();
        java.lang.String str5 = answerDto0.getText();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper6 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig7 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl8 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository9 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository10 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository11 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper12 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository9, testRepository10, answerRepository11);
        ma.glasnost.orika.MapperFacade mapperFacade13 = null;
        submitResultRequestToDomainMapper12.setMapperFacade(mapperFacade13);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType15 = submitResultRequestToDomainMapper12.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper16 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper17 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean18 = createPostRequestToPostMapper17.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper19 = null;
        ma.glasnost.orika.MapperFacade mapperFacade20 = mapperConfig7.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl8, submitResultRequestToDomainMapper12, resultToDescriptionMapper16, createPostRequestToPostMapper17, postToDtoMapper19);
        postToDtoMapper6.setMapperFacade(mapperFacade20);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType22 = postToDtoMapper6.getBType();
        java.lang.Boolean boolean23 = postToDtoMapper6.favorsExtension();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository24 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository25 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository26 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper27 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository24, testRepository25, answerRepository26);
        ma.glasnost.orika.MapperFacade mapperFacade28 = null;
        submitResultRequestToDomainMapper27.setMapperFacade(mapperFacade28);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType30 = submitResultRequestToDomainMapper27.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper31 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig32 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl33 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository34 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository35 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository36 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper37 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository34, testRepository35, answerRepository36);
        ma.glasnost.orika.MapperFacade mapperFacade38 = null;
        submitResultRequestToDomainMapper37.setMapperFacade(mapperFacade38);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType40 = submitResultRequestToDomainMapper37.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper41 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper42 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean43 = createPostRequestToPostMapper42.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper44 = null;
        ma.glasnost.orika.MapperFacade mapperFacade45 = mapperConfig32.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl33, submitResultRequestToDomainMapper37, resultToDescriptionMapper41, createPostRequestToPostMapper42, postToDtoMapper44);
        postToDtoMapper31.setMapperFacade(mapperFacade45);
        submitResultRequestToDomainMapper27.setMapperFacade(mapperFacade45);
        postToDtoMapper6.setMapperFacade(mapperFacade45);
        boolean boolean49 = answerDto0.equals((java.lang.Object) mapperFacade45);
        java.lang.String str50 = answerDto0.getText();
        java.lang.String str51 = answerDto0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AnswerDto(id=0, text=null)" + "'", str4, "AnswerDto(id=0, text=null)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(resultType15);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertNotNull(mapperFacade20);
        org.junit.Assert.assertNotNull(postDtoType22);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(resultType30);
        org.junit.Assert.assertNotNull(resultType40);
        org.junit.Assert.assertEquals("'" + boolean43 + "' != '" + false + "'", boolean43, false);
        org.junit.Assert.assertNotNull(mapperFacade45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AnswerDto(id=0, text=null)" + "'", str51, "AnswerDto(id=0, text=null)");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.vntu.marenko.ualearning.server.model.Test test0 = new com.vntu.marenko.ualearning.server.model.Test();
        com.vntu.marenko.ualearning.server.model.Tag[] tagArray1 = new com.vntu.marenko.ualearning.server.model.Tag[] {};
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag> tagList2 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Tag>) tagList2, tagArray1);
        test0.setTags((java.util.List<com.vntu.marenko.ualearning.server.model.Tag>) tagList2);
        com.vntu.marenko.ualearning.server.model.Tag[] tagArray5 = new com.vntu.marenko.ualearning.server.model.Tag[] {};
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag> tagList6 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Tag>) tagList6, tagArray5);
        test0.setTags((java.util.List<com.vntu.marenko.ualearning.server.model.Tag>) tagList6);
        java.lang.String str9 = test0.toString();
        java.lang.String str10 = test0.getNameTest();
        org.junit.Assert.assertNotNull(tagArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tagArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=[])" + "'", str9, "Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=[])");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int1 = result0.getId();
        com.vntu.marenko.ualearning.server.model.Test test2 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int3 = test2.getId();
        java.lang.Integer int4 = test2.getId();
        result0.setTest(test2);
        java.lang.String str6 = test2.getDescriptionTest();
        java.util.List<com.vntu.marenko.ualearning.server.model.Question> questionList7 = test2.getQuestions();
        test2.setNameTest("Post(id=10, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(questionList7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str1 = questionDto0.getText();
        int int2 = questionDto0.getId();
        com.vntu.marenko.ualearning.server.model.User user3 = new com.vntu.marenko.ualearning.server.model.User();
        user3.setInstitution("hi!");
        java.lang.String str6 = user3.toString();
        java.lang.String str7 = user3.getEmail();
        java.lang.String str8 = user3.getEmail();
        boolean boolean9 = questionDto0.equals((java.lang.Object) str8);
        com.vntu.marenko.ualearning.server.model.Tag tag10 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str11 = tag10.toString();
        java.lang.String str12 = tag10.getName();
        java.lang.Integer int13 = tag10.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper14 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper15 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType16 = createPostRequestToPostMapper15.getBType();
        com.vntu.marenko.ualearning.server.model.Post post17 = new com.vntu.marenko.ualearning.server.model.Post();
        post17.setText("");
        java.lang.String str20 = post17.toString();
        post17.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest23 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest23.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext26 = null;
        createPostRequestToPostMapper15.mapBtoA(post17, createPostRequest23, mappingContext26);
        com.vntu.marenko.ualearning.server.model.Post post28 = new com.vntu.marenko.ualearning.server.model.Post();
        post28.setText("");
        java.lang.String str31 = post28.toString();
        java.lang.Integer int32 = post28.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest33 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str34 = createPostRequest33.getUsername();
        java.lang.String str35 = createPostRequest33.toString();
        ma.glasnost.orika.MappingContext mappingContext36 = null;
        createPostRequestToPostMapper15.mapBtoA(post28, createPostRequest33, mappingContext36);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper38 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType39 = createPostRequestToPostMapper38.getBType();
        com.vntu.marenko.ualearning.server.model.Post post40 = new com.vntu.marenko.ualearning.server.model.Post();
        post40.setText("");
        java.lang.String str43 = post40.toString();
        post40.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest46 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest46.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext49 = null;
        createPostRequestToPostMapper38.mapBtoA(post40, createPostRequest46, mappingContext49);
        ma.glasnost.orika.MappingContext mappingContext51 = null;
        createPostRequestToPostMapper14.mapAtoB(createPostRequest33, post40, mappingContext51);
        boolean boolean53 = tag10.equals((java.lang.Object) createPostRequest33);
        boolean boolean54 = questionDto0.equals((java.lang.Object) tag10);
        tag10.setId((java.lang.Integer) (-1));
        java.lang.String str57 = tag10.getName();
        tag10.setName("AnswerDto(id=0, text=Tag(id=null, name=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str6, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Tag(id=null, name=null)" + "'", str11, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(postType16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str20, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str31, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str35, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str43, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto2 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto2.setId((int) '#');
        boolean boolean5 = userRequest0.equals((java.lang.Object) '#');
        userRequest0.setEmail("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository8 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl9 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository8);
        boolean boolean10 = userRequest0.equals((java.lang.Object) postServiceImpl9);
        userRequest0.setAge((int) (byte) 1);
        userRequest0.setAge((int) (byte) 100);
        userRequest0.setLogin("TestDescription(id=-1, nameTest=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null))");
        userRequest0.setAge((int) (short) -1);
        java.lang.String str19 = userRequest0.getName();
        userRequest0.setName("UserRequest(login=null, password=null, name=null, surname=null, age=100, institution=null, email=UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest0 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str1 = loginRequest0.getLogin();
        loginRequest0.setLogin("User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
        java.lang.String str4 = loginRequest0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginRequest(login=User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0), password=null)" + "'", str4, "LoginRequest(login=User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0), password=null)");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto1 = null;
        resultDto0.setTest(testDto1);
        int int3 = resultDto0.getId();
        long long4 = resultDto0.getMark();
        com.vntu.marenko.ualearning.server.dto.UserDto userDto5 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        java.lang.String str6 = userDto5.toString();
        java.lang.String str7 = userDto5.getLogin();
        userDto5.setLogin("hi!");
        resultDto0.setUser(userDto5);
        java.lang.String str11 = userDto5.getLogin();
        java.lang.String str12 = userDto5.toString();
        userDto5.setEmail("AnswerDto(id=0, text=null)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)" + "'", str6, "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UserDto(login=hi!, name=null, surname=null, age=0, institution=null, email=null, rating=0)" + "'", str12, "UserDto(login=hi!, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        java.lang.String str1 = answer0.getText();
        java.lang.String str2 = answer0.getText();
        java.lang.String str3 = answer0.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = answer0.equals(obj4);
        answer0.setCorrect(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Answer(id=null, text=null, correct=false)" + "'", str3, "Answer(id=null, text=null, correct=false)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.vntu.marenko.ualearning.server.dto.TestDto testDto0 = new com.vntu.marenko.ualearning.server.dto.TestDto();
        int int1 = testDto0.getId();
        testDto0.setDescriptionTest("ResultDescription(id=null, testId=100, testName=null, mark=0)");
        java.util.List<com.vntu.marenko.ualearning.server.dto.TagDto> tagDtoList4 = testDto0.getTags();
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto5 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto6 = null;
        resultDto5.setTest(testDto6);
        int int8 = resultDto5.getId();
        long long9 = resultDto5.getMark();
        boolean boolean10 = testDto0.equals((java.lang.Object) resultDto5);
        com.vntu.marenko.ualearning.server.model.Result result11 = new com.vntu.marenko.ualearning.server.model.Result();
        result11.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.Test test14 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int15 = test14.getId();
        java.lang.Integer int16 = test14.getId();
        test14.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int19 = test14.getCompletedCounter();
        result11.setTest(test14);
        com.vntu.marenko.ualearning.server.model.Test test21 = result11.getTest();
        com.vntu.marenko.ualearning.server.model.Test test22 = new com.vntu.marenko.ualearning.server.model.Test();
        com.vntu.marenko.ualearning.server.model.Tag[] tagArray23 = new com.vntu.marenko.ualearning.server.model.Tag[] {};
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag> tagList24 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Tag>) tagList24, tagArray23);
        test22.setTags((java.util.List<com.vntu.marenko.ualearning.server.model.Tag>) tagList24);
        com.vntu.marenko.ualearning.server.model.Tag[] tagArray27 = new com.vntu.marenko.ualearning.server.model.Tag[] {};
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag> tagList28 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Tag>) tagList28, tagArray27);
        test22.setTags((java.util.List<com.vntu.marenko.ualearning.server.model.Tag>) tagList28);
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList31 = test22.getTags();
        test21.setTags(tagList31);
        boolean boolean33 = testDto0.equals((java.lang.Object) test21);
        java.lang.String str34 = testDto0.getNameTest();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(tagDtoList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(test21);
        org.junit.Assert.assertNotNull(tagArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tagArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tagList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.toString();
        java.lang.String str2 = tag0.toString();
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest3 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str4 = userRequest3.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto5 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto5.setId((int) '#');
        boolean boolean8 = userRequest3.equals((java.lang.Object) '#');
        boolean boolean9 = tag0.equals((java.lang.Object) boolean8);
        tag0.setName("ResultDescription(id=null, testId=100, testName=null, mark=0)");
        tag0.setName("ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        com.vntu.marenko.ualearning.server.model.User user14 = new com.vntu.marenko.ualearning.server.model.User();
        user14.setInstitution("hi!");
        java.lang.String str17 = user14.toString();
        java.lang.String str18 = user14.getEmail();
        java.lang.String str19 = user14.getEmail();
        java.lang.String str20 = user14.getInstitution();
        boolean boolean21 = tag0.equals((java.lang.Object) str20);
        tag0.setName("");
        java.lang.String str24 = tag0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tag(id=null, name=null)" + "'", str1, "Tag(id=null, name=null)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Tag(id=null, name=null)" + "'", str2, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str17, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper3 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType4 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType5 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType6 = resultToDescriptionMapper3.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType7 = resultToDescriptionMapper3.getAType();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper8 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean9 = createPostRequestToPostMapper8.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig10 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl11 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository13 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository14 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper15 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository12, testRepository13, answerRepository14);
        ma.glasnost.orika.MapperFacade mapperFacade16 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade16);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType18 = submitResultRequestToDomainMapper15.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper19 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper20 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean21 = createPostRequestToPostMapper20.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper22 = null;
        ma.glasnost.orika.MapperFacade mapperFacade23 = mapperConfig10.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl11, submitResultRequestToDomainMapper15, resultToDescriptionMapper19, createPostRequestToPostMapper20, postToDtoMapper22);
        createPostRequestToPostMapper8.setMapperFacade(mapperFacade23);
        resultToDescriptionMapper3.setMapperFacade(mapperFacade23);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController26 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade23);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository28 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository29 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper30 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository27, testRepository28, answerRepository29);
        ma.glasnost.orika.MapperFacade mapperFacade31 = null;
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade31);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType33 = submitResultRequestToDomainMapper30.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper34 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig35 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl36 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository37 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository38 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository39 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper40 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository37, testRepository38, answerRepository39);
        ma.glasnost.orika.MapperFacade mapperFacade41 = null;
        submitResultRequestToDomainMapper40.setMapperFacade(mapperFacade41);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType43 = submitResultRequestToDomainMapper40.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper44 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper45 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean46 = createPostRequestToPostMapper45.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper47 = null;
        ma.glasnost.orika.MapperFacade mapperFacade48 = mapperConfig35.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl36, submitResultRequestToDomainMapper40, resultToDescriptionMapper44, createPostRequestToPostMapper45, postToDtoMapper47);
        postToDtoMapper34.setMapperFacade(mapperFacade48);
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade48);
        com.vntu.marenko.ualearning.server.service.UserService userService51 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper52 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig53 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl54 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository55 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository56 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository57 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper58 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository55, testRepository56, answerRepository57);
        ma.glasnost.orika.MapperFacade mapperFacade59 = null;
        submitResultRequestToDomainMapper58.setMapperFacade(mapperFacade59);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType61 = submitResultRequestToDomainMapper58.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper62 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper63 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean64 = createPostRequestToPostMapper63.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper65 = null;
        ma.glasnost.orika.MapperFacade mapperFacade66 = mapperConfig53.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl54, submitResultRequestToDomainMapper58, resultToDescriptionMapper62, createPostRequestToPostMapper63, postToDtoMapper65);
        postToDtoMapper52.setMapperFacade(mapperFacade66);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController68 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService51, mapperFacade66);
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade66);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController70 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade66);
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest71 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str72 = loginRequest71.toString();
        java.lang.String str73 = loginRequest71.toString();
        java.lang.String str74 = loginRequest71.getLogin();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = authorisationController70.login(loginRequest71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType4);
        org.junit.Assert.assertNotNull(resultType5);
        org.junit.Assert.assertNotNull(resultDescriptionType6);
        org.junit.Assert.assertNotNull(resultType7);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(resultType18);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertNotNull(mapperFacade23);
        org.junit.Assert.assertNotNull(resultType33);
        org.junit.Assert.assertNotNull(resultType43);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + false + "'", boolean46, false);
        org.junit.Assert.assertNotNull(mapperFacade48);
        org.junit.Assert.assertNotNull(resultType61);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
        org.junit.Assert.assertNotNull(mapperFacade66);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str72, "LoginRequest(login=null, password=null)");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str73, "LoginRequest(login=null, password=null)");
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper2 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig3 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl4 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository5 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository6 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository7 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper8 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository5, testRepository6, answerRepository7);
        ma.glasnost.orika.MapperFacade mapperFacade9 = null;
        submitResultRequestToDomainMapper8.setMapperFacade(mapperFacade9);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType11 = submitResultRequestToDomainMapper8.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper12 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper13 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean14 = createPostRequestToPostMapper13.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper15 = null;
        ma.glasnost.orika.MapperFacade mapperFacade16 = mapperConfig3.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl4, submitResultRequestToDomainMapper8, resultToDescriptionMapper12, createPostRequestToPostMapper13, postToDtoMapper15);
        postToDtoMapper2.setMapperFacade(mapperFacade16);
        com.vntu.marenko.ualearning.server.controller.UserController userController18 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade16);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository19 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl20 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository19);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository21 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper22 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig23 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl24 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository25 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository27 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper28 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository25, testRepository26, answerRepository27);
        ma.glasnost.orika.MapperFacade mapperFacade29 = null;
        submitResultRequestToDomainMapper28.setMapperFacade(mapperFacade29);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType31 = submitResultRequestToDomainMapper28.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper32 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper33 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean34 = createPostRequestToPostMapper33.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper35 = null;
        ma.glasnost.orika.MapperFacade mapperFacade36 = mapperConfig23.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl24, submitResultRequestToDomainMapper28, resultToDescriptionMapper32, createPostRequestToPostMapper33, postToDtoMapper35);
        postToDtoMapper22.setMapperFacade(mapperFacade36);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository38 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig39 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl40 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository41 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository42 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository43 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper44 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository41, testRepository42, answerRepository43);
        ma.glasnost.orika.MapperFacade mapperFacade45 = null;
        submitResultRequestToDomainMapper44.setMapperFacade(mapperFacade45);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType47 = submitResultRequestToDomainMapper44.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper48 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper49 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean50 = createPostRequestToPostMapper49.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper51 = null;
        ma.glasnost.orika.MapperFacade mapperFacade52 = mapperConfig39.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl40, submitResultRequestToDomainMapper44, resultToDescriptionMapper48, createPostRequestToPostMapper49, postToDtoMapper51);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl53 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository54 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository55 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository56 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper57 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository54, testRepository55, answerRepository56);
        ma.glasnost.orika.MapperFacade mapperFacade58 = null;
        submitResultRequestToDomainMapper57.setMapperFacade(mapperFacade58);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType60 = submitResultRequestToDomainMapper57.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper61 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig62 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl63 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository64 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository65 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository66 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper67 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository64, testRepository65, answerRepository66);
        ma.glasnost.orika.MapperFacade mapperFacade68 = null;
        submitResultRequestToDomainMapper67.setMapperFacade(mapperFacade68);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType70 = submitResultRequestToDomainMapper67.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper71 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper72 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean73 = createPostRequestToPostMapper72.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper74 = null;
        ma.glasnost.orika.MapperFacade mapperFacade75 = mapperConfig62.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl63, submitResultRequestToDomainMapper67, resultToDescriptionMapper71, createPostRequestToPostMapper72, postToDtoMapper74);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper76 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade77 = mapperConfig39.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl53, submitResultRequestToDomainMapper57, resultToDescriptionMapper61, createPostRequestToPostMapper72, postToDtoMapper76);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl78 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository21, mapperFacade36, userRepository38, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl53);
        com.vntu.marenko.ualearning.server.controller.UserController userController79 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl20, mapperFacade36);
        com.vntu.marenko.ualearning.server.controller.UserController userController80 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade36);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.UserDto userDto82 = userController80.getUser("CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertNotNull(mapperFacade16);
        org.junit.Assert.assertNotNull(resultType31);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + false + "'", boolean34, false);
        org.junit.Assert.assertNotNull(mapperFacade36);
        org.junit.Assert.assertNotNull(resultType47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + false + "'", boolean50, false);
        org.junit.Assert.assertNotNull(mapperFacade52);
        org.junit.Assert.assertNotNull(resultType60);
        org.junit.Assert.assertNotNull(resultType70);
        org.junit.Assert.assertEquals("'" + boolean73 + "' != '" + false + "'", boolean73, false);
        org.junit.Assert.assertNotNull(mapperFacade75);
        org.junit.Assert.assertNotNull(mapperFacade77);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer0.setText("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        boolean boolean3 = answer0.isCorrect();
        java.lang.String str4 = answer0.getText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str4, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository2 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper3 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository0, testRepository1, answerRepository2);
        ma.glasnost.orika.MapperFacade mapperFacade4 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade4);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType6 = submitResultRequestToDomainMapper3.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade7);
        com.vntu.marenko.ualearning.server.model.User user9 = new com.vntu.marenko.ualearning.server.model.User();
        user9.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository13 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository14 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper15 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository12, testRepository13, answerRepository14);
        ma.glasnost.orika.MapperFacade mapperFacade16 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade16);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType18 = submitResultRequestToDomainMapper15.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade19 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade19);
        boolean boolean21 = user9.equals((java.lang.Object) submitResultRequestToDomainMapper15);
        com.vntu.marenko.ualearning.server.model.Result result22 = new com.vntu.marenko.ualearning.server.model.Result();
        result22.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user25 = new com.vntu.marenko.ualearning.server.model.User();
        user25.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test28 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean29 = user25.equals((java.lang.Object) test28);
        user25.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result22.setUser(user25);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest33 = null;
        ma.glasnost.orika.MappingContext mappingContext34 = null;
        submitResultRequestToDomainMapper15.mapBtoA(result22, submitResultRequest33, mappingContext34);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest36 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest36.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int39 = submitResultRequest36.getTestId();
        ma.glasnost.orika.MappingContext mappingContext40 = null;
        submitResultRequestToDomainMapper3.mapBtoA(result22, submitResultRequest36, mappingContext40);
        submitResultRequest36.setTestId((-1));
        java.lang.String str44 = submitResultRequest36.toString();
        org.junit.Assert.assertNotNull(submitResultRequestType6);
        org.junit.Assert.assertNotNull(submitResultRequestType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=-1, answers=null)" + "'", str44, "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=-1, answers=null)");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        java.lang.String str1 = answer0.toString();
        answer0.setText("LoginRequest(login=null, password=null)");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest4 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str5 = userRequest4.getInstitution();
        java.lang.String str6 = userRequest4.getPassword();
        boolean boolean7 = answer0.equals((java.lang.Object) userRequest4);
        answer0.setCorrect(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Answer(id=null, text=null, correct=false)" + "'", str1, "Answer(id=null, text=null, correct=false)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.Integer int3 = post0.getId();
        java.util.Date date4 = post0.getTimestamp();
        post0.setId((java.lang.Integer) (-1));
        post0.setUser("LoginRequest(login=null, password=null)");
        java.lang.String str9 = post0.getUser();
        post0.setText("TestDto(id=100, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str9, "LoginRequest(login=null, password=null)");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper0 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType1 = createPostRequestToPostMapper0.getBType();
        com.vntu.marenko.ualearning.server.model.Post post2 = new com.vntu.marenko.ualearning.server.model.Post();
        post2.setText("");
        java.lang.String str5 = post2.toString();
        post2.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest8 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest8.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext11 = null;
        createPostRequestToPostMapper0.mapBtoA(post2, createPostRequest8, mappingContext11);
        com.vntu.marenko.ualearning.server.model.Post post13 = new com.vntu.marenko.ualearning.server.model.Post();
        post13.setText("");
        java.lang.String str16 = post13.toString();
        java.lang.Integer int17 = post13.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest18 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str19 = createPostRequest18.getUsername();
        java.lang.String str20 = createPostRequest18.toString();
        ma.glasnost.orika.MappingContext mappingContext21 = null;
        createPostRequestToPostMapper0.mapBtoA(post13, createPostRequest18, mappingContext21);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository23 = null;
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository25 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer26 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl27 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository23, mapperFacade24, userRepository25, markComputer26);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean29 = createPostRequestToPostMapper28.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig30 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl31 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository32 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository33 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository34 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper35 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository32, testRepository33, answerRepository34);
        ma.glasnost.orika.MapperFacade mapperFacade36 = null;
        submitResultRequestToDomainMapper35.setMapperFacade(mapperFacade36);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType38 = submitResultRequestToDomainMapper35.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper39 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper40 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean41 = createPostRequestToPostMapper40.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper42 = null;
        ma.glasnost.orika.MapperFacade mapperFacade43 = mapperConfig30.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl31, submitResultRequestToDomainMapper35, resultToDescriptionMapper39, createPostRequestToPostMapper40, postToDtoMapper42);
        createPostRequestToPostMapper28.setMapperFacade(mapperFacade43);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController45 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl27, mapperFacade43);
        com.vntu.marenko.ualearning.server.service.UserService userService46 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper47 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig48 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl49 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository50 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository51 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository52 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper53 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository50, testRepository51, answerRepository52);
        ma.glasnost.orika.MapperFacade mapperFacade54 = null;
        submitResultRequestToDomainMapper53.setMapperFacade(mapperFacade54);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType56 = submitResultRequestToDomainMapper53.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper57 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper58 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean59 = createPostRequestToPostMapper58.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper60 = null;
        ma.glasnost.orika.MapperFacade mapperFacade61 = mapperConfig48.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl49, submitResultRequestToDomainMapper53, resultToDescriptionMapper57, createPostRequestToPostMapper58, postToDtoMapper60);
        postToDtoMapper47.setMapperFacade(mapperFacade61);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController63 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService46, mapperFacade61);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController64 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl27, mapperFacade61);
        createPostRequestToPostMapper0.setMapperFacade(mapperFacade61);
        java.lang.Boolean boolean66 = createPostRequestToPostMapper0.favorsExtension();
        java.lang.Boolean boolean67 = createPostRequestToPostMapper0.favorsExtension();
        ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object> objMapper68 = null;
        ma.glasnost.orika.Mapper[] mapperArray70 = new ma.glasnost.orika.Mapper[1];
        @SuppressWarnings("unchecked")
        ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[] objMapperArray71 = (ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[]) mapperArray70;
        objMapperArray71[0] = objMapper68;
        // The following exception was thrown during execution in test generation
        try {
            createPostRequestToPostMapper0.setUsedMappers(objMapperArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not be called for a user custom mapper.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(postType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str5, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str16, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str20, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(resultType38);
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + false + "'", boolean41, false);
        org.junit.Assert.assertNotNull(mapperFacade43);
        org.junit.Assert.assertNotNull(resultType56);
        org.junit.Assert.assertEquals("'" + boolean59 + "' != '" + false + "'", boolean59, false);
        org.junit.Assert.assertNotNull(mapperFacade61);
        org.junit.Assert.assertEquals("'" + boolean66 + "' != '" + false + "'", boolean66, false);
        org.junit.Assert.assertEquals("'" + boolean67 + "' != '" + false + "'", boolean67, false);
        org.junit.Assert.assertNotNull(mapperArray70);
        org.junit.Assert.assertNotNull(objMapperArray71);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper1 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper2 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType3 = createPostRequestToPostMapper2.getBType();
        com.vntu.marenko.ualearning.server.model.Post post4 = new com.vntu.marenko.ualearning.server.model.Post();
        post4.setText("");
        java.lang.String str7 = post4.toString();
        post4.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest10 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest10.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext13 = null;
        createPostRequestToPostMapper2.mapBtoA(post4, createPostRequest10, mappingContext13);
        com.vntu.marenko.ualearning.server.model.Post post15 = new com.vntu.marenko.ualearning.server.model.Post();
        post15.setText("");
        java.lang.String str18 = post15.toString();
        java.lang.Integer int19 = post15.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest20 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str21 = createPostRequest20.getUsername();
        java.lang.String str22 = createPostRequest20.toString();
        ma.glasnost.orika.MappingContext mappingContext23 = null;
        createPostRequestToPostMapper2.mapBtoA(post15, createPostRequest20, mappingContext23);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper25 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType26 = createPostRequestToPostMapper25.getBType();
        com.vntu.marenko.ualearning.server.model.Post post27 = new com.vntu.marenko.ualearning.server.model.Post();
        post27.setText("");
        java.lang.String str30 = post27.toString();
        post27.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest33 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest33.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext36 = null;
        createPostRequestToPostMapper25.mapBtoA(post27, createPostRequest33, mappingContext36);
        ma.glasnost.orika.MappingContext mappingContext38 = null;
        createPostRequestToPostMapper1.mapAtoB(createPostRequest20, post27, mappingContext38);
        boolean boolean40 = answerDto0.equals((java.lang.Object) mappingContext38);
        answerDto0.setId((int) (short) 10);
        org.junit.Assert.assertNotNull(postType3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str7, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str18, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str22, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str30, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription0 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription0.setId((java.lang.Integer) 0);
        resultDescription0.setMark(1L);
        java.lang.Integer int5 = resultDescription0.getTestId();
        long long6 = resultDescription0.getMark();
        resultDescription0.setTestName("ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        resultDescription0.setId((java.lang.Integer) 52);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper0 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper1 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType2 = createPostRequestToPostMapper1.getBType();
        com.vntu.marenko.ualearning.server.model.Post post3 = new com.vntu.marenko.ualearning.server.model.Post();
        post3.setText("");
        java.lang.String str6 = post3.toString();
        post3.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest9 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest9.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext12 = null;
        createPostRequestToPostMapper1.mapBtoA(post3, createPostRequest9, mappingContext12);
        com.vntu.marenko.ualearning.server.model.Post post14 = new com.vntu.marenko.ualearning.server.model.Post();
        post14.setText("");
        java.lang.String str17 = post14.toString();
        java.lang.Integer int18 = post14.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest19 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str20 = createPostRequest19.getUsername();
        java.lang.String str21 = createPostRequest19.toString();
        ma.glasnost.orika.MappingContext mappingContext22 = null;
        createPostRequestToPostMapper1.mapBtoA(post14, createPostRequest19, mappingContext22);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper24 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType25 = createPostRequestToPostMapper24.getBType();
        com.vntu.marenko.ualearning.server.model.Post post26 = new com.vntu.marenko.ualearning.server.model.Post();
        post26.setText("");
        java.lang.String str29 = post26.toString();
        post26.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest32 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest32.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext35 = null;
        createPostRequestToPostMapper24.mapBtoA(post26, createPostRequest32, mappingContext35);
        ma.glasnost.orika.MappingContext mappingContext37 = null;
        createPostRequestToPostMapper0.mapAtoB(createPostRequest19, post26, mappingContext37);
        com.vntu.marenko.ualearning.server.model.User user39 = new com.vntu.marenko.ualearning.server.model.User();
        java.lang.String str40 = user39.getEmail();
        java.lang.String str41 = user39.getSurname();
        user39.setEmail("Answer(id=null, text=null, correct=false)");
        boolean boolean45 = user39.equals((java.lang.Object) (byte) -1);
        boolean boolean46 = createPostRequest19.equals((java.lang.Object) user39);
        int int47 = user39.getAge();
        org.junit.Assert.assertNotNull(postType2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str6, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str17, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str21, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str29, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        long long1 = user0.getRating();
        user0.setLogin("hi!");
        java.lang.Object obj4 = null;
        boolean boolean5 = user0.equals(obj4);
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        userRequest0.setEmail("AnswerDto(id=0, text=null)");
        userRequest0.setInstitution("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        userRequest0.setPassword("Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription8 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        java.lang.Integer int9 = resultDescription8.getId();
        java.lang.Integer int10 = resultDescription8.getId();
        boolean boolean11 = userRequest0.equals((java.lang.Object) resultDescription8);
        com.vntu.marenko.ualearning.server.dto.UserDto userDto12 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto12.setInstitution("");
        userDto12.setSurname("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        java.lang.String str17 = userDto12.getName();
        boolean boolean18 = resultDescription8.equals((java.lang.Object) userDto12);
        resultDescription8.setTestName("QuestionDto(id=35, text=null, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!)])");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository22 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository23 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper24 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository21, testRepository22, answerRepository23);
        ma.glasnost.orika.MapperFacade mapperFacade25 = null;
        submitResultRequestToDomainMapper24.setMapperFacade(mapperFacade25);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType27 = submitResultRequestToDomainMapper24.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType28 = submitResultRequestToDomainMapper24.getBType();
        boolean boolean29 = resultDescription8.equals((java.lang.Object) submitResultRequestToDomainMapper24);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(resultType27);
        org.junit.Assert.assertNotNull(resultType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int4 = test3.getId();
        java.lang.Integer int5 = test3.getId();
        test3.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int8 = test3.getCompletedCounter();
        result0.setTest(test3);
        com.vntu.marenko.ualearning.server.model.User user10 = result0.getUser();
        result0.setId((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.vntu.marenko.ualearning.server.dto.PostDto postDto0 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto0.setId((int) (byte) 100);
        com.vntu.marenko.ualearning.server.dto.UserDto userDto3 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto3.setInstitution("");
        java.lang.String str6 = userDto3.getInstitution();
        userDto3.setAge((int) (byte) 10);
        boolean boolean9 = postDto0.equals((java.lang.Object) (byte) 10);
        postDto0.setText("SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        java.lang.String str12 = postDto0.getText();
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest13 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str14 = userRequest13.getName();
        userRequest13.setEmail("TagDto(id=1, name=null)");
        com.vntu.marenko.ualearning.server.model.Post post17 = new com.vntu.marenko.ualearning.server.model.Post();
        post17.setText("");
        java.lang.String str20 = post17.toString();
        java.util.Date date21 = null;
        post17.setTimestamp(date21);
        post17.setText("CreatePostRequest(text=null, username=null)");
        boolean boolean25 = userRequest13.equals((java.lang.Object) post17);
        boolean boolean26 = postDto0.equals((java.lang.Object) post17);
        java.lang.String str27 = post17.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)" + "'", str12, "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str20, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        userRequest0.setEmail("TagDto(id=1, name=null)");
        com.vntu.marenko.ualearning.server.model.Post post4 = new com.vntu.marenko.ualearning.server.model.Post();
        post4.setText("");
        java.lang.String str7 = post4.toString();
        java.util.Date date8 = null;
        post4.setTimestamp(date8);
        post4.setText("CreatePostRequest(text=null, username=null)");
        boolean boolean12 = userRequest0.equals((java.lang.Object) post4);
        userRequest0.setName("SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        userRequest0.setInstitution("CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null)");
        userRequest0.setInstitution("TestDto(id=0, nameTest=null, descriptionTest=ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0), completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str7, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.toString();
        java.lang.String str2 = tag0.getName();
        java.lang.Integer int3 = tag0.getId();
        java.lang.String str4 = tag0.toString();
        java.lang.String str5 = tag0.toString();
        java.lang.String str6 = tag0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tag(id=null, name=null)" + "'", str1, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tag(id=null, name=null)" + "'", str4, "Tag(id=null, name=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tag(id=null, name=null)" + "'", str5, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.String str3 = post0.toString();
        java.lang.Integer int4 = post0.getId();
        java.util.Date date5 = null;
        post0.setTimestamp(date5);
        java.lang.String str7 = post0.getText();
        java.util.List<java.lang.String> strList8 = post0.getLikes();
        java.util.Date date9 = null;
        post0.setTimestamp(date9);
        java.lang.String str11 = post0.toString();
        com.vntu.marenko.ualearning.server.model.Post post12 = new com.vntu.marenko.ualearning.server.model.Post();
        post12.setText("");
        java.lang.Integer int15 = post12.getId();
        java.util.Date date16 = post12.getTimestamp();
        com.vntu.marenko.ualearning.server.model.Post post17 = new com.vntu.marenko.ualearning.server.model.Post();
        post17.setText("");
        java.util.Date date20 = null;
        post17.setTimestamp(date20);
        java.lang.String str22 = post17.getUser();
        java.util.Date date23 = null;
        post17.setTimestamp(date23);
        java.lang.String str25 = post17.getText();
        java.lang.String[] strArray66 = new java.lang.String[] { "User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)", "TestDescription(id=-1, nameTest=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null))", "Question(id=null, text=null, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])", "LoginRequest(login=null, password=hi!)", "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)", "Answer(id=null, text=null, correct=false)", "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)", "LoginRequest(login=Result(id=null, user=null, test=null, submitted=false, answers=null), password=null)", "CreatePostRequest(text=null, username=null)", "ResultDescription(id=0, testId=null, testName=null, mark=1)", "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=100, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)])", "ResultDescription(id=0, testId=null, testName=null, mark=1)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)", "Result(id=null, user=null, test=null, submitted=false, answers=null)", "TestDescription(id=-1, nameTest=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null))", "ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0)", "CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null)", "Post(id=null, text=, timestamp=null, user=null, likes=null)", "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=10)", "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)", "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)", "ResultDescription(id=0, testId=null, testName=null, mark=1)", "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)", "TestDescription(id=-1, nameTest=TagDto(id=0, name=null))", "QuestionDto(id=10, text=null, answers=null)", "ResultDescription(id=null, testId=100, testName=null, mark=0)", "UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)", "Post(id=null, text=, timestamp=null, user=null, likes=null)", "User(login=null, password=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), name=null, surname=, age=52, institution=null, email=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), rating=0)", "ResultDescription(id=null, testId=100, testName=null, mark=0)", "hi!", "TestDescription(id=-1, nameTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0))", "Tag(id=null, name=ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0))", "LoginRequest(login=null, password=hi!)", "CreatePostRequest(text=null, username=null)", "User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)", "ResultDescription(id=null, testId=100, testName=null, mark=0)" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        post17.setLikes((java.util.List<java.lang.String>) strList67);
        post12.setLikes((java.util.List<java.lang.String>) strList67);
        post0.setLikes((java.util.List<java.lang.String>) strList67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str3, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str11, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto0.setId(100);
        resultDto0.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.UserDto userDto5 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto5.setRating((int) (byte) -1);
        userDto5.setLogin("LoginRequest(login=null, password=null)");
        resultDto0.setUser(userDto5);
        resultDto0.setId((int) (short) -1);
        resultDto0.setId((int) (byte) 10);
        int int15 = resultDto0.getId();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto0.setText("");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        int int1 = questionDto0.getId();
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList2 = questionDto0.getAnswers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(answerDtoList2);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription0 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription0.setId((java.lang.Integer) 0);
        resultDescription0.setTestName("hi!");
        java.lang.String str5 = resultDescription0.getTestName();
        java.lang.Integer int6 = resultDescription0.getTestId();
        long long7 = resultDescription0.getMark();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig8 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl9 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository10 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository11 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository12 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper13 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository10, testRepository11, answerRepository12);
        ma.glasnost.orika.MapperFacade mapperFacade14 = null;
        submitResultRequestToDomainMapper13.setMapperFacade(mapperFacade14);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType16 = submitResultRequestToDomainMapper13.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper17 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper18 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean19 = createPostRequestToPostMapper18.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper20 = null;
        ma.glasnost.orika.MapperFacade mapperFacade21 = mapperConfig8.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl9, submitResultRequestToDomainMapper13, resultToDescriptionMapper17, createPostRequestToPostMapper18, postToDtoMapper20);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest22 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest22.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        com.vntu.marenko.ualearning.server.model.Post post25 = new com.vntu.marenko.ualearning.server.model.Post();
        ma.glasnost.orika.MappingContext mappingContext26 = null;
        createPostRequestToPostMapper18.mapAtoB(createPostRequest22, post25, mappingContext26);
        boolean boolean28 = resultDescription0.equals((java.lang.Object) createPostRequestToPostMapper18);
        com.vntu.marenko.ualearning.server.model.Post post29 = new com.vntu.marenko.ualearning.server.model.Post();
        post29.setText("");
        java.lang.String str32 = post29.toString();
        java.lang.Integer int33 = post29.getId();
        post29.setText("Answer(id=null, text=null, correct=false)");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper36 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper37 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType38 = createPostRequestToPostMapper37.getBType();
        com.vntu.marenko.ualearning.server.model.Post post39 = new com.vntu.marenko.ualearning.server.model.Post();
        post39.setText("");
        java.lang.String str42 = post39.toString();
        post39.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest45 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest45.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext48 = null;
        createPostRequestToPostMapper37.mapBtoA(post39, createPostRequest45, mappingContext48);
        com.vntu.marenko.ualearning.server.model.Post post50 = new com.vntu.marenko.ualearning.server.model.Post();
        post50.setText("");
        java.lang.String str53 = post50.toString();
        java.lang.Integer int54 = post50.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest55 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str56 = createPostRequest55.getUsername();
        java.lang.String str57 = createPostRequest55.toString();
        ma.glasnost.orika.MappingContext mappingContext58 = null;
        createPostRequestToPostMapper37.mapBtoA(post50, createPostRequest55, mappingContext58);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper60 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType61 = createPostRequestToPostMapper60.getBType();
        com.vntu.marenko.ualearning.server.model.Post post62 = new com.vntu.marenko.ualearning.server.model.Post();
        post62.setText("");
        java.lang.String str65 = post62.toString();
        post62.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest68 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest68.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext71 = null;
        createPostRequestToPostMapper60.mapBtoA(post62, createPostRequest68, mappingContext71);
        ma.glasnost.orika.MappingContext mappingContext73 = null;
        createPostRequestToPostMapper36.mapAtoB(createPostRequest55, post62, mappingContext73);
        ma.glasnost.orika.MappingContext mappingContext75 = null;
        createPostRequestToPostMapper18.mapBtoA(post29, createPostRequest55, mappingContext75);
        java.lang.String str77 = createPostRequest55.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(resultType16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertNotNull(mapperFacade21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str32, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNotNull(postType38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str42, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str53, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str57, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str65, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        userDto0.setSurname("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        userDto0.setLogin("Tag(id=null, name=null)");
        java.lang.String str7 = userDto0.getLogin();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl8 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper9 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl8);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType10 = resultToDescriptionMapper9.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType11 = resultToDescriptionMapper9.getAType();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription12 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription12.setId((java.lang.Integer) 0);
        resultDescription12.setMark(1L);
        java.lang.Integer int17 = resultDescription12.getTestId();
        long long18 = resultDescription12.getMark();
        com.vntu.marenko.ualearning.server.model.Result result19 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int20 = result19.getId();
        com.vntu.marenko.ualearning.server.model.Test test21 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int22 = test21.getId();
        java.lang.Integer int23 = test21.getId();
        result19.setTest(test21);
        boolean boolean25 = result19.isSubmitted();
        ma.glasnost.orika.MappingContext mappingContext26 = null;
        resultToDescriptionMapper9.mapBtoA(resultDescription12, result19, mappingContext26);
        com.vntu.marenko.ualearning.server.dto.TestDescription testDescription28 = new com.vntu.marenko.ualearning.server.dto.TestDescription();
        testDescription28.setNameTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        testDescription28.setId((-1));
        testDescription28.setNameTest("TagDto(id=0, name=null)");
        java.lang.String str35 = testDescription28.toString();
        com.vntu.marenko.ualearning.server.model.Result result36 = new com.vntu.marenko.ualearning.server.model.Result();
        result36.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user39 = new com.vntu.marenko.ualearning.server.model.User();
        user39.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test42 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean43 = user39.equals((java.lang.Object) test42);
        user39.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result36.setUser(user39);
        boolean boolean47 = testDescription28.equals((java.lang.Object) user39);
        result19.setUser(user39);
        boolean boolean49 = userDto0.equals((java.lang.Object) user39);
        int int50 = userDto0.getRating();
        userDto0.setAge(52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tag(id=null, name=null)" + "'", str7, "Tag(id=null, name=null)");
        org.junit.Assert.assertNotNull(resultType10);
        org.junit.Assert.assertNotNull(resultType11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "TestDescription(id=-1, nameTest=TagDto(id=0, name=null))" + "'", str35, "TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.toString();
        java.lang.String str2 = tag0.toString();
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest3 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str4 = userRequest3.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto5 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto5.setId((int) '#');
        boolean boolean8 = userRequest3.equals((java.lang.Object) '#');
        boolean boolean9 = tag0.equals((java.lang.Object) boolean8);
        tag0.setName("ResultDescription(id=null, testId=100, testName=null, mark=0)");
        tag0.setName("ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        com.vntu.marenko.ualearning.server.model.User user14 = new com.vntu.marenko.ualearning.server.model.User();
        user14.setInstitution("hi!");
        java.lang.String str17 = user14.toString();
        java.lang.String str18 = user14.getEmail();
        java.lang.String str19 = user14.getEmail();
        java.lang.String str20 = user14.getInstitution();
        boolean boolean21 = tag0.equals((java.lang.Object) str20);
        tag0.setName("TestDescription(id=-1, nameTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tag(id=null, name=null)" + "'", str1, "Tag(id=null, name=null)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Tag(id=null, name=null)" + "'", str2, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str17, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest0 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository2 = null;
        ma.glasnost.orika.MapperFacade mapperFacade3 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository4 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto5 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl6 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean7 = answerDto5.equals((java.lang.Object) markComputerImpl6);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl8 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository2, mapperFacade3, userRepository4, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl6);
        boolean boolean9 = loginRequest0.equals((java.lang.Object) resultServiceImpl8);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository10 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl11 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository10);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository12 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig14 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl15 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository16 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository17 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository18 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper19 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository16, testRepository17, answerRepository18);
        ma.glasnost.orika.MapperFacade mapperFacade20 = null;
        submitResultRequestToDomainMapper19.setMapperFacade(mapperFacade20);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType22 = submitResultRequestToDomainMapper19.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper23 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper24 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean25 = createPostRequestToPostMapper24.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper26 = null;
        ma.glasnost.orika.MapperFacade mapperFacade27 = mapperConfig14.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl15, submitResultRequestToDomainMapper19, resultToDescriptionMapper23, createPostRequestToPostMapper24, postToDtoMapper26);
        postToDtoMapper13.setMapperFacade(mapperFacade27);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository29 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig30 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl31 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository32 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository33 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository34 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper35 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository32, testRepository33, answerRepository34);
        ma.glasnost.orika.MapperFacade mapperFacade36 = null;
        submitResultRequestToDomainMapper35.setMapperFacade(mapperFacade36);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType38 = submitResultRequestToDomainMapper35.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper39 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper40 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean41 = createPostRequestToPostMapper40.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper42 = null;
        ma.glasnost.orika.MapperFacade mapperFacade43 = mapperConfig30.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl31, submitResultRequestToDomainMapper35, resultToDescriptionMapper39, createPostRequestToPostMapper40, postToDtoMapper42);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl44 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository45 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository46 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository47 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper48 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository45, testRepository46, answerRepository47);
        ma.glasnost.orika.MapperFacade mapperFacade49 = null;
        submitResultRequestToDomainMapper48.setMapperFacade(mapperFacade49);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType51 = submitResultRequestToDomainMapper48.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper52 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig53 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl54 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository55 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository56 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository57 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper58 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository55, testRepository56, answerRepository57);
        ma.glasnost.orika.MapperFacade mapperFacade59 = null;
        submitResultRequestToDomainMapper58.setMapperFacade(mapperFacade59);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType61 = submitResultRequestToDomainMapper58.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper62 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper63 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean64 = createPostRequestToPostMapper63.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper65 = null;
        ma.glasnost.orika.MapperFacade mapperFacade66 = mapperConfig53.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl54, submitResultRequestToDomainMapper58, resultToDescriptionMapper62, createPostRequestToPostMapper63, postToDtoMapper65);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper67 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade68 = mapperConfig30.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl44, submitResultRequestToDomainMapper48, resultToDescriptionMapper52, createPostRequestToPostMapper63, postToDtoMapper67);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl69 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository12, mapperFacade27, userRepository29, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl44);
        com.vntu.marenko.ualearning.server.controller.UserController userController70 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl11, mapperFacade27);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController71 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl8, mapperFacade27);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.ResultDto resultDto73 = resultServiceImpl8.getResult((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(resultType22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + false + "'", boolean25, false);
        org.junit.Assert.assertNotNull(mapperFacade27);
        org.junit.Assert.assertNotNull(resultType38);
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + false + "'", boolean41, false);
        org.junit.Assert.assertNotNull(mapperFacade43);
        org.junit.Assert.assertNotNull(resultType51);
        org.junit.Assert.assertNotNull(resultType61);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
        org.junit.Assert.assertNotNull(mapperFacade66);
        org.junit.Assert.assertNotNull(mapperFacade68);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository2 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper3 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository0, testRepository1, answerRepository2);
        ma.glasnost.orika.MapperFacade mapperFacade4 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade4);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType6 = submitResultRequestToDomainMapper3.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade7);
        com.vntu.marenko.ualearning.server.model.User user9 = new com.vntu.marenko.ualearning.server.model.User();
        user9.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository13 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository14 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper15 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository12, testRepository13, answerRepository14);
        ma.glasnost.orika.MapperFacade mapperFacade16 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade16);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType18 = submitResultRequestToDomainMapper15.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade19 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade19);
        boolean boolean21 = user9.equals((java.lang.Object) submitResultRequestToDomainMapper15);
        com.vntu.marenko.ualearning.server.model.Result result22 = new com.vntu.marenko.ualearning.server.model.Result();
        result22.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user25 = new com.vntu.marenko.ualearning.server.model.User();
        user25.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test28 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean29 = user25.equals((java.lang.Object) test28);
        user25.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result22.setUser(user25);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest33 = null;
        ma.glasnost.orika.MappingContext mappingContext34 = null;
        submitResultRequestToDomainMapper15.mapBtoA(result22, submitResultRequest33, mappingContext34);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest36 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest36.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int39 = submitResultRequest36.getTestId();
        ma.glasnost.orika.MappingContext mappingContext40 = null;
        submitResultRequestToDomainMapper3.mapBtoA(result22, submitResultRequest36, mappingContext40);
        ma.glasnost.orika.MapperFacade mapperFacade42 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade42);
        org.junit.Assert.assertNotNull(submitResultRequestType6);
        org.junit.Assert.assertNotNull(submitResultRequestType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper0 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig1 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = submitResultRequestToDomainMapper6.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper10 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper11 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean12 = createPostRequestToPostMapper11.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = null;
        ma.glasnost.orika.MapperFacade mapperFacade14 = mapperConfig1.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2, submitResultRequestToDomainMapper6, resultToDescriptionMapper10, createPostRequestToPostMapper11, postToDtoMapper13);
        postToDtoMapper0.setMapperFacade(mapperFacade14);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType16 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType17 = postToDtoMapper0.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType18 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType19 = postToDtoMapper0.getBType();
        java.lang.Boolean boolean20 = postToDtoMapper0.favorsExtension();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto21 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        java.lang.String str22 = postDto21.getLogin();
        postDto21.setTimestamp("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        com.vntu.marenko.ualearning.server.model.Post post25 = new com.vntu.marenko.ualearning.server.model.Post();
        post25.setText("");
        java.lang.String str28 = post25.toString();
        java.lang.Integer int29 = post25.getId();
        ma.glasnost.orika.MappingContext mappingContext30 = null;
        postToDtoMapper0.mapBtoA(postDto21, post25, mappingContext30);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType32 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType33 = postToDtoMapper0.getBType();
        ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object> objMapper34 = null;
        ma.glasnost.orika.Mapper[] mapperArray36 = new ma.glasnost.orika.Mapper[1];
        @SuppressWarnings("unchecked")
        ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[] objMapperArray37 = (ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[]) mapperArray36;
        objMapperArray37[0] = objMapper34;
        // The following exception was thrown during execution in test generation
        try {
            postToDtoMapper0.setUsedMappers(objMapperArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not be called for a user custom mapper.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertNotNull(postType16);
        org.junit.Assert.assertNotNull(postDtoType17);
        org.junit.Assert.assertNotNull(postType18);
        org.junit.Assert.assertNotNull(postDtoType19);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str28, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(postType32);
        org.junit.Assert.assertNotNull(postDtoType33);
        org.junit.Assert.assertNotNull(mapperArray36);
        org.junit.Assert.assertNotNull(objMapperArray37);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl1 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean2 = answerDto0.equals((java.lang.Object) markComputerImpl1);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType9 = submitResultRequestToDomainMapper6.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade10 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade10);
        boolean boolean12 = answerDto0.equals((java.lang.Object) submitResultRequestToDomainMapper6);
        com.vntu.marenko.ualearning.server.model.Result result13 = new com.vntu.marenko.ualearning.server.model.Result();
        com.vntu.marenko.ualearning.server.model.User user14 = new com.vntu.marenko.ualearning.server.model.User();
        user14.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test17 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean18 = user14.equals((java.lang.Object) test17);
        result13.setUser(user14);
        com.vntu.marenko.ualearning.server.model.Test test20 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int21 = test20.getId();
        java.lang.Integer int22 = test20.getId();
        test20.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        result13.setTest(test20);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository28 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper29 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository26, testRepository27, answerRepository28);
        ma.glasnost.orika.MapperFacade mapperFacade30 = null;
        submitResultRequestToDomainMapper29.setMapperFacade(mapperFacade30);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType32 = submitResultRequestToDomainMapper29.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade33 = null;
        submitResultRequestToDomainMapper29.setMapperFacade(mapperFacade33);
        com.vntu.marenko.ualearning.server.model.User user35 = new com.vntu.marenko.ualearning.server.model.User();
        user35.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository38 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository39 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository40 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper41 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository38, testRepository39, answerRepository40);
        ma.glasnost.orika.MapperFacade mapperFacade42 = null;
        submitResultRequestToDomainMapper41.setMapperFacade(mapperFacade42);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType44 = submitResultRequestToDomainMapper41.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade45 = null;
        submitResultRequestToDomainMapper41.setMapperFacade(mapperFacade45);
        boolean boolean47 = user35.equals((java.lang.Object) submitResultRequestToDomainMapper41);
        com.vntu.marenko.ualearning.server.model.Result result48 = new com.vntu.marenko.ualearning.server.model.Result();
        result48.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user51 = new com.vntu.marenko.ualearning.server.model.User();
        user51.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test54 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean55 = user51.equals((java.lang.Object) test54);
        user51.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result48.setUser(user51);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest59 = null;
        ma.glasnost.orika.MappingContext mappingContext60 = null;
        submitResultRequestToDomainMapper41.mapBtoA(result48, submitResultRequest59, mappingContext60);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest62 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest62.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int65 = submitResultRequest62.getTestId();
        ma.glasnost.orika.MappingContext mappingContext66 = null;
        submitResultRequestToDomainMapper29.mapBtoA(result48, submitResultRequest62, mappingContext66);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto68 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto68.setText("hi!");
        java.lang.String str71 = answerDto68.getText();
        boolean boolean72 = submitResultRequest62.equals((java.lang.Object) answerDto68);
        submitResultRequest62.setUserLogin("hi!");
        ma.glasnost.orika.MappingContext mappingContext75 = null;
        submitResultRequestToDomainMapper6.mapBtoA(result13, submitResultRequest62, mappingContext75);
        submitResultRequest62.setUserLogin("CreatePostRequest(text=CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null), username=null)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(submitResultRequestType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(submitResultRequestType32);
        org.junit.Assert.assertNotNull(submitResultRequestType44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper0 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig1 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository4 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository5 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper6 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository3, testRepository4, answerRepository5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        submitResultRequestToDomainMapper6.setMapperFacade(mapperFacade7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = submitResultRequestToDomainMapper6.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper10 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper11 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean12 = createPostRequestToPostMapper11.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper13 = null;
        ma.glasnost.orika.MapperFacade mapperFacade14 = mapperConfig1.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2, submitResultRequestToDomainMapper6, resultToDescriptionMapper10, createPostRequestToPostMapper11, postToDtoMapper13);
        postToDtoMapper0.setMapperFacade(mapperFacade14);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType16 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType17 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType18 = postToDtoMapper0.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType19 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType20 = postToDtoMapper0.getBType();
        com.vntu.marenko.ualearning.server.model.Post post21 = new com.vntu.marenko.ualearning.server.model.Post();
        post21.setText("");
        java.lang.String str24 = post21.toString();
        java.lang.Integer int25 = post21.getId();
        java.util.Date date26 = null;
        post21.setTimestamp(date26);
        java.lang.Integer int28 = post21.getId();
        java.lang.Integer int29 = post21.getId();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto30 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto30.setId((int) (byte) 100);
        java.lang.String str33 = postDto30.getText();
        postDto30.setLogin("ResultDescription(id=null, testId=100, testName=null, mark=0)");
        java.lang.String str36 = postDto30.getTimestamp();
        java.lang.String str37 = postDto30.getText();
        java.lang.String str38 = postDto30.getText();
        postDto30.setId((int) 'a');
        int int41 = postDto30.getId();
        ma.glasnost.orika.MappingContext mappingContext42 = null;
        // The following exception was thrown during execution in test generation
        try {
            postToDtoMapper0.mapAtoB(post21, postDto30, mappingContext42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertNotNull(postType16);
        org.junit.Assert.assertNotNull(postType17);
        org.junit.Assert.assertNotNull(postDtoType18);
        org.junit.Assert.assertNotNull(postType19);
        org.junit.Assert.assertNotNull(postDtoType20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str24, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl1 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository0);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl2 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper3 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl2);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType4 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType5 = resultToDescriptionMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType6 = resultToDescriptionMapper3.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType7 = resultToDescriptionMapper3.getAType();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper8 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean9 = createPostRequestToPostMapper8.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig10 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl11 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository13 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository14 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper15 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository12, testRepository13, answerRepository14);
        ma.glasnost.orika.MapperFacade mapperFacade16 = null;
        submitResultRequestToDomainMapper15.setMapperFacade(mapperFacade16);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType18 = submitResultRequestToDomainMapper15.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper19 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper20 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean21 = createPostRequestToPostMapper20.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper22 = null;
        ma.glasnost.orika.MapperFacade mapperFacade23 = mapperConfig10.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl11, submitResultRequestToDomainMapper15, resultToDescriptionMapper19, createPostRequestToPostMapper20, postToDtoMapper22);
        createPostRequestToPostMapper8.setMapperFacade(mapperFacade23);
        resultToDescriptionMapper3.setMapperFacade(mapperFacade23);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController26 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade23);
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest27 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str28 = loginRequest27.toString();
        java.lang.String str29 = loginRequest27.getLogin();
        loginRequest27.setPassword("hi!");
        loginRequest27.setLogin("UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)");
        java.lang.String str34 = loginRequest27.getLogin();
        java.lang.String str35 = loginRequest27.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = authorisationController26.login(loginRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType4);
        org.junit.Assert.assertNotNull(resultType5);
        org.junit.Assert.assertNotNull(resultDescriptionType6);
        org.junit.Assert.assertNotNull(resultType7);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(resultType18);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertNotNull(mapperFacade23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str28, "LoginRequest(login=null, password=null)");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)" + "'", str34, "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LoginRequest(login=UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0), password=hi!)" + "'", str35, "LoginRequest(login=UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0), password=hi!)");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository0 = null;
        ma.glasnost.orika.MapperFacade mapperFacade1 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository2 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer3 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl4 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository0, mapperFacade1, userRepository2, markComputer3);
        ma.glasnost.orika.MapperFacade mapperFacade5 = null;
        com.vntu.marenko.ualearning.server.controller.ResultController resultController6 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl4, mapperFacade5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        com.vntu.marenko.ualearning.server.controller.ResultController resultController8 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl4, mapperFacade7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionList10 = resultController8.getResultsForUser("TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=1, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)])");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.toString();
        java.lang.Integer int2 = tag0.getId();
        java.lang.String str3 = tag0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tag(id=null, name=null)" + "'", str1, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag(id=null, name=null)" + "'", str3, "Tag(id=null, name=null)");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag0.setName("Post(id=null, text=ResultDescription(id=0, testId=null, testName=null, mark=1), timestamp=null, user=null, likes=null)");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        user0.setName("TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        user0.setAge((int) '#');
        user0.setInstitution("ResultDto(id=100, user=null, test=null, submitted=false, answers=null, mark=0)");
        user0.setRating((long) (byte) 100);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto0 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto0.setId(1);
        boolean boolean4 = tagDto0.equals((java.lang.Object) (-1L));
        tagDto0.setId((int) (short) 0);
        java.lang.String str7 = tagDto0.getName();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto8 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto8.setId((int) (byte) 100);
        com.vntu.marenko.ualearning.server.dto.UserDto userDto11 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto11.setInstitution("");
        java.lang.String str14 = userDto11.getInstitution();
        userDto11.setAge((int) (byte) 10);
        boolean boolean17 = postDto8.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = tagDto0.equals((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        java.lang.String str3 = userDto0.getInstitution();
        userDto0.setSurname("hi!");
        userDto0.setRating((int) ' ');
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper8 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType9 = createPostRequestToPostMapper8.getBType();
        com.vntu.marenko.ualearning.server.model.Post post10 = new com.vntu.marenko.ualearning.server.model.Post();
        post10.setText("");
        java.lang.String str13 = post10.toString();
        post10.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest16 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest16.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext19 = null;
        createPostRequestToPostMapper8.mapBtoA(post10, createPostRequest16, mappingContext19);
        com.vntu.marenko.ualearning.server.model.Post post21 = new com.vntu.marenko.ualearning.server.model.Post();
        post21.setText("");
        java.lang.String str24 = post21.toString();
        java.lang.Integer int25 = post21.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest26 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str27 = createPostRequest26.getUsername();
        java.lang.String str28 = createPostRequest26.toString();
        ma.glasnost.orika.MappingContext mappingContext29 = null;
        createPostRequestToPostMapper8.mapBtoA(post21, createPostRequest26, mappingContext29);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository31 = null;
        ma.glasnost.orika.MapperFacade mapperFacade32 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository33 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer34 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl35 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository31, mapperFacade32, userRepository33, markComputer34);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper36 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean37 = createPostRequestToPostMapper36.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig38 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl39 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository40 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository41 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository42 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper43 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository40, testRepository41, answerRepository42);
        ma.glasnost.orika.MapperFacade mapperFacade44 = null;
        submitResultRequestToDomainMapper43.setMapperFacade(mapperFacade44);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType46 = submitResultRequestToDomainMapper43.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper47 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper48 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean49 = createPostRequestToPostMapper48.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper50 = null;
        ma.glasnost.orika.MapperFacade mapperFacade51 = mapperConfig38.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl39, submitResultRequestToDomainMapper43, resultToDescriptionMapper47, createPostRequestToPostMapper48, postToDtoMapper50);
        createPostRequestToPostMapper36.setMapperFacade(mapperFacade51);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController53 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl35, mapperFacade51);
        com.vntu.marenko.ualearning.server.service.UserService userService54 = null;
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper55 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig56 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl57 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository58 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository59 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository60 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper61 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository58, testRepository59, answerRepository60);
        ma.glasnost.orika.MapperFacade mapperFacade62 = null;
        submitResultRequestToDomainMapper61.setMapperFacade(mapperFacade62);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType64 = submitResultRequestToDomainMapper61.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper65 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper66 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean67 = createPostRequestToPostMapper66.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper68 = null;
        ma.glasnost.orika.MapperFacade mapperFacade69 = mapperConfig56.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl57, submitResultRequestToDomainMapper61, resultToDescriptionMapper65, createPostRequestToPostMapper66, postToDtoMapper68);
        postToDtoMapper55.setMapperFacade(mapperFacade69);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController71 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService54, mapperFacade69);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController72 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl35, mapperFacade69);
        createPostRequestToPostMapper8.setMapperFacade(mapperFacade69);
        java.lang.Boolean boolean74 = createPostRequestToPostMapper8.favorsExtension();
        java.lang.Boolean boolean75 = createPostRequestToPostMapper8.favorsExtension();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest76 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str77 = createPostRequest76.getUsername();
        createPostRequest76.setText("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        com.vntu.marenko.ualearning.server.model.Post post80 = new com.vntu.marenko.ualearning.server.model.Post();
        post80.setText("");
        java.lang.String str83 = post80.toString();
        java.lang.Integer int84 = post80.getId();
        java.util.Date date85 = null;
        post80.setTimestamp(date85);
        java.lang.Integer int87 = post80.getId();
        ma.glasnost.orika.MappingContext mappingContext88 = null;
        createPostRequestToPostMapper8.mapAtoB(createPostRequest76, post80, mappingContext88);
        boolean boolean90 = userDto0.equals((java.lang.Object) post80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(postType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str13, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str24, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str28, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
        org.junit.Assert.assertNotNull(resultType46);
        org.junit.Assert.assertEquals("'" + boolean49 + "' != '" + false + "'", boolean49, false);
        org.junit.Assert.assertNotNull(mapperFacade51);
        org.junit.Assert.assertNotNull(resultType64);
        org.junit.Assert.assertEquals("'" + boolean67 + "' != '" + false + "'", boolean67, false);
        org.junit.Assert.assertNotNull(mapperFacade69);
        org.junit.Assert.assertEquals("'" + boolean74 + "' != '" + false + "'", boolean74, false);
        org.junit.Assert.assertEquals("'" + boolean75 + "' != '" + false + "'", boolean75, false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str83, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int84);
        org.junit.Assert.assertNull(int87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int1 = result0.getId();
        com.vntu.marenko.ualearning.server.model.Test test2 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int3 = test2.getId();
        java.lang.Integer int4 = test2.getId();
        result0.setTest(test2);
        java.lang.Integer int6 = result0.getId();
        com.vntu.marenko.ualearning.server.model.Result result7 = new com.vntu.marenko.ualearning.server.model.Result();
        result7.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user10 = new com.vntu.marenko.ualearning.server.model.User();
        user10.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test13 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean14 = user10.equals((java.lang.Object) test13);
        user10.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result7.setUser(user10);
        com.vntu.marenko.ualearning.server.model.Question question18 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int19 = question18.getId();
        java.lang.Integer int20 = question18.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer21 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer22 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer22.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray25 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer21, answer22 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList26 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList26, answerArray25);
        question18.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList26);
        result7.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList26);
        result0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList26);
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user33 = new com.vntu.marenko.ualearning.server.model.User();
        user33.setSurname("");
        user33.setRating((long) (short) -1);
        result0.setUser(user33);
        user33.setInstitution("User(login=null, password=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), name=null, surname=, age=52, institution=null, email=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), rating=0)");
        user33.setName("CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(answerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper0 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper1 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType2 = createPostRequestToPostMapper1.getBType();
        com.vntu.marenko.ualearning.server.model.Post post3 = new com.vntu.marenko.ualearning.server.model.Post();
        post3.setText("");
        java.lang.String str6 = post3.toString();
        post3.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest9 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest9.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext12 = null;
        createPostRequestToPostMapper1.mapBtoA(post3, createPostRequest9, mappingContext12);
        com.vntu.marenko.ualearning.server.model.Post post14 = new com.vntu.marenko.ualearning.server.model.Post();
        post14.setText("");
        java.lang.String str17 = post14.toString();
        java.lang.Integer int18 = post14.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest19 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str20 = createPostRequest19.getUsername();
        java.lang.String str21 = createPostRequest19.toString();
        ma.glasnost.orika.MappingContext mappingContext22 = null;
        createPostRequestToPostMapper1.mapBtoA(post14, createPostRequest19, mappingContext22);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper24 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType25 = createPostRequestToPostMapper24.getBType();
        com.vntu.marenko.ualearning.server.model.Post post26 = new com.vntu.marenko.ualearning.server.model.Post();
        post26.setText("");
        java.lang.String str29 = post26.toString();
        post26.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest32 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest32.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext35 = null;
        createPostRequestToPostMapper24.mapBtoA(post26, createPostRequest32, mappingContext35);
        ma.glasnost.orika.MappingContext mappingContext37 = null;
        createPostRequestToPostMapper0.mapAtoB(createPostRequest19, post26, mappingContext37);
        com.vntu.marenko.ualearning.server.model.User user39 = new com.vntu.marenko.ualearning.server.model.User();
        java.lang.String str40 = user39.getEmail();
        java.lang.String str41 = user39.getSurname();
        user39.setEmail("Answer(id=null, text=null, correct=false)");
        boolean boolean45 = user39.equals((java.lang.Object) (byte) -1);
        boolean boolean46 = createPostRequest19.equals((java.lang.Object) user39);
        java.lang.String str47 = createPostRequest19.getUsername();
        com.vntu.marenko.ualearning.server.model.Answer answer48 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer48.setCorrect(false);
        java.lang.Integer int51 = answer48.getId();
        answer48.setCorrect(false);
        com.vntu.marenko.ualearning.server.dto.TestDescription testDescription54 = new com.vntu.marenko.ualearning.server.dto.TestDescription();
        testDescription54.setNameTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        testDescription54.setId((-1));
        java.lang.String str59 = testDescription54.getNameTest();
        boolean boolean61 = testDescription54.equals((java.lang.Object) "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        int int62 = testDescription54.getId();
        boolean boolean63 = answer48.equals((java.lang.Object) testDescription54);
        boolean boolean64 = createPostRequest19.equals((java.lang.Object) testDescription54);
        int int65 = testDescription54.getId();
        org.junit.Assert.assertNotNull(postType2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str6, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str17, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str21, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str29, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str59, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository2 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl3 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository1, tagRepository2);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper4 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig5 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl6 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository7 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository8 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository9 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper10 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository7, testRepository8, answerRepository9);
        ma.glasnost.orika.MapperFacade mapperFacade11 = null;
        submitResultRequestToDomainMapper10.setMapperFacade(mapperFacade11);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType13 = submitResultRequestToDomainMapper10.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper14 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper15 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean16 = createPostRequestToPostMapper15.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper17 = null;
        ma.glasnost.orika.MapperFacade mapperFacade18 = mapperConfig5.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl6, submitResultRequestToDomainMapper10, resultToDescriptionMapper14, createPostRequestToPostMapper15, postToDtoMapper17);
        postToDtoMapper4.setMapperFacade(mapperFacade18);
        com.vntu.marenko.ualearning.server.controller.TestController testController20 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade18);
        ma.glasnost.orika.MapperFacade mapperFacade21 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController22 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade21);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper23 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean24 = createPostRequestToPostMapper23.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig25 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl26 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository28 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository29 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper30 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository27, testRepository28, answerRepository29);
        ma.glasnost.orika.MapperFacade mapperFacade31 = null;
        submitResultRequestToDomainMapper30.setMapperFacade(mapperFacade31);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType33 = submitResultRequestToDomainMapper30.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper34 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper35 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean36 = createPostRequestToPostMapper35.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper37 = null;
        ma.glasnost.orika.MapperFacade mapperFacade38 = mapperConfig25.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl26, submitResultRequestToDomainMapper30, resultToDescriptionMapper34, createPostRequestToPostMapper35, postToDtoMapper37);
        createPostRequestToPostMapper23.setMapperFacade(mapperFacade38);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository40 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository41 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository42 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper43 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository40, testRepository41, answerRepository42);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType44 = submitResultRequestToDomainMapper43.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper45 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig46 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl47 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository48 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository49 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository50 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper51 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository48, testRepository49, answerRepository50);
        ma.glasnost.orika.MapperFacade mapperFacade52 = null;
        submitResultRequestToDomainMapper51.setMapperFacade(mapperFacade52);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType54 = submitResultRequestToDomainMapper51.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper55 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper56 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean57 = createPostRequestToPostMapper56.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper58 = null;
        ma.glasnost.orika.MapperFacade mapperFacade59 = mapperConfig46.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl47, submitResultRequestToDomainMapper51, resultToDescriptionMapper55, createPostRequestToPostMapper56, postToDtoMapper58);
        postToDtoMapper45.setMapperFacade(mapperFacade59);
        submitResultRequestToDomainMapper43.setMapperFacade(mapperFacade59);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository62 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl63 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository62);
        com.vntu.marenko.ualearning.server.controller.PostController postController64 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade59, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl63);
        com.vntu.marenko.ualearning.server.controller.PostController postController65 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade38, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl63);
        com.vntu.marenko.ualearning.server.controller.TestController testController66 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade38);
        boolean boolean67 = answerDto0.equals((java.lang.Object) testServiceImpl3);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl68 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper69 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl68);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType70 = resultToDescriptionMapper69.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType71 = resultToDescriptionMapper69.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType72 = resultToDescriptionMapper69.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType73 = resultToDescriptionMapper69.getAType();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper74 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean75 = createPostRequestToPostMapper74.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig76 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl77 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository78 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository79 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository80 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper81 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository78, testRepository79, answerRepository80);
        ma.glasnost.orika.MapperFacade mapperFacade82 = null;
        submitResultRequestToDomainMapper81.setMapperFacade(mapperFacade82);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType84 = submitResultRequestToDomainMapper81.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper85 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper86 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean87 = createPostRequestToPostMapper86.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper88 = null;
        ma.glasnost.orika.MapperFacade mapperFacade89 = mapperConfig76.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl77, submitResultRequestToDomainMapper81, resultToDescriptionMapper85, createPostRequestToPostMapper86, postToDtoMapper88);
        createPostRequestToPostMapper74.setMapperFacade(mapperFacade89);
        resultToDescriptionMapper69.setMapperFacade(mapperFacade89);
        com.vntu.marenko.ualearning.server.controller.TestController testController92 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl3, mapperFacade89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.model.Test> testList93 = testServiceImpl3.getAllTests();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType13);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertNotNull(mapperFacade18);
        org.junit.Assert.assertEquals("'" + boolean24 + "' != '" + false + "'", boolean24, false);
        org.junit.Assert.assertNotNull(resultType33);
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + false + "'", boolean36, false);
        org.junit.Assert.assertNotNull(mapperFacade38);
        org.junit.Assert.assertNotNull(resultType44);
        org.junit.Assert.assertNotNull(resultType54);
        org.junit.Assert.assertEquals("'" + boolean57 + "' != '" + false + "'", boolean57, false);
        org.junit.Assert.assertNotNull(mapperFacade59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(resultType70);
        org.junit.Assert.assertNotNull(resultType71);
        org.junit.Assert.assertNotNull(resultDescriptionType72);
        org.junit.Assert.assertNotNull(resultType73);
        org.junit.Assert.assertEquals("'" + boolean75 + "' != '" + false + "'", boolean75, false);
        org.junit.Assert.assertNotNull(resultType84);
        org.junit.Assert.assertEquals("'" + boolean87 + "' != '" + false + "'", boolean87, false);
        org.junit.Assert.assertNotNull(mapperFacade89);
    }
}

