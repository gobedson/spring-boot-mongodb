package com.example.oluniyin.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.oluniyin.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, BigInteger> {

	 Post findFirstByOrderByPostedOnDesc() ;

	 List<Post> findAllByOrderByPostedOnDesc() ;
	 Post findBySlug(String slug);

}
