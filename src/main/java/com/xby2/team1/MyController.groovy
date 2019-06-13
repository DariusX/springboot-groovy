package com.xby2.team1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {

    @GetMapping(value = "/")
    String index() {
        return "This is the root. Nothing to see here."
    }

}
