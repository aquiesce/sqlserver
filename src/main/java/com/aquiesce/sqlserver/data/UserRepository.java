package com.aquiesce.sqlserver.data;

import com.aquiesce.sqlserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByFirstName(String firstName);
    User findByLastName(String lastName);
}
