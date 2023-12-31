package lib.bookbrain.service.impl;

import lib.bookbrain.anno.AroundDelete;
import lib.bookbrain.anno.AroundGet;
import lib.bookbrain.anno.AroundUpdate;
import lib.bookbrain.dao.BookInfoMapper;
import lib.bookbrain.model.*;
import lib.bookbrain.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoServiceImpl implements BookInfoService {

private final BookInfoMapper bookInfoMapper;
private final BaseServiceImpl<BookInfo> baseService;

@Autowired
public BookInfoServiceImpl(BookInfoMapper bookInfoMapper) {
   this.bookInfoMapper = bookInfoMapper;
   baseService = new BaseServiceImpl<>(bookInfoMapper);
}

@AroundGet
@Override
public Response getBy(Payload<BookInfo> payload, Filter filter) {
   return baseService.getBy(payload, filter);
}

@Override
public Response create(Payload<BookInfo> payload) {
   return baseService.create(payload);
}

@AroundGet
@Override
public Response getById(Payload<BookInfo> payload) {
   return baseService.getById(payload);
}

@AroundUpdate
@Override
public Response update(Payload<BookInfo> payload) {
   return baseService.update(payload);
}

@AroundDelete
@Override
public Response delete(Payload<BookInfo> payload) {
   return baseService.delete(payload);
}

}
