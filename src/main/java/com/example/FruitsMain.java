package com.example;

import com.example.dao.FruitsDao;
import com.example.service.FruitsService;

public class FruitsMain {

    public static void main(String[] args) {
        FruitsService fruitsService = new FruitsService();
        fruitsService.setFruitsDao(new FruitsDao());
        boolean flag = fruitsService.isExist(1);
        System.out.println(flag ? "present" : "missing");
    }
    
}
