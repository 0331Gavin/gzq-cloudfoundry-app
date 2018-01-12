package com.example.gzqcloudfoundryapp.web.respository;

import com.example.gzqcloudfoundryapp.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByName(String username);



    
    

}
