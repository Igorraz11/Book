package telran.java40.book.dao;

import java.util.Optional;

import telran.java40.book.model.Author;

public interface AuthorRepository {

	Optional<Author> findById(String authorName);

	void delete(Author author);

	Author save(Author author);

}
