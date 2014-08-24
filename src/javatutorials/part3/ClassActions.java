package javatutorials.part3;

public class ClassActions implements InterFaceActions {

    int result = 0;
    
    @Override
    public void actionAdd(int first, int second) {
        result = first + second;
    }

    @Override
    public void actionSubstract(int first, int second) {
        result = first - second;
    }

    @Override
    public void actionMultiple(int first, int second) {
        result = first * second;
    }

    @Override
    public void actionDivide(int first, int second) {
        result = first / second;
    }
    
    @Override
    public int setResult() {
        return result;
    }
}
