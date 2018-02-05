package com.plutus.ds.maker;

import com.plutus.ds.entities.CandleChartData;
import com.plutus.ds.entities.Exchange;

import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;

public class CandleChartDataMaker {

    public CandleChartData make(List<Exchange> exchanges) {
        CandleChartData candleChartData = new CandleChartData();


        // 시, 고, 저, 종, 볼륨
        double open = exchanges.get(0).getPrice();
        double high = exchanges.stream().map(item -> item.getPrice()).max(Double::compare).get();
        double low = exchanges.stream().map(item -> item.getPrice()).min(Double::compare).get();
        double close = exchanges.get(exchanges.size() - 1).getPrice();
        double volume = exchanges.stream().map(item -> item.getAmount()).reduce(0.0d, (a, b) -> a + b);

        candleChartData.setOpen(open);
        candleChartData.setHigh(high);
        candleChartData.setLow(low);
        candleChartData.setClose(close);
        candleChartData.setVolume(volume);
        candleChartData.setTime(exchanges.get(0).getCreatedAt());

        return candleChartData;
    }
}
