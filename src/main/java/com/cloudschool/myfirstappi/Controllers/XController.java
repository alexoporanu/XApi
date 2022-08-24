package com.cloudschool.myfirstappi.Controllers;

import com.cloudschool.myfirstappi.Models.X;
import com.cloudschool.myfirstappi.Services.XService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("X")
public class XController {
    @Autowired
    XService x;

    @GetMapping("/all")
    public List<X> getAllX() {
        return x.getAllX();
    }

    @GetMapping("{id}")
    public X getById(@PathVariable Integer id) {
        return x.getXById(id);
    }

    @PostMapping
    public X saveX(@RequestBody X x1) {
        return x.saveX(x1);
    }
}
