package lib.bookbrain.controller;

import lib.bookbrain.anno.AroundConduct;
import lib.bookbrain.model.Debit;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;
import lib.bookbrain.service.DebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/debits")
@AroundConduct
public class DebitController {
private final DebitService debitService;

@Autowired
public DebitController(DebitService debitService) {
   this.debitService = debitService;
}

@GetMapping
public Mono<Response> getDebits(@RequestBody(required = false) Payload<Debit> payload, @RequestHeader("token") String token, @RequestBody(required = false) Filter filter) {
   return Mono.just(debitService.getBy(payload, filter));
}

@PostMapping
public Mono<Response> createDebit(@RequestBody(required = false) Payload<Debit> payload, @RequestHeader("token") String token) {
   return Mono.just(debitService.create(payload));
}

@GetMapping("/{id}")
public Mono<Response> getDebit(@RequestBody(required = false) Payload<Debit> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(debitService.getById(payload));
}

@PatchMapping("/{id}")
public Mono<Response> updateDebit(@RequestBody(required = false) Payload<Debit> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(debitService.update(payload));
}

@DeleteMapping("/{id}")
public Mono<Response> deleteDebit(@RequestBody(required = false) Payload<Debit> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(debitService.delete(payload));
}
}
