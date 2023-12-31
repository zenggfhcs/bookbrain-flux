package lib.bookbrain.controller;

import lib.bookbrain.anno.AroundConduct;
import lib.bookbrain.model.BookInfo;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;
import lib.bookbrain.service.BookInfoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bookInfos")
@AroundConduct
public class BookInfoController {
private final BookInfoService bookInfoService;

public BookInfoController(BookInfoService bookInfoService) {
   this.bookInfoService = bookInfoService;
}

@GetMapping
public Mono<Response> getBookInfos(@RequestBody(required = false) Payload<BookInfo> payload, @RequestHeader("token") String ignoredToken, @RequestBody(required = false) Filter filter) {
   return Mono.just(bookInfoService.getBy(payload, filter));
}

@PostMapping
public Mono<Response> createBookInfo(@RequestBody(required = false) Payload<BookInfo> payload, @RequestHeader("token") String ignoredToken) {
   return Mono.just(bookInfoService.create(payload));
}

@GetMapping("/{ignoredId}")
public Mono<Response> getBookInfo(@RequestBody(required = false) Payload<BookInfo> payload, @RequestHeader("token") String ignoredToken, @PathVariable Integer ignoredId) {
   return Mono.just(bookInfoService.getById(payload));
}

@PatchMapping("/{ignoredId}")
public Mono<Response> updateBookInfo(@RequestBody(required = false) Payload<BookInfo> payload, @RequestHeader("token") String ignoredToken, @PathVariable Integer ignoredId) {
   return Mono.just(bookInfoService.update(payload));
}

@DeleteMapping("/{ignoredId}")
public Mono<Response> deleteBookInfo(@RequestBody(required = false) Payload<BookInfo> payload, @RequestHeader("token") String ignoredToken, @PathVariable Integer ignoredId) {
   return Mono.just(bookInfoService.delete(payload));
}
}
