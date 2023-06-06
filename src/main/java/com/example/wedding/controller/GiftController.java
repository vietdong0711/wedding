package com.example.wedding.controller;

import com.example.wedding.request.GiftRequest;
import com.example.wedding.response.GiftResponse;
import com.example.wedding.service.IGiftService;
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
@RequestMapping("/wedding/gift")
public class GiftController {

    @Autowired
    private IGiftService giftService;

    @GetMapping()
    public ResponseEntity<?> getGifts() {
        List<GiftResponse> responses =  giftService.getGifts();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createGift(@RequestBody GiftRequest request) throws Exception {
        giftService.createGift(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
