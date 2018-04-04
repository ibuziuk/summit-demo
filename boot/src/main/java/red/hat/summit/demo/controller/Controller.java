package red.hat.summit.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String customPost() {
        return "custom";
    }

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    public String customGet() {
        return "custom";
    }

}
