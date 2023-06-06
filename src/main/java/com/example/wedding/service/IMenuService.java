package com.example.wedding.service;

import com.example.wedding.request.MenuRequest;
import com.example.wedding.response.MenuResponse;

import java.util.List;

public interface IMenuService {
    void createMenu(MenuRequest request);

    List<MenuResponse> getMenus();
}
