package com.example.oluniyin;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Author;
import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.AuthorRepository;
import com.example.oluniyin.repository.PostRepository;

@Service
public class DatabaseLoader {

	private static final Logger logger = LoggerFactory.getLogger(DatabaseLoader.class);
	private final PostRepository postRepository;
	private final AuthorRepository authorRepository;

	@Autowired
	public DatabaseLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
		this.postRepository = postRepository;
	}

	@PostConstruct
	private void initDatabase() {
		authorRepository.deleteAll();

		Author gy = new Author("Godson", "Yebadokpo", "godson.yebadokpo@gmail.com");
		authorRepository.save(gy);

		postRepository.deleteAll();

		Post p = new Post("Demo for Spring boot and mongodb");

		p.setSlug("godson-yebadokpo-post-content-1");
		p.setBody(
				"<p>Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte standard de l''imprimerie depuis les années 1500, quand un peintre anonyme assembla ensemble des morceaux de texte pour réaliser un livre spécimen de polices de texte. Il n''a pas fait que survivre cinq siècles, mais s''est aussi adapté à la bureautique informatique, sans que son contenu n''en soit modifié. Il a été popularisé dans les années 1960 grâce à la vente de feuilles Letraset contenant des passages du Lorem Ipsum, et, plus récemment, par son inclusion dans des applications de mise en page de texte, comme Aldus PageMaker.</p>");
		p.setTeaser(
				"<p>Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte standard de l''imprimerie depuis les années 1500, quand un peintre anonyme assembla ensemble des morceaux de texte pour réaliser un livre spécimen de polices de texte. Il n''a pas fait que survivre cinq siècles, mais s''est aussi adapté à la bureautique informatique, sans que son contenu n''en soit modifié. Il a été popularisé dans les années 1960 grâce à la vente de feuilles Letraset contenant des passages du Lorem Ipsum, et, plus récemment, par son inclusion dans des applications de mise en page de texte, comme Aldus PageMaker.</p>");
		p.setPostedOn(new Date());
		p.setAuthor(gy);

		postRepository.save(p);

	}

}
