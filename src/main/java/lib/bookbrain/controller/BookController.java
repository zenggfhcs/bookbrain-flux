package lib.bookbrain.controller;

import lib.bookbrain.anno.AroundConduct;
import lib.bookbrain.model.Book;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;
import lib.bookbrain.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
@AroundConduct
public class BookController {

private final BookService bookService;

@Autowired
public BookController(BookService bookService) {
   this.bookService = bookService;
}


@GetMapping
public Mono<Response> getBooks(@RequestBody(required = false) Payload<Book> payload, @RequestHeader("token") String ignoredToken, @RequestBody(required = false) Filter filter) {
   return Mono.just(bookService.getBy(payload, filter));
}

@PostMapping
public Mono<Response> createBook(@RequestBody(required = false) Payload<Book> payload, @RequestHeader("token") String ignoredToken) {
   return Mono.just(bookService.create(payload));
}

@GetMapping("/{ignoredId}")
public Mono<Response> getBook(@RequestBody(required = false) Payload<Book> payload, @RequestHeader("token") String ignoredToken, @PathVariable Integer ignoredId) {
   return Mono.just(bookService.getById(payload));
}

@PatchMapping("/{ignoredId}")
public Mono<Response> updateBook(@RequestBody(required = false) Payload<Book> payload, @RequestHeader("token") String ignoredToken, @PathVariable Integer ignoredId) {
   return Mono.just(bookService.update(payload));
}

@DeleteMapping("/{ignoredId}")
public Mono<Response> deleteBook(@RequestBody(required = false) Payload<Book> payload, @RequestHeader("token") String ignoredToken, @PathVariable Integer ignoredId) {
   return Mono.just(bookService.delete(payload));
}
}
