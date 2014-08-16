package mx.gob.jgtjo.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/", produces = "application/json")
public class IndexController {

    private static final Logger log = LoggerFactory
            .getLogger(IndexController.class);

    @RequestMapping(method = GET)
    public Map<String, Object> show() {
        Map<String, Object> response = newHashMap();
        response.put("hello", "World!");

        log.info("Hello, World!");

        return response;
    }

}
