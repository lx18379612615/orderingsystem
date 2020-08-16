package com.southwind.repository;

import com.southwind.entity.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    List<Order> findAllByUid(int index, int limit, long uid);
    int countByUid(long uid);
    List<Order> findAll(int index, int limit);
    void updateState(long id);
    int count();
}
