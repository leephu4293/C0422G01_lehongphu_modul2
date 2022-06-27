package iofile.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class run {
    public static List<Country> readCsv(String path){
        List<Country> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        String[] arr;
        try {
            fileReader= new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                list.add(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e ){

        }
        return list;
    }

    public static void main(String[] args) {
      List<Country> list =  readCsv("src/iofile/task2/file.csv");
        for (Country x: list) {
            System.out.println(x);
        }
    }
}
