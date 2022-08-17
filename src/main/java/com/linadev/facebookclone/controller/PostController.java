package com.linadev.facebookclone.controller;

import com.linadev.facebookclone.model.Post;
import com.linadev.facebookclone.service.PostService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/post")
@CrossOrigin(value="http://localhost:3000/")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;


    @PostMapping("")
    public Post addPost(@RequestParam Map<String, String> requestParams){

        String strPost = requestParams.get("post");
        String email = requestParams.get("email");
        String name = requestParams.get("name");
        String file = requestParams.get("file");
        String profilePic = requestParams.get("profilePic");

        Post post = Post.builder()
                .file(file)
                .name(name)
                .email(email)
                .fbPost(strPost)
                .profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();
        post = postService.addPost(post);

        return post;
    }
}
