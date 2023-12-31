package lib.bookbrain.service.impl;

import lib.bookbrain.anno.AroundDelete;
import lib.bookbrain.anno.AroundGet;
import lib.bookbrain.anno.AroundUpdate;
import lib.bookbrain.dao.PublisherMapper;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Publisher;
import lib.bookbrain.model.Response;
import lib.bookbrain.service.PublisherService;
import org.springframework.stereotype.Service;


@Service
public class PublisherServiceImpl implements PublisherService {
private final PublisherMapper publisherMapper;
private final BaseServiceImpl<Publisher> baseService;

public PublisherServiceImpl(PublisherMapper publisherMapper) {
   this.publisherMapper = publisherMapper;
   baseService = new BaseServiceImpl<>(publisherMapper);
}

@AroundGet
@Override
public Response getBy(Payload<Publisher> payload, Filter filter) {
   return baseService.getBy(payload, filter);
}

@Override
public Response create(Payload<Publisher> payload) {
   return baseService.create(payload);
}

@AroundGet
@Override
public Response getById(Payload<Publisher> payload) {
   return baseService.getById(payload);
}

@AroundUpdate
@Override
public Response update(Payload<Publisher> payload) {
   return baseService.update(payload);
}

@AroundDelete
@Override
public Response delete(Payload<Publisher> payload) {
   return baseService.delete(payload);
}
}
