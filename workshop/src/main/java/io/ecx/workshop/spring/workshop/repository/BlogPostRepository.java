package io.ecx.workshop.spring.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ecx.workshop.spring.workshop.models.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer>
{
}
