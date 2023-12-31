package lib.bookbrain.service;

import lib.bookbrain.model.Debit;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;

public interface DebitService extends BaseService<Debit> {
@Override
Response getBy(Payload<Debit> payload, Filter filter);

@Override
Response create(Payload<Debit> payload);

@Override
Response getById(Payload<Debit> payload);

@Override
Response update(Payload<Debit> payload);

@Override
Response delete(Payload<Debit> payload);
}
