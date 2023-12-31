package lib.bookbrain.service;

import lib.bookbrain.model.Filter;
import lib.bookbrain.model.GetLog;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;

public interface GetLogService extends BaseService<GetLog> {
void createLog(GetLog log);

void updateLog(GetLog log);

Response getBy(Payload<GetLog> payload, Filter filter);

Response create(Payload<GetLog> payload);

Response getById(Payload<GetLog> payload);

Response update(Payload<GetLog> payload);

Response delete(Payload<GetLog> payload);
}
