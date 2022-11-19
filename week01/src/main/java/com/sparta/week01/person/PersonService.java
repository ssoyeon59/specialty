package com.sparta.week01.person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Transactional
    public Long updatePerson(Long id, PersonRequestDto requestDto) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다")
        );
        person.update(requestDto);
        return person.getId();
    }
}
