package com.vivek.oauth2.socialoauth2.demoController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping(value = "")
    public ResponseEntity<String> demo1() {
        return ResponseEntity.ok("Hello World _ 2");
    }


    @GetMapping(value = "api/v1/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello World");
    }

}
