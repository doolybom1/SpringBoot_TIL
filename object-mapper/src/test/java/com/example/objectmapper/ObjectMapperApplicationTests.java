package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------");

        // Text JSON -> Object
        // Object -> Text JSON

        ObjectMapper objectMapper = new ObjectMapper();

        // object -> text
        // objectMapoper는  get method를 활용
        User user = new User("steve", 10, "010-111-1111");
        String text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text -> object
        // objectMapoper는 default 생성자를 필요로 함
        User objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
