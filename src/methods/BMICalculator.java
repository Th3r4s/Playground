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
}
