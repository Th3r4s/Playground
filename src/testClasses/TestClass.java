package testClasses;

import methods.BMICalculator;
import methods.CalorieCalculator;
import objects.Athlete;

public class TestClass {

    public static void main(String args[]){

        Athlete at = new Athlete();
        at.setAge(23);
        at.setGender("w");
        at.setHeight(167);
        at.setName("Mary");
        at.setSurname("Athursdottir");
        at.setUsername("MAthurs");
        at.setWeight(65);

        double height = at.getHeight();
        double weight = at.getWeight();
        int age = at.getAge();
        BMICalculator bc = new BMICalculator();
        CalorieCalculator cc = new CalorieCalculator();
        double athleteBmi = bc.calcBmi(weight,height);
        System.out.println("Athlete BMI: "+athleteBmi+", means: "+bc.categorizeBMI(athleteBmi)+" has bmr of: "+cc.bmrWomen(weight,height,age));

        Athlete atM = new Athlete();
        atM.setAge(33);
        atM.setGender("m");
        atM.setHeight(188);
        atM.setName("Marc");
        atM.setSurname("Athurssonir");
        atM.setUsername("MAthurs");
        atM.setWeight(75);
        System.out.println("Athlete BMI: "+athleteBmi+", means: "+bc.categorizeBMI(athleteBmi)+" has bmr of: "+cc.bmrMen(weight,height,age));
    }
}
