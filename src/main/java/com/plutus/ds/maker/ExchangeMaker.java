package com.plutus.ds.maker;

import com.plutus.ds.entities.Exchange;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExchangeMaker {
    public Exchange make(String exchangeString){
        Exchange exchange = new Exchange();

        // 한줄을 읽어온다.
        // ,로 자른다
        String[] arExchange = exchangeString.split(",");

        // 0번 yyyy-mm-dd hh:mm:ss는 localDateTime으로 바꾼다.
        LocalDateTime localDateTime = LocalDateTime.parse(arExchange[0], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        exchange.setCreatedAt(localDateTime);

        // amount, price 1번, 2번은 넣는다.
        Double amount = Double.parseDouble(arExchange[1]);
        Double price = Double.parseDouble(arExchange[2]);

        exchange.setAmount(amount);
        exchange.setPrice(price);

        return exchange;
    }
}
