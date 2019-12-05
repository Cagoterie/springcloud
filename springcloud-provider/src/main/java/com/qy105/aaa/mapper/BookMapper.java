package com.qy105.aaa.mapper;

import com.qy105.aaa.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@Mapper
@Repository
public interface BookMapper {
    /**
     * 获得所有书籍
     * @return
     */
    @Select("select * from book_info")
    List<BookInfo> queryBook();
}
