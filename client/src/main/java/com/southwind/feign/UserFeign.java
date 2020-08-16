package com.southwind.feign;

import com.southwind.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/findAll/{index}/{limit}")
    List<User> findAll(@PathVariable("index") int indedx, @PathVariable("limit") int limit);

    @GetMapping("/user/findById/{id}")
    User findById(@PathVariable("id") long id);

    @GetMapping("/user/count")
    int count();

    @PostMapping("/user/save")
    void save(@RequestBody User user);

    @PutMapping("/user/update")
    void update(@RequestBody User user);

    @DeleteMapping("/user/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);
}
