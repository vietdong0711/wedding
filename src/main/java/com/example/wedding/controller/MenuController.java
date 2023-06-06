package com.example.wedding.controller;

import com.example.wedding.request.MenuRequest;
import com.example.wedding.response.MenuResponse;
import com.example.wedding.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/wedding/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @GetMapping()
    public ResponseEntity<?> getMenus() {
        List<MenuResponse> responses = menuService.getMenus();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createMenu(@RequestBody MenuRequest request) {
        menuService.createMenu(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
