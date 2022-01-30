package com.luxoft;

import java.util.Scanner;

public class Calc {


        private Scanner scanner;
        private String operation;

        public Calc(){
            this.scanner = new Scanner(System.in);
        }
        public void calculate(){
            while (!"q".equals(operation)){
                try {
                    System.out.println(calcStep());
                } catch (NumberFormatException ex){
                    System.out.println("Wrong input data!");
                }
            }
        }

        public double calcStep(){
            System.out.println("Enter the first number:");
            int firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter second number:");
            int secondNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter operation");
            operation = scanner.nextLine();
            return performOperation(firstNumber, secondNumber);
        }
        private double performOperation(int firstNumber, int secondNumber){
            double result;
            switch (operation){
                case "+":
                    result = plus(firstNumber, secondNumber);
                    break;

                case "/":
                    result = divide(firstNumber, secondNumber);
                    break;
                case "-":
                    result = minus(firstNumber,secondNumber);
                    break;
                case "*":
                    result = multiple(firstNumber,secondNumber);
                    break;
                default:
                    result=0;
                    break;
            }
            return result;
        }
        private int plus(int numberOne, int numberTwo){
            return numberOne+numberTwo;
        }
        private double divide(int numberOne, int numberTwo){
            return numberOne/numberTwo;
        }
        private float minus(int numberOne, int numberTwo){
            return numberOne-numberTwo;
        }
        private int multiple(int numberOne, int numberTwo){
            return numberOne*numberTwo;
        }


}
