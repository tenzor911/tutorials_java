/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatutorials.part2;

import java.util.Scanner;

/**
 *
 * @author tenzor
 */
public class ClassMain {
    public static void main(String args[]) {
        Scanner inputDegree = new Scanner(System.in);
        int degreeToInput = inputDegree.nextInt();
        InterFaces cosInterface = new ClassCos();
        InterFaces sinInterface = new ClassSin();
        System.out.println("COS:" + cosInterface.calculate(degreeToInput));
        System.out.println("SIN:" + sinInterface.calculate(degreeToInput));
    } 
}
