package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(@RequestParam("who") String who) {
        return "Greetings from Spring Boot! - I'm a little " + who ;
    }

}