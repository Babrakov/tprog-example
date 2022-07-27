package ga.berlo.tproger.bookstore.mapper;

import ga.berlo.tproger.bookstore.model.Book;
import ga.berlo.tproger.bookstore.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
}
