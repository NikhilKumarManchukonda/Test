package com.mock.supermartGraddle.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Item {
    @Id
    private String id;
    private String name;
    private Integer number;
    private Double cost;
}

