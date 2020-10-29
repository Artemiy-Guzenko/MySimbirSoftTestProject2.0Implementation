package ru.guzenko.sbstestproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.guzenko.sbstestproject.model.Url;
import ru.guzenko.sbstestproject.service.UrlService;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class UrlController {

    private UrlService urlService;

    @Autowired
    public void setUrlService(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String helloPage() {
        return "hello";
    }

    @PostMapping("/result")
    public String addWords(@RequestParam("url") String urlPath, Model model) {
        Map resultMap = urlService.addWords(new Url(urlPath));
        model.addAttribute("resultMap", resultMap);

        return "result";
    }

    @GetMapping("/db")
    public String listAllUrls(Model model) {
        model.addAttribute("listAllUrls", urlService.listAllUrls());

        return "db";
    }

}