package com.southwind.entity;

import lombok.Data;

/**
 * @author lengxu32110
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
