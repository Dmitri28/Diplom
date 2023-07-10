/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransportFirm;

/**
 *
 * @author admin
 */
public class TransportInTimeTransportFirm  extends Firm implements ValueForShiping {
     
    private  String brandOfTrailer31;
    private  String brandOfTrailer32;
    private  String brandOfTrailer33;
    private  String brandOfTrailer34;
    private  String brandOfTrailer35;
    private  String brandOfTrailer36;
    private  String brandOfTrailer37;
    private  String brandOfTrailer38;
    private  String brandOfTrailer39;
    private  String brandOfTrailer40;
    private  int numberOfTheCar=31;





    private  float petrolF4;

    public TransportInTimeTransportFirm(String brandOfTransport31, String brandOfTransport32, String brandOfTransport33, String brandOfTransport34, String brandOfTransport35, String brandOfTransport36, String brandOfTransport37, String brandOfTransport38, String brandOfTransport39, String brandOfTransport40, String brandOfTrailer31, String brandOfTrailer32, String brandOfTrailer33, String brandOfTrailer34, String brandOfTrailer35, String brandOfTrailer36, String brandOfTrailer37, String brandOfTrailer38, String brandOfTrailer39, String brandOfTrailer40, float petrolF4) {
        
        this.brandOfTrailer31 = brandOfTrailer31;
        this.brandOfTrailer32 = brandOfTrailer32;
        this.brandOfTrailer33 = brandOfTrailer33;
        this.brandOfTrailer34 = brandOfTrailer34;
        this.brandOfTrailer35 = brandOfTrailer35;
        this.brandOfTrailer36 = brandOfTrailer36;
        this.brandOfTrailer37 = brandOfTrailer37;
        this.brandOfTrailer38 = brandOfTrailer38;
        this.brandOfTrailer39 = brandOfTrailer39;
        this.brandOfTrailer40 = brandOfTrailer40;
        this.petrolF4 = petrolF4;
    }
    public  void choice3(){
        switch (numberOfTheCar){
            case 31:
                System.out.println(brandOfTrailer31);
                break;
            case 32:
                System.out.println(brandOfTrailer32);
                break;
            case 33:
                System.out.println(brandOfTrailer33);
                break;
            case 34:
                System.out.println(brandOfTrailer34);
                break;
            case 35:
                System.out.println(brandOfTrailer35);
                break;
            case 36:
                System.out.println(brandOfTrailer36);
                break;
            case 37:
                System.out.println(brandOfTrailer37);
                break;
            case 38:
                System.out.println(brandOfTrailer38);
                break;
            case 39:
                System.out.println(brandOfTrailer39);
                break;
            case 40:
                System.out.println(brandOfTrailer40);
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
