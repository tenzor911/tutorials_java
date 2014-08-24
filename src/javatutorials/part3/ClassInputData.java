package javatutorials.part3;

import java.util.Scanner;

public class ClassInputData {
    //String numVar = null;
    public void getData() {
        System.out.print("Введите число или операцию: ");
        Scanner inputVar = new Scanner(System.in);
        String numVar = inputVar.next();
        if (inputVar.hasNextInt()){
            System.out.println("Вы ввели число: " + numVar.toString());
        } else if (("+").equals(numVar)) {
            System.out.println("Вы ввели операцию сложения");   
        } else if (("-").equals(numVar)) {
            System.out.println("Вы ввели операцию вычитания");
        } else if (("*").equals(numVar)){
            System.out.println("Вы ввели операцию умножения");
        } else if (("/").equals(numVar)) {
            System.out.println("Вы ввели операцию деления");
        } else {
            System.out.println("Это не число и не операция");
        }
    }
}
