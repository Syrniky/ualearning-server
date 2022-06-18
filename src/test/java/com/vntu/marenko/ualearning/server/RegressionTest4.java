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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer0.setText("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        boolean boolean3 = answer0.isCorrect();
        java.lang.String str4 = answer0.getText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str4, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto0.setText("");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        int int1 = questionDto0.getId();
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList2 = questionDto0.getAnswers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(answerDtoList2);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.toString();
        java.lang.Integer int2 = tag0.getId();
        java.lang.String str3 = tag0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tag(id=null, name=null)" + "'", str1, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag(id=null, name=null)" + "'", str3, "Tag(id=null, name=null)");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag0.setName("Post(id=null, text=ResultDescription(id=0, testId=null, testName=null, mark=1), timestamp=null, user=null, likes=null)");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        user0.setSurname("");
        user0.setName("TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        user0.setAge((int) '#');
        user0.setInstitution("ResultDto(id=100, user=null, test=null, submitted=false, answers=null, mark=0)");
        user0.setRating((long) (byte) 100);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setRating((int) (short) 10);
        userDto0.setSurname("QuestionDto(id=10, text=ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0), answers=null)");
        java.lang.String str5 = userDto0.getSurname();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "QuestionDto(id=10, text=ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0), answers=null)" + "'", str5, "QuestionDto(id=10, text=ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0), answers=null)");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str1 = questionDto0.toString();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto2 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto2.setId(0);
        postDto2.setText("UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        java.lang.String str7 = postDto2.getText();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto8 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str9 = questionDto8.getText();
        int int10 = questionDto8.getId();
        questionDto8.setId(10);
        java.lang.String str13 = questionDto8.toString();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto14 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl15 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean16 = answerDto14.equals((java.lang.Object) markComputerImpl15);
        java.lang.String str17 = answerDto14.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto18 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto18.setText("hi!");
        java.lang.String str21 = answerDto18.getText();
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto22 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper23 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
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
        com.vntu.marenko.ualearning.server.model.Post post37 = new com.vntu.marenko.ualearning.server.model.Post();
        post37.setText("");
        java.lang.String str40 = post37.toString();
        java.lang.Integer int41 = post37.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest42 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str43 = createPostRequest42.getUsername();
        java.lang.String str44 = createPostRequest42.toString();
        ma.glasnost.orika.MappingContext mappingContext45 = null;
        createPostRequestToPostMapper24.mapBtoA(post37, createPostRequest42, mappingContext45);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper47 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType48 = createPostRequestToPostMapper47.getBType();
        com.vntu.marenko.ualearning.server.model.Post post49 = new com.vntu.marenko.ualearning.server.model.Post();
        post49.setText("");
        java.lang.String str52 = post49.toString();
        post49.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest55 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest55.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext58 = null;
        createPostRequestToPostMapper47.mapBtoA(post49, createPostRequest55, mappingContext58);
        ma.glasnost.orika.MappingContext mappingContext60 = null;
        createPostRequestToPostMapper23.mapAtoB(createPostRequest42, post49, mappingContext60);
        boolean boolean62 = answerDto22.equals((java.lang.Object) mappingContext60);
        com.vntu.marenko.ualearning.server.dto.AnswerDto[] answerDtoArray63 = new com.vntu.marenko.ualearning.server.dto.AnswerDto[] { answerDto14, answerDto18, answerDto22 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList64 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.AnswerDto>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList64, answerDtoArray63);
        questionDto8.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList64);
        boolean boolean67 = postDto2.equals((java.lang.Object) answerDtoList64);
        questionDto0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto>) answerDtoList64);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList69 = questionDto0.getAnswers();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "QuestionDto(id=0, text=null, answers=null)" + "'", str1, "QuestionDto(id=0, text=null, answers=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)" + "'", str7, "UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "QuestionDto(id=10, text=null, answers=null)" + "'", str13, "QuestionDto(id=10, text=null, answers=null)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(postType25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str29, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str40, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str44, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str52, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(answerDtoArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(answerDtoList69);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user3 = new com.vntu.marenko.ualearning.server.model.User();
        user3.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test6 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean7 = user3.equals((java.lang.Object) test6);
        user3.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result0.setUser(user3);
        com.vntu.marenko.ualearning.server.model.Question question11 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int12 = question11.getId();
        java.lang.Integer int13 = question11.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer14 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer15 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer15.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray18 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer14, answer15 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList19 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList19, answerArray18);
        question11.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList19);
        result0.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList19);
        java.lang.String str23 = result0.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(answerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Result(id=100, user=User(login=null, password=null, name=null, surname=, age=0, institution=null, email=Post(id=null, text=, timestamp=null, user=null, likes=null), rating=0), test=null, submitted=false, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])" + "'", str23, "Result(id=100, user=User(login=null, password=null, name=null, surname=, age=0, institution=null, email=Post(id=null, text=, timestamp=null, user=null, likes=null), rating=0), test=null, submitted=false, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setLogin("TagDto(id=0, name=null)");
        int int3 = userDto0.getRating();
        java.lang.String str4 = userDto0.getEmail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer0.setText("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.String str3 = answer0.getText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str3, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionList30 = resultController27.getResultsForUser("Post(id=null, text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), timestamp=Sat Jun 18 18:05:56 EEST 2022, user=null, likes=null)");
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
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.vntu.marenko.ualearning.server.service.UserService userService0 = null;
        com.vntu.marenko.ualearning.server.service.UserService userService1 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository2 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository3 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl4 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository2, tagRepository3);
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
        com.vntu.marenko.ualearning.server.controller.TestController testController21 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl4, mapperFacade19);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository22 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository23 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository24 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper25 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository22, testRepository23, answerRepository24);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType26 = submitResultRequestToDomainMapper25.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper27 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig28 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl29 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository30 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository31 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository32 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper33 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository30, testRepository31, answerRepository32);
        ma.glasnost.orika.MapperFacade mapperFacade34 = null;
        submitResultRequestToDomainMapper33.setMapperFacade(mapperFacade34);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType36 = submitResultRequestToDomainMapper33.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper37 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper38 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean39 = createPostRequestToPostMapper38.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper40 = null;
        ma.glasnost.orika.MapperFacade mapperFacade41 = mapperConfig28.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl29, submitResultRequestToDomainMapper33, resultToDescriptionMapper37, createPostRequestToPostMapper38, postToDtoMapper40);
        postToDtoMapper27.setMapperFacade(mapperFacade41);
        submitResultRequestToDomainMapper25.setMapperFacade(mapperFacade41);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository44 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl45 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository44);
        com.vntu.marenko.ualearning.server.controller.PostController postController46 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade41, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl45);
        com.vntu.marenko.ualearning.server.controller.PostController postController47 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade19, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl45);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController48 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService1, mapperFacade19);
        com.vntu.marenko.ualearning.server.controller.AuthorisationController authorisationController49 = new com.vntu.marenko.ualearning.server.controller.AuthorisationController(userService0, mapperFacade19);
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest50 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str51 = userRequest50.getName();
        java.lang.String str52 = userRequest50.getName();
        java.lang.String str53 = userRequest50.getPassword();
        userRequest50.setLogin("TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        userRequest50.setSurname("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = authorisationController49.register(userRequest50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(mapperFacade19);
        org.junit.Assert.assertNotNull(resultType26);
        org.junit.Assert.assertNotNull(resultType36);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + false + "'", boolean39, false);
        org.junit.Assert.assertNotNull(mapperFacade41);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.vntu.marenko.ualearning.server.dto.TestDescription testDescription0 = new com.vntu.marenko.ualearning.server.dto.TestDescription();
        testDescription0.setNameTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        testDescription0.setNameTest("hi!");
        int int5 = testDescription0.getId();
        testDescription0.setId((int) (byte) 1);
        testDescription0.setNameTest("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        int int10 = testDescription0.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto0 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        java.lang.String str1 = questionDto0.getText();
        int int2 = questionDto0.getId();
        questionDto0.setId(10);
        java.lang.String str5 = questionDto0.toString();
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
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl20 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository22 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository23 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper24 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository21, testRepository22, answerRepository23);
        ma.glasnost.orika.MapperFacade mapperFacade25 = null;
        submitResultRequestToDomainMapper24.setMapperFacade(mapperFacade25);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType27 = submitResultRequestToDomainMapper24.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper28 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig29 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl30 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository31 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository32 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository33 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper34 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository31, testRepository32, answerRepository33);
        ma.glasnost.orika.MapperFacade mapperFacade35 = null;
        submitResultRequestToDomainMapper34.setMapperFacade(mapperFacade35);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType37 = submitResultRequestToDomainMapper34.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper38 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper39 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean40 = createPostRequestToPostMapper39.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper41 = null;
        ma.glasnost.orika.MapperFacade mapperFacade42 = mapperConfig29.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl30, submitResultRequestToDomainMapper34, resultToDescriptionMapper38, createPostRequestToPostMapper39, postToDtoMapper41);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper43 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade44 = mapperConfig6.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl20, submitResultRequestToDomainMapper24, resultToDescriptionMapper28, createPostRequestToPostMapper39, postToDtoMapper43);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType45 = submitResultRequestToDomainMapper24.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType46 = submitResultRequestToDomainMapper24.getBType();
        boolean boolean47 = questionDto0.equals((java.lang.Object) submitResultRequestToDomainMapper24);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "QuestionDto(id=10, text=null, answers=null)" + "'", str5, "QuestionDto(id=10, text=null, answers=null)");
        org.junit.Assert.assertNotNull(resultType14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(mapperFacade19);
        org.junit.Assert.assertNotNull(resultType27);
        org.junit.Assert.assertNotNull(resultType37);
        org.junit.Assert.assertEquals("'" + boolean40 + "' != '" + false + "'", boolean40, false);
        org.junit.Assert.assertNotNull(mapperFacade42);
        org.junit.Assert.assertNotNull(mapperFacade44);
        org.junit.Assert.assertNotNull(resultType45);
        org.junit.Assert.assertNotNull(resultType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        int int77 = submitResultRequest62.getTestId();
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest0 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest0.setText("Result(id=null, user=null, test=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), submitted=false, answers=null)");
        java.lang.String str3 = createPostRequest0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CreatePostRequest(text=Result(id=null, user=null, test=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), submitted=false, answers=null), username=null)" + "'", str3, "CreatePostRequest(text=Result(id=null, user=null, test=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), submitted=false, answers=null), username=null)");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        java.lang.String str2 = userRequest0.getPassword();
        userRequest0.setEmail("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        int int5 = userRequest0.getAge();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.vntu.marenko.ualearning.server.dto.TestDto testDto0 = new com.vntu.marenko.ualearning.server.dto.TestDto();
        java.lang.String str1 = testDto0.toString();
        java.lang.String str2 = testDto0.toString();
        java.lang.String str3 = testDto0.getNameTest();
        java.lang.String str4 = testDto0.getDescriptionTest();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)" + "'", str1, "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)" + "'", str2, "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        userRequest0.setInstitution("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=[])");
        java.lang.String str3 = userRequest0.getEmail();
        java.lang.String str4 = userRequest0.getName();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository5 = null;
        ma.glasnost.orika.MapperFacade mapperFacade6 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository7 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto8 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl9 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean10 = answerDto8.equals((java.lang.Object) markComputerImpl9);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl11 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository5, mapperFacade6, userRepository7, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl9);
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper12 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl9);
        java.lang.Boolean boolean13 = resultToDescriptionMapper12.favorsExtension();
        boolean boolean14 = userRequest0.equals((java.lang.Object) resultToDescriptionMapper12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto0 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto0.setId(1);
        tagDto0.setName("User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
        java.lang.String str5 = tagDto0.getName();
        tagDto0.setName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)" + "'", str5, "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        java.lang.String str3 = userDto0.getInstitution();
        userDto0.setSurname("hi!");
        boolean boolean7 = userDto0.equals((java.lang.Object) 52);
        com.vntu.marenko.ualearning.server.dto.UserDto userDto8 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto8.setInstitution("");
        java.lang.String str11 = userDto8.getInstitution();
        java.lang.String str12 = userDto8.getInstitution();
        java.lang.String str13 = userDto8.getSurname();
        userDto8.setSurname("");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository16 = null;
        ma.glasnost.orika.MapperFacade mapperFacade17 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository18 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer19 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl20 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository16, mapperFacade17, userRepository18, markComputer19);
        ma.glasnost.orika.MapperFacade mapperFacade21 = null;
        com.vntu.marenko.ualearning.server.controller.ResultController resultController22 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl20, mapperFacade21);
        boolean boolean23 = userDto8.equals((java.lang.Object) resultServiceImpl20);
        boolean boolean24 = userDto0.equals((java.lang.Object) boolean23);
        java.lang.String str25 = userDto0.getSurname();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        java.lang.String str25 = tag0.getName();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl1 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean2 = answerDto0.equals((java.lang.Object) markComputerImpl1);
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto3 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        answerDto3.setId((int) (byte) -1);
        boolean boolean6 = answerDto0.equals((java.lang.Object) (byte) -1);
        answerDto0.setText("Question(id=null, text=null, answers=null)");
        int int9 = answerDto0.getId();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription10 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription10.setId((java.lang.Integer) 0);
        resultDescription10.setTestName("hi!");
        java.lang.String str15 = resultDescription10.getTestName();
        java.lang.Integer int16 = resultDescription10.getTestId();
        long long17 = resultDescription10.getMark();
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
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest32 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest32.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        com.vntu.marenko.ualearning.server.model.Post post35 = new com.vntu.marenko.ualearning.server.model.Post();
        ma.glasnost.orika.MappingContext mappingContext36 = null;
        createPostRequestToPostMapper28.mapAtoB(createPostRequest32, post35, mappingContext36);
        boolean boolean38 = resultDescription10.equals((java.lang.Object) createPostRequestToPostMapper28);
        com.vntu.marenko.ualearning.server.model.Post post39 = new com.vntu.marenko.ualearning.server.model.Post();
        post39.setText("");
        java.lang.String str42 = post39.toString();
        java.lang.Integer int43 = post39.getId();
        post39.setText("Answer(id=null, text=null, correct=false)");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper46 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper47 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType48 = createPostRequestToPostMapper47.getBType();
        com.vntu.marenko.ualearning.server.model.Post post49 = new com.vntu.marenko.ualearning.server.model.Post();
        post49.setText("");
        java.lang.String str52 = post49.toString();
        post49.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest55 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest55.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext58 = null;
        createPostRequestToPostMapper47.mapBtoA(post49, createPostRequest55, mappingContext58);
        com.vntu.marenko.ualearning.server.model.Post post60 = new com.vntu.marenko.ualearning.server.model.Post();
        post60.setText("");
        java.lang.String str63 = post60.toString();
        java.lang.Integer int64 = post60.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest65 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str66 = createPostRequest65.getUsername();
        java.lang.String str67 = createPostRequest65.toString();
        ma.glasnost.orika.MappingContext mappingContext68 = null;
        createPostRequestToPostMapper47.mapBtoA(post60, createPostRequest65, mappingContext68);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper70 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType71 = createPostRequestToPostMapper70.getBType();
        com.vntu.marenko.ualearning.server.model.Post post72 = new com.vntu.marenko.ualearning.server.model.Post();
        post72.setText("");
        java.lang.String str75 = post72.toString();
        post72.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest78 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest78.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext81 = null;
        createPostRequestToPostMapper70.mapBtoA(post72, createPostRequest78, mappingContext81);
        ma.glasnost.orika.MappingContext mappingContext83 = null;
        createPostRequestToPostMapper46.mapAtoB(createPostRequest65, post72, mappingContext83);
        ma.glasnost.orika.MappingContext mappingContext85 = null;
        createPostRequestToPostMapper28.mapBtoA(post39, createPostRequest65, mappingContext85);
        boolean boolean87 = answerDto0.equals((java.lang.Object) post39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(resultType26);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(mapperFacade31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str42, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(postType48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str52, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str63, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str67, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType71);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str75, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        com.vntu.marenko.ualearning.server.dto.UserDto userDto11 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto11.setInstitution("");
        java.lang.String str14 = userDto11.getInstitution();
        userDto11.setEmail("TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        resultDto0.setUser(userDto11);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList18 = resultDto0.getAnswers();
        resultDto0.setId(0);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList21 = resultDto0.getAnswers();
        int int22 = resultDto0.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)" + "'", str6, "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(answerDtoList18);
        org.junit.Assert.assertNull(answerDtoList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription0 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription0.setId((java.lang.Integer) 0);
        resultDescription0.setMark(1L);
        resultDescription0.setTestId((java.lang.Integer) 35);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription0 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription0.setId((java.lang.Integer) 0);
        resultDescription0.setMark(1L);
        java.lang.String str5 = resultDescription0.getTestName();
        resultDescription0.setId((java.lang.Integer) 100);
        long long8 = resultDescription0.getMark();
        resultDescription0.setTestName("CreatePostRequest(text=Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)), username=null)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto0 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto0.setId(1);
        boolean boolean4 = tagDto0.equals((java.lang.Object) (-1L));
        int int5 = tagDto0.getId();
        java.lang.String str6 = tagDto0.toString();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl7 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper8 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl7);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType9 = resultToDescriptionMapper8.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType10 = resultToDescriptionMapper8.getAType();
        java.lang.Boolean boolean11 = resultToDescriptionMapper8.favorsExtension();
        boolean boolean12 = tagDto0.equals((java.lang.Object) resultToDescriptionMapper8);
        java.lang.String str13 = tagDto0.toString();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper14 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType15 = createPostRequestToPostMapper14.getBType();
        com.vntu.marenko.ualearning.server.model.Post post16 = new com.vntu.marenko.ualearning.server.model.Post();
        post16.setText("");
        java.lang.String str19 = post16.toString();
        java.lang.Integer int20 = post16.getId();
        java.util.Date date21 = null;
        post16.setTimestamp(date21);
        java.lang.Integer int23 = post16.getId();
        com.vntu.marenko.ualearning.server.model.Tag tag24 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str25 = tag24.toString();
        java.lang.String str26 = tag24.getName();
        java.lang.Integer int27 = tag24.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper29 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType30 = createPostRequestToPostMapper29.getBType();
        com.vntu.marenko.ualearning.server.model.Post post31 = new com.vntu.marenko.ualearning.server.model.Post();
        post31.setText("");
        java.lang.String str34 = post31.toString();
        post31.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest37 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest37.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext40 = null;
        createPostRequestToPostMapper29.mapBtoA(post31, createPostRequest37, mappingContext40);
        com.vntu.marenko.ualearning.server.model.Post post42 = new com.vntu.marenko.ualearning.server.model.Post();
        post42.setText("");
        java.lang.String str45 = post42.toString();
        java.lang.Integer int46 = post42.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest47 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str48 = createPostRequest47.getUsername();
        java.lang.String str49 = createPostRequest47.toString();
        ma.glasnost.orika.MappingContext mappingContext50 = null;
        createPostRequestToPostMapper29.mapBtoA(post42, createPostRequest47, mappingContext50);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper52 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType53 = createPostRequestToPostMapper52.getBType();
        com.vntu.marenko.ualearning.server.model.Post post54 = new com.vntu.marenko.ualearning.server.model.Post();
        post54.setText("");
        java.lang.String str57 = post54.toString();
        post54.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest60 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest60.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext63 = null;
        createPostRequestToPostMapper52.mapBtoA(post54, createPostRequest60, mappingContext63);
        ma.glasnost.orika.MappingContext mappingContext65 = null;
        createPostRequestToPostMapper28.mapAtoB(createPostRequest47, post54, mappingContext65);
        boolean boolean67 = tag24.equals((java.lang.Object) createPostRequest47);
        createPostRequest47.setText("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        createPostRequest47.setUsername("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        java.lang.String str72 = createPostRequest47.getUsername();
        createPostRequest47.setText("TagDto(id=0, name=null)");
        ma.glasnost.orika.MappingContext mappingContext75 = null;
        createPostRequestToPostMapper14.mapBtoA(post16, createPostRequest47, mappingContext75);
        java.lang.String str77 = createPostRequest47.getUsername();
        boolean boolean78 = tagDto0.equals((java.lang.Object) str77);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TagDto(id=1, name=null)" + "'", str6, "TagDto(id=1, name=null)");
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertNotNull(resultType10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TagDto(id=1, name=null)" + "'", str13, "TagDto(id=1, name=null)");
        org.junit.Assert.assertNotNull(postType15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str19, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Tag(id=null, name=null)" + "'", str25, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(postType30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str34, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str45, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str49, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str57, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ResultDescription(id=0, testId=null, testName=null, mark=1)" + "'", str72, "ResultDescription(id=0, testId=null, testName=null, mark=1)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "ResultDescription(id=0, testId=null, testName=null, mark=1)" + "'", str77, "ResultDescription(id=0, testId=null, testName=null, mark=1)");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto1 = null;
        resultDto0.setTest(testDto1);
        java.util.List<com.vntu.marenko.ualearning.server.dto.AnswerDto> answerDtoList3 = resultDto0.getAnswers();
        resultDto0.setId(100);
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription6 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription6.setId((java.lang.Integer) 0);
        resultDescription6.setTestName("hi!");
        java.lang.String str11 = resultDescription6.getTestName();
        boolean boolean12 = resultDto0.equals((java.lang.Object) str11);
        com.vntu.marenko.ualearning.server.dto.UserDto userDto13 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto13.setInstitution("");
        userDto13.setSurname("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        userDto13.setLogin("Tag(id=null, name=null)");
        userDto13.setInstitution("ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        java.lang.String str22 = userDto13.getInstitution();
        resultDto0.setUser(userDto13);
        resultDto0.setMark((long) (byte) 1);
        resultDto0.setId(0);
        org.junit.Assert.assertNull(answerDtoList3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)" + "'", str22, "ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.vntu.marenko.ualearning.server.model.Test test0 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int1 = test0.getId();
        java.lang.Integer int2 = test0.getId();
        test0.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.model.Tag tag5 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag5.setName("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        com.vntu.marenko.ualearning.server.model.Tag tag8 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag8.setName("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        com.vntu.marenko.ualearning.server.model.Tag tag11 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str12 = tag11.toString();
        java.lang.String str13 = tag11.getName();
        java.lang.Integer int14 = tag11.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper15 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper16 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType17 = createPostRequestToPostMapper16.getBType();
        com.vntu.marenko.ualearning.server.model.Post post18 = new com.vntu.marenko.ualearning.server.model.Post();
        post18.setText("");
        java.lang.String str21 = post18.toString();
        post18.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest24 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest24.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext27 = null;
        createPostRequestToPostMapper16.mapBtoA(post18, createPostRequest24, mappingContext27);
        com.vntu.marenko.ualearning.server.model.Post post29 = new com.vntu.marenko.ualearning.server.model.Post();
        post29.setText("");
        java.lang.String str32 = post29.toString();
        java.lang.Integer int33 = post29.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest34 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str35 = createPostRequest34.getUsername();
        java.lang.String str36 = createPostRequest34.toString();
        ma.glasnost.orika.MappingContext mappingContext37 = null;
        createPostRequestToPostMapper16.mapBtoA(post29, createPostRequest34, mappingContext37);
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
        ma.glasnost.orika.MappingContext mappingContext52 = null;
        createPostRequestToPostMapper15.mapAtoB(createPostRequest34, post41, mappingContext52);
        boolean boolean54 = tag11.equals((java.lang.Object) createPostRequest34);
        com.vntu.marenko.ualearning.server.model.Tag tag55 = new com.vntu.marenko.ualearning.server.model.Tag();
        com.vntu.marenko.ualearning.server.model.Tag[] tagArray56 = new com.vntu.marenko.ualearning.server.model.Tag[] { tag5, tag8, tag11, tag55 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag> tagList57 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Tag>) tagList57, tagArray56);
        test0.setTags((java.util.List<com.vntu.marenko.ualearning.server.model.Tag>) tagList57);
        java.lang.Integer int60 = test0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Tag(id=null, name=null)" + "'", str12, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(postType17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str21, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str32, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str36, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str44, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tagArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(int60);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        long long1 = user0.getRating();
        user0.setLogin("hi!");
        com.vntu.marenko.ualearning.server.model.Question question4 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int5 = question4.getId();
        java.util.List<com.vntu.marenko.ualearning.server.model.Answer> answerList6 = null;
        question4.setAnswers(answerList6);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository8 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository9 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository10 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper11 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository8, testRepository9, answerRepository10);
        ma.glasnost.orika.MapperFacade mapperFacade12 = null;
        submitResultRequestToDomainMapper11.setMapperFacade(mapperFacade12);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType14 = submitResultRequestToDomainMapper11.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade15 = null;
        submitResultRequestToDomainMapper11.setMapperFacade(mapperFacade15);
        com.vntu.marenko.ualearning.server.model.User user17 = new com.vntu.marenko.ualearning.server.model.User();
        user17.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository22 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper23 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository20, testRepository21, answerRepository22);
        ma.glasnost.orika.MapperFacade mapperFacade24 = null;
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade24);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType26 = submitResultRequestToDomainMapper23.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade27 = null;
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade27);
        boolean boolean29 = user17.equals((java.lang.Object) submitResultRequestToDomainMapper23);
        com.vntu.marenko.ualearning.server.model.Result result30 = new com.vntu.marenko.ualearning.server.model.Result();
        result30.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user33 = new com.vntu.marenko.ualearning.server.model.User();
        user33.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test36 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean37 = user33.equals((java.lang.Object) test36);
        user33.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result30.setUser(user33);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest41 = null;
        ma.glasnost.orika.MappingContext mappingContext42 = null;
        submitResultRequestToDomainMapper23.mapBtoA(result30, submitResultRequest41, mappingContext42);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest44 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest44.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int47 = submitResultRequest44.getTestId();
        ma.glasnost.orika.MappingContext mappingContext48 = null;
        submitResultRequestToDomainMapper11.mapBtoA(result30, submitResultRequest44, mappingContext48);
        com.vntu.marenko.ualearning.server.model.Question question50 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str51 = question50.getText();
        java.lang.Integer int52 = question50.getId();
        com.vntu.marenko.ualearning.server.service.TestService testService53 = null;
        ma.glasnost.orika.MapperFacade mapperFacade54 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController55 = new com.vntu.marenko.ualearning.server.controller.TestController(testService53, mapperFacade54);
        boolean boolean56 = question50.equals((java.lang.Object) testController55);
        com.vntu.marenko.ualearning.server.model.Result result57 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int58 = result57.getId();
        com.vntu.marenko.ualearning.server.model.Test test59 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int60 = test59.getId();
        java.lang.Integer int61 = test59.getId();
        result57.setTest(test59);
        java.lang.Integer int63 = result57.getId();
        com.vntu.marenko.ualearning.server.model.Result result64 = new com.vntu.marenko.ualearning.server.model.Result();
        result64.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user67 = new com.vntu.marenko.ualearning.server.model.User();
        user67.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test70 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean71 = user67.equals((java.lang.Object) test70);
        user67.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result64.setUser(user67);
        com.vntu.marenko.ualearning.server.model.Question question75 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int76 = question75.getId();
        java.lang.Integer int77 = question75.getId();
        com.vntu.marenko.ualearning.server.model.Answer answer78 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.model.Answer answer79 = new com.vntu.marenko.ualearning.server.model.Answer();
        answer79.setCorrect(false);
        com.vntu.marenko.ualearning.server.model.Answer[] answerArray82 = new com.vntu.marenko.ualearning.server.model.Answer[] { answer78, answer79 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer> answerList83 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Answer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Answer>) answerList83, answerArray82);
        question75.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList83);
        result64.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList83);
        result57.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList83);
        question50.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList83);
        result30.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList83);
        question4.setAnswers((java.util.List<com.vntu.marenko.ualearning.server.model.Answer>) answerList83);
        boolean boolean91 = user0.equals((java.lang.Object) question4);
        java.lang.String str92 = question4.getText();
        question4.setId((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(submitResultRequestType14);
        org.junit.Assert.assertNotNull(submitResultRequestType26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNull(int63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(int76);
        org.junit.Assert.assertNull(int77);
        org.junit.Assert.assertNotNull(answerArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        userRequest0.setSurname("QuestionDto(id=0, text=null, answers=null)");
        java.lang.String str17 = userRequest0.getSurname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "QuestionDto(id=0, text=null, answers=null)" + "'", str17, "QuestionDto(id=0, text=null, answers=null)");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.Integer int3 = post0.getId();
        java.util.Date date4 = post0.getTimestamp();
        post0.setId((java.lang.Integer) 35);
        java.lang.String str7 = post0.getUser();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.lang.String str15 = userRequest0.getInstitution();
        java.lang.String str16 = userRequest0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UserRequest(login=null, password=null, name=null, surname=null, age=100, institution=null, email=UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0))" + "'", str16, "UserRequest(login=null, password=null, name=null, surname=null, age=100, institution=null, email=UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0))");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig22 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl23 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository24 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository25 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository26 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper27 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository24, testRepository25, answerRepository26);
        ma.glasnost.orika.MapperFacade mapperFacade28 = null;
        submitResultRequestToDomainMapper27.setMapperFacade(mapperFacade28);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType30 = submitResultRequestToDomainMapper27.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper31 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper32 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean33 = createPostRequestToPostMapper32.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper34 = null;
        ma.glasnost.orika.MapperFacade mapperFacade35 = mapperConfig22.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl23, submitResultRequestToDomainMapper27, resultToDescriptionMapper31, createPostRequestToPostMapper32, postToDtoMapper34);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl36 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository37 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository38 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository39 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper40 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository37, testRepository38, answerRepository39);
        ma.glasnost.orika.MapperFacade mapperFacade41 = null;
        submitResultRequestToDomainMapper40.setMapperFacade(mapperFacade41);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType43 = submitResultRequestToDomainMapper40.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper44 = null;
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
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper59 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade60 = mapperConfig22.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl36, submitResultRequestToDomainMapper40, resultToDescriptionMapper44, createPostRequestToPostMapper55, postToDtoMapper59);
        com.vntu.marenko.ualearning.server.controller.TestController testController61 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl2, mapperFacade60);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.model.Test test63 = testServiceImpl2.getTest(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
        org.junit.Assert.assertNotNull(resultType30);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + false + "'", boolean33, false);
        org.junit.Assert.assertNotNull(mapperFacade35);
        org.junit.Assert.assertNotNull(resultType43);
        org.junit.Assert.assertNotNull(resultType53);
        org.junit.Assert.assertEquals("'" + boolean56 + "' != '" + false + "'", boolean56, false);
        org.junit.Assert.assertNotNull(mapperFacade58);
        org.junit.Assert.assertNotNull(mapperFacade60);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.vntu.marenko.ualearning.server.dto.PostDto postDto0 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        java.lang.String str1 = postDto0.getLogin();
        java.lang.String[] strArray6 = new java.lang.String[] { "LoginRequest(login=null, password=null)", "CreatePostRequest(text=null, username=null)", "Answer(id=null, text=null, correct=false)", "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        postDto0.setLikes((java.util.List<java.lang.String>) strList7);
        java.lang.String str10 = postDto0.getText();
        postDto0.setText("User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)");
        java.lang.String str13 = postDto0.getTimestamp();
        java.lang.String str14 = postDto0.getTimestamp();
        java.lang.String str15 = postDto0.getText();
        postDto0.setId(35);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper18 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType19 = createPostRequestToPostMapper18.getBType();
        com.vntu.marenko.ualearning.server.model.Post post20 = new com.vntu.marenko.ualearning.server.model.Post();
        post20.setText("");
        java.lang.String str23 = post20.toString();
        post20.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest26 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest26.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext29 = null;
        createPostRequestToPostMapper18.mapBtoA(post20, createPostRequest26, mappingContext29);
        com.vntu.marenko.ualearning.server.model.Post post31 = new com.vntu.marenko.ualearning.server.model.Post();
        post31.setText("");
        java.lang.String str34 = post31.toString();
        java.lang.Integer int35 = post31.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest36 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str37 = createPostRequest36.getUsername();
        java.lang.String str38 = createPostRequest36.toString();
        ma.glasnost.orika.MappingContext mappingContext39 = null;
        createPostRequestToPostMapper18.mapBtoA(post31, createPostRequest36, mappingContext39);
        createPostRequest36.setText("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)");
        createPostRequest36.setText("hi!");
        boolean boolean45 = postDto0.equals((java.lang.Object) createPostRequest36);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)" + "'", str15, "User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)");
        org.junit.Assert.assertNotNull(postType19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str23, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str34, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str38, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.String str3 = post0.toString();
        java.lang.Integer int4 = post0.getId();
        java.util.List<java.lang.String> strList5 = null;
        post0.setLikes(strList5);
        post0.setText("UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str3, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int4 = test3.getId();
        java.lang.Integer int5 = test3.getId();
        test3.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int8 = test3.getCompletedCounter();
        result0.setTest(test3);
        com.vntu.marenko.ualearning.server.model.Test test10 = result0.getTest();
        boolean boolean11 = result0.isSubmitted();
        com.vntu.marenko.ualearning.server.model.Result result12 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int13 = result12.getId();
        com.vntu.marenko.ualearning.server.model.Test test14 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int15 = test14.getId();
        java.lang.Integer int16 = test14.getId();
        result12.setTest(test14);
        java.lang.Integer int18 = result12.getId();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto19 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto19.setId(0);
        postDto19.setText("UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        postDto19.setTimestamp("User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
        com.vntu.marenko.ualearning.server.model.Test test26 = new com.vntu.marenko.ualearning.server.model.Test();
        com.vntu.marenko.ualearning.server.model.Tag[] tagArray27 = new com.vntu.marenko.ualearning.server.model.Tag[] {};
        java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag> tagList28 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.model.Tag>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.model.Tag>) tagList28, tagArray27);
        test26.setTags((java.util.List<com.vntu.marenko.ualearning.server.model.Tag>) tagList28);
        boolean boolean31 = postDto19.equals((java.lang.Object) test26);
        result12.setTest(test26);
        result0.setTest(test26);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(test10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(tagArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest0 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest0.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        java.util.List<java.lang.Integer> intList3 = submitResultRequest0.getAnswers();
        java.util.List<java.lang.Integer> intList4 = submitResultRequest0.getAnswers();
        java.lang.String str5 = submitResultRequest0.toString();
        submitResultRequest0.setUserLogin("UserDto(login=null, name=null, surname=null, age=0, institution=, email=null, rating=0)");
        java.lang.String str8 = submitResultRequest0.getUserLogin();
        org.junit.Assert.assertNull(intList3);
        org.junit.Assert.assertNull(intList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)" + "'", str5, "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UserDto(login=null, name=null, surname=null, age=0, institution=, email=null, rating=0)" + "'", str8, "UserDto(login=null, name=null, surname=null, age=0, institution=, email=null, rating=0)");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest0 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str1 = loginRequest0.toString();
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest2 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str3 = userRequest2.getName();
        java.lang.String str4 = userRequest2.getName();
        java.lang.String str5 = userRequest2.getName();
        boolean boolean6 = loginRequest0.equals((java.lang.Object) userRequest2);
        loginRequest0.setPassword("Result(id=100, user=null, test=null, submitted=false, answers=null)");
        java.lang.String str9 = loginRequest0.getLogin();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str1, "LoginRequest(login=null, password=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        loginRequest0.setPassword("TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=100, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)])");
        loginRequest0.setLogin("ResultDto(id=0, user=null, test=null, submitted=true, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0)");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository14 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository15 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository16 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper17 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository14, testRepository15, answerRepository16);
        ma.glasnost.orika.MapperFacade mapperFacade18 = null;
        submitResultRequestToDomainMapper17.setMapperFacade(mapperFacade18);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType20 = submitResultRequestToDomainMapper17.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade21 = null;
        submitResultRequestToDomainMapper17.setMapperFacade(mapperFacade21);
        com.vntu.marenko.ualearning.server.model.User user23 = new com.vntu.marenko.ualearning.server.model.User();
        user23.setSurname("");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository26 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository27 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository28 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper29 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository26, testRepository27, answerRepository28);
        ma.glasnost.orika.MapperFacade mapperFacade30 = null;
        submitResultRequestToDomainMapper29.setMapperFacade(mapperFacade30);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType32 = submitResultRequestToDomainMapper29.getAType();
        ma.glasnost.orika.MapperFacade mapperFacade33 = null;
        submitResultRequestToDomainMapper29.setMapperFacade(mapperFacade33);
        boolean boolean35 = user23.equals((java.lang.Object) submitResultRequestToDomainMapper29);
        com.vntu.marenko.ualearning.server.model.Result result36 = new com.vntu.marenko.ualearning.server.model.Result();
        result36.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.model.User user39 = new com.vntu.marenko.ualearning.server.model.User();
        user39.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test42 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean43 = user39.equals((java.lang.Object) test42);
        user39.setEmail("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        result36.setUser(user39);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest47 = null;
        ma.glasnost.orika.MappingContext mappingContext48 = null;
        submitResultRequestToDomainMapper29.mapBtoA(result36, submitResultRequest47, mappingContext48);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest50 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest50.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int53 = submitResultRequest50.getTestId();
        ma.glasnost.orika.MappingContext mappingContext54 = null;
        submitResultRequestToDomainMapper17.mapBtoA(result36, submitResultRequest50, mappingContext54);
        com.vntu.marenko.ualearning.server.model.Test test56 = result36.getTest();
        boolean boolean57 = loginRequest0.equals((java.lang.Object) test56);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(submitResultRequestType20);
        org.junit.Assert.assertNotNull(submitResultRequestType32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(test56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        int int1 = answerDto0.getId();
        com.vntu.marenko.ualearning.server.dto.TestDto testDto2 = new com.vntu.marenko.ualearning.server.dto.TestDto();
        java.lang.String str3 = testDto2.toString();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto4 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str5 = tagDto4.toString();
        java.lang.String str6 = tagDto4.getName();
        com.vntu.marenko.ualearning.server.model.User user7 = new com.vntu.marenko.ualearning.server.model.User();
        long long8 = user7.getRating();
        user7.setLogin("hi!");
        boolean boolean11 = tagDto4.equals((java.lang.Object) user7);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto12 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str13 = tagDto12.toString();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto14 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto14.setId(1);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto17 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str18 = tagDto17.toString();
        java.lang.String str19 = tagDto17.getName();
        com.vntu.marenko.ualearning.server.model.Test test20 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int21 = test20.getId();
        java.lang.Integer int22 = test20.getId();
        test20.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList25 = test20.getTags();
        boolean boolean26 = tagDto17.equals((java.lang.Object) tagList25);
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto27 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto27.setId(1);
        boolean boolean31 = tagDto27.equals((java.lang.Object) (-1L));
        int int32 = tagDto27.getId();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto33 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto33.setId(1);
        java.lang.String str36 = tagDto33.getName();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto37 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str38 = tagDto37.toString();
        java.lang.String str39 = tagDto37.getName();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto40 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str41 = tagDto40.toString();
        java.lang.String str42 = tagDto40.getName();
        com.vntu.marenko.ualearning.server.model.Test test43 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int44 = test43.getId();
        java.lang.Integer int45 = test43.getId();
        test43.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList48 = test43.getTags();
        boolean boolean49 = tagDto40.equals((java.lang.Object) tagList48);
        com.vntu.marenko.ualearning.server.dto.TagDto[] tagDtoArray50 = new com.vntu.marenko.ualearning.server.dto.TagDto[] { tagDto4, tagDto12, tagDto14, tagDto17, tagDto27, tagDto33, tagDto37, tagDto40 };
        java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.TagDto> tagDtoList51 = new java.util.ArrayList<com.vntu.marenko.ualearning.server.dto.TagDto>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.vntu.marenko.ualearning.server.dto.TagDto>) tagDtoList51, tagDtoArray50);
        testDto2.setTags((java.util.List<com.vntu.marenko.ualearning.server.dto.TagDto>) tagDtoList51);
        testDto2.setNameTest("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        java.lang.Integer int56 = testDto2.getCompletedCounter();
        testDto2.setDescriptionTest("CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null)");
        java.lang.String str59 = testDto2.getNameTest();
        testDto2.setDescriptionTest("LoginRequest(login=null, password=hi!)");
        boolean boolean62 = answerDto0.equals((java.lang.Object) testDto2);
        answerDto0.setText("UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)");
        java.lang.String str65 = answerDto0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)" + "'", str3, "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TagDto(id=0, name=null)" + "'", str5, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TagDto(id=0, name=null)" + "'", str13, "TagDto(id=0, name=null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TagDto(id=0, name=null)" + "'", str18, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(tagList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "TagDto(id=0, name=null)" + "'", str38, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "TagDto(id=0, name=null)" + "'", str41, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNull(tagList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tagDtoArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)" + "'", str59, "Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "AnswerDto(id=0, text=UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0))" + "'", str65, "AnswerDto(id=0, text=UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0))");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        loginRequest0.setPassword("TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=100, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)])");
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto12 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto12.setId((int) '#');
        boolean boolean15 = loginRequest0.equals((java.lang.Object) questionDto12);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository16 = null;
        com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl userServiceImpl17 = new com.vntu.marenko.ualearning.server.service.impl.UserServiceImpl(userRepository16);
        boolean boolean18 = questionDto12.equals((java.lang.Object) userServiceImpl17);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper19 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean20 = createPostRequestToPostMapper19.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig21 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl22 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository23 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository24 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository25 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper26 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository23, testRepository24, answerRepository25);
        ma.glasnost.orika.MapperFacade mapperFacade27 = null;
        submitResultRequestToDomainMapper26.setMapperFacade(mapperFacade27);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType29 = submitResultRequestToDomainMapper26.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper30 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper31 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean32 = createPostRequestToPostMapper31.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper33 = null;
        ma.glasnost.orika.MapperFacade mapperFacade34 = mapperConfig21.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl22, submitResultRequestToDomainMapper26, resultToDescriptionMapper30, createPostRequestToPostMapper31, postToDtoMapper33);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl35 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository36 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository37 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository38 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper39 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository36, testRepository37, answerRepository38);
        ma.glasnost.orika.MapperFacade mapperFacade40 = null;
        submitResultRequestToDomainMapper39.setMapperFacade(mapperFacade40);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType42 = submitResultRequestToDomainMapper39.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper43 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig44 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl45 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository46 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository47 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository48 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper49 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository46, testRepository47, answerRepository48);
        ma.glasnost.orika.MapperFacade mapperFacade50 = null;
        submitResultRequestToDomainMapper49.setMapperFacade(mapperFacade50);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType52 = submitResultRequestToDomainMapper49.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper53 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper54 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean55 = createPostRequestToPostMapper54.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper56 = null;
        ma.glasnost.orika.MapperFacade mapperFacade57 = mapperConfig44.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl45, submitResultRequestToDomainMapper49, resultToDescriptionMapper53, createPostRequestToPostMapper54, postToDtoMapper56);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper58 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade59 = mapperConfig21.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl35, submitResultRequestToDomainMapper39, resultToDescriptionMapper43, createPostRequestToPostMapper54, postToDtoMapper58);
        createPostRequestToPostMapper19.setMapperFacade(mapperFacade59);
        com.vntu.marenko.ualearning.server.controller.UserController userController61 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl17, mapperFacade59);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.model.User user63 = userServiceImpl17.getUser("CreatePostRequest(text=Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)), username=null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNotNull(resultType29);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + false + "'", boolean32, false);
        org.junit.Assert.assertNotNull(mapperFacade34);
        org.junit.Assert.assertNotNull(resultType42);
        org.junit.Assert.assertNotNull(resultType52);
        org.junit.Assert.assertEquals("'" + boolean55 + "' != '" + false + "'", boolean55, false);
        org.junit.Assert.assertNotNull(mapperFacade57);
        org.junit.Assert.assertNotNull(mapperFacade59);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest0 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        int int1 = submitResultRequest0.getTestId();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        submitResultRequest0.setAnswers((java.util.List<java.lang.Integer>) intList6);
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest9 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        int int10 = submitResultRequest9.getTestId();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        submitResultRequest9.setAnswers((java.util.List<java.lang.Integer>) intList15);
        submitResultRequest0.setAnswers((java.util.List<java.lang.Integer>) intList15);
        java.lang.String str19 = submitResultRequest0.toString();
        int int20 = submitResultRequest0.getTestId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SubmitResultRequest(userLogin=null, testId=0, answers=[1, 10, -1])" + "'", str19, "SubmitResultRequest(userLogin=null, testId=0, answers=[1, 10, -1])");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.CreatePostRequest> createPostRequestType67 = createPostRequestToPostMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.CreatePostRequest> createPostRequestType68 = createPostRequestToPostMapper0.getAType();
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
        org.junit.Assert.assertNotNull(createPostRequestType67);
        org.junit.Assert.assertNotNull(createPostRequestType68);
        org.junit.Assert.assertNotNull(mapperArray70);
        org.junit.Assert.assertNotNull(objMapperArray71);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        java.lang.String str1 = user0.getEmail();
        java.lang.String str2 = user0.getSurname();
        user0.setSurname("Tag(id=null, name=null)");
        int int5 = user0.getAge();
        user0.setAge((int) (byte) 100);
        user0.setSurname("Post(id=null, text=Answer(id=null, text=null, correct=false), timestamp=null, user=null, likes=null)");
        user0.setName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto0 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str1 = tagDto0.toString();
        java.lang.String str2 = tagDto0.getName();
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int4 = test3.getId();
        java.lang.Integer int5 = test3.getId();
        test3.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.util.List<com.vntu.marenko.ualearning.server.model.Tag> tagList8 = test3.getTags();
        boolean boolean9 = tagDto0.equals((java.lang.Object) tagList8);
        tagDto0.setName("User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)");
        java.lang.String str12 = tagDto0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TagDto(id=0, name=null)" + "'", str1, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(tagList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TagDto(id=0, name=User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0))" + "'", str12, "TagDto(id=0, name=User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0))");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository2 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper3 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository0, testRepository1, answerRepository2);
        ma.glasnost.orika.MapperFacade mapperFacade4 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade4);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType6 = submitResultRequestToDomainMapper3.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType7 = submitResultRequestToDomainMapper3.getBType();
        org.junit.Assert.assertNotNull(submitResultRequestType6);
        org.junit.Assert.assertNotNull(resultType7);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
            java.util.List<com.vntu.marenko.ualearning.server.dto.TestDescription> testDescriptionList67 = testController65.getTestDescriptionsForTag((int) 'a');
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.util.Date date3 = null;
        post0.setTimestamp(date3);
        java.lang.String str5 = post0.getText();
        post0.setText("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        java.lang.String str8 = post0.toString();
        com.vntu.marenko.ualearning.server.model.Post post9 = new com.vntu.marenko.ualearning.server.model.Post();
        post9.setText("");
        java.lang.String str12 = post9.toString();
        java.lang.Integer int13 = post9.getId();
        java.util.Date date14 = null;
        post9.setTimestamp(date14);
        java.lang.String str16 = post9.getText();
        java.util.List<java.lang.String> strList17 = post9.getLikes();
        java.util.Date date18 = null;
        post9.setTimestamp(date18);
        java.lang.String str20 = post9.toString();
        com.vntu.marenko.ualearning.server.model.Post post21 = new com.vntu.marenko.ualearning.server.model.Post();
        post21.setText("");
        java.lang.Integer int24 = post21.getId();
        java.util.Date date25 = post21.getTimestamp();
        com.vntu.marenko.ualearning.server.model.Post post26 = new com.vntu.marenko.ualearning.server.model.Post();
        post26.setText("");
        java.util.Date date29 = null;
        post26.setTimestamp(date29);
        java.lang.String str31 = post26.getUser();
        java.util.Date date32 = null;
        post26.setTimestamp(date32);
        java.lang.String str34 = post26.getText();
        java.lang.String[] strArray75 = new java.lang.String[] { "User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)", "TestDescription(id=-1, nameTest=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null))", "Question(id=null, text=null, answers=[Answer(id=null, text=null, correct=false), Answer(id=null, text=null, correct=false)])", "LoginRequest(login=null, password=hi!)", "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)", "Answer(id=null, text=null, correct=false)", "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)", "LoginRequest(login=Result(id=null, user=null, test=null, submitted=false, answers=null), password=null)", "CreatePostRequest(text=null, username=null)", "ResultDescription(id=0, testId=null, testName=null, mark=1)", "TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=100, questions=null, tags=[TagDto(id=0, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=1, name=null), TagDto(id=1, name=null), TagDto(id=0, name=null), TagDto(id=0, name=null)])", "ResultDescription(id=0, testId=null, testName=null, mark=1)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)", "Result(id=null, user=null, test=null, submitted=false, answers=null)", "TestDescription(id=-1, nameTest=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null))", "ResultDto(id=0, user=null, test=null, submitted=false, answers=null, mark=0)", "CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null)", "Post(id=null, text=, timestamp=null, user=null, likes=null)", "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=10)", "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)", "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)", "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)", "ResultDescription(id=0, testId=null, testName=null, mark=1)", "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)", "TestDescription(id=-1, nameTest=TagDto(id=0, name=null))", "QuestionDto(id=10, text=null, answers=null)", "ResultDescription(id=null, testId=100, testName=null, mark=0)", "UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)", "Post(id=null, text=, timestamp=null, user=null, likes=null)", "User(login=null, password=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), name=null, surname=, age=52, institution=null, email=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), rating=0)", "ResultDescription(id=null, testId=100, testName=null, mark=0)", "hi!", "TestDescription(id=-1, nameTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0))", "Tag(id=null, name=ResultDto(id=0, user=null, test=null, submitted=false, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null)], mark=0))", "LoginRequest(login=null, password=hi!)", "CreatePostRequest(text=null, username=null)", "User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=0)", "ResultDescription(id=null, testId=100, testName=null, mark=0)" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        post26.setLikes((java.util.List<java.lang.String>) strList76);
        post21.setLikes((java.util.List<java.lang.String>) strList76);
        post9.setLikes((java.util.List<java.lang.String>) strList76);
        post0.setLikes((java.util.List<java.lang.String>) strList76);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Post(id=null, text=ResultDescription(id=0, testId=null, testName=null, mark=1), timestamp=null, user=null, likes=null)" + "'", str8, "Post(id=null, text=ResultDescription(id=0, testId=null, testName=null, mark=1), timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str12, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str20, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.String str3 = post0.toString();
        java.lang.Integer int4 = post0.getId();
        java.util.Date date5 = null;
        post0.setTimestamp(date5);
        java.lang.Integer int7 = post0.getId();
        java.lang.String str8 = post0.getText();
        post0.setId((java.lang.Integer) 0);
        com.vntu.marenko.ualearning.server.model.User user11 = new com.vntu.marenko.ualearning.server.model.User();
        user11.setSurname("");
        user11.setEmail("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        user11.setEmail("TagDto(id=0, name=null)");
        user11.setRating((long) (-1));
        boolean boolean20 = post0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str3, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        user27.setRating(0L);
        com.vntu.marenko.ualearning.server.dto.PostDto postDto30 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        java.lang.String str31 = postDto30.getLogin();
        java.lang.String str32 = postDto30.getLogin();
        boolean boolean33 = user27.equals((java.lang.Object) str32);
        int int34 = user27.getAge();
        org.junit.Assert.assertNotNull(submitResultRequestType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        java.lang.Boolean boolean77 = createPostRequestToPostMapper18.favorsExtension();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest78 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str79 = createPostRequest78.getUsername();
        createPostRequest78.setText("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.String str82 = createPostRequest78.toString();
        java.lang.String str83 = createPostRequest78.getUsername();
        com.vntu.marenko.ualearning.server.model.Post post84 = new com.vntu.marenko.ualearning.server.model.Post();
        post84.setText("");
        java.lang.String str87 = post84.toString();
        java.lang.Integer int88 = post84.getId();
        java.util.Date date89 = null;
        post84.setTimestamp(date89);
        java.lang.String str91 = post84.getText();
        java.lang.String str92 = post84.getUser();
        ma.glasnost.orika.MappingContext mappingContext93 = null;
        createPostRequestToPostMapper18.mapAtoB(createPostRequest78, post84, mappingContext93);
        java.lang.Integer int95 = post84.getId();
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
        org.junit.Assert.assertEquals("'" + boolean77 + "' != '" + false + "'", boolean77, false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "CreatePostRequest(text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), username=null)" + "'", str82, "CreatePostRequest(text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), username=null)");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str87, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(int95);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto2 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto2.setId((int) '#');
        boolean boolean5 = userRequest0.equals((java.lang.Object) '#');
        userRequest0.setEmail("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository8 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl9 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository8);
        boolean boolean10 = userRequest0.equals((java.lang.Object) postServiceImpl9);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.model.Post post12 = postServiceImpl9.getPost((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl0 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper1 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl0);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType2 = resultToDescriptionMapper1.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType3 = resultToDescriptionMapper1.getAType();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription4 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription4.setId((java.lang.Integer) 0);
        resultDescription4.setMark(1L);
        java.lang.Integer int9 = resultDescription4.getTestId();
        long long10 = resultDescription4.getMark();
        com.vntu.marenko.ualearning.server.model.Result result11 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int12 = result11.getId();
        com.vntu.marenko.ualearning.server.model.Test test13 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int14 = test13.getId();
        java.lang.Integer int15 = test13.getId();
        result11.setTest(test13);
        boolean boolean17 = result11.isSubmitted();
        ma.glasnost.orika.MappingContext mappingContext18 = null;
        resultToDescriptionMapper1.mapBtoA(resultDescription4, result11, mappingContext18);
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
        com.vntu.marenko.ualearning.server.model.Post post34 = new com.vntu.marenko.ualearning.server.model.Post();
        post34.setText("");
        java.lang.Integer int37 = post34.getId();
        java.util.Date date38 = post34.getTimestamp();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest39 = null;
        ma.glasnost.orika.MappingContext mappingContext40 = null;
        createPostRequestToPostMapper30.mapBtoA(post34, createPostRequest39, mappingContext40);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.CreatePostRequest> createPostRequestType42 = createPostRequestToPostMapper30.getAType();
        boolean boolean43 = resultDescription4.equals((java.lang.Object) createPostRequestType42);
        resultDescription4.setMark((long) (byte) 100);
        org.junit.Assert.assertNotNull(resultType2);
        org.junit.Assert.assertNotNull(resultType3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(resultType28);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNotNull(mapperFacade33);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(createPostRequestType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.vntu.marenko.ualearning.server.model.Post post0 = new com.vntu.marenko.ualearning.server.model.Post();
        post0.setText("");
        java.lang.String str3 = post0.toString();
        java.lang.Integer int4 = post0.getId();
        java.util.List<java.lang.String> strList5 = null;
        post0.setLikes(strList5);
        java.lang.String str7 = post0.toString();
        java.lang.Integer int8 = post0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str3, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str7, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto0 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        java.lang.String str1 = tagDto0.toString();
        java.lang.String str2 = tagDto0.getName();
        com.vntu.marenko.ualearning.server.model.User user3 = new com.vntu.marenko.ualearning.server.model.User();
        long long4 = user3.getRating();
        user3.setLogin("hi!");
        boolean boolean7 = tagDto0.equals((java.lang.Object) user3);
        java.lang.String str8 = user3.getLogin();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TagDto(id=0, name=null)" + "'", str1, "TagDto(id=0, name=null)");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        userRequest0.setEmail("AnswerDto(id=0, text=null)");
        userRequest0.setInstitution("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        userRequest0.setPassword("Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto8 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto8.setInstitution("");
        java.lang.String str11 = userDto8.getInstitution();
        userDto8.setName("SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        userDto8.setAge((int) ' ');
        userDto8.setSurname("TagDto(id=1, name=null)");
        boolean boolean18 = userRequest0.equals((java.lang.Object) "TagDto(id=1, name=null)");
        userRequest0.setAge(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository0 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository1 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository2 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper3 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository0, testRepository1, answerRepository2);
        ma.glasnost.orika.MapperFacade mapperFacade4 = null;
        submitResultRequestToDomainMapper3.setMapperFacade(mapperFacade4);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.SubmitResultRequest> submitResultRequestType6 = submitResultRequestToDomainMapper3.getAType();
        com.vntu.marenko.ualearning.server.model.Result result7 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int8 = result7.getId();
        com.vntu.marenko.ualearning.server.model.Test test9 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int10 = test9.getId();
        java.lang.Integer int11 = test9.getId();
        result7.setTest(test9);
        java.lang.Integer int13 = result7.getId();
        com.vntu.marenko.ualearning.server.model.Test test14 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int15 = test14.getId();
        java.lang.Integer int16 = test14.getId();
        test14.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int19 = test14.getCompletedCounter();
        java.lang.Integer int20 = test14.getCompletedCounter();
        result7.setTest(test14);
        com.vntu.marenko.ualearning.server.model.User user22 = result7.getUser();
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest23 = null;
        ma.glasnost.orika.MappingContext mappingContext24 = null;
        submitResultRequestToDomainMapper3.mapBtoA(result7, submitResultRequest23, mappingContext24);
        com.vntu.marenko.ualearning.server.model.User user26 = new com.vntu.marenko.ualearning.server.model.User();
        user26.setInstitution("hi!");
        java.lang.String str29 = user26.toString();
        result7.setUser(user26);
        org.junit.Assert.assertNotNull(submitResultRequestType6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str29, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        java.lang.String str1 = answer0.getText();
        answer0.setId((java.lang.Integer) (-1));
        java.lang.String str4 = answer0.getText();
        boolean boolean5 = answer0.isCorrect();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        userRequest0.setEmail("AnswerDto(id=0, text=null)");
        userRequest0.setInstitution("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        java.lang.String str6 = userRequest0.getInstitution();
        userRequest0.setInstitution("Result(id=null, user=User(login=null, password=null, name=null, surname=, age=0, institution=null, email=Post(id=null, text=, timestamp=null, user=null, likes=null), rating=0), test=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), submitted=false, answers=null)");
        int int9 = userRequest0.getAge();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str6, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.vntu.marenko.ualearning.server.model.Question question0 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.Integer int1 = question0.getId();
        java.lang.Integer int2 = question0.getId();
        java.lang.String str3 = question0.getText();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl4 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper5 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl4);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType6 = resultToDescriptionMapper5.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType7 = resultToDescriptionMapper5.getAType();
        java.lang.Boolean boolean8 = resultToDescriptionMapper5.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig9 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl10 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository11 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository12 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository13 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper14 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository11, testRepository12, answerRepository13);
        ma.glasnost.orika.MapperFacade mapperFacade15 = null;
        submitResultRequestToDomainMapper14.setMapperFacade(mapperFacade15);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType17 = submitResultRequestToDomainMapper14.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper18 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper19 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean20 = createPostRequestToPostMapper19.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper21 = null;
        ma.glasnost.orika.MapperFacade mapperFacade22 = mapperConfig9.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl10, submitResultRequestToDomainMapper14, resultToDescriptionMapper18, createPostRequestToPostMapper19, postToDtoMapper21);
        resultToDescriptionMapper5.setMapperFacade(mapperFacade22);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType24 = resultToDescriptionMapper5.getBType();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription25 = null;
        com.vntu.marenko.ualearning.server.model.Result result26 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int27 = result26.getId();
        com.vntu.marenko.ualearning.server.model.Test test28 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int29 = test28.getId();
        java.lang.Integer int30 = test28.getId();
        result26.setTest(test28);
        java.lang.Integer int32 = result26.getId();
        java.util.List<com.vntu.marenko.ualearning.server.model.Answer> answerList33 = result26.getAnswers();
        ma.glasnost.orika.MappingContext mappingContext34 = null;
        resultToDescriptionMapper5.mapBtoA(resultDescription25, result26, mappingContext34);
        boolean boolean36 = question0.equals((java.lang.Object) resultDescription25);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resultType6);
        org.junit.Assert.assertNotNull(resultType7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(resultType17);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNotNull(mapperFacade22);
        org.junit.Assert.assertNotNull(resultDescriptionType24);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(answerList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.getPassword();
        userRequest0.setLogin("TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        java.lang.String str6 = userRequest0.getLogin();
        userRequest0.setName("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        userRequest0.setLogin("CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null)");
        userRequest0.setSurname("PostDto(id=0, text=UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null), timestamp=null, login=null, likes=null)");
        java.lang.String str13 = userRequest0.toString();
        userRequest0.setAge(0);
        userRequest0.setInstitution("ResultDto(id=100, user=UserDto(login=LoginRequest(login=null, password=null), name=null, surname=null, age=0, institution=null, email=null, rating=-1), test=null, submitted=false, answers=null, mark=0)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TestDescription(id=-1, nameTest=TagDto(id=0, name=null))" + "'", str6, "TestDescription(id=-1, nameTest=TagDto(id=0, name=null))");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UserRequest(login=CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null), password=null, name=ResultDescription(id=0, testId=null, testName=null, mark=1), surname=PostDto(id=0, text=UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null), timestamp=null, login=null, likes=null), age=0, institution=null, email=null)" + "'", str13, "UserRequest(login=CreatePostRequest(text=Post(id=null, text=, timestamp=null, user=null, likes=null), username=null), password=null, name=ResultDescription(id=0, testId=null, testName=null, mark=1), surname=PostDto(id=0, text=UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null), timestamp=null, login=null, likes=null), age=0, institution=null, email=null)");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest0 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str1 = loginRequest0.getLogin();
        loginRequest0.setLogin("User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
        java.lang.String str4 = loginRequest0.toString();
        java.lang.String str5 = loginRequest0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginRequest(login=User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0), password=null)" + "'", str4, "LoginRequest(login=User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0), password=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LoginRequest(login=User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0), password=null)" + "'", str5, "LoginRequest(login=User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0), password=null)");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl0 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper1 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl0);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType2 = resultToDescriptionMapper1.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType3 = resultToDescriptionMapper1.getAType();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription4 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        resultDescription4.setId((java.lang.Integer) 0);
        resultDescription4.setMark(1L);
        java.lang.Integer int9 = resultDescription4.getTestId();
        long long10 = resultDescription4.getMark();
        com.vntu.marenko.ualearning.server.model.Result result11 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int12 = result11.getId();
        com.vntu.marenko.ualearning.server.model.Test test13 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int14 = test13.getId();
        java.lang.Integer int15 = test13.getId();
        result11.setTest(test13);
        boolean boolean17 = result11.isSubmitted();
        ma.glasnost.orika.MappingContext mappingContext18 = null;
        resultToDescriptionMapper1.mapBtoA(resultDescription4, result11, mappingContext18);
        java.lang.Boolean boolean20 = resultToDescriptionMapper1.favorsExtension();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType21 = resultToDescriptionMapper1.getBType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionType22 = resultToDescriptionMapper1.getBType();
        java.lang.Boolean boolean23 = resultToDescriptionMapper1.favorsExtension();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription24 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        java.lang.Integer int25 = resultDescription24.getId();
        java.lang.String str26 = resultDescription24.getTestName();
        resultDescription24.setTestId((java.lang.Integer) 100);
        java.lang.String str29 = resultDescription24.getTestName();
        java.lang.String str30 = resultDescription24.toString();
        resultDescription24.setMark((-1L));
        com.vntu.marenko.ualearning.server.model.Result result33 = null;
        ma.glasnost.orika.MappingContext mappingContext34 = null;
        resultToDescriptionMapper1.mapBtoA(resultDescription24, result33, mappingContext34);
        org.junit.Assert.assertNotNull(resultType2);
        org.junit.Assert.assertNotNull(resultType3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNotNull(resultDescriptionType21);
        org.junit.Assert.assertNotNull(resultDescriptionType22);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ResultDescription(id=null, testId=100, testName=null, mark=0)" + "'", str30, "ResultDescription(id=null, testId=100, testName=null, mark=0)");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.lang.String str41 = answerDto0.toString();
        int int42 = answerDto0.getId();
        org.junit.Assert.assertNotNull(postType3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str7, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str18, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str22, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str30, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AnswerDto(id=0, text=null)" + "'", str41, "AnswerDto(id=0, text=null)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl0 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper1 = new com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl0);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType2 = resultToDescriptionMapper1.getAType();
        com.vntu.marenko.ualearning.server.dto.ResultDescription resultDescription3 = new com.vntu.marenko.ualearning.server.dto.ResultDescription();
        java.lang.Integer int4 = resultDescription3.getId();
        java.lang.String str5 = resultDescription3.getTestName();
        resultDescription3.setTestId((java.lang.Integer) 100);
        java.lang.String str8 = resultDescription3.getTestName();
        java.lang.Integer int9 = resultDescription3.getId();
        java.lang.String str10 = resultDescription3.toString();
        java.lang.String str11 = resultDescription3.toString();
        com.vntu.marenko.ualearning.server.model.Result result12 = new com.vntu.marenko.ualearning.server.model.Result();
        java.lang.Integer int13 = result12.getId();
        com.vntu.marenko.ualearning.server.model.Test test14 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int15 = test14.getId();
        java.lang.Integer int16 = test14.getId();
        result12.setTest(test14);
        java.lang.Integer int18 = result12.getId();
        com.vntu.marenko.ualearning.server.model.Test test19 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int20 = test19.getId();
        java.lang.Integer int21 = test19.getId();
        test19.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int24 = test19.getCompletedCounter();
        java.lang.Integer int25 = test19.getCompletedCounter();
        result12.setTest(test19);
        com.vntu.marenko.ualearning.server.model.User user27 = result12.getUser();
        ma.glasnost.orika.MappingContext mappingContext28 = null;
        resultToDescriptionMapper1.mapBtoA(resultDescription3, result12, mappingContext28);
        long long30 = resultDescription3.getMark();
        org.junit.Assert.assertNotNull(resultType2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ResultDescription(id=null, testId=100, testName=null, mark=0)" + "'", str10, "ResultDescription(id=null, testId=100, testName=null, mark=0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ResultDescription(id=null, testId=100, testName=null, mark=0)" + "'", str11, "ResultDescription(id=null, testId=100, testName=null, mark=0)");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        createPostRequest19.setUsername("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        createPostRequest19.setText("UserRequest(login=null, password=null, name=null, surname=null, age=52, institution=null, email=null)");
        java.lang.String str43 = createPostRequest19.getText();
        org.junit.Assert.assertNotNull(postType2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str6, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str17, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str21, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str29, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UserRequest(login=null, password=null, name=null, surname=null, age=52, institution=null, email=null)" + "'", str43, "UserRequest(login=null, password=null, name=null, surname=null, age=52, institution=null, email=null)");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        result0.setId((java.lang.Integer) 100);
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest3 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str4 = userRequest3.getName();
        java.lang.String str5 = userRequest3.getName();
        boolean boolean6 = result0.equals((java.lang.Object) str5);
        com.vntu.marenko.ualearning.server.model.User user7 = result0.getUser();
        com.vntu.marenko.ualearning.server.model.Result result8 = new com.vntu.marenko.ualearning.server.model.Result();
        com.vntu.marenko.ualearning.server.model.Result result9 = new com.vntu.marenko.ualearning.server.model.Result();
        com.vntu.marenko.ualearning.server.model.User user10 = new com.vntu.marenko.ualearning.server.model.User();
        user10.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test13 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean14 = user10.equals((java.lang.Object) test13);
        result9.setUser(user10);
        result8.setUser(user10);
        result8.setSubmitted(false);
        com.vntu.marenko.ualearning.server.model.User user19 = result8.getUser();
        user19.setSurname("User(login=null, password=Test(id=null, nameTest=null, descriptionTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), completedCounter=null, questions=null, tags=null), name=null, surname=, age=52, institution=null, email=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), rating=0)");
        result0.setUser(user19);
        com.vntu.marenko.ualearning.server.model.User user23 = new com.vntu.marenko.ualearning.server.model.User();
        user23.setInstitution("hi!");
        java.lang.String str26 = user23.toString();
        java.lang.String str27 = user23.getEmail();
        java.lang.String str28 = user23.getEmail();
        java.lang.String str29 = user23.getInstitution();
        result0.setUser(user23);
        com.vntu.marenko.ualearning.server.model.Test test31 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int32 = test31.getId();
        java.lang.Integer int33 = test31.getId();
        java.lang.Integer int34 = test31.getCompletedCounter();
        result0.setTest(test31);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str26, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(int34);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        java.lang.String str3 = userDto0.getInstitution();
        userDto0.setEmail("TestDto(id=0, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        userDto0.setSurname("UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)");
        java.lang.String str8 = userDto0.getSurname();
        userDto0.setName("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)" + "'", str8, "UserDto(login=null, name=null, surname=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), age=0, institution=, email=null, rating=0)");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto0.setId(100);
        resultDto0.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.UserDto userDto5 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto5.setRating((int) (byte) -1);
        userDto5.setLogin("LoginRequest(login=null, password=null)");
        resultDto0.setUser(userDto5);
        resultDto0.setId((int) (short) -1);
        com.vntu.marenko.ualearning.server.dto.UserDto userDto13 = resultDto0.getUser();
        com.vntu.marenko.ualearning.server.dto.UserDto userDto14 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto14.setRating((int) (byte) -1);
        int int17 = userDto14.getAge();
        userDto14.setInstitution("TestDescription(id=-1, nameTest=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0))");
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper20 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType21 = createPostRequestToPostMapper20.getBType();
        com.vntu.marenko.ualearning.server.model.Post post22 = new com.vntu.marenko.ualearning.server.model.Post();
        post22.setText("");
        java.lang.String str25 = post22.toString();
        post22.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest28 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest28.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext31 = null;
        createPostRequestToPostMapper20.mapBtoA(post22, createPostRequest28, mappingContext31);
        com.vntu.marenko.ualearning.server.model.Post post33 = new com.vntu.marenko.ualearning.server.model.Post();
        post33.setText("");
        java.lang.String str36 = post33.toString();
        java.lang.Integer int37 = post33.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest38 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str39 = createPostRequest38.getUsername();
        java.lang.String str40 = createPostRequest38.toString();
        ma.glasnost.orika.MappingContext mappingContext41 = null;
        createPostRequestToPostMapper20.mapBtoA(post33, createPostRequest38, mappingContext41);
        createPostRequest38.setText("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)");
        boolean boolean45 = userDto14.equals((java.lang.Object) "UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)");
        resultDto0.setUser(userDto14);
        org.junit.Assert.assertNotNull(userDto13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(postType21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str25, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str36, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str40, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.model.Test> testList23 = testServiceImpl2.getTestsWithTag((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository19 = null;
        com.vntu.marenko.ualearning.server.repository.TagRepository tagRepository20 = null;
        com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl testServiceImpl21 = new com.vntu.marenko.ualearning.server.service.impl.TestServiceImpl(testRepository19, tagRepository20);
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
        com.vntu.marenko.ualearning.server.controller.TestController testController38 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl21, mapperFacade36);
        ma.glasnost.orika.MapperFacade mapperFacade39 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController40 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl21, mapperFacade39);
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig41 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl42 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository43 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository44 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository45 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper46 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository43, testRepository44, answerRepository45);
        ma.glasnost.orika.MapperFacade mapperFacade47 = null;
        submitResultRequestToDomainMapper46.setMapperFacade(mapperFacade47);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType49 = submitResultRequestToDomainMapper46.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper50 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper51 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean52 = createPostRequestToPostMapper51.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper53 = null;
        ma.glasnost.orika.MapperFacade mapperFacade54 = mapperConfig41.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl42, submitResultRequestToDomainMapper46, resultToDescriptionMapper50, createPostRequestToPostMapper51, postToDtoMapper53);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl55 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository56 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository57 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository58 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper59 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository56, testRepository57, answerRepository58);
        ma.glasnost.orika.MapperFacade mapperFacade60 = null;
        submitResultRequestToDomainMapper59.setMapperFacade(mapperFacade60);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType62 = submitResultRequestToDomainMapper59.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper63 = null;
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
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper78 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade79 = mapperConfig41.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl55, submitResultRequestToDomainMapper59, resultToDescriptionMapper63, createPostRequestToPostMapper74, postToDtoMapper78);
        com.vntu.marenko.ualearning.server.controller.TestController testController80 = new com.vntu.marenko.ualearning.server.controller.TestController((com.vntu.marenko.ualearning.server.service.TestService) testServiceImpl21, mapperFacade79);
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest81 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str82 = userRequest81.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto83 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto83.setId((int) '#');
        boolean boolean86 = userRequest81.equals((java.lang.Object) '#');
        userRequest81.setEmail("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=0)");
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository89 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl90 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository89);
        boolean boolean91 = userRequest81.equals((java.lang.Object) postServiceImpl90);
        com.vntu.marenko.ualearning.server.controller.PostController postController92 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade79, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl90);
        com.vntu.marenko.ualearning.server.service.PostService postService93 = null;
        com.vntu.marenko.ualearning.server.controller.PostController postController94 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade79, postService93);
        com.vntu.marenko.ualearning.server.controller.UserController userController95 = new com.vntu.marenko.ualearning.server.controller.UserController((com.vntu.marenko.ualearning.server.service.UserService) userServiceImpl1, mapperFacade79);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.UserDto userDto97 = userController95.getUser("Question(id=null, text=null, answers=null)");
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
        org.junit.Assert.assertNotNull(resultType49);
        org.junit.Assert.assertEquals("'" + boolean52 + "' != '" + false + "'", boolean52, false);
        org.junit.Assert.assertNotNull(mapperFacade54);
        org.junit.Assert.assertNotNull(resultType62);
        org.junit.Assert.assertNotNull(resultType72);
        org.junit.Assert.assertEquals("'" + boolean75 + "' != '" + false + "'", boolean75, false);
        org.junit.Assert.assertNotNull(mapperFacade77);
        org.junit.Assert.assertNotNull(mapperFacade79);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.String str31 = userDto24.getLogin();
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.vntu.marenko.ualearning.server.dto.PostDto postDto0 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        int int1 = postDto0.getId();
        postDto0.setId((int) (byte) -1);
        java.lang.String str4 = postDto0.getTimestamp();
        java.lang.String str5 = postDto0.toString();
        java.lang.String str6 = postDto0.getLogin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PostDto(id=-1, text=null, timestamp=null, login=null, likes=null)" + "'", str5, "PostDto(id=-1, text=null, timestamp=null, login=null, likes=null)");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        createPostRequest18.setText("UserDto(login=null, name=null, surname=null, age=0, institution=null, email=null, rating=-1)");
        java.lang.String str25 = createPostRequest18.getUsername();
        org.junit.Assert.assertNotNull(postType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str5, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str16, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str20, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository0 = null;
        ma.glasnost.orika.MapperFacade mapperFacade1 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository2 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer3 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl4 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository0, mapperFacade1, userRepository2, markComputer3);
        ma.glasnost.orika.MapperFacade mapperFacade5 = null;
        com.vntu.marenko.ualearning.server.controller.ResultController resultController6 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl4, mapperFacade5);
        ma.glasnost.orika.MapperFacade mapperFacade7 = null;
        com.vntu.marenko.ualearning.server.controller.ResultController resultController8 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl4, mapperFacade7);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper9 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType10 = createPostRequestToPostMapper9.getBType();
        com.vntu.marenko.ualearning.server.model.Post post11 = new com.vntu.marenko.ualearning.server.model.Post();
        post11.setText("");
        java.lang.String str14 = post11.toString();
        post11.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest17 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest17.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext20 = null;
        createPostRequestToPostMapper9.mapBtoA(post11, createPostRequest17, mappingContext20);
        com.vntu.marenko.ualearning.server.model.Post post22 = new com.vntu.marenko.ualearning.server.model.Post();
        post22.setText("");
        java.lang.String str25 = post22.toString();
        java.lang.Integer int26 = post22.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest27 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str28 = createPostRequest27.getUsername();
        java.lang.String str29 = createPostRequest27.toString();
        ma.glasnost.orika.MappingContext mappingContext30 = null;
        createPostRequestToPostMapper9.mapBtoA(post22, createPostRequest27, mappingContext30);
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository32 = null;
        ma.glasnost.orika.MapperFacade mapperFacade33 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository34 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer35 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl36 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository32, mapperFacade33, userRepository34, markComputer35);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper37 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean38 = createPostRequestToPostMapper37.favorsExtension();
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
        createPostRequestToPostMapper37.setMapperFacade(mapperFacade52);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController54 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl36, mapperFacade52);
        createPostRequestToPostMapper9.setMapperFacade(mapperFacade52);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController56 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl4, mapperFacade52);
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.ResultDto resultDto58 = resultServiceImpl4.getResult((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(postType10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str14, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str25, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str29, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + false + "'", boolean38, false);
        org.junit.Assert.assertNotNull(resultType47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + false + "'", boolean50, false);
        org.junit.Assert.assertNotNull(mapperFacade52);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        int int41 = answerDto0.getId();
        answerDto0.setText("");
        org.junit.Assert.assertNotNull(postType3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str7, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str18, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str22, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str30, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        tag0.setName("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.String str3 = tag0.getName();
        com.vntu.marenko.ualearning.server.dto.PostDto postDto4 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        java.lang.String str5 = postDto4.getLogin();
        java.lang.String[] strArray10 = new java.lang.String[] { "LoginRequest(login=null, password=null)", "CreatePostRequest(text=null, username=null)", "Answer(id=null, text=null, correct=false)", "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        postDto4.setLikes((java.util.List<java.lang.String>) strList11);
        java.lang.String str14 = postDto4.getText();
        boolean boolean15 = tag0.equals((java.lang.Object) str14);
        com.vntu.marenko.ualearning.server.model.Post post16 = new com.vntu.marenko.ualearning.server.model.Post();
        post16.setText("");
        java.lang.String str19 = post16.toString();
        java.lang.Integer int20 = post16.getId();
        java.util.Date date21 = null;
        post16.setTimestamp(date21);
        java.lang.String str23 = post16.getText();
        java.lang.String str24 = post16.getUser();
        post16.setUser("Test(id=0, nameTest=null, descriptionTest=, completedCounter=1, questions=null, tags=null)");
        boolean boolean27 = tag0.equals((java.lang.Object) "Test(id=0, nameTest=null, descriptionTest=, completedCounter=1, questions=null, tags=null)");
        tag0.setName("QuestionDto(id=35, text=null, answers=[AnswerDto(id=0, text=null), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null), AnswerDto(id=0, text=null), AnswerDto(id=0, text=hi!)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)" + "'", str3, "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str19, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        java.lang.String str1 = user0.getEmail();
        java.lang.String str2 = user0.getEmail();
        com.vntu.marenko.ualearning.server.model.User user3 = new com.vntu.marenko.ualearning.server.model.User();
        user3.setEmail("hi!");
        user3.setSurname("hi!");
        user3.setInstitution("Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null)");
        java.lang.String str10 = user3.toString();
        java.lang.String str11 = user3.getEmail();
        boolean boolean12 = user0.equals((java.lang.Object) user3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)" + "'", str10, "User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        user27.setRating(0L);
        java.lang.String str30 = user27.getEmail();
        java.lang.String str31 = user27.getInstitution();
        int int32 = user27.getAge();
        java.lang.String str33 = user27.getSurname();
        java.lang.String str34 = user27.getEmail();
        org.junit.Assert.assertNotNull(submitResultRequestType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str30, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str34, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto0 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.dto.TagDto tagDto1 = new com.vntu.marenko.ualearning.server.dto.TagDto();
        tagDto1.setId(1);
        boolean boolean5 = tagDto1.equals((java.lang.Object) (-1L));
        int int6 = tagDto1.getId();
        tagDto1.setId((int) '#');
        boolean boolean9 = answerDto0.equals((java.lang.Object) '#');
        answerDto0.setId((int) '#');
        answerDto0.setId((int) (byte) 100);
        java.lang.String str14 = answerDto0.getText();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.vntu.marenko.ualearning.server.dto.PostDto postDto0 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto0.setId(0);
        postDto0.setText("UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        postDto0.setTimestamp("User(login=null, password=null, name=null, surname=hi!, age=0, institution=Test(id=null, nameTest=null, descriptionTest=null, completedCounter=null, questions=null, tags=null), email=hi!, rating=0)");
        postDto0.setTimestamp("AnswerDto(id=10, text=null)");
        postDto0.setTimestamp("PostDto(id=0, text=null, timestamp=Question(id=null, text=null, answers=null), login=null, likes=[LoginRequest(login=null, password=null), CreatePostRequest(text=null, username=null), Answer(id=null, text=null, correct=false), User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)])");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest0 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest0.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int3 = submitResultRequest0.getTestId();
        java.lang.String str4 = submitResultRequest0.toString();
        java.lang.String str5 = submitResultRequest0.getUserLogin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)" + "'", str4, "SubmitResultRequest(userLogin=QuestionDto(id=10, text=null, answers=null), testId=0, answers=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "QuestionDto(id=10, text=null, answers=null)" + "'", str5, "QuestionDto(id=10, text=null, answers=null)");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.lang.Integer int33 = tag0.getId();
        java.lang.String str34 = tag0.getName();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper35 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper36 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType37 = createPostRequestToPostMapper36.getBType();
        com.vntu.marenko.ualearning.server.model.Post post38 = new com.vntu.marenko.ualearning.server.model.Post();
        post38.setText("");
        java.lang.String str41 = post38.toString();
        post38.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest44 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest44.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext47 = null;
        createPostRequestToPostMapper36.mapBtoA(post38, createPostRequest44, mappingContext47);
        com.vntu.marenko.ualearning.server.model.Post post49 = new com.vntu.marenko.ualearning.server.model.Post();
        post49.setText("");
        java.lang.String str52 = post49.toString();
        java.lang.Integer int53 = post49.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest54 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str55 = createPostRequest54.getUsername();
        java.lang.String str56 = createPostRequest54.toString();
        ma.glasnost.orika.MappingContext mappingContext57 = null;
        createPostRequestToPostMapper36.mapBtoA(post49, createPostRequest54, mappingContext57);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper59 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType60 = createPostRequestToPostMapper59.getBType();
        com.vntu.marenko.ualearning.server.model.Post post61 = new com.vntu.marenko.ualearning.server.model.Post();
        post61.setText("");
        java.lang.String str64 = post61.toString();
        post61.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest67 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest67.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext70 = null;
        createPostRequestToPostMapper59.mapBtoA(post61, createPostRequest67, mappingContext70);
        ma.glasnost.orika.MappingContext mappingContext72 = null;
        createPostRequestToPostMapper35.mapAtoB(createPostRequest54, post61, mappingContext72);
        com.vntu.marenko.ualearning.server.model.User user74 = new com.vntu.marenko.ualearning.server.model.User();
        java.lang.String str75 = user74.getEmail();
        java.lang.String str76 = user74.getSurname();
        user74.setEmail("Answer(id=null, text=null, correct=false)");
        boolean boolean80 = user74.equals((java.lang.Object) (byte) -1);
        boolean boolean81 = createPostRequest54.equals((java.lang.Object) user74);
        boolean boolean82 = tag0.equals((java.lang.Object) user74);
        java.lang.String str83 = tag0.toString();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper84 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType85 = createPostRequestToPostMapper84.getBType();
        com.vntu.marenko.ualearning.server.model.Post post86 = new com.vntu.marenko.ualearning.server.model.Post();
        post86.setText("");
        java.lang.String str89 = post86.toString();
        post86.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest92 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest92.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext95 = null;
        createPostRequestToPostMapper84.mapBtoA(post86, createPostRequest92, mappingContext95);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType97 = createPostRequestToPostMapper84.getBType();
        boolean boolean98 = tag0.equals((java.lang.Object) createPostRequestToPostMapper84);
        org.junit.Assert.assertNotNull(submitResultRequestType12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)" + "'", str34, "User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        org.junit.Assert.assertNotNull(postType37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str41, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str52, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str56, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str64, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))" + "'", str83, "Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        org.junit.Assert.assertNotNull(postType85);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str89, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNotNull(postType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.vntu.marenko.ualearning.server.dto.ResultDto resultDto0 = new com.vntu.marenko.ualearning.server.dto.ResultDto();
        resultDto0.setId(100);
        resultDto0.setId((int) '#');
        com.vntu.marenko.ualearning.server.dto.UserDto userDto5 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto5.setRating((int) (byte) -1);
        userDto5.setLogin("LoginRequest(login=null, password=null)");
        resultDto0.setUser(userDto5);
        resultDto0.setId((int) (short) -1);
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
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType29 = postToDtoMapper13.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType30 = postToDtoMapper13.getBType();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository31 = null;
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
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository46 = null;
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository47 = null;
        ma.glasnost.orika.MapperFacade mapperFacade48 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository49 = null;
        com.vntu.marenko.ualearning.server.dto.AnswerDto answerDto50 = new com.vntu.marenko.ualearning.server.dto.AnswerDto();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl51 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        boolean boolean52 = answerDto50.equals((java.lang.Object) markComputerImpl51);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl53 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository47, mapperFacade48, userRepository49, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl51);
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl54 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository31, mapperFacade45, userRepository46, (com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl51);
        postToDtoMapper13.setMapperFacade(mapperFacade45);
        boolean boolean56 = resultDto0.equals((java.lang.Object) postToDtoMapper13);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType57 = postToDtoMapper13.getAType();
        java.lang.Boolean boolean58 = postToDtoMapper13.favorsExtension();
        org.junit.Assert.assertNotNull(resultType22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + false + "'", boolean25, false);
        org.junit.Assert.assertNotNull(mapperFacade27);
        org.junit.Assert.assertNotNull(postType29);
        org.junit.Assert.assertNotNull(postDtoType30);
        org.junit.Assert.assertNotNull(resultType40);
        org.junit.Assert.assertEquals("'" + boolean43 + "' != '" + false + "'", boolean43, false);
        org.junit.Assert.assertNotNull(mapperFacade45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(postType57);
        org.junit.Assert.assertEquals("'" + boolean58 + "' != '" + false + "'", boolean58, false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository22 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper23 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository20, testRepository21, answerRepository22);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType24 = submitResultRequestToDomainMapper23.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper25 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig26 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl27 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository28 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository29 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository30 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper31 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository28, testRepository29, answerRepository30);
        ma.glasnost.orika.MapperFacade mapperFacade32 = null;
        submitResultRequestToDomainMapper31.setMapperFacade(mapperFacade32);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType34 = submitResultRequestToDomainMapper31.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper35 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper36 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean37 = createPostRequestToPostMapper36.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper38 = null;
        ma.glasnost.orika.MapperFacade mapperFacade39 = mapperConfig26.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl27, submitResultRequestToDomainMapper31, resultToDescriptionMapper35, createPostRequestToPostMapper36, postToDtoMapper38);
        postToDtoMapper25.setMapperFacade(mapperFacade39);
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade39);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository42 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl43 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository42);
        com.vntu.marenko.ualearning.server.controller.PostController postController44 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade39, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl43);
        com.vntu.marenko.ualearning.server.controller.PostController postController45 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade17, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl43);
        com.vntu.marenko.ualearning.server.model.Tag tag46 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str47 = tag46.toString();
        java.lang.String str48 = tag46.getName();
        java.lang.Integer int49 = tag46.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper50 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper51 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType52 = createPostRequestToPostMapper51.getBType();
        com.vntu.marenko.ualearning.server.model.Post post53 = new com.vntu.marenko.ualearning.server.model.Post();
        post53.setText("");
        java.lang.String str56 = post53.toString();
        post53.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest59 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest59.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext62 = null;
        createPostRequestToPostMapper51.mapBtoA(post53, createPostRequest59, mappingContext62);
        com.vntu.marenko.ualearning.server.model.Post post64 = new com.vntu.marenko.ualearning.server.model.Post();
        post64.setText("");
        java.lang.String str67 = post64.toString();
        java.lang.Integer int68 = post64.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest69 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str70 = createPostRequest69.getUsername();
        java.lang.String str71 = createPostRequest69.toString();
        ma.glasnost.orika.MappingContext mappingContext72 = null;
        createPostRequestToPostMapper51.mapBtoA(post64, createPostRequest69, mappingContext72);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper74 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType75 = createPostRequestToPostMapper74.getBType();
        com.vntu.marenko.ualearning.server.model.Post post76 = new com.vntu.marenko.ualearning.server.model.Post();
        post76.setText("");
        java.lang.String str79 = post76.toString();
        post76.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest82 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest82.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext85 = null;
        createPostRequestToPostMapper74.mapBtoA(post76, createPostRequest82, mappingContext85);
        ma.glasnost.orika.MappingContext mappingContext87 = null;
        createPostRequestToPostMapper50.mapAtoB(createPostRequest69, post76, mappingContext87);
        boolean boolean89 = tag46.equals((java.lang.Object) createPostRequest69);
        createPostRequest69.setText("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        java.lang.String str92 = createPostRequest69.getUsername();
        createPostRequest69.setText("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.dto.PostDto postDto95 = postController45.createPost(createPostRequest69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
        org.junit.Assert.assertNotNull(resultType24);
        org.junit.Assert.assertNotNull(resultType34);
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
        org.junit.Assert.assertNotNull(mapperFacade39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tag(id=null, name=null)" + "'", str47, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNotNull(postType52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str56, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str67, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str71, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str79, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.vntu.marenko.ualearning.server.dto.SubmitResultRequest submitResultRequest0 = new com.vntu.marenko.ualearning.server.dto.SubmitResultRequest();
        submitResultRequest0.setUserLogin("QuestionDto(id=10, text=null, answers=null)");
        int int3 = submitResultRequest0.getTestId();
        int int4 = submitResultRequest0.getTestId();
        int int5 = submitResultRequest0.getTestId();
        com.vntu.marenko.ualearning.server.model.Post post6 = new com.vntu.marenko.ualearning.server.model.Post();
        post6.setText("");
        java.lang.String str9 = post6.toString();
        java.lang.Integer int10 = post6.getId();
        java.util.Date date11 = null;
        post6.setTimestamp(date11);
        java.lang.Integer int13 = post6.getId();
        boolean boolean14 = submitResultRequest0.equals((java.lang.Object) post6);
        java.lang.String str15 = submitResultRequest0.getUserLogin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str9, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "QuestionDto(id=10, text=null, answers=null)" + "'", str15, "QuestionDto(id=10, text=null, answers=null)");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository20 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository21 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository22 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper23 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository20, testRepository21, answerRepository22);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType24 = submitResultRequestToDomainMapper23.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper25 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig26 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl27 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository28 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository29 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository30 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper31 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository28, testRepository29, answerRepository30);
        ma.glasnost.orika.MapperFacade mapperFacade32 = null;
        submitResultRequestToDomainMapper31.setMapperFacade(mapperFacade32);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType34 = submitResultRequestToDomainMapper31.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper35 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper36 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean37 = createPostRequestToPostMapper36.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper38 = null;
        ma.glasnost.orika.MapperFacade mapperFacade39 = mapperConfig26.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl27, submitResultRequestToDomainMapper31, resultToDescriptionMapper35, createPostRequestToPostMapper36, postToDtoMapper38);
        postToDtoMapper25.setMapperFacade(mapperFacade39);
        submitResultRequestToDomainMapper23.setMapperFacade(mapperFacade39);
        com.vntu.marenko.ualearning.server.repository.PostRepository postRepository42 = null;
        com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl postServiceImpl43 = new com.vntu.marenko.ualearning.server.service.impl.PostServiceImpl(postRepository42);
        com.vntu.marenko.ualearning.server.controller.PostController postController44 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade39, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl43);
        com.vntu.marenko.ualearning.server.controller.PostController postController45 = new com.vntu.marenko.ualearning.server.controller.PostController(mapperFacade17, (com.vntu.marenko.ualearning.server.service.PostService) postServiceImpl43);
        com.vntu.marenko.ualearning.server.model.Post post46 = new com.vntu.marenko.ualearning.server.model.Post();
        post46.setText("");
        java.lang.Integer int49 = post46.getId();
        java.util.Date date50 = post46.getTimestamp();
        post46.setId((java.lang.Integer) (-1));
        post46.setUser("LoginRequest(login=null, password=null)");
        java.lang.String str55 = post46.getUser();
        // The following exception was thrown during execution in test generation
        try {
            com.vntu.marenko.ualearning.server.model.Post post56 = postServiceImpl43.savePost(post46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType12);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(mapperFacade17);
        org.junit.Assert.assertNotNull(resultType24);
        org.junit.Assert.assertNotNull(resultType34);
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
        org.junit.Assert.assertNotNull(mapperFacade39);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "LoginRequest(login=null, password=null)" + "'", str55, "LoginRequest(login=null, password=null)");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.vntu.marenko.ualearning.server.model.User user0 = new com.vntu.marenko.ualearning.server.model.User();
        java.lang.String str1 = user0.getEmail();
        java.lang.String str2 = user0.getSurname();
        user0.setSurname("Tag(id=null, name=null)");
        java.lang.String str5 = user0.getSurname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tag(id=null, name=null)" + "'", str5, "Tag(id=null, name=null)");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType16 = postToDtoMapper0.getBType();
        java.lang.Boolean boolean17 = postToDtoMapper0.favorsExtension();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType18 = postToDtoMapper0.getBType();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper19 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean20 = createPostRequestToPostMapper19.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig21 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl22 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository23 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository24 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository25 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper26 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository23, testRepository24, answerRepository25);
        ma.glasnost.orika.MapperFacade mapperFacade27 = null;
        submitResultRequestToDomainMapper26.setMapperFacade(mapperFacade27);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType29 = submitResultRequestToDomainMapper26.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper30 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper31 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean32 = createPostRequestToPostMapper31.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper33 = null;
        ma.glasnost.orika.MapperFacade mapperFacade34 = mapperConfig21.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl22, submitResultRequestToDomainMapper26, resultToDescriptionMapper30, createPostRequestToPostMapper31, postToDtoMapper33);
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl35 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository36 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository37 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository38 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper39 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository36, testRepository37, answerRepository38);
        ma.glasnost.orika.MapperFacade mapperFacade40 = null;
        submitResultRequestToDomainMapper39.setMapperFacade(mapperFacade40);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType42 = submitResultRequestToDomainMapper39.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper43 = null;
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig44 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl45 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository46 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository47 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository48 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper49 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository46, testRepository47, answerRepository48);
        ma.glasnost.orika.MapperFacade mapperFacade50 = null;
        submitResultRequestToDomainMapper49.setMapperFacade(mapperFacade50);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType52 = submitResultRequestToDomainMapper49.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper53 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper54 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean55 = createPostRequestToPostMapper54.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper56 = null;
        ma.glasnost.orika.MapperFacade mapperFacade57 = mapperConfig44.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl45, submitResultRequestToDomainMapper49, resultToDescriptionMapper53, createPostRequestToPostMapper54, postToDtoMapper56);
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper58 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        ma.glasnost.orika.MapperFacade mapperFacade59 = mapperConfig21.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl35, submitResultRequestToDomainMapper39, resultToDescriptionMapper43, createPostRequestToPostMapper54, postToDtoMapper58);
        createPostRequestToPostMapper19.setMapperFacade(mapperFacade59);
        postToDtoMapper0.setMapperFacade(mapperFacade59);
        java.lang.Boolean boolean62 = postToDtoMapper0.favorsExtension();
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertNotNull(postDtoType16);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(postDtoType18);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNotNull(resultType29);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + false + "'", boolean32, false);
        org.junit.Assert.assertNotNull(mapperFacade34);
        org.junit.Assert.assertNotNull(resultType42);
        org.junit.Assert.assertNotNull(resultType52);
        org.junit.Assert.assertEquals("'" + boolean55 + "' != '" + false + "'", boolean55, false);
        org.junit.Assert.assertNotNull(mapperFacade57);
        org.junit.Assert.assertNotNull(mapperFacade59);
        org.junit.Assert.assertEquals("'" + boolean62 + "' != '" + false + "'", boolean62, false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.PostDto> postDtoType16 = postToDtoMapper0.getBType();
        java.lang.Boolean boolean17 = postToDtoMapper0.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper18 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType19 = createPostRequestToPostMapper18.getBType();
        com.vntu.marenko.ualearning.server.model.Post post20 = new com.vntu.marenko.ualearning.server.model.Post();
        post20.setText("");
        java.lang.String str23 = post20.toString();
        post20.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest26 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest26.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext29 = null;
        createPostRequestToPostMapper18.mapBtoA(post20, createPostRequest26, mappingContext29);
        com.vntu.marenko.ualearning.server.model.Post post31 = new com.vntu.marenko.ualearning.server.model.Post();
        post31.setText("");
        java.lang.String str34 = post31.toString();
        java.lang.Integer int35 = post31.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest36 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str37 = createPostRequest36.getUsername();
        java.lang.String str38 = createPostRequest36.toString();
        ma.glasnost.orika.MappingContext mappingContext39 = null;
        createPostRequestToPostMapper18.mapBtoA(post31, createPostRequest36, mappingContext39);
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository41 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository42 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository43 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper44 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository41, testRepository42, answerRepository43);
        ma.glasnost.orika.MapperFacade mapperFacade45 = null;
        submitResultRequestToDomainMapper44.setMapperFacade(mapperFacade45);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType47 = submitResultRequestToDomainMapper44.getBType();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper48 = new com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper();
        com.vntu.marenko.ualearning.server.mapper.MapperConfig mapperConfig49 = new com.vntu.marenko.ualearning.server.mapper.MapperConfig();
        com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl markComputerImpl50 = new com.vntu.marenko.ualearning.server.component.impl.MarkComputerImpl();
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository51 = null;
        com.vntu.marenko.ualearning.server.repository.TestRepository testRepository52 = null;
        com.vntu.marenko.ualearning.server.repository.AnswerRepository answerRepository53 = null;
        com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper submitResultRequestToDomainMapper54 = new com.vntu.marenko.ualearning.server.mapper.SubmitResultRequestToDomainMapper(userRepository51, testRepository52, answerRepository53);
        ma.glasnost.orika.MapperFacade mapperFacade55 = null;
        submitResultRequestToDomainMapper54.setMapperFacade(mapperFacade55);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Result> resultType57 = submitResultRequestToDomainMapper54.getBType();
        com.vntu.marenko.ualearning.server.mapper.ResultToDescriptionMapper resultToDescriptionMapper58 = null;
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper59 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean60 = createPostRequestToPostMapper59.favorsExtension();
        com.vntu.marenko.ualearning.server.mapper.PostToDtoMapper postToDtoMapper61 = null;
        ma.glasnost.orika.MapperFacade mapperFacade62 = mapperConfig49.createMapper((com.vntu.marenko.ualearning.server.component.MarkComputer) markComputerImpl50, submitResultRequestToDomainMapper54, resultToDescriptionMapper58, createPostRequestToPostMapper59, postToDtoMapper61);
        postToDtoMapper48.setMapperFacade(mapperFacade62);
        submitResultRequestToDomainMapper44.setMapperFacade(mapperFacade62);
        createPostRequestToPostMapper18.setMapperFacade(mapperFacade62);
        postToDtoMapper0.setMapperFacade(mapperFacade62);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType67 = postToDtoMapper0.getAType();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType68 = postToDtoMapper0.getAType();
        org.junit.Assert.assertNotNull(resultType9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(mapperFacade14);
        org.junit.Assert.assertNotNull(postDtoType16);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(postType19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str23, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str34, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str38, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(resultType47);
        org.junit.Assert.assertNotNull(resultType57);
        org.junit.Assert.assertEquals("'" + boolean60 + "' != '" + false + "'", boolean60, false);
        org.junit.Assert.assertNotNull(mapperFacade62);
        org.junit.Assert.assertNotNull(postType67);
        org.junit.Assert.assertNotNull(postType68);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        com.vntu.marenko.ualearning.server.model.User user1 = new com.vntu.marenko.ualearning.server.model.User();
        user1.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test4 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean5 = user1.equals((java.lang.Object) test4);
        result0.setUser(user1);
        com.vntu.marenko.ualearning.server.model.User user7 = result0.getUser();
        java.lang.Integer int8 = result0.getId();
        com.vntu.marenko.ualearning.server.model.Test test9 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int10 = test9.getId();
        java.lang.Integer int11 = test9.getId();
        test9.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int14 = test9.getCompletedCounter();
        java.lang.Integer int15 = test9.getCompletedCounter();
        java.lang.Integer int16 = test9.getCompletedCounter();
        java.lang.String str17 = test9.getDescriptionTest();
        boolean boolean18 = result0.equals((java.lang.Object) str17);
        result0.setSubmitted(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)" + "'", str17, "User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        long long22 = resultDto0.getMark();
        resultDto0.setMark((long) (short) 100);
        com.vntu.marenko.ualearning.server.dto.TestDto testDto25 = new com.vntu.marenko.ualearning.server.dto.TestDto();
        int int26 = testDto25.getId();
        testDto25.setId((int) (byte) 100);
        java.lang.Integer int29 = testDto25.getCompletedCounter();
        com.vntu.marenko.ualearning.server.dto.LoginRequest loginRequest30 = new com.vntu.marenko.ualearning.server.dto.LoginRequest();
        java.lang.String str31 = loginRequest30.getPassword();
        com.vntu.marenko.ualearning.server.dto.UserShortDto userShortDto32 = new com.vntu.marenko.ualearning.server.dto.UserShortDto();
        boolean boolean33 = loginRequest30.equals((java.lang.Object) userShortDto32);
        java.lang.String str34 = loginRequest30.getLogin();
        loginRequest30.setLogin("Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
        boolean boolean37 = testDto25.equals((java.lang.Object) loginRequest30);
        resultDto0.setTest(testDto25);
        boolean boolean39 = resultDto0.isSubmitted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(answerDtoArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(testDto21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        userRequest0.setEmail("AnswerDto(id=0, text=null)");
        userRequest0.setPassword("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.String str6 = userRequest0.toString();
        java.lang.String str7 = userRequest0.getLogin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UserRequest(login=null, password=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), name=null, surname=null, age=0, institution=null, email=AnswerDto(id=0, text=null))" + "'", str6, "UserRequest(login=null, password=User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0), name=null, surname=null, age=0, institution=null, email=AnswerDto(id=0, text=null))");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest14 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest14.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        com.vntu.marenko.ualearning.server.model.Post post17 = new com.vntu.marenko.ualearning.server.model.Post();
        ma.glasnost.orika.MappingContext mappingContext18 = null;
        createPostRequestToPostMapper10.mapAtoB(createPostRequest14, post17, mappingContext18);
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.dto.CreatePostRequest> createPostRequestType20 = createPostRequestToPostMapper10.getAType();
        ma.glasnost.orika.Mapper[] mapperArray22 = new ma.glasnost.orika.Mapper[0];
        @SuppressWarnings("unchecked")
        ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[] objMapperArray23 = (ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[]) mapperArray22;
        // The following exception was thrown during execution in test generation
        try {
            createPostRequestToPostMapper10.setUsedMappers((ma.glasnost.orika.Mapper<java.lang.Object, java.lang.Object>[]) mapperArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not be called for a user custom mapper.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resultType8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNotNull(mapperFacade13);
        org.junit.Assert.assertNotNull(createPostRequestType20);
        org.junit.Assert.assertNotNull(mapperArray22);
        org.junit.Assert.assertNotNull(objMapperArray23);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getInstitution();
        com.vntu.marenko.ualearning.server.dto.QuestionDto questionDto2 = new com.vntu.marenko.ualearning.server.dto.QuestionDto();
        questionDto2.setId((int) '#');
        boolean boolean5 = userRequest0.equals((java.lang.Object) '#');
        userRequest0.setInstitution("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        userRequest0.setLogin("Result(id=100, user=null, test=null, submitted=false, answers=null)");
        java.lang.String str10 = userRequest0.getSurname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.vntu.marenko.ualearning.server.dto.UserRequest userRequest0 = new com.vntu.marenko.ualearning.server.dto.UserRequest();
        java.lang.String str1 = userRequest0.getName();
        java.lang.String str2 = userRequest0.getName();
        java.lang.String str3 = userRequest0.getPassword();
        userRequest0.setSurname("Question(id=null, text=null, answers=null)");
        java.lang.Object obj6 = null;
        boolean boolean7 = userRequest0.equals(obj6);
        userRequest0.setName("CreatePostRequest(text=null, username=null)");
        java.lang.String str10 = userRequest0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str10, "CreatePostRequest(text=null, username=null)");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest0 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str1 = createPostRequest0.getUsername();
        createPostRequest0.setText("User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0)");
        java.lang.String str4 = createPostRequest0.toString();
        createPostRequest0.setUsername("QuestionDto(id=0, text=null, answers=null)");
        java.lang.String str7 = createPostRequest0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CreatePostRequest(text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), username=null)" + "'", str4, "CreatePostRequest(text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), username=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CreatePostRequest(text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), username=QuestionDto(id=0, text=null, answers=null))" + "'", str7, "CreatePostRequest(text=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0), username=QuestionDto(id=0, text=null, answers=null))");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository1 = null;
        ma.glasnost.orika.MapperFacade mapperFacade2 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer4 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl5 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository1, mapperFacade2, userRepository3, markComputer4);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper6 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean7 = createPostRequestToPostMapper6.favorsExtension();
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
        createPostRequestToPostMapper6.setMapperFacade(mapperFacade21);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController23 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl5, mapperFacade21);
        boolean boolean24 = answer0.equals((java.lang.Object) resultServiceImpl5);
        java.lang.Integer int25 = answer0.getId();
        answer0.setText("UserDto(login=null, name=null, surname=null, age=100, institution=, email=null, rating=0)");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(resultType16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertNotNull(mapperFacade21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.getName();
        java.lang.Integer int2 = tag0.getId();
        com.vntu.marenko.ualearning.server.model.Test test3 = new com.vntu.marenko.ualearning.server.model.Test();
        java.lang.Integer int4 = test3.getId();
        java.lang.Integer int5 = test3.getId();
        test3.setDescriptionTest("User(login=null, password=null, name=null, surname=null, age=0, institution=hi!, email=null, rating=0)");
        java.lang.Integer int8 = test3.getCompletedCounter();
        java.lang.Integer int9 = test3.getCompletedCounter();
        java.lang.Integer int10 = test3.getCompletedCounter();
        com.vntu.marenko.ualearning.server.model.Question question11 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str12 = question11.getText();
        java.lang.Integer int13 = question11.getId();
        boolean boolean14 = test3.equals((java.lang.Object) question11);
        java.lang.String str15 = question11.toString();
        boolean boolean16 = tag0.equals((java.lang.Object) str15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Question(id=null, text=null, answers=null)" + "'", str15, "Question(id=null, text=null, answers=null)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.vntu.marenko.ualearning.server.model.Tag tag0 = new com.vntu.marenko.ualearning.server.model.Tag();
        java.lang.String str1 = tag0.toString();
        java.lang.String str2 = tag0.getName();
        java.lang.Integer int3 = tag0.getId();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper4 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper5 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType6 = createPostRequestToPostMapper5.getBType();
        com.vntu.marenko.ualearning.server.model.Post post7 = new com.vntu.marenko.ualearning.server.model.Post();
        post7.setText("");
        java.lang.String str10 = post7.toString();
        post7.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest13 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest13.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext16 = null;
        createPostRequestToPostMapper5.mapBtoA(post7, createPostRequest13, mappingContext16);
        com.vntu.marenko.ualearning.server.model.Post post18 = new com.vntu.marenko.ualearning.server.model.Post();
        post18.setText("");
        java.lang.String str21 = post18.toString();
        java.lang.Integer int22 = post18.getId();
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest23 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        java.lang.String str24 = createPostRequest23.getUsername();
        java.lang.String str25 = createPostRequest23.toString();
        ma.glasnost.orika.MappingContext mappingContext26 = null;
        createPostRequestToPostMapper5.mapBtoA(post18, createPostRequest23, mappingContext26);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper28 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        ma.glasnost.orika.metadata.Type<com.vntu.marenko.ualearning.server.model.Post> postType29 = createPostRequestToPostMapper28.getBType();
        com.vntu.marenko.ualearning.server.model.Post post30 = new com.vntu.marenko.ualearning.server.model.Post();
        post30.setText("");
        java.lang.String str33 = post30.toString();
        post30.setId((java.lang.Integer) 10);
        com.vntu.marenko.ualearning.server.dto.CreatePostRequest createPostRequest36 = new com.vntu.marenko.ualearning.server.dto.CreatePostRequest();
        createPostRequest36.setText("Post(id=null, text=, timestamp=null, user=null, likes=null)");
        ma.glasnost.orika.MappingContext mappingContext39 = null;
        createPostRequestToPostMapper28.mapBtoA(post30, createPostRequest36, mappingContext39);
        ma.glasnost.orika.MappingContext mappingContext41 = null;
        createPostRequestToPostMapper4.mapAtoB(createPostRequest23, post30, mappingContext41);
        boolean boolean43 = tag0.equals((java.lang.Object) createPostRequest23);
        createPostRequest23.setText("ResultDescription(id=0, testId=null, testName=null, mark=1)");
        createPostRequest23.setUsername("");
        java.lang.String str48 = createPostRequest23.getUsername();
        java.lang.String str49 = createPostRequest23.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tag(id=null, name=null)" + "'", str1, "Tag(id=null, name=null)");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(postType6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str10, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str21, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CreatePostRequest(text=null, username=null)" + "'", str25, "CreatePostRequest(text=null, username=null)");
        org.junit.Assert.assertNotNull(postType29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Post(id=null, text=, timestamp=null, user=null, likes=null)" + "'", str33, "Post(id=null, text=, timestamp=null, user=null, likes=null)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "CreatePostRequest(text=ResultDescription(id=0, testId=null, testName=null, mark=1), username=)" + "'", str49, "CreatePostRequest(text=ResultDescription(id=0, testId=null, testName=null, mark=1), username=)");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.vntu.marenko.ualearning.server.model.Question question0 = new com.vntu.marenko.ualearning.server.model.Question();
        java.lang.String str1 = question0.getText();
        java.lang.Integer int2 = question0.getId();
        com.vntu.marenko.ualearning.server.service.TestService testService3 = null;
        ma.glasnost.orika.MapperFacade mapperFacade4 = null;
        com.vntu.marenko.ualearning.server.controller.TestController testController5 = new com.vntu.marenko.ualearning.server.controller.TestController(testService3, mapperFacade4);
        boolean boolean6 = question0.equals((java.lang.Object) testController5);
        com.vntu.marenko.ualearning.server.dto.PostDto postDto7 = new com.vntu.marenko.ualearning.server.dto.PostDto();
        postDto7.setId(0);
        postDto7.setText("UserRequest(login=null, password=null, name=null, surname=null, age=0, institution=null, email=null)");
        java.lang.String str12 = postDto7.getLogin();
        boolean boolean13 = question0.equals((java.lang.Object) postDto7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.vntu.marenko.ualearning.server.dto.UserDto userDto0 = new com.vntu.marenko.ualearning.server.dto.UserDto();
        userDto0.setInstitution("");
        java.lang.String str3 = userDto0.getInstitution();
        java.lang.String str4 = userDto0.getInstitution();
        java.lang.String str5 = userDto0.getSurname();
        userDto0.setRating((int) (byte) -1);
        userDto0.setRating(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        java.lang.String str55 = tag10.getName();
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
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.vntu.marenko.ualearning.server.model.Answer answer0 = new com.vntu.marenko.ualearning.server.model.Answer();
        com.vntu.marenko.ualearning.server.repository.ResultRepository resultRepository1 = null;
        ma.glasnost.orika.MapperFacade mapperFacade2 = null;
        com.vntu.marenko.ualearning.server.repository.UserRepository userRepository3 = null;
        com.vntu.marenko.ualearning.server.component.MarkComputer markComputer4 = null;
        com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl resultServiceImpl5 = new com.vntu.marenko.ualearning.server.service.impl.ResultServiceImpl(resultRepository1, mapperFacade2, userRepository3, markComputer4);
        com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper createPostRequestToPostMapper6 = new com.vntu.marenko.ualearning.server.mapper.CreatePostRequestToPostMapper();
        java.lang.Boolean boolean7 = createPostRequestToPostMapper6.favorsExtension();
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
        createPostRequestToPostMapper6.setMapperFacade(mapperFacade21);
        com.vntu.marenko.ualearning.server.controller.ResultController resultController23 = new com.vntu.marenko.ualearning.server.controller.ResultController((com.vntu.marenko.ualearning.server.service.ResultService) resultServiceImpl5, mapperFacade21);
        boolean boolean24 = answer0.equals((java.lang.Object) resultServiceImpl5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.vntu.marenko.ualearning.server.dto.ResultDescription> resultDescriptionList26 = resultServiceImpl5.getResultsForUser("Tag(id=null, name=User(login=null, password=null, name=null, surname=hi!, age=0, institution=null, email=hi!, rating=0))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(resultType16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertNotNull(mapperFacade21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.vntu.marenko.ualearning.server.model.Result result0 = new com.vntu.marenko.ualearning.server.model.Result();
        com.vntu.marenko.ualearning.server.model.User user1 = new com.vntu.marenko.ualearning.server.model.User();
        user1.setSurname("");
        com.vntu.marenko.ualearning.server.model.Test test4 = new com.vntu.marenko.ualearning.server.model.Test();
        boolean boolean5 = user1.equals((java.lang.Object) test4);
        result0.setUser(user1);
        java.lang.String str7 = user1.getLogin();
        java.lang.String str8 = user1.getSurname();
        user1.setPassword("User(login=null, password=null, name=null, surname=, age=0, institution=null, email=null, rating=-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
            com.vntu.marenko.ualearning.server.dto.TestDto testDto94 = testController92.getTest((int) (byte) 1);
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

