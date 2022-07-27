package ga.berlo.tproger.service;

import ga.berlo.tproger.dao.BookEntity;
import ga.berlo.tproger.dao.BookRepository;
import ga.berlo.tproger.exception.BookNotFoundException;
import ga.berlo.tproger.mapper.BookToEntityMapper;
import ga.berlo.tproger.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultBookService implements BookService{

    private final BookRepository bookRepository;
    private final BookToEntityMapper mapper;

    @Override
    public Book getBookById(Long id) {

        BookEntity bookEntity = bookRepository
                .findById(id)
                .orElseThrow(()->new BookNotFoundException("Book not found: id = " + id));
        return mapper.bookEntityToBook(bookEntity);
    }

    @Override
    public List<Book> getAllBooks() {
        Iterable<BookEntity> iterable = bookRepository.findAll();
        ArrayList<Book> books = new ArrayList<>();
        for(BookEntity bookEntity : iterable) {
            books.add(mapper.bookEntityToBook(bookEntity));
        }
        return books;
    }

    @Override
    public void addBook(Book book) {

        BookEntity bookEntity = mapper.bookToBookEntity(book);
        bookRepository.save(bookEntity);

    }
}
