/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatutorials.part2;

/**
 *
 * @author tenzor
 */
public class ClassSin implements InterFaces{
    @Override
    public double calculate(int degreeToInput) {
        double radians = Math.toRadians(degreeToInput);
        return Math.sin(radians);
    }
}
