package lib.bookbrain.service;

import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Publisher;
import lib.bookbrain.model.Response;

public interface PublisherService extends BaseService<Publisher> {
Response getBy(Payload<Publisher> payload, Filter filter);

Response create(Payload<Publisher> payload);

Response getById(Payload<Publisher> payload);

Response update(Payload<Publisher> payload);

Response delete(Payload<Publisher> payload);
}
