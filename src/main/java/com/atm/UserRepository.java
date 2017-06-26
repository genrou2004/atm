package com.atm;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 6/23/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByUserName(String userName);


    public boolean existsByUserName(String userName);


}
