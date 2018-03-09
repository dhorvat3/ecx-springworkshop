package io.ecx.workshop.spring.workshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.ecx.workshop.spring.workshop.models.BlogPost;
import io.ecx.workshop.spring.workshop.models.Comment;
import io.ecx.workshop.spring.workshop.models.User;
import io.ecx.workshop.spring.workshop.repository.CommentRepository;
import io.ecx.workshop.spring.workshop.service.CommentService;

public class DefaultCommentServiceImpl implements CommentService
{
    @Autowired
    CommentRepository commentRepository;

    @Override
    public Comment findById(int id)
    {
        return null;
    }

    @Override
    public List<Comment> findByBlogPost(BlogPost blogPost)
    {
        return null;
    }

    @Override
    public List<Comment> findByUser(User user)
    {
        return null;
    }
}
