package com.chny.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping(path = "/", produces = "text/html")
    public String index() {
        return "/index_offline";
    }

    @GetMapping(path = "/map", produces = "text/html")
    public String map() {
        return "/map";
    }


    @GetMapping(path = "/data", produces = "text/html")
    public String getDate() {
        return "/getdata";
    }
}
