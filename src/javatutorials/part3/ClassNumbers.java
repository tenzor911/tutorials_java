package javatutorials.part3;

import java.util.Stack;

public class ClassNumbers {
    
    ClassVariables commonVars = new ClassVariables();
    Stack varStack = new Stack();
    
    public void setInputNumber(Stack numInStack) {
        //System.out.println(varStack);
        varStack = numInStack;
    }
    
    public Stack getStack() {
        //System.out.println(varStack);
        return varStack;
    }
    
    public int checkFirstNumberInStack() {
        if( !getStack().empty() ) {
            commonVars.objFirstNumber = (Integer)getStack().pop();
            commonVars.firstNumber = commonVars.objFirstNumber;
            //System.out.println(commonVars.firstNumber);
        } else {
            commonVars.firstNumber = 0;
            //System.out.println("check"+commonVars.firstNumber);
        }
        return commonVars.firstNumber;
    }
    
    public int checkSecondNumberInStack() {
        if( !getStack().empty() ) {
            commonVars.objSecondNumber = (Integer)getStack().pop();
            commonVars.secondNumber = commonVars.objSecondNumber;
        } else {
            commonVars.secondNumber = 0;
        }
        return commonVars.secondNumber;
    }   
}
