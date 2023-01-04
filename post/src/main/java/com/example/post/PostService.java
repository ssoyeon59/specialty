package com.example.post;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

public class PostService {
    @Transactional
    public ResponseEntity<?> createPost(PostRequestDto requestDto) {
        return ResponseEntity.ok("post create");
    }
}
