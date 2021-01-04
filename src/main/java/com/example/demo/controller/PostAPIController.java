package com.example.demo.controller;

import com.example.demo.model.SearchVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostAPIController {

    // http통신할때 post는 body에다 data를 집어넣어서 받아오겠다.
    // @RequestBody에 SearchVO에 있는 값을 매칭해서 보내줘라.
/*
    @RequestMapping(method = RequestMethod.POST, path = "/postRequest")
    public SearchVo postRequest(@RequestBody SearchVo searchVo){
        return searchVo;
    }

    @PostMapping(value = "/postMapping")
    public SearchVo  postMapping(@RequestBody SearchVo  searchVo){
        return searchVo;
    }
 */
}
