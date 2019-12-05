package com.qy105.aaa.service;

import com.qy105.aaa.mapper.BookMapper;
import com.qy105.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {
        List<BookInfo> bookInfoList = bookMapper.queryBook();
        if (bookInfoList == null) {
            return null;
        }
        return bookInfoList;
    }
}
