package com.qy105.aaa.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@RestController
public class FeignController {
    @Autowired
    private BookService bookService;

    @HystrixCommand
    @GetMapping("/getBookFeign")
    public List<BookInfo> queryBook(){
        List<BookInfo> bookInfoList = bookService.queryBook();
        System.out.println(bookInfoList.size());
        return bookInfoList;
    }
}
