package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class services {
    @Autowired
    repo reposit;

    public List<student> find(){
        return reposit.findAll();
    }

    public student findbyid(int id){
        return reposit.findById(id).orElse(new student());
    }

    public void addstudent(student student){
         reposit.save(student);

    }

    public void updatestudent(student student){
        reposit.save(student);

    }


    public void deletestudent(int id){
        reposit.deleteById(id);
    }


}
