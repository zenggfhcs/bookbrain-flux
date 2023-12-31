package lib.bookbrain.controller;

import lib.bookbrain.anno.AroundConduct;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Publisher;
import lib.bookbrain.model.Response;
import lib.bookbrain.service.PublisherService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/publishers")
@AroundConduct
public class PublisherController {
private final PublisherService publisherService;

public PublisherController(PublisherService publisherService) {
   this.publisherService = publisherService;
}

@GetMapping
public Mono<Response> getPublishers(@RequestBody(required = false) Payload<Publisher> payload, @RequestHeader("token") String token, @RequestBody(required = false) Filter filter) {
   return Mono.just(publisherService.getBy(payload, filter));
}

@PostMapping
public Mono<Response> createPublisher(@RequestBody(required = false) Payload<Publisher> payload, @RequestHeader("token") String token) {
   return Mono.just(publisherService.create(payload));
}

@GetMapping("/{id}")
public Mono<Response> getPublisher(@RequestBody(required = false) Payload<Publisher> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(publisherService.getById(payload));
}


@PatchMapping("/{id}")
public Mono<Response> updatePublisher(@RequestBody(required = false) Payload<Publisher> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(publisherService.update(payload));
}

@DeleteMapping("/{id}")
public Mono<Response> deletePublisher(@RequestBody(required = false) Payload<Publisher> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(publisherService.delete(payload));
}
}
