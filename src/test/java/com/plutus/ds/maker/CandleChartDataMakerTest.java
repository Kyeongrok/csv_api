package com.plutus.ds.maker;

import com.plutus.ds.entities.CandleChartData;
import com.plutus.ds.entities.Exchange;
import com.plutus.ds.utils.CsvStringListGetter;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class CandleChartDataMakerTest {

    private String csvFilePath = "./test_datas/ohlcv.csv";
    private CandleChartDataMaker candleChartDataMaker = new CandleChartDataMaker();
    private CsvStringListGetter csvStringListGetter = new CsvStringListGetter();
    private ExchangeMaker exchangeMaker = new ExchangeMaker();


    @Test
    public void name() throws Exception {

        List<String> strings = csvStringListGetter.getCsvString(csvFilePath);
        List<Exchange> exchanges = strings.stream().map(item -> exchangeMaker.make(item)).collect(Collectors.toList());

        LocalDateTime startLocalDateTime = LocalDateTime.parse("2018-10-31 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime endLocalDateTime = LocalDateTime.parse("2018-02-01 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));


        CandleChartData candleChartData = candleChartDataMaker.make(exchanges);
        System.out.println(candleChartData);

    }
}