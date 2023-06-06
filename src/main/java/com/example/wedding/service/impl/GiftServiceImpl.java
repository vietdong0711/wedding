package com.example.wedding.service.impl;

import com.example.wedding.entity.Customer;
import com.example.wedding.entity.Gift;
import com.example.wedding.repository.ICustomerRepository;
import com.example.wedding.repository.IGiftRepository;
import com.example.wedding.request.GiftRequest;
import com.example.wedding.response.GiftResponse;
import com.example.wedding.service.IGiftService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiftServiceImpl implements IGiftService {

    @Autowired
    private IGiftRepository giftRepository;
    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createGift(GiftRequest request) throws Exception {
        Optional<Customer> optionalCustomer = customerRepository.findById(request.getCustomerId());
        if (!optionalCustomer.isPresent()) {
            throw new Exception("Khach moi nay ko ton tai");
        }
        Gift gift = new Gift(request);
        gift.setCustomer(optionalCustomer.get());
        giftRepository.save(gift);
    }

    @Override
    public List<GiftResponse> getGifts() {
        List<Gift> gifts = giftRepository.findAll();
        List<GiftResponse> responses = modelMapper.map(gifts, new TypeToken<List<GiftResponse>>() {
        }.getType());

        return responses;
    }
}
