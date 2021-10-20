package br.com.rmblog.rmblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rmblog.rmblog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
