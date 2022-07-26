package telran.java40.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.java40.book.model.Book;

public interface BookRepository {
	Stream<Book> findByAuthorsName(String authorName);

	Stream<Book> findByPublisherPublisherName(String publisherName);

	boolean existsById(Long isbn);

	Book save(Book book);

	void delete(Book book);

	Optional<Book> findById(Long isbn);
}
