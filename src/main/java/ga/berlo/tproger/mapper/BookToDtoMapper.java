package ga.berlo.tproger.mapper;

import ga.berlo.tproger.model.Book;
import ga.berlo.tproger.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
}
