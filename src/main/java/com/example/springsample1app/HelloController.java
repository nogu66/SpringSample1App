package com.example.springsample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        String msg = """
                <div class="border boeder-primary">
                <h2>メッセージ</h2>
                <p>THis is sample message!</p>
                </div>
                """;
        mav.setViewName("index");
        mav.addObject("msg", msg);
        return mav;
    }
}
