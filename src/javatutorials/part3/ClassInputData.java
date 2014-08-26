package javatutorials.part3;

import java.util.Scanner;

public class ClassInputData {
    //String numVar = null;
    public void getData() {
        System.out.print("Введите число или операцию: ");
        Scanner inputVar = new Scanner(System.in);
        String operationType = inputVar.nextLine();
        String myStr = "";
        
        
        char[] input = operationType.trim().toCharArray();
            
        for(int counter = 0; counter < input.length; counter++) {
            if (input[counter] == '0'){
                myStr = myStr + input[counter];
            }
            
            
                   if (input[counter] == '+') {
                System.out.println("Вы ввели операцию сложения");    
            } else if (input[counter] == '-') {
                System.out.println("Вычитание");
            } else if (input[counter] == '*') {
                System.out.println("Умножение");
            } else if (input[counter] == '/') {
                System.out.println("Деление");
            }
        }
        
        if ((input)) {
            System.out.println("Вы ввели операцию сложения"); 
        } else if ((operationType).equals("-")) {
            System.out.println("Вы ввели операцию вычитания");
        } else if ((operationType).equals("*")) {
            System.out.println("Вы ввели операцию умножения");
        } else if ((operationType).equals("/")) {
            System.out.println("Вы ввели операцию деления");
        }  else {
            System.out.println("Это не число и не операция!");
        }
        
    }
}
