package com.plutus.ds.utils;

import com.plutus.ds.entities.Exchange;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CsvStringListGetterTest {

    private CsvStringListGetter csvStringListGetter = new CsvStringListGetter();
    private String path = "./test_datas/ohlcv.csv";

    @Test
    public void name() throws Exception {
        List<String> stringList = csvStringListGetter.getCsvString(path);

        System.out.println(stringList);

    }
}