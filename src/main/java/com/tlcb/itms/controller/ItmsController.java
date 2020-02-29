package com.tlcb.itms.controller;

import com.tlcb.itms.vo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2020/2/23
 * @Time: 17:53
 * Description:
 */
@Controller
public class ItmsController {

    @RequestMapping("/")
    public String index(Map<String, String> params) {
        params.put("name", "zhuxiaolei");
        params.put("age", "24");

        return "index";
    }

    public String test(ModelMap map) {
        List<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("zhuxiaolei", "25"));
        userInfos.add(new UserInfo("renjie", "24"));
        userInfos.add(new UserInfo("xiasongyi", "24"));
        userInfos.add(new UserInfo("xialei", "25"));
        map.put("userInfos", userInfos);
        return "";
    }


}
