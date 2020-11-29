package ru.xlcerber.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.xlcerber.blog.models.Post;

public interface PostRepository extends CrudRepository <Post, Long> {
}
