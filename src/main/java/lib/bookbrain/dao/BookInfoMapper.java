package lib.bookbrain.dao;

import lib.bookbrain.model.BookInfo;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookInfoMapper extends BaseMapper<BookInfo> {
BookInfo getById(Payload<BookInfo> payload);

List<BookInfo> getBy(@Param("payload") Payload<BookInfo> payload, @Param("filter") Filter filter);

int update(Payload<BookInfo> payload);

int create(Payload<BookInfo> payload);

int delete(Payload<BookInfo> payload);

BookInfo getByUpdate(Payload<BookInfo> payload);
}
