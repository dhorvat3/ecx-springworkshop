package io.ecx.workshop.spring.workshop.service;

import java.util.List;

import io.ecx.workshop.spring.workshop.models.BlogPost;
import io.ecx.workshop.spring.workshop.models.User;

public interface BlogPostService
{
    BlogPost findById(int id);
    BlogPost findByTitle(String title);
    List<BlogPost> findByUser(User user);
}
