package com.qy105.aaa.controller;

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
public class BookController {

    @Autowired
    private BookService bookService;
    private int i = 1;

    @GetMapping("/getBook")
     public List<BookInfo> queryBook(){
         List<BookInfo> allBook = bookService.getAllBook();
        /*if (++i % 2 == 0) {
            throw new IllegalArgumentException();
        }*/
        /*try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return allBook;
     }
}
