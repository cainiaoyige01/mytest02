package com.niuzai.service;

import com.niuzai.pojo.items;

import java.util.List;

/**
 * @author niu_zai
 * @DateTime 2022/4/28 0:02 星期四
 */
public interface ServiceDao {
    List<items> findAll();
}
