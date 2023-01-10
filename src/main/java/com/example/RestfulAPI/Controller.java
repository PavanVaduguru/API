package com.example.RestfulAPI;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.text.ParseException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class Controller {

    Map<String, RestUser> allUsers = new HashMap<>();
    @GetMapping
    public Collection<RestUser> getMethod(){
        return allUsers.values();
    }
    @PostMapping(path="/employee", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String postMethod(@RequestBody RestUser userDetails) {
        RestUser addValue = new RestUser();

        addValue.setEmpID(userDetails.getEmpID());
        addValue.setEmpName(userDetails.getEmpName());
        addValue.setEmpDesignation(userDetails.getEmpDesignation());

        allUsers.put(userDetails.getEmpID(), addValue);
        return "User Added";

    }
    @PutMapping
    public String putMethod(){
        return "Put Method ACK";
    }
    @DeleteMapping
    public String deleteMethod(){
        return "delete Method ACK";
    }

}
