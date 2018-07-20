package testClasses;

import methods.BMICalculator;
import objects.Athlete;

public class TestClass {

    public static void main(String args[]){

        Athlete at = new Athlete();
        at.setAge(23);
        at.setGender("w");
        at.setHeight(1.67);
        at.setName("Mary");
        at.setSurname("Athursdottir");
        at.setUsername("MAthurs");
        at.setWeight(65);

        double height = at.getHeight();
        double weight = at.getWeight();
        BMICalculator bc = new BMICalculator();
        double athleteBmi = bc.calcBmi(weight,height);
        System.out.println("Athlete BMI: "+athleteBmi);
    }
}
