package com.sparta.week01.service;

import com.sparta.week01.domain.Course;
import com.sparta.week01.domain.CourseRepository;
import com.sparta.week01.domain.CourseRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Transactional
    public Long update(Long id, CourseRequestDto requestDto) {
        Course course1 = courseRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        course1.update(requestDto);
        return course1.getId();
    }
}
