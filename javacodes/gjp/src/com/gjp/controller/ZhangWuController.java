package com.gjp.controller;

import com.gjp.domain.ZhangWu;
import com.gjp.service.ZhangWuService;

import java.util.List;

public class ZhangWuController {
    private ZhangWuService service = new ZhangWuService();

    public List<ZhangWu> selectAll() {
        return service.selectAll();
    }

    public List<ZhangWu> select(String startDate, String endDate) {
        return service.select(startDate, endDate);
    }

    public void addZhangWu(ZhangWu zhangwu) {
        service.addZhangWu(zhangwu);
    }

    public void editZhangWu(ZhangWu zhangWu) {
        service.editZhangWu(zhangWu);
    }

    public void deleteZhangWu(int id) {
        service.deleteZhangWu(id);
    }
}
