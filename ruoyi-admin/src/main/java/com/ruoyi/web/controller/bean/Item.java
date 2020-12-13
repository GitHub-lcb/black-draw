package com.ruoyi.web.controller.bean;


public class Item {
    private Integer num;
    private String name;
    // 抽奖次数
    private Integer count;
    private Integer money;
    private Integer totalCount;

    public Item(Integer num, String name, Integer count, Integer money, Integer totalCount) {

        this.num = num;
        this.name = name;
        this.count = count;
        this.money = money;
        this.totalCount = totalCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Item(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public Item(Integer num, String name, Integer count) {
        this.num = num;
        this.name = name;
        this.count = count;
    }

    public Item(Integer num, String name, Integer count, Integer money) {
        this.num = num;
        this.name = name;
        this.count = count;
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
