package com.plutus.ds.maker;

import com.plutus.ds.entities.Exchange;
import com.plutus.ds.utils.CsvStringListGetter;
import com.plutus.ds.utils.FileStringGetter;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import static org.junit.Assert.*;

public class ExchangeMakerTest {
    private FileStringGetter fileStringGetter = new FileStringGetter();
    private ExchangeMaker exchangeMaker = new ExchangeMaker();
    private String path = "./test_datas/ohlcv.csv";
    private CsvStringListGetter csvStringListGetter = new CsvStringListGetter();

    @Test
    public void makeExchange() throws Exception {
        List<String> strings = csvStringListGetter.getCsvString(path);

        Exchange exchange = exchangeMaker.make(strings.get(0));
        assertEquals(2017, exchange.getCreatedAt().getYear());
        assertEquals(0.01, exchange.getAmount(), 1e-15);

        System.out.println(exchange);

        System.out.println(exchange.getCreatedAt());

    }
}