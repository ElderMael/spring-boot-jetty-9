package mx.gob.jgtjo.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {

    private static final Logger log = LoggerFactory
            .getLogger(IndexController.class);

    @RequestMapping(method = GET)
    public ModelAndView index() {
        return new ModelAndView("main/index");
    }

}
