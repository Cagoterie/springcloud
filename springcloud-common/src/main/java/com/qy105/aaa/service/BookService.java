package com.qy105.aaa.service;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

import com.qy105.aaa.model.BookInfo;

import java.util.List;

public interface BookService {

    /**
     * 获得所有书籍
     * @return
     */
    List<BookInfo> getAllBook();

}
