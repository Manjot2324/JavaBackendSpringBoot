package com.RestAPICalls.RestAPICalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestApiController {
    @GetMapping
    public String getHello(){
        return "Hello from Bridge-Labz";
    }
    @GetMapping("/query")
    public String getHelloWithName(@RequestParam String name){
        return "Hello" + " " + name + " " + "from Bridze-Labz";
    }


}
