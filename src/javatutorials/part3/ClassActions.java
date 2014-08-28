package javatutorials.part3;

public class ClassActions implements InterFaceActions {
    
    ClassVariables commonVars = new ClassVariables();
    ClassNumbers checkNumbers = new ClassNumbers();

    @Override
    public void action_add() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() + checkNumbers.checkSecondNumberInStack();
        System.out.println(commonVars.resultNumber);
    }

    @Override
    public void action_substract() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() - checkNumbers.checkSecondNumberInStack();
        System.out.println(commonVars.resultNumber);
    }

    @Override
    public void action_multiple() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() * checkNumbers.checkSecondNumberInStack();
        System.out.println(commonVars.resultNumber);
    }

    @Override
    public void action_divide() {
        commonVars.resultNumber = checkNumbers.checkFirstNumberInStack() / checkNumbers.checkSecondNumberInStack();
        System.out.println(commonVars.resultNumber);
    }    
}
