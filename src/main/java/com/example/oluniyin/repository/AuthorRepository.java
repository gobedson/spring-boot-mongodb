package com.example.oluniyin.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.oluniyin.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, BigInteger> {

}
