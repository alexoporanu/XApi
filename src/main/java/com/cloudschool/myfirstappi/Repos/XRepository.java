package com.cloudschool.myfirstappi.Repos;

import com.cloudschool.myfirstappi.Models.X;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface XRepository extends CrudRepository<X, Integer> {

}
