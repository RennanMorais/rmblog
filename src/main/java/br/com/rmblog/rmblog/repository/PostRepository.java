package br.com.rmblog.rmblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rmblog.rmblog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}
