package javatutorials.part3;

public class ClassActions implements InterFaceActions {
    
    ClassNumbers checkNumbers = new ClassNumbers();
    ClassVariables commonVars = new ClassVariables();
    
    @Override
    public void action_add() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() + checkNumbers.checkSecondNumberInStack();
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }

    @Override
    public void action_substract() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() - checkNumbers.checkSecondNumberInStack();
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }

    @Override
    public void action_multiple() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() * checkNumbers.checkSecondNumberInStack();
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }

    @Override
    public void action_divide() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() / checkNumbers.checkSecondNumberInStack();
        System.out.println("ваш результат: " + commonVars.resultNumber);
    }    
}
