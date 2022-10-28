package com.sparta.week01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("강소연");
        person.setAddress("경기도 성남시");
        person.setAge(27);
        person.setJob("취준생");
        return person;
    }
}
