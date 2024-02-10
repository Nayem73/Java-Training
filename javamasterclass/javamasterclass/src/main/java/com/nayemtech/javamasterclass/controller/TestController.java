package com.nayemtech.javamasterclass.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/test")
//    @ResponseBody
    public ResponseEntity<Map<String, String>> testingJson() {
        String s = "is this in json or not?";
        Map<String, String> response = new HashMap<>();
        response.put("s", s);
        return ResponseEntity.ok().body(response);
    }
}
