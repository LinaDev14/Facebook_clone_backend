package com.linadev.facebookclone.service;


import com.linadev.facebookclone.model.Post;

import java.util.List;

public interface PostServiceInterface {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();

}
