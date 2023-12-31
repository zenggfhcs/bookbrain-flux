package lib.bookbrain.dao;

import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {

List<User> getBy(@Param("payload") Payload<User> payload, @Param("filter") Filter filter);

int create(Payload<User> payload);

User getById(Payload<User> payload);

int delete(Payload<User> payload);

int update(Payload<User> payload);

User getByUpdate(Payload<User> payload);

int has(Payload<User> payload);

int login(Payload<User> payload);
}
