
import static javax.swing.UIManager.get;

//The program is about Personal Rider Licenses 139 USD
public class Okular {

    private float unitsRider;

    private float dozensRider;

    private float valueRider;

    private float discountRider;

    private float totalRider;

    private float giftLicenses;

    public Okular() {
        unitsRider = 0;
        valueRider = 0;
        giftLicenses = 0;
        discountRider = 0;
        dozensRider = 12;
    }

    public float getUnitsRider() {
        return unitsRider;
    }

    public void setUnitsRider(float unitsRider) {
        this.unitsRider = unitsRider;
    }

    public float getValueRider() {
        return valueRider;
    }

    public void setValueRider(float valueRider) {
        this.valueRider = valueRider;
    }

    public float getGiftLicenses() {
        return giftLicenses;
    }

    public void setGiftLicenses(float giftLicenses) {
        this.giftLicenses = giftLicenses;
    }

    public float getDiscountRider() {
        return discountRider;
    }

    public void setDiscountRider(float discountRider) {
        this.discountRider = discountRider;
    }

    public float getDozensRider() {
        return dozensRider;
    }

    public void setDozensRider(float dozensRider) {
        this.dozensRider = dozensRider;
    }

    public float getTotalRider() {
        return totalRider;
    }

    public void setTotalRider(float totalRider) {
        this.totalRider = totalRider;
    }



    public float getDozens(){

        unitsRider = dozensRider;

        return unitsRider;
    }

    public float valueRider(){

        valueRider = unitsRider*139;

        return valueRider;
    }

    public float discountt(){
       valueRider();
    //(15*valueRider)/100
        if(getUnitsRider() > 3)
            discountRider=  (15*valueRider)/100;
        else
            discountRider = (10*valueRider)/100;


    return discountRider;

    }

    public float toPay(){
        valueRider();
        discountt();

        totalRider = (valueRider-discountRider);

        return totalRider;

    }

    public float giftRider(){
        
       for (int i=3; i<1000; i++)
        if(unitsRider > i)
            giftLicenses = unitsRider-3;

        else
            if (unitsRider<3)
                giftLicenses=0;

            return giftLicenses;


    }

}
