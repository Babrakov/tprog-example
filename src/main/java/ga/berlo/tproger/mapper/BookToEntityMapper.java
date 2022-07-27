package ga.berlo.tproger.mapper;

import ga.berlo.tproger.dao.BookEntity;
import ga.berlo.tproger.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
