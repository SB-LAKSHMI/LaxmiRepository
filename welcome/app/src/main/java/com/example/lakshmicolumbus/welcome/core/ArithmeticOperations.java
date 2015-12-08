package com.example.lakshmicolumbus.welcome.core;

/**
 * Created by sameer on 23/11/15.
 */
public class ArithmeticOperations {
    private String mInputOne = "",mInputTwo = "";
    private boolean isFirstInput = true;

    public double prev, curr, result;
    private char op;

    public void setInput(String input){
        if(isFirstInput)
            setInputOne(input);
        else setInputTwo(input);
    }

    public String getInput(){
        if(isFirstInput)
            return mInputOne;
        else return mInputTwo;
    }

    private void setInputOne(String inputOne){
        if(mInputOne == null) mInputOne = inputOne;
        else mInputOne +=inputOne;
    }

    private void setInputTwo(String inputTwo){
        if(mInputTwo == null) mInputTwo = inputTwo;
        else mInputTwo +=inputTwo;
    }


    public void setOperator(char operator){
        isFirstInput = false;
        op = operator;
    }

    public void clear(){
        mInputOne = "";
        mInputTwo = "";
        isFirstInput = true;
    }

    public String getResult(){
        Double inputOne = Double.parseDouble(mInputOne);
        Double inputTwo = Double.parseDouble(mInputTwo);
        clear();
        switch(op){
            default:
           case '+':
                return String.valueOf(inputOne+inputTwo);
            case '-':
                return String.valueOf(inputOne-inputTwo);

            case '*':
                return String.valueOf(inputOne*inputTwo);

            case '/':
                return String.valueOf(inputOne/inputTwo);


        }

    }




}
