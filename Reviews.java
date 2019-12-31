package com.mytechladder.movie_reivew;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.beans.factory.annotation.Autowired;

@Entity

public class Reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	@SequenceGenerator(name="id_generator", sequenceName = "review_id", allocationSize=50)
	private int id;
	private String comment;
	private int rating;
	
	//Foreign keys
	
	@ManyToOne
	@JoinColumn(name = "movie_id", referencedColumnName = "id",insertable = false, updatable = false)

	private Movie movie;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id",insertable = false, updatable = false)
	private User user;
	
	
	

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", movie_id=" + movie.getId() + ", user_id=" + user.getId() + ", comment=" + comment
				+ ", rating=" + rating + "]";
	}
	
	

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}

	public Movie getMovie() {
		return movie;
	}
	

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public void setMovieID(int movieid)
	{
		movie.setId(movieid);
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public void setUserID(int userid)
	{
		user.setId(userid);
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}
//default constructor
	protected Reviews() {
	}
	
	public Reviews(String comment, int rating, Movie movie, User user) {
		super();
		//this.id = id;
		this.comment = comment;
		this.rating = rating;
		this.movie = movie;
		this.user = user;
	}

	public int getMovie_id() {
		return movie.getId();
	}

	public int getUser_id() {
		return user.getId();
	}
		
}
