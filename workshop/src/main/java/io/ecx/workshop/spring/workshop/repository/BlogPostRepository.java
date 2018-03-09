package io.ecx.workshop.spring.workshop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import io.ecx.workshop.spring.workshop.models.BlogPost;
import io.ecx.workshop.spring.workshop.models.User;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer>
{
    BlogPost findById(int id);
    BlogPost findByTitle(String title);
    List<BlogPost> findByUser(User user);
}
