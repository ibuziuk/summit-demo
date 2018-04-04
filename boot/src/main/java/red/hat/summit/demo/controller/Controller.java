package red.hat.summit.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/custom")
public class Controller {

    @PostMapping
    public String customPost() {
        return "{custom}";
    }

    @GetMapping
    public String customGet() {
        return "custom";
    }

}
