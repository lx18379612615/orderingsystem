package com.southwind.feign;

import com.southwind.entity.Order;
import com.southwind.entity.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author lengxu32110
 */
@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/save")
    void save(@RequestBody Order order);

    @GetMapping("/order/findAllByUid/{index}/{limit}/{uid}")
    OrderVO findAllByUid(@PathVariable("index") int index,
                         @PathVariable("limit") int limit,
                         @PathVariable("uid") long uid);

    @GetMapping("/order/findAll/{index}/{limit}")
    OrderVO findAll(@PathVariable("index") int index,
                    @PathVariable("limit") int limit);

    @GetMapping("/order/updateState/{id}")
    void updateState(@PathVariable("id") long id);
}
