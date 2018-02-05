package com.plutus.ds.entities;

import lombok.Data;

@Data
public class CandleChartData {
    private double open;
    private double high;
    private double low;
    private double close;
    private double volume;

}
