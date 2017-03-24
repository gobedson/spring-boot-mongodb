package com.example.oluniyin.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Author implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4746494555596690643L;
	
	@Id
	private BigInteger id;
	private String firstName;
	private String lastName;
	private String email;
	
	@DBRef
	private List<Post> posts;

	@SuppressWarnings("unused")
	private Author() {

	}

	public Author(String first, String last, String email) {
		this.firstName = first;
		this.lastName = last;
		this.email = email;
	}



	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", posts=" + posts + "]";
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
