package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Fatal ERROR!");
        }

        //kolejny test
        System.out.println("Test - pierwszy test jednostkowy Calculator");

        Calculator calculator = new Calculator(5,9);
        int methodAdd = calculator.add();
        int methodSubstract = calculator.substract();

        if(methodAdd == (5+9)){
            System.out.println("Method \"add\" is working");
        }else{
            System.out.println("Method \"add\" is not working");
        }

        if(methodSubstract == (5-9)){
            System.out.println("Method \"substract\" is working");
        }else{
            System.out.println("Method \"substract\" is not working");
        }
    }
}
