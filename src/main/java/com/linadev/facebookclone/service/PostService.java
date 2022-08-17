package com.linadev.facebookclone.service;


import com.linadev.facebookclone.entity.PostEntity;
import com.linadev.facebookclone.model.Post;
import com.linadev.facebookclone.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService implements PostServiceInterface{

    private final PostRepository postRepository;

    @Override
    public Post addPost(Post post) throws Exception {

        try{

            PostEntity postEntity = new PostEntity();
            BeanUtils.copyProperties(post, postEntity);

            if(post.getFile() != null && !post.getFile().equalsIgnoreCase("null"))
                postEntity.setImage(post.getFile());
            else
                postEntity.setImage(null);

            postEntity = postRepository.save(postEntity);

            post.setId(postEntity.getId());
            post.setFile(null);
            post.setImage(postEntity.getImage());

        }catch (Exception e ){
            throw  new Exception("Could not save Post: " + e);
        }
        return post;
    }

    @Override
    public List<Post> getPost() {

        return null;
    }

}
