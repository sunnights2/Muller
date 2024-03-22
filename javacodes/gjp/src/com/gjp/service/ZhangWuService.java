package com.gjp.service;

import com.gjp.dao.ZhangWuDao;
import com.gjp.domain.ZhangWu;

import java.util.List;

public class ZhangWuService {
     private ZhangWuDao zhangWuDao = new ZhangWuDao();

     public List<ZhangWu> selectAll() {
         return zhangWuDao.selectAll();
     }

    public List<ZhangWu> select(String startDate, String endDate) {
        return zhangWuDao.select(startDate, endDate);
    }

    public void addZhangWu(ZhangWu zhangwu) {
        zhangWuDao.addZhangWu(zhangwu);
    }

    public void editZhangWu(ZhangWu zhangWu) {
        zhangWuDao.editZhangWu(zhangWu);
    }

    public void deleteZhangWu(int id) {
        zhangWuDao.deleteZhangWu(id);
    }
}
