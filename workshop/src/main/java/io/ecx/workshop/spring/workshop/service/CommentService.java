package io.ecx.workshop.spring.workshop.service;

import java.util.List;

import io.ecx.workshop.spring.workshop.models.BlogPost;
import io.ecx.workshop.spring.workshop.models.Comment;
import io.ecx.workshop.spring.workshop.models.User;

public interface CommentService
{
    Comment findById(int id);
    List<Comment> findByBlogPost(BlogPost blogPost);
    List<Comment> findByUser(User user);
}
