package com.plutus.ds.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CandleChartData {
    private LocalDateTime time;
    private double open;
    private double high;
    private double low;
    private double close;
    private double volume;

}
