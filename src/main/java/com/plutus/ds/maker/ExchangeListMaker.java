package com.plutus.ds.maker;

import com.plutus.ds.entities.Exchange;
import com.plutus.ds.utils.FileStringGetter;

import java.util.ArrayList;
import java.util.List;

public class ExchangeListMaker {
    private FileStringGetter fileStringGetter = new FileStringGetter();

    public List<Exchange> makeExchanges(String csvString){
        List<Exchange> exchanges = new ArrayList<>();


        // 파일을 읽어온다.
        // 한줄씩 돌려서 exchanges를 만든다.

        return exchanges;
    }
}
