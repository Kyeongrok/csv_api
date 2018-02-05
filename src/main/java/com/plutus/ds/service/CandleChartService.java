package com.plutus.ds.service;

import com.plutus.ds.dto.CandleChartDataDto;
import com.plutus.ds.entities.CandleChartData;
import com.plutus.ds.entities.Exchange;
import com.plutus.ds.maker.CandleChartDataDtoMaker;
import com.plutus.ds.maker.CandleChartDataListMaker;
import com.plutus.ds.maker.CandleChartDataMaker;
import com.plutus.ds.maker.ExchangeMaker;
import com.plutus.ds.utils.CsvStringListGetter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;

@Component
public class CandleChartService {

    private String csvFilePath = "./test_datas/ohlcv.csv";
    private CsvStringListGetter csvStringListGetter = new CsvStringListGetter();
    private ExchangeMaker exchangeMaker = new ExchangeMaker();
    private CandleChartDataListMaker candleChartDataListMaker = new CandleChartDataListMaker();
    private CandleChartDataDtoMaker candleChartDataDtoMaker = new CandleChartDataDtoMaker();



    public CandleChartDataDto getCandleChartDataDto(int resolution, int fromTimestamp, int toTimestamp){

        CandleChartDataDto candleChartDataDto = new CandleChartDataDto();

        // timestamp를 LocalDateTime으로 변경
        LocalDateTime fromLocalDateTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(fromTimestamp),
                        TimeZone.getDefault().toZoneId());

        LocalDateTime toLocalDateTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(fromTimestamp),
                        TimeZone.getDefault().toZoneId());

        // csv파일 List<Exchange>로 불러옴
        List<String> strings = csvStringListGetter.getCsvString(csvFilePath);
        List<Exchange> exchanges = strings.stream().map(item -> exchangeMaker.make(item)).collect(Collectors.toList());


        // LocalDateTime으로 query함


        // 결과를 candleChartDataDto로 만듬
        List<CandleChartData> candleChartDatas = candleChartDataListMaker.make(exchanges);
        candleChartDataDto = candleChartDataDtoMaker.candleChartDataDto(candleChartDatas);

       return candleChartDataDto;
    }



}
