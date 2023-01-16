package com.istay.ecstestapplication.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ECSTestController {

    @GetMapping("/main")
    public String getMain() {
        return "main call deploy";
    }


    @GetMapping("/test")
    public String getTestIndex() {
        return "Test";
    }

    @GetMapping("/test/main")
    public String getTestMain() {
        return "test-4 success";
    }

}
