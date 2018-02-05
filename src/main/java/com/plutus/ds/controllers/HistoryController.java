package com.plutus.ds.controllers;


import com.plutus.ds.service.CandleChartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class HistoryController {

    @Autowired
    private CandleChartService candleChartService;

    @GetMapping("history")
    public String getArgs(
            @RequestParam(value = "resolution")String resolution,
            @RequestParam(value = "from")String from,
            @RequestParam(value = "to")String to) {

        int iResolution = 0;
        int iFrom = 0;
        int iTo = 0;



        return resolution + ":" + from + ":" + to;
    }
}
