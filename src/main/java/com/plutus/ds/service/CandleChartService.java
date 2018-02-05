package com.plutus.ds.service;

import com.plutus.ds.dto.CandleChartDataDto;
import org.springframework.stereotype.Component;

@Component
public class CandleChartService {

    public CandleChartDataDto getCandleChartDataDto(int resolution, int fromTimestamp, int toTimestamp){

        CandleChartDataDto candleChartDataDto = new CandleChartDataDto();

        // timestamp를 LocalDateTime으로 변경

        // csv파일 List<Exchange>로 불러옴

        // LocalDateTime으로 query함

        // 결과를 candleChartDataDto로 만듬


       return candleChartDataDto;
    }

}
