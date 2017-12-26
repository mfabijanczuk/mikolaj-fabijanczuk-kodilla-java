package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"12345677891", "John", "Smith"},
            {"09876543212", "Ivone", "Nowak"},
            {"45764009461", "Jessi", "Pinkman"},
            {"98132576149", "Walter", "White"},
            {"75142376901", "Clara", "Lanson"}};
    private  double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n){
        if(n > salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];

    }
    public  String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
