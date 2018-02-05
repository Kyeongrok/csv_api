package com.plutus.ds.maker;

import com.plutus.ds.entities.CandleChartData;
import com.plutus.ds.entities.Exchange;

import java.util.ArrayList;
import java.util.List;

public class CandleChartDataListMaker {
    private CandleChartDataMaker candleChartDataMaker = new CandleChartDataMaker();

    public List<CandleChartData> make(List<Exchange> exchanges) {
        List<CandleChartData> candleChartDatas = new ArrayList<>();

        // 날짜로 쪼갠다
        CandleChartData candleChartData = candleChartDataMaker.make(exchanges);
        candleChartDatas.add(candleChartData);

        return candleChartDatas;

    }
}
