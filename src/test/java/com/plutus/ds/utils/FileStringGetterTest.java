package com.plutus.ds.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileStringGetterTest {

    private FileStringGetter fileStringGetter = new FileStringGetter();

    @Test
    public void getString() {
        String string = fileStringGetter.getStirng("./test_datas/ohlcv.csv");
        assertNotNull(string);

        System.out.println(string);
    }
}