package ga.berlo.tproger.bookstore.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

    List<BookEntity> findAllByAuthorContaining(String author);
}
