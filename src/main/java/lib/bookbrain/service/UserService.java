package lib.bookbrain.service;

import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;
import lib.bookbrain.model.User;

public interface UserService extends BaseService<User> {
Response login(Payload<User> payload);

Response getBy(Payload<User> payload, Filter filter);

Response create(Payload<User> payload);

Response getById(Payload<User> payload);

Response update(Payload<User> payload);

Response delete(Payload<User> payload);


}

