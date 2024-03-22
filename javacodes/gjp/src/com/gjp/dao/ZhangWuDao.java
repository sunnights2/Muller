package com.gjp.dao;

import com.gjp.domain.ZhangWu;
import org.apache.commons.dbutils.QueryRunner;
import com.gjp.tools.JDBCutils;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class ZhangWuDao {
    QueryRunner qr = new QueryRunner(JDBCutils.getDataSource());

    public List<ZhangWu> selectAll() {
        try {
            String sql = "select * from gjp_zhangwu";
            List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
            return list;
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException("查询所有账户失败");
        }
    }

    public List<ZhangWu> select(String startDate, String endDate) {
        try {
            String sql = "select * from gjp_zhangwu where createtime between ? and ?";
            Object[] params = {startDate, endDate};
            return qr.query(sql, new BeanListHandler<>(ZhangWu.class), params);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("条件查询失败");
        }
    }
    public void addZhangWu(ZhangWu zhangwu) {
        try {
            String sql = "insert into gjp_zhangwu (flname,money,zhanghu,createtime,description) values(?,?,?,?,?)";
            Object[] params = {zhangwu.getFlname(), zhangwu.getMoney(), zhangwu.getZhanghu(), zhangwu.getCreatetime(), zhangwu.getDescription(), zhangwu.getCreatetime()};
            qr.update(sql, params);}
        catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException("添加账务失败");

            }
    }

    public void editZhangWu(ZhangWu zhangWu) {
        try {
            String sql = "update gjp_zhangwu set flname=?,money=?,zhanghu=?,createtime=?,description=? where zwid=?";
            Object[] params = {zhangWu.getFlname(), zhangWu.getMoney(), zhangWu.getZhanghu(), zhangWu.getCreatetime(), zhangWu.getDescription(), zhangWu.getZwid()};
            qr.update(sql, params);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("编辑失败");
        }
    }

    public void deleteZhangWu(int id) {
        try {
            String sql = "DELETE FROM gjp_zhangwu WHERE zwid=?";
            qr.update(sql, id);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("删除失败");
        }
    }
}

