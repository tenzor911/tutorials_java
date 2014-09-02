package javatutorials.part3;

import java.util.Scanner;
import java.util.Stack;

public class ClassInputData {

    ClassActions arithmeticActions = new ClassActions();
    ClassNumbers checkNumbers = new ClassNumbers();
    ClassVariables commonVars = new ClassVariables();
    
    Stack calcStack = new Stack();

    public void getData() {
        while (commonVars.mainCycle != true) {                                                                  //повторяем нашу программу, пока mainCycle равен false
            System.out.print("Введите число или операцию: ");
            commonVars.inputVar = new Scanner(System.in);
            String operationType = commonVars.inputVar.nextLine();                                              //принимаем данные на вход
            char[] symbolForInput = operationType.trim().toCharArray();
            String strOfNumbers = "";
            for(int firstCycleCounter = 0; firstCycleCounter < symbolForInput.length; firstCycleCounter++) {
                if (symbolForInput[firstCycleCounter] >= '0' && symbolForInput[firstCycleCounter] <= '9') {
                    strOfNumbers = strOfNumbers + symbolForInput[firstCycleCounter];
                    calcStack.push(Integer.parseInt(strOfNumbers));                                             //кладём число в стек
                    checkNumbers.setInputNumber(calcStack);
                } else if (symbolForInput[firstCycleCounter] == '+') {
                    System.out.println("Вы ввели операцию сложения"); 
                    arithmeticActions.action_add(checkNumbers.checkFirstNumberInStack(), checkNumbers.checkSecondNumberInStack());
                } else if (symbolForInput[firstCycleCounter] == '-') {
                    System.out.println("Вы ввели операцию вычитания");
                    arithmeticActions.action_substract(checkNumbers.checkFirstNumberInStack(), checkNumbers.checkSecondNumberInStack());
                } else if (symbolForInput[firstCycleCounter] == '*') {
                    System.out.println("Вы ввели операцию умножения");
                    arithmeticActions.action_multiple(checkNumbers.checkFirstNumberInStack(), checkNumbers.checkSecondNumberInStack());
                } else if (symbolForInput[firstCycleCounter] == '/') {
                    System.out.println("Вы ввели операцию деления");
                    arithmeticActions.action_divide(checkNumbers.checkFirstNumberInStack(), checkNumbers.checkSecondNumberInStack());
                } else if (symbolForInput[firstCycleCounter] == 'e'){
                    System.out.println("Вы ввели комбинацию для выхода. Программа будет завершена!");
                    commonVars.mainCycle = true;
                } else {
                    System.out.println("Вы ввели некорректные данные. Программа будет завершена!");
                    commonVars.mainCycle = true;
                }
            } 
        }
    }  
}

