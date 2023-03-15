package com.app.demo.controller;


import com.app.demo.service.MessageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Log4j2
public class SampleApi {

    @Autowired
    private MessageService messageService;


    @GetMapping(value = "/message", consumes = MediaType.ALL_VALUE)
    public String getMessage() {
        log.info("calling message api");
        return messageService.oKMessage();
    }

}
