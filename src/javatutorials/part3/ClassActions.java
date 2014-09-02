package javatutorials.part3;

public class ClassActions implements InterFaceActions {
    
    ClassNumbers checkNumbers = new ClassNumbers();
    ClassVariables commonVars = new ClassVariables();
    
    @Override
    public void action_add(int firstStackNumber, int secondStackNumber) {
        commonVars.resultNumber = firstStackNumber + secondStackNumber;
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }

    @Override
    public void action_substract(int firstStackNumber, int secondStackNumber) {
        commonVars.resultNumber = firstStackNumber - secondStackNumber;
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }

    @Override
    public void action_multiple(int firstStackNumber, int secondStackNumber) {
        commonVars.resultNumber = firstStackNumber * secondStackNumber;
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }

    @Override
    public void action_divide(int firstStackNumber, int secondStackNumber) {
        try {
            secondStackNumber = 0;
            commonVars.resultNumber = firstStackNumber / secondStackNumber;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Зафиксирована попытка деления на ноль!");
        }
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }    
}
