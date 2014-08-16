package mx.gob.jgtjo.web.controllers;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class IndexController {

    private static final Logger log = LoggerFactory
            .getLogger(IndexController.class);

    @RequestMapping(method = GET)
    public ModelAndView index() {

        Map<String, Object> model = Maps.newHashMap();

        log.info("Hello, World!");

        return new ModelAndView("main/index", model);
    }

}
