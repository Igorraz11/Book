package telran.java40.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.java40.book.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public Stream<Book> findByAuthorsName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Book> findByPublisherPublisherName(String publisherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long isbn) {
		Book book = em.find(Book.class, isbn);
		return book != null;
	}

	@Override
	public Book save(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Book> findById(Long isbn) {
		Book book = em.find(Book.class, isbn);
		return Optional.ofNullable(book);
	}

}
