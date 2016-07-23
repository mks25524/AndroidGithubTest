package bitspider.xam;

/**
 * Created by Mobile App Develop on 18-6-16.
 */
public class ProductPrice {
    private double inputProductPrice;
    private double inputVat;
    private double inputDiscount;

    public double calculation(){
        inputProductPrice=inputProductPrice+(inputProductPrice*(inputVat/100));

        double res=inputProductPrice-(inputProductPrice*(inputDiscount/100));

        return res;
    }

    public double getInputDiscount() {
        return inputDiscount;
    }

    public void setInputDiscount(double inputDiscount) {
        this.inputDiscount = inputDiscount;
    }

    public double getInputVat() {

        return inputVat;
    }

    public void setInputVat(double inputVat) {
        this.inputVat = inputVat;
    }

    public double getInputProductPrice() {

        return inputProductPrice;
    }

    public void setInputProductPrice(double inputProductPrice) {
        this.inputProductPrice = inputProductPrice;
    }
}
