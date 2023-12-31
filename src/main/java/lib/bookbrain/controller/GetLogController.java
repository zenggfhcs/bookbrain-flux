package lib.bookbrain.controller;

import lib.bookbrain.anno.AroundConduct;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.GetLog;
import lib.bookbrain.model.Payload;
import lib.bookbrain.model.Response;
import lib.bookbrain.service.GetLogService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/logs")
@AroundConduct
public class GetLogController {
private final GetLogService logService;

public GetLogController(GetLogService logService) {
   this.logService = logService;
}

@GetMapping
public Mono<Response> getLogs(@RequestBody(required = false) Payload<GetLog> payload, @RequestHeader("token") String token, @RequestBody(required = false) Filter filter) {
   return Mono.just(logService.getBy(payload, filter));
}
}
