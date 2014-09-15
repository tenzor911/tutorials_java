package javatutorials.part3;

public class ClassActions implements InterFaceActions {
    
    int resultNumber;
    
    //@Override
    public int action_add(int firstStackNumber, int secondStackNumber) {
        resultNumber = firstStackNumber + secondStackNumber;
        System.out.println("ваш результат: " + resultNumber);
        return resultNumber;
    }

    public int action_substract(int firstStackNumber, int secondStackNumber) {
        resultNumber = secondStackNumber - firstStackNumber;
        System.out.println("ваш результат: " + resultNumber);
        return resultNumber;
    }

    @Override
    public int action_multiple(int firstStackNumber, int secondStackNumber) {
        resultNumber = firstStackNumber * secondStackNumber;
        System.out.println("ваш результат: " + resultNumber);
        return resultNumber;
    }
    
    @Override
    public int action_divide(int firstStackNumber, int secondStackNumber) {
        try {
            secondStackNumber = 0;
            resultNumber = secondStackNumber / firstStackNumber;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Зафиксирована попытка деления на ноль!");
        }
        System.out.println("ваш результат: " + resultNumber);
        return resultNumber;
    }    
}
