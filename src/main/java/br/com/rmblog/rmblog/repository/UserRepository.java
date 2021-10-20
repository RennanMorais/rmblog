package br.com.rmblog.rmblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rmblog.rmblog.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
