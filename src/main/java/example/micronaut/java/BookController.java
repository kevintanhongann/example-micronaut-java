package example.micronaut.java;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/book")
public class BookController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}