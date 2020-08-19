package com.bw.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    private int id;
    private String serial;
}
