package com.zskj.Boys.controller;

import com.zskj.Boys.entity.Boys;
import com.zskj.Boys.entity.Result;
import com.zskj.Boys.repository.BoyRepository;
import com.zskj.Boys.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class BoysController {

    @Autowired
    private BoyRepository boyRepository;

    @GetMapping("/hello")
    public String hello() {
        return "hello  Boot";
    }

    @GetMapping("/addBoys")
    public Result<Boys> addBoys(
            @Valid Boys boys,
            BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(boyRepository.save(boys));

    }

    @GetMapping("/findBoys/{id}")
    public String findBoys(@PathVariable("id")Integer id){

        Boys boys = boyRepository.findOne(id);
        return boys.toString();
    }

    @GetMapping("/findAll")
    public String findAll(){
        return boyRepository.findAll().toString();
    }


}
