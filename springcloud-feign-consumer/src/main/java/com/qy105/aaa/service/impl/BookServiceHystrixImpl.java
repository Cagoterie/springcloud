package com.qy105.aaa.service.impl;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@Service
public class BookServiceHystrixImpl implements BookService {
    @Override
    public List<BookInfo> queryBook() {
        System.out.println("服务降级中");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("查令街84号");
        List<BookInfo> bookInfoList = new LinkedList<>();
        bookInfoList.add(bookInfo);
        return bookInfoList;
    }
}
