package com.sora.baseadapter;

/**
 * Created by Sora on 2015/12/6.
 */
public class Bean {
    private String title;
    private String desc;
    private String time;
    private String phone;

    public Bean(String desc, String phone, String time, String title) {
        this.desc = desc;
        this.phone = phone;
        this.time = time;
        this.title = title;
    }

    public Bean() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
