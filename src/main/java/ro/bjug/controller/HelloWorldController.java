package ro.bjug.controller;

import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Controller
@Path("/hello")
public class HelloWorldController {

    @GET
    public String sayHello() {
        return "hello.jsp";
    }
}
