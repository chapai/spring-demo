package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 10/25/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello\n\n";
    }
}
