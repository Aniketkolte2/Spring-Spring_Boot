package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class projectcontroller {
    @Autowired
    services services;

    @RequestMapping("/")
    public String page(){
        return "hello";
    }

    @GetMapping("/all")
    public List<student> all(){
        return services.find();
    }

    @GetMapping("/all/{id}")
    public student findbyid(@PathVariable int id){
        return services.findbyid(id);

    }

    @PostMapping("/all")
    public void add(@RequestBody student student){
        services.addstudent(student);
    }

    @PostMapping("/update")
    public void update(@RequestBody student student){
        services.updatestudent(student);
    }


    @DeleteMapping("/all/{id}")
    public void delete(@PathVariable int id){
        services.deletestudent(id);
    }

}
