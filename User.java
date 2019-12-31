package com.mytechladder.movie_reivew;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")

public class User {
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	
/*	@OneToMany(mappedBy = "user")
	private List<Reviews> reviews;*/

//constructors
	protected User() {
	}

	public User(int id,String username) {
		super();
		this.id = id;
		this.username = username;
	}

//setters
	
	  public void setId(int id) {
		  this.id = id;
		  } 
	  
	  public void setUsername(String
			  username) { this.username = username; }
	 

	//getters
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username+ "]";
	}

}
