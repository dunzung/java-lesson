package com.dunzung.java.spring.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String param = req.getParameter("param");
        if (param.trim().equals("add")) {
            System.out.println(param);
        }
        return null;
    }
}