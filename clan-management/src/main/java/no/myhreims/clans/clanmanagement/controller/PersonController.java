package no.myhreims.clans.clanmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by spam on 1/22/2017.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @RequestMapping
    @ResponseBody
    String home() {
        return "Hello Person!";
    }
}
