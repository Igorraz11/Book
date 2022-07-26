package telran.java40.book.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.java40.book.model.Author;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public Optional<Author> findById(String authorName) {
		Author author = em.find(Author.class, authorName);
		return Optional.ofNullable(author);
	}

	@Override
	public void delete(Author author) {
		// TODO Auto-generated method stub

	}

	@Override
	public Author save(Author author) {
		em.persist(author);
		return author;
	}

}
