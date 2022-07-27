package ga.berlo.tproger.controller;

import ga.berlo.tproger.mapper.BookToDtoMapper;
import ga.berlo.tproger.model.Book;
import ga.berlo.tproger.model.BookRequest;
import ga.berlo.tproger.service.BookService;
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
