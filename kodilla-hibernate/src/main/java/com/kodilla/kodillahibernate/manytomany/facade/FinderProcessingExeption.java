package com.kodilla.kodillahibernate.manytomany.facade;

public class FinderProcessingExeption extends Exception {

    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found ";
    public static String ERR_COMPANY_NOT_FOUND = "Company not found";
    public static String ERR_SEARCH_FINISHED = "Unsuccessful finding process";

    public FinderProcessingExeption(String message) {
        super(message);
    }
}