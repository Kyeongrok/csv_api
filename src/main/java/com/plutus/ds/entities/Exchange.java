package com.plutus.ds.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Exchange {
    private LocalDateTime createdAt;
    private Double amount;
    private Double price;

}
