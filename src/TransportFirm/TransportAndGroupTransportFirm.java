/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransportFirm;

/**
 *
 * @author admin
 */
public class TransportAndGroupTransportFirm   extends Firm implements ValueForShiping{

  
      private String brandOfTransport11;
    private String brandOfTransport12;
    private String brandOfTransport13;
    private String brandOfTransport14;
    private String brandOfTransport15;
    private String brandOfTransport16;
    private String brandOfTransport17;
    private String brandOfTransport18;
    private String brandOfTransport19;
    private String brandOfTransport20;
    private int numberOfTheCar=11;


    public String getBrandOfTransport11() {
        return brandOfTransport11;
    }

    public void setBrandOfTransport11(String brandOfTransport11) {
        this.brandOfTransport11 = brandOfTransport11;
    }

    public String getBrandOfTransport12() {
        return brandOfTransport12;
    }

    public void setBrandOfTransport12(String brandOfTransport12) {
        this.brandOfTransport12 = brandOfTransport12;
    }

    public String getBrandOfTransport13() {
        return brandOfTransport13;
    }

    public void setBrandOfTransport13(String brandOfTransport13) {
        this.brandOfTransport13 = brandOfTransport13;
    }

    public String getBrandOfTransport14() {
        return brandOfTransport14;
    }

    public void setBrandOfTransport14(String brandOfTransport14) {
        this.brandOfTransport14 = brandOfTransport14;
    }

    public String getBrandOfTransport15() {
        return brandOfTransport15;
    }

    public void setBrandOfTransport15(String brandOfTransport15) {
        this.brandOfTransport15 = brandOfTransport15;
    }

    public String getBrandOfTransport16() {
        return brandOfTransport16;
    }

    public void setBrandOfTransport16(String brandOfTransport16) {
        this.brandOfTransport16 = brandOfTransport16;
    }

    public String getBrandOfTransport17() {
        return brandOfTransport17;
    }

    public void setBrandOfTransport17(String brandOfTransport17) {
        this.brandOfTransport17 = brandOfTransport17;
    }

    public String getBrandOfTransport18() {
        return brandOfTransport18;
    }

    public void setBrandOfTransport18(String brandOfTransport18) {
        this.brandOfTransport18 = brandOfTransport18;
    }

    public String getBrandOfTransport19() {
        return brandOfTransport19;
    }

    public void setBrandOfTransport19(String brandOfTransport19) {
        this.brandOfTransport19 = brandOfTransport19;
    }

    public String getBrandOfTransport20() {
        return brandOfTransport20;
    }

    public void setBrandOfTransport20(String brandOfTransport20) {
        this.brandOfTransport20 = brandOfTransport20;
    }

    private  float petrolF1;

    public float getPetrolF1() {
        return petrolF1;
    }


    public void setPetrolF1(float petrolF1) {
        this.petrolF1 = petrolF1;
    }
    public  void  choice1()
    {
        switch (numberOfTheCar) {
            case 11:
                System.out.println(getBrandOfTransport11());
                break;
            case 12:
                System.out.println(getBrandOfTransport12());
                break;
            case 13:
                System.out.println(getBrandOfTransport13());
                break;
            case 14:
                System.out.println(getBrandOfTransport14());
                break;
            case 15:
                System.out.println(getBrandOfTransport15());
                break;
            case 16:
                System.out.println(getBrandOfTransport16());
                break;
            case 17:
                System.out.println(getBrandOfTransport17());
                break;
            case 18:
                System.out.println(getBrandOfTransport18());
                break;
            case 19:
                System.out.println(getBrandOfTransport19());
                break;
            case 20:
                System.out.println(getBrandOfTransport20());
                break;
            default:
                System.out.println("Sorry but our firm hasn't car what do you like");
                break;
        }
    }
      @Override
    public float function(float a, float b, float c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
