package com.gjp.views;

import com.gjp.controller.ZhangWuController;
import com.gjp.dao.ZhangWuDao;
import com.gjp.domain.ZhangWu;

import java.util.List;
import java.util.Scanner;

public class MainView   {
    private ZhangWuController controller = new ZhangWuController();

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("---------------管家婆家庭记账软件---------------");
            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
            System.out.println("请输入要操作的功能序号[1-5]:");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    addZhangWu();
                    break;
                case 2:
                    editZhangWu();
                    break;
                case 3:
                    deleteZhangWu();
                    break;
                case 4:
                    selectZhangWu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    private void selectZhangWu() {
        System.out.println("1.查询所有 2.条件查询");
        Scanner sc = new Scanner(System.in);
        int  select = sc.nextInt();
        switch (select){
            case 1:
                //查询所有
                selectAll();
                break;
            case 2:
                //条件查询
                select();
                break;
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
    }

    private void select() {
        System.out.println("选择条件查询,输入日期格式XXXX-XX-XX");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入开始日期:");
        String startDate = sc.nextLine();
        System.out.print("请输入结果日期:");
        String endDate = sc.nextLine();

        List<ZhangWu> list = controller.select(startDate, endDate);
        if (list.size() != 0)
            print(list);
        else
            System.out.println("未查询到数据");
    }

    private void selectAll() {
        List<ZhangWu> list = controller.selectAll();
        if (list.size() != 0)
            print(list);
        else
            System.out.println("未查询到数据");
    }

    private void print(List<ZhangWu> list) {
        System.out.println("ID\t\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
        for (ZhangWu zhangWu : list){
            System.out.println(zhangWu.getZwid() + "\t\t" + zhangWu.getFlname() + "\t\t" + zhangWu.getZhanghu() + "\t\t" + zhangWu.getMoney() + "\t\t" + zhangWu.getCreatetime() + "\t\t" + zhangWu.getDescription());
        }
    }

    private void deleteZhangWu() {
        selectAll();
        System.out.println("选择的是删除功能，请输入序号即可");
        int zwid = new Scanner(System.in).nextInt();
        //调用控制层方法，传递主键id即可
        controller.deleteZhangWu(zwid);
        System.out.println("删除账务成功");
    }

    private void editZhangWu() {
        selectAll();
        System.out.println("选择的是编辑功能，请输入数据");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入ID");
        int zwid = sc.nextInt();
        System.out.println("输入分类名称");
        String flname = sc.next();
        System.out.println("输入金额");
        double money = sc.nextDouble();
        System.out.println("输入账户");
        String zhanghu = sc.next();
        System.out.println("输入日期：格式XXXX-XX-xx");
        String createtime = sc.next();
        System.out.println("输入具体描述");
        String description = sc.next();
        ZhangWu zhangWu = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
        controller.editZhangWu(zhangWu);
        System.out.println("编辑成功");
    }

    private void addZhangWu() {
        System.out.println("选择的添加账务功能，请输入以下内容");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分类名称");
        String flname = sc.next();
        System.out.println("输入金额");
        double money = sc.nextDouble();
        System.out.println("输入账户");
        String zhanghu = sc.next();
        System.out.println("输入日期：格式XXXX-XX-xx");
        String createtime = sc.next();
        System.out.println("输入具体描述");
        String description = sc.next();

        ZhangWu zhangwu = new ZhangWu(0,flname,money,zhanghu, createtime,description);
        controller.addZhangWu(zhangwu);
        System.out.println("添加成功");
    }
}
