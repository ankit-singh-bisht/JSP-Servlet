package com.ankitsingh.springbootwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home () {
        return "index";
    }

    //Can also be used without parsing if method param is same as param
@RequestMapping("/addNumbers")
public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
    // Calculate the sum of the two numbers
    int sum = num1 + num2;

    // Store the result in the session
    model.addAttribute("result", sum);
    // Return the view name to display the result
    return "addNumbers";
}

}
