package lib.bookbrain.service;

import lib.bookbrain.model.Book;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;

public interface BookService extends BaseService<Book> {
@Override
Response getBy(Payload<Book> payload, Filter filter);
@Override
Response create(Payload<Book> payload);
@Override
Response getById(Payload<Book> payload);
@Override
Response update(Payload<Book> payload);
@Override
Response delete(Payload<Book> payload);
}
