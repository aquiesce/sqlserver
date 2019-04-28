package com.aquiesce.sqlserver.data;

import com.aquiesce.sqlserver.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByFirstName(String firstName);
    User findByLastName(String lastName);
}
