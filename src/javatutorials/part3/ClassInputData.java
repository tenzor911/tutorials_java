package javatutorials.part3;

import java.util.Scanner;
import java.util.Stack;

public class ClassInputData {
    
    boolean mainCycle = false;
    
    Integer objFirstNumber;
    Integer objSecondNumber;
    
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
                    action_substract();
                } else if (symbolForInput[firstCycleCounter] == '*') {
                    System.out.println("Вы ввели операцию умножения");
                    action_multiple();
                } else if (symbolForInput[firstCycleCounter] == '/') {
                    System.out.println("Вы ввели операцию деления");
                    action_divide();
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
        objFirstNumber = (Integer)calcStack.pop();
        firstNumber = objFirstNumber;
        objSecondNumber = (Integer)calcStack.pop();
        secondNumber = objSecondNumber;
        resultNumber = firstNumber + secondNumber;
        System.out.println(resultNumber);
    }
    
    void action_substract() {
        objFirstNumber = (Integer)calcStack.pop();
        firstNumber = objFirstNumber;
        objSecondNumber = (Integer)calcStack.pop();
        secondNumber = objSecondNumber;
        resultNumber = firstNumber - secondNumber;
        System.out.println(resultNumber);
    }
    
    void action_multiple() {
        objFirstNumber = (Integer)calcStack.pop();
        firstNumber = objFirstNumber;
        objSecondNumber = (Integer)calcStack.pop();
        secondNumber = objSecondNumber;
        resultNumber = firstNumber * secondNumber;
        System.out.println(resultNumber);
    }
    
    void action_divide() {
        objFirstNumber = (Integer)calcStack.pop();
        firstNumber = objFirstNumber;
        objSecondNumber = (Integer)calcStack.pop();
        secondNumber = objSecondNumber;
        resultNumber = firstNumber / secondNumber;
        System.out.println(resultNumber);
    }
    
}

