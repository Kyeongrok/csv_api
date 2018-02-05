package com.plutus.ds.maker;

import com.plutus.ds.dto.CandleChartDataDto;
import com.plutus.ds.entities.CandleChartData;
import com.plutus.ds.entities.Exchange;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class CandleChartDataDtoMaker {
    public CandleChartDataDto candleChartDataDto(List<CandleChartData> candleChartDatas) {

        CandleChartDataDto candleChartDataDto = new CandleChartDataDto();

        // List<CandleChartData>를 여러개 만든다

        List<Long> time = candleChartDatas.stream().map(item -> item.getTime())
                .map(item-> Timestamp.valueOf(item).getTime()).collect(Collectors.toList());



        List<Double> open = candleChartDatas.stream().map(item -> item.getOpen()).collect(Collectors.toList());
        List<Double> high = candleChartDatas.stream().map(item -> item.getHigh()).collect(Collectors.toList());
        List<Double> low = candleChartDatas.stream().map(item -> item.getLow()).collect(Collectors.toList());
        List<Double> close = candleChartDatas.stream().map(item -> item.getClose()).collect(Collectors.toList());
        List<Double> volume = candleChartDatas.stream().map(item -> item.getVolume()).collect(Collectors.toList());

        candleChartDataDto.setOpen(open);
        candleChartDataDto.setHigh(high);
        candleChartDataDto.setLow(low);
        candleChartDataDto.setClose(close);
        candleChartDataDto.setVolume(volume);
        candleChartDataDto.setTime(time);


        return candleChartDataDto;

    }
}
