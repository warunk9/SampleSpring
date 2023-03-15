package com.app.demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class MessageService {


    public String oKMessage() {
        log.info("service return the message");
        return "ok google";
    }
}
