package iofile.task1;

import abtract_interface.bai_tap.bt1.Resizeable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static  void   writeMethod (String pathFile, List<String > list) {

        File file = new File(pathFile);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        int lengthstr =0 ;
        try {
            fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                lengthstr+= s.length();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e ){

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("do dai chuoi " + lengthstr);
    }

    public static List<String> readCopy( String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line ;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line =  bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("khong co file ");
        }
        return list;
    }

    public static void main(String[] args) {
       List<String> list=  readCopy("src/iofile/copy.txt");
         writeMethod("src/iofile/target.txt", list);

    }
}





