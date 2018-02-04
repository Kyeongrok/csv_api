package com.plutus.ds.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class FileStringGetter {
    public String getStirng(String filePath) {
        //file에서 line을 읽어옴
        File file = new File(filePath);

        //file에서 한줄씩 읽어와야함.
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                result = result + line;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
