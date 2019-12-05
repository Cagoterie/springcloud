package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.impl.BookServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@FeignClient(value = "provider-server",fallback = BookServiceHystrixImpl.class)
public interface BookService {

    /**
     * 获得所有书籍
     * @return
     */
    @GetMapping(value = "/getBook")
    List<BookInfo> queryBook();
}
