package com.example;

import com.example.dao.FruitsDao;
import com.example.service.FruitsService;

/**
 * https://qiita.com/hirotatsuuu/items/586e1f2f6bdd408dbafc
 * 
 * @author kazurayam
 *
 */
public class FruitsMain {

    public static void main(String[] args) {
        FruitsService fruitsService = new FruitsService();
        fruitsService.setFruitsDao(new FruitsDao());
        boolean flag = fruitsService.isExist(1);
        System.out.println(flag ? "present" : "missing");
    }
    
}
