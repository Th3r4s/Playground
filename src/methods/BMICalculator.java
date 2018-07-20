package methods;


import java.util.logging.Logger;

public class BMICalculator {

    private final static Logger LOGGER = Logger.getLogger(BMICalculator.class.getName());

    public BMICalculator() {

    }

    public double calcBmi(double kg, double height){

        double bmi = kg/(height*height);
        LOGGER.info("kg: "+kg+" height: "+height+" bmi: "+bmi);
        return bmi;
    }

    public String categorizeBMI(double bmi){

        String category;
        if(bmi < 15){
            category = "Very severely underweight";
        }else if((15>bmi) || (bmi<16)){
            category = "Severely underweight";
        }else if((16>bmi) || (bmi<18.5)){
            category = "Underweight";
        }else if((18.5>bmi) || (bmi<25)){
            category = "Normal (healthy weight)";
        }else if((25>bmi) || (bmi<30)){
            category = "Overweight";
        }else if((30>bmi) || (bmi<35)){
            category = "Moderately obese";
        }else if((35>bmi) || (bmi<16)){
            category = "Severely obese";
        }else{
            category = "Very severely obese";
        }
        return category;
    }
}
