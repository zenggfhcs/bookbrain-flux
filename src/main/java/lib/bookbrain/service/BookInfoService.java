package lib.bookbrain.service;

import lib.bookbrain.model.BookInfo;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;

public interface BookInfoService extends BaseService<BookInfo> {
@Override
Response getBy(Payload<BookInfo> payload, Filter filter);

@Override
Response create(Payload<BookInfo> payload);

@Override
Response getById(Payload<BookInfo> payload);

@Override
Response update(Payload<BookInfo> payload);

@Override
Response delete(Payload<BookInfo> payload);
}
