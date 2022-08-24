package com.cloudschool.myfirstappi.Services;

import com.cloudschool.myfirstappi.Models.X;
import com.cloudschool.myfirstappi.Repos.XRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class XService {
    @Autowired
    XRepository XR;

    public X saveX(X x) {
        return XR.save(x);
    }

    public List<X> getAllX() {
        List<X> aux = new ArrayList<>();
        XR.findAll().iterator().forEachRemaining((aux::add));
        return aux;
    }

    public X getXById(Integer id) {
        return XR.findById(id).get();
    }
}
