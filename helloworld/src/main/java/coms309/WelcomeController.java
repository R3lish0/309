package coms309;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.joda.time.LocalTime;

@RestController
class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hello and welcome to Eli's heavily modified version COMS 309 hello function";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {

        return "Hello and welcome to COMS 309: " + name + " It is currently " + new LocalTime();
    }
    
    
}
