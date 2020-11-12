package com.development.springjpahibernateexample.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import com.development.springjpahibernateexample.models.Users;
import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);
}