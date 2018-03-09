package io.ecx.workshop.spring.workshop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment
{
    @Id
    @GeneratedValue
    private int id;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name="blogPostRefId", referencedColumnName = "id")
    private BlogPost blogPost;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "userRefId", referencedColumnName = "id")
    private User user;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public BlogPost getBlogPost()
    {
        return blogPost;
    }

    public void setBlogPost(BlogPost blogPost)
    {
        this.blogPost = blogPost;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
