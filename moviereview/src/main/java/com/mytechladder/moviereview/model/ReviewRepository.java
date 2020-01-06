package com.srividhyagk.movie_review;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ReviewRepository extends CrudRepository<Reviews,Integer>{
	
	
	List<Reviews> findByUser_id(int user_id);
	List<Reviews> findByMovie_id(int movie_id);
	List<Reviews> findByRating(int rating);
	
}
