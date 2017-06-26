package com.atm;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 6/23/17.
 */
public interface TransactionRepository extends CrudRepository<Transaction, Integer>{
}
