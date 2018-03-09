package io.ecx.workshop.spring.workshop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import io.ecx.workshop.spring.workshop.models.BlogPost;
import io.ecx.workshop.spring.workshop.models.Comment;
import io.ecx.workshop.spring.workshop.models.User;

public interface CommentRepository extends JpaRepository<Comment, Integer>
{
    Comment findById(int id);
    List<Comment> findByBlogPost(BlogPost blogPost);
    List<Comment> findByUser(User user);
}
