package lib.bookbrain.service;

import lib.bookbrain.model.DeletedLog;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;

public interface DeleteLogService extends BaseService<DeletedLog> {
void createLog(DeletedLog log);

void updateLog(DeletedLog log);

Response getBy(Payload<DeletedLog> payload, Filter filter);
@Override
Response create(Payload<DeletedLog> payload);
@Override
Response getById(Payload<DeletedLog> payload);
@Override
Response update(Payload<DeletedLog> payload);
@Override
Response delete(Payload<DeletedLog> payload);
}
