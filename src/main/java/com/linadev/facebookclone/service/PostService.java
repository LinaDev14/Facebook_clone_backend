package com.linadev.facebookclone.service;


import com.linadev.facebookclone.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService implements PostServiceInterface{

    private final PostRepository postRepository;
}
