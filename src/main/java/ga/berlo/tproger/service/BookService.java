package ga.berlo.tproger.service;

import ga.berlo.tproger.model.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);// получить книгу по id
    List<Book> getAllBooks();// получить список всех книг
    void addBook(Book book);// добавить книгу

    List<Book> findByAuthor(String author);

}
