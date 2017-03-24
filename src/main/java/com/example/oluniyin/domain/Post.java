package com.example.oluniyin.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -58390506078017532L;
	
	@Id
	private BigInteger id;
	
	private String title;
	
	private String body;
	
	public Date postedOn;
	
	private String teaser;
	
	private String slug;
	
	private Author author;

	@SuppressWarnings("unused")
	public Post() {

	}

	public Post(String title) {
		
		this.setTitle(title);
		

	}

	



	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public String getTeaser() {
		return teaser;
	}

	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Author getAuthor() {
		return author;
	}

	

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", posteOn=" + postedOn + ", teaser=" + teaser
				+ ", slug=" + slug + ", author=" + author + "]";
	}

}
