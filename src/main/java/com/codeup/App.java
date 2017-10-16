package com.codeup;

import org.apache.commons.lang3.StringUtils;

import javax.print.DocFlavor;


public class App {
    static Input input = new Input();

    public boolean checkIsaNumber(String userInput) {

        boolean isANumber = StringUtils.isNumeric(userInput);
        if (isANumber) {
            System.out.println("Awesome you inputted a number: " + userInput);
        } else {
            System.out.println(userInput + " is not a number.");
        }
        return isANumber;
    }

    public String checkSwapCase(String userInput) {

        String swapCase = StringUtils.swapCase(userInput);
        return swapCase;
    }

    public String Checkreverse (String userInput) {
        String reverse = StringUtils.reverse(userInput);
            return reverse;
    }


    public static void main(String[] args) {
        App app = new App();
        String userInput = input.getString("Please enter a number:");
        System.out.println(app.checkIsaNumber(userInput));
        userInput = input.getString("Please enter a sentence:");
        System.out.println(app.checkSwapCase(userInput));
        userInput = input.getString("Please write a sentence:");
        System.out.println(app.Checkreverse(userInput));
    }
}