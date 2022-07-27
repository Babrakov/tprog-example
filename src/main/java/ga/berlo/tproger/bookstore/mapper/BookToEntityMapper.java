package ga.berlo.tproger.bookstore.mapper;

import ga.berlo.tproger.bookstore.dao.BookEntity;
import ga.berlo.tproger.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
