package com.ye.web;

import com.ye.entity.User;
import com.ye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/")
public class WebController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/page")
    public String page(HttpServletRequest request, ModelMap map) {
        List<User> list = userService.getAll();
        map.put("users", list);
        for (User u : list) {
            System.out.println(u);
        }
        return "first";
    }
}
