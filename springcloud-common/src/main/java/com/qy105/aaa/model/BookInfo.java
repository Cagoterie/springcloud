package com.qy105.aaa.model;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BookInfo {
    private long bookId;
    private String bookName;
    private Integer bookStore;
    private BigDecimal bookPrice;
}
