package com.ruoyi.system.domain.vo;

public class DrawBaoDi {
    private String username;
    private int count;

    public DrawBaoDi(String username, int count) {
        this.username = username;
        this.count = count;
    }

    public DrawBaoDi() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
