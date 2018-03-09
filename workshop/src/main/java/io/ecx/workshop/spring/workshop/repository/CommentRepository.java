package io.ecx.workshop.spring.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ecx.workshop.spring.workshop.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>
{
}
