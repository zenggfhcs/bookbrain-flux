package lib.bookbrain.controller;


import lib.bookbrain.anno.AroundConduct;
import lib.bookbrain.model.*;
import lib.bookbrain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@AroundConduct
public class UserController {

private final UserService userService;

@Autowired
public UserController(UserService userService) {
   this.userService = userService;
}

@PostMapping("/login")
public Mono<Response> login(@RequestBody(required = false) Payload<User> payload, @RequestHeader("token") String token) {
   return Mono.just(userService.login(payload));
}

@GetMapping
public Mono<Response> getUsers(@RequestBody(required = false) Payload<User> payload, @RequestHeader("token") String token, @RequestBody(required = false) Filter filter) {
   return Mono.just(userService.getBy(payload, filter));
}

@PostMapping
public Mono<Response> createUser(@RequestBody(required = false) Payload<User> payload, @RequestHeader("token") String token) {
   return Mono.just(userService.create(payload));
}

@GetMapping("/{id}")
public Mono<Response> getUser(@RequestBody(required = false) Payload<User> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(userService.getById(payload));
}

@PatchMapping("/{id}")
public Mono<Response> updateUser(@RequestBody(required = false) Payload<User> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(userService.update(payload));
}


@DeleteMapping("/{id}")
public Mono<Response> deleteUser(@RequestBody(required = false) Payload<User> payload, @RequestHeader("token") String token, @PathVariable Integer id) {
   return Mono.just(userService.delete(payload));
}
}
