package com.kodilla.exeption.main;

import com.kodilla.exeption.io.FileReader;
import com.kodilla.exeption.io.FileReaderException;
import com.kodilla.exeption.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e){
            System.out.println("Problem while reading a file.");
        }
    }
}