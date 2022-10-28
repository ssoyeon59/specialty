package com.sparta.week01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("김철수");
        person.setAddress("경기도 부천시");
        person.setAge(20);
        person.setJob("대학생");
        return person;
    }
}
