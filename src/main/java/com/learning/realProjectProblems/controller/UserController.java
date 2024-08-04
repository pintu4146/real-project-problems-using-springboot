package com.learning.realProjectProblems.controller;
import com.learning.realProjectProblems.Exception.MyCustomException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);
    @GetMapping("sm")
    public ResponseEntity<String> sendMessage(){

            logger.info("send Message  hits");
//            if (objectNode.has("name")) {
//                return ResponseEntity.ok(objectNode.get("name").asText());
//            } else {
//                throw new MyCustomException("Missing required field 'name' in request body");
//            }
        return ResponseEntity.ok("hello world");

    }
}
