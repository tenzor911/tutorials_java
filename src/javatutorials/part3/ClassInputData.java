package javatutorials.part3;

import java.util.Scanner;
import java.util.Stack;

public class ClassInputData {
    public void getData() {
        System.out.print("Введите число или операцию: ");
        Scanner inputVar = new Scanner(System.in);
        String operationType = inputVar.nextLine();
        char[] symbolForInput = operationType.trim().toCharArray();
        Stack calcStack = new Stack();

        String strOfNumbers = "";

        for(int firstCycleCounter = 0; firstCycleCounter < symbolForInput.length; firstCycleCounter++) {
            if (symbolForInput[firstCycleCounter] >= '0' && symbolForInput[firstCycleCounter] <= '9') {
                strOfNumbers = strOfNumbers + symbolForInput[firstCycleCounter];
            } else if (symbolForInput[firstCycleCounter] == '+') {
                System.out.println("Вы ввели операцию сложения");    
            } else if (symbolForInput[firstCycleCounter] == '-') {
                System.out.println("Вы ввели операцию вычитания");
            } else if (symbolForInput[firstCycleCounter] == '*') {
                System.out.println("Вы ввели операцию умножения");
            } else if (symbolForInput[firstCycleCounter] == '/') {
                System.out.println("Вы ввели операцию деления");
            } else {
                System.out.println("ERROR!!!");
                System.exit(0);
            }
        }
        calcStack.push(Integer.parseInt(strOfNumbers));
        System.out.println(calcStack.lastElement());
            
            
           /*        else if (input[counter] == '+') {
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
        }*/
        }

    }

