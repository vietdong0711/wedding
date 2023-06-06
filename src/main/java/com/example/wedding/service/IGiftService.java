package com.example.wedding.service;


import com.example.wedding.request.GiftRequest;
import com.example.wedding.response.GiftResponse;

import java.util.List;

public interface IGiftService {
    void createGift(GiftRequest request) throws Exception;

    List<GiftResponse> getGifts();
}
