package com.niuzai.service.imp;

import com.niuzai.dao.ItemsDao;
import com.niuzai.pojo.items;
import com.niuzai.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author niu_zai
 * @DateTime 2022/4/28 0:02 星期四
 */
@Service
public class ServiceDaoImp implements ServiceDao {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<items> findAll() {
       return itemsDao.findAll();
    }
}
