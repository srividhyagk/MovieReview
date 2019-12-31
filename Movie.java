package com.mytechladder.movie_reivew;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	private String category;
	//@OneToMany(mappedBy = "movie")
//	private List<Reviews> reviews;

	// constructors
	protected Movie() {
	}

	public Movie(String title, String category) {
		super();
		// this.id = id;
		this.title = title;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", category=" + category + "]";
	}

	public String getCategory() {
		return this.category;
	}
}
