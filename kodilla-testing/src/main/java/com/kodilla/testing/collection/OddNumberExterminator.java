package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        int temporaryValue = 0;
        for(int n=0; n < numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if(temporaryValue % 2 ==0){
                oddList.add(temporaryValue);
            }
        }
        return oddList;
    }
}
