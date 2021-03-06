package javatutorials.part4;

public interface Node {
    void isDirectory();
    void isFile();
    void getName();
    void getChildren();
    void getEnteredPath(String path);
    String setEnteredPath();
}
