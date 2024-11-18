package com.lefort.olympic.controllers.ootb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ootb")
public class IndexController {

    @GetMapping("/")
    public String indexPage() {

        return "chat things";
    }

}
