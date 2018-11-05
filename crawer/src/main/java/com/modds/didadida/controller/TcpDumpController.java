package com.modds.didadida.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicLong;

/**
 * sudo tcpdump   -n -s 0 | xargs -i curl -d {} http://localhost:8001/tcpdump
 */
@RestController
public class TcpDumpController {
    private static final Logger logger = LoggerFactory.getLogger(TcpDumpController.class);

    private AtomicLong count = new AtomicLong(0);

    @PostMapping("/tcpdump")
    public void tcpdump(@RequestBody String body) throws UnsupportedEncodingException {
        logger.info("--{}--,tcpdump info: {}", count.getAndIncrement(), URLDecoder.decode(body, "utf-8"));
    }
}
