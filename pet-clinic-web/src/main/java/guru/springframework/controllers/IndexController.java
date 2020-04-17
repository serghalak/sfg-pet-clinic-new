package guru.springframework.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        log.debug("Getting index page");

        return "index";
    }

    @RequestMapping({"/oups"})
    public String oupsHandler(){
        return "notimplemented";
    }
}
