package ga.berlo.tproger.bookstore.controller;

import ga.berlo.tproger.bookstore.mapper.BookToDtoMapper;
import ga.berlo.tproger.bookstore.service.BookService;
import ga.berlo.tproger.bookstore.model.Book;
import ga.berlo.tproger.bookstore.model.BookRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    private final BookToDtoMapper mapper;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks(@RequestParam(required = false) String author){
        if (author != null) {
            return bookService.findByAuthor(author);
        }
        return bookService.getAllBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookRequest request){
        bookService.addBook(mapper.AddBookRequestToBook(request));
    }
}
