package com.tutor.lesson.secondTask.input;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.secondTask.validation.IArrayValidator;
import com.tutor.lesson.secondTask.validation.impl.ArrayValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintToFile {

    private final static Logger LOG = LogManager.getLogger(PrintToFile.class);
    private static final IArrayValidator arrayValidator = new ArrayValidatorImpl();

    public static boolean inputFile(CustomArray customArray, String path){
        try(PrintWriter file = new PrintWriter(new File(path))){
            file.write(customArray.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }


    public static String readFile(String path){
        String str = "";
        Scanner reader = null;
        try(FileReader file = new FileReader(path)) {
            reader = new Scanner(file);
            while (reader.hasNext()){
                str = reader.nextLine();
                if (arrayValidator.isWord(str)) {
                    return str;
                }
                else {
                    str = null;
                }
            }
            if (str == null){
                LOG.warn("Файл заполнен неверно!");
            }
            if ("".equals(str)){
                LOG.warn("Файл пустой!");
            }
            reader.close();
        } catch (IOException e) {
            LOG.error("Файл не найден!" + path);
            e.printStackTrace();
        } finally{
            if (reader != null){
                reader.close();
            }
        }
        return str;
        // TODO: 26.07.2022 переделать метод readFile, чтобы записывалась только 1 строка, использовать try с ресурсами 
    }
}
