/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransportFirm;

/**
 *
 * @author admin
 */
public class TransportAndLogicEnterTransportFirm extends Firm implements ValueForShiping{
     private String brandOfTransport1;
    private String brandOfTransport2;
    private String brandOfTransport3;
    private String brandOfTransport4;
    private String brandOfTransport5;
    private String brandOfTransport6;
    private String brandOfTransport7;
    private String brandOfTransport8;
    private String brandOfTransport9;
    private String brandOfTransport10;
  
    private int numberOfTheCar = 1;

    @Override
    public float function(float a, float b, float c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private float petrolF;

    public float getPetrolF() {
        return petrolF;
    }

    public void setPetrolF(float petrolF) {
        this.petrolF = petrolF;
    }

    public String getBrandOfTransport1() {
        return brandOfTransport1;
    }

    public void setBrandOfTransport1(String brandOfTransport1) {
        this.brandOfTransport1 = brandOfTransport1;
    }

    public String getBrandOfTransport2() {
        return brandOfTransport2;
    }

    public void setBrandOfTransport2(String brandOfTransport2) {
        this.brandOfTransport2 = brandOfTransport2;
    }

    public String getBrandOfTransport3() {
        return brandOfTransport3;
    }

    public void setBrandOfTransport3(String brandOfTransport3) {
        this.brandOfTransport3 = brandOfTransport3;
    }

    public String getBrandOfTransport4() {
        return brandOfTransport4;
    }

    public void setBrandOfTransport4(String brandOfTransport4) {
        this.brandOfTransport4 = brandOfTransport4;
    }

    public String getBrandOfTransport5() {
        return brandOfTransport5;
    }

    public void setBrandOfTransport5(String brandOfTransport5) {
        this.brandOfTransport5 = brandOfTransport5;
    }

    public String getBrandOfTransport6() {
        return brandOfTransport6;
    }

    public void setBrandOfTransport6(String brandOfTransport6) {
        this.brandOfTransport6 = brandOfTransport6;
    }

    public String getBrandOfTransport7() {
        return brandOfTransport7;
    }

    public void setBrandOfTransport7(String brandOfTransport7) {
        this.brandOfTransport7 = brandOfTransport7;
    }

    public String getBrandOfTransport8() {
        return brandOfTransport8;
    }

    public void setBrandOfTransport8(String brandOfTransport8) {
        this.brandOfTransport8 = brandOfTransport8;
    }

    public String getBrandOfTransport9() {
        return brandOfTransport9;
    }

    public void setBrandOfTransport9(String brandOfTransport9) {
        this.brandOfTransport9 = brandOfTransport9;
    }

    public String getBrandOfTransport10() {
        return brandOfTransport10;
    }

    public void setBrandOfTransport10(String brandOfTransport10) {
        this.brandOfTransport10 = brandOfTransport10;
    

   
    }

    public void choice() {
        switch (numberOfTheCar) {
            case 1:
                System.out.println(getBrandOfTransport1());
                break;
            case 2:
                System.out.println(getBrandOfTransport2());
                break;
            case 3:
                System.out.println(getBrandOfTransport3());
                break;
            case 4:
                System.out.println(getBrandOfTransport4());
                break;
            case 5:
                System.out.println(getBrandOfTransport5());
                break;
            case 6:
                System.out.println(getBrandOfTransport6());
                break;
            case 7:
                System.out.println(getBrandOfTransport7());
                break;
            case 8:
                System.out.println(getBrandOfTransport8());
                break;
            case 9:
                System.out.println(getBrandOfTransport9());
                break;
            case 10:
                System.out.println(getBrandOfTransport10());
                break;

            default:
                System.out.println("Sorry but our firm hasn't car what do you like");
                break;
        }
    }
}



    
    

