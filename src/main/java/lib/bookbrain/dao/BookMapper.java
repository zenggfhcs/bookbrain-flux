package lib.bookbrain.dao;

import lib.bookbrain.model.Book;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

Book getById(Payload<Book> payload);

List<Book> getBy(@Param("payload") Payload<Book> payload, @Param("filter") Filter filter);

int create(Payload<Book> payload);

int update(Payload<Book> payload);

int delete(Payload<Book> payload);

Book getByUpdate(Payload<Book> payload);
}
