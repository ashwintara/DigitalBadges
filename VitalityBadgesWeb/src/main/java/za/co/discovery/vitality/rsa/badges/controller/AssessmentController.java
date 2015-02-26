package za.co.discovery.vitality.rsa.badges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ASHWINI2 on 26/02/2015.
 */
@Controller
@RequestMapping("/assessment")
public class AssessmentController {
        @RequestMapping(method = RequestMethod.GET)
        public ModelAndView helloWorld(){

            ModelAndView model = new ModelAndView("HelloWorldPage");
            model.addObject("msg", "hello world");

            return model;
        }
}
