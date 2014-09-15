package javatutorials.part3;

import java.util.Scanner;
import java.util.Stack;

public class ClassInputData {

    ClassActions arithmeticActions = new ClassActions();
    
    int firstNumber; 
    int secondNumber;
    int resultNumber;
    
    char[] symbolForInput;
    
    boolean mainCycle = false;
    
    Integer objFirstNumber;
    Integer objSecondNumber;
   
    Scanner inputVar;
    
    String operationType;
    String strOfNumbers;
    
    
    Stack calcStack = new Stack();

    public void getData() {
        while (mainCycle != true) {                                                                  //повторяем нашу программу, пока mainCycle равен false
            System.out.print("Введите число или операцию: ");
            inputVar = new Scanner(System.in);
            operationType = inputVar.nextLine();                                              //принимаем данные на вход
            symbolForInput = operationType.trim().toCharArray();
            strOfNumbers = "";
            for(int firstCycleCounter = 0; firstCycleCounter < symbolForInput.length; firstCycleCounter++) {
                if (symbolForInput[firstCycleCounter] >= '0' && symbolForInput[firstCycleCounter] <= '9') {
                    strOfNumbers = strOfNumbers + symbolForInput[firstCycleCounter];
                } else if (symbolForInput[firstCycleCounter] == '+') {
                    System.out.println("Вы ввели операцию сложения"); 
                    calcStack.push(arithmeticActions.action_add((int) calcStack.pop(), (int) calcStack.pop()));
                } else if (symbolForInput[firstCycleCounter] == '-') {
                    System.out.println("Вы ввели операцию вычитания");
                    calcStack.push(arithmeticActions.action_substract((int) calcStack.pop(), (int) calcStack.pop()));
                } else if (symbolForInput[firstCycleCounter] == '*') {
                    System.out.println("Вы ввели операцию умножения");
                    calcStack.push(arithmeticActions.action_multiple((int) calcStack.pop(), (int) calcStack.pop()));
                } else if (symbolForInput[firstCycleCounter] == '/') {
                    System.out.println("Вы ввели операцию деления");
                    calcStack.push(arithmeticActions.action_divide((int) calcStack.pop(), (int) calcStack.pop()));
                } else if (symbolForInput[firstCycleCounter] == 'e'){
                    System.out.println("Вы ввели комбинацию для выхода. Программа будет завершена!");
                    mainCycle = true;
                } else {
                    System.out.println("Вы ввели некорректные данные. Программа будет завершена!");
                    mainCycle = true;
                }
            } 
            if (!strOfNumbers.equals("")) {
                calcStack.push(Integer.parseInt(strOfNumbers));
            }
        }
    }  
}

