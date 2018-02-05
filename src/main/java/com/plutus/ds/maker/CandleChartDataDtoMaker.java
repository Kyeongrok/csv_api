package com.plutus.ds.maker;

import com.plutus.ds.dto.CandleChartDataDto;
import com.plutus.ds.entities.Exchange;

import java.util.List;

public class CandleChartDataDtoMaker {
    CandleChartDataDto candleChartDataDto(List<Exchange> exchanges) {

        CandleChartDataDto candleChartDataDto = new CandleChartDataDto();
        // 날짜별로 분리해야함

        // List<CandleChartData> 를 여러개 만든다

        return candleChartDataDto;

    }
}
