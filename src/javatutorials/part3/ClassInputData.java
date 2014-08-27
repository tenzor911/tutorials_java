package javatutorials.part3;

import java.util.Scanner;
import java.util.Stack;

public class ClassInputData {
    
    boolean mainCycle = false;
    int firstNumber; 
    int secondNumber;
    int resultNumber;
    Stack calcStack = new Stack();
    
    
    public void getData() {
        while (mainCycle != true) {
            System.out.print("Введите число или операцию: ");
            Scanner inputVar = new Scanner(System.in);
            String operationType = inputVar.nextLine();
            char[] symbolForInput = operationType.trim().toCharArray();
            String strOfNumbers = "";
            for(int firstCycleCounter = 0; firstCycleCounter < symbolForInput.length; firstCycleCounter++) {
                if (symbolForInput[firstCycleCounter] >= '0' && symbolForInput[firstCycleCounter] <= '9') {
                    strOfNumbers = strOfNumbers + symbolForInput[firstCycleCounter];
                    calcStack.push(Integer.parseInt(strOfNumbers));
                } else if (symbolForInput[firstCycleCounter] == '+') {
                    System.out.println("Вы ввели операцию сложения");  
                    action_add();
                } else if (symbolForInput[firstCycleCounter] == '-') {
                    System.out.println("Вы ввели операцию вычитания");
                } else if (symbolForInput[firstCycleCounter] == '*') {
                    System.out.println("Вы ввели операцию умножения");
                } else if (symbolForInput[firstCycleCounter] == '/') {
                    System.out.println("Вы ввели операцию деления");
                } else if (symbolForInput[firstCycleCounter] == 'e'){
                    System.out.println("Вы ввели комбинацию для выхода. Программа будет завершена!");
                    mainCycle = true;
                } else {
                    System.out.println("Вы ввели некорректные данные. Программа будет завершена!");
                    mainCycle = true;
                }
            } 
        }
    }
    void action_add() {
        System.out.println(calcStack.pop());
    }
    
}

