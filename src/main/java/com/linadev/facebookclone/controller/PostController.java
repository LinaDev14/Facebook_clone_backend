package com.linadev.facebookclone.controller;

import com.linadev.facebookclone.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/post")
@CrossOrigin(value="http://localhost:3000/")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;


}
