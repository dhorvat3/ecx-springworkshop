package io.ecx.workshop.spring.workshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.ecx.workshop.spring.workshop.models.BlogPost;
import io.ecx.workshop.spring.workshop.models.User;
import io.ecx.workshop.spring.workshop.repository.BlogPostRepository;
import io.ecx.workshop.spring.workshop.service.BlogPostService;

public class DefaultBlogPostServiceImpl implements BlogPostService
{
    @Autowired
    BlogPostRepository blogPostRepository;

    @Override
    public BlogPost findById(int id)
    {
        return null;
    }

    @Override
    public BlogPost findByTitle(String title)
    {
        return null;
    }

    @Override
    public List<BlogPost> findByUser(User user)
    {
        return null;
    }
}
