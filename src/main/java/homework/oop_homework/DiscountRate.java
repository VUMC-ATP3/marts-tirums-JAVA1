package homework.oop_homework;

public class DiscountRate {
    static private double serviceDiscountPremium = 0.2;
    static private double serviceDiscountGold = 0.15;
    static private double serviceDiscountSilver = 0.1;
    static private double productDiscountPremium = 0.1;
    static private double productDiscountGold = 0.1;
    static private double productDiscountSilver = 0.1;

    static public double getServiceDiscountRate(String type) {

        if ("Premium".equalsIgnoreCase(type)) {
            return serviceDiscountPremium;
        }
        else if ("Gold".equalsIgnoreCase(type)) {
            return serviceDiscountGold;
        }
        else if ("Silver".equalsIgnoreCase(type)) {
            return serviceDiscountSilver;
        }

        return 0.0;
    }

    static public double getProductDiscountRate(String type) {

        if ("Premium".equalsIgnoreCase(type)) {
            return productDiscountPremium;
        }
        else if ("Gold".equalsIgnoreCase(type)) {
            return productDiscountGold;
        }
        else if ("Silver".equalsIgnoreCase(type)) {
            return productDiscountSilver;
        }

        return 0.0;
    }


}

