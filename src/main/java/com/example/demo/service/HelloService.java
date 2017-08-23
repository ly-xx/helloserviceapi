package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

@RequestMapping(value = "/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello4(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello5(@RequestHeader(value = "name") String name, @RequestHeader(value = "age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello6(@RequestBody User user);
}
