package com.it.vx.item.controller;

import com.it.vx.common.enums.ExceptionEnum;
import com.it.vx.common.exception.VXException;
import com.it.vx.pojo.Item;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbs
 * @version 1.0
 * @date 2019/8/3 22:58
 */
@RestController
@RequestMapping("item")
public class ItemController {

    @PostMapping
    public ResponseEntity<Void> saveItme(Item item){
        if (item.getPrice()==null){
            throw new VXException(ExceptionEnum.BRAND_CREATE_FAILED);
        }
    return  new ResponseEntity(HttpStatus.CREATED);
    }
}
