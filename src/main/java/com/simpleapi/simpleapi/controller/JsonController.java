package com.simpleapi.simpleapi.controller;

import com.simpleapi.simpleapi.identity.DogType;
import com.simpleapi.simpleapi.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;

public class JsonController {
    private DogService userService;

    public JsonController(DogService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public Iterable<DogType> list() {
        return userService.list();
    }
}
