package com.tlcb.itms.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2020/2/24
 * @Time: 22:15
 * Description:
 */
public class UserInfo {

    private String name;
    private String age;

    public UserInfo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
