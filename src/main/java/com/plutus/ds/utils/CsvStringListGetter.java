package com.plutus.ds.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvStringListGetter {
    public List<String> getCsvString(String path){
        List<String> strings = new ArrayList<>();

        File file = new File(path);
        //file에서 한줄씩 읽어와야함.

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 0번은 지운다. header임
        strings.remove(0);

        return strings;
    }
}
