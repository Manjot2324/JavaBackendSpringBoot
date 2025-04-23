package com.RestAPICalls.RestAPICalls;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/param/{name}")
    public String getHellowithName(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String postHello(@RequestBody UserDTO userDTO){
        return "Hello" +" "+ userDTO.getFirstName() + " " + userDTO.getLastName() +" " + "from Bridze-Labz.";
    }
    @PutMapping("/put/{firstName}")
    public String putHello(@PathVariable String firstName,
                           @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }


}
