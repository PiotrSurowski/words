package com.wsei.words;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request, RedirectAttributes attributes){
        String search = request.getParameter("search");
        attributes.addAttribute("search", search);
        return "board";
    }
}
