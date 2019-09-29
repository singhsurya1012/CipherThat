package com.encrypt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/encrypt")
public class EncryptionController {

    public static Logger LOGGER = LoggerFactory.getLogger(EncryptionController.class);

    @GetMapping("/generateKey")
    public ResponseEntity generateKey() {
        return null;
    }
}
