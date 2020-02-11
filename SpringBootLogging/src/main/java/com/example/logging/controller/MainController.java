package com.example.logging.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MainController {
   private static final Logger logger = LogManager.getLogger(MainController.class);

    @GetMapping
    public String main() {
        logger.info("Some info");
        logger.warn("Some warning");
        logger.error("Some error");
        logger.trace("Some trace");
        logger.debug("Some debug");

        return "Some logging has beed done";
    }

}
