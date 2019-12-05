package com.qy105.aaa.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.qy105.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error",commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")})
    @GetMapping("/getBookRibbon")
    public List<BookInfo> queryBook(){
        LinkedList forObject = restTemplate.getForObject("http://provider-server/getBook", LinkedList.class);
        return forObject;
    }

    public List<BookInfo> error(){
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("谢谢你曾来过我的世界");
        List<BookInfo> bookInfoList = new LinkedList<>();
        bookInfoList.add(bookInfo);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("服务熔断了" + format);
        if (bookInfoList == null) {
            return null;
        }
        return bookInfoList;
    }
}
