/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransportFirm;

/**
 *
 * @author admin
 */
public class TransportGoingTransportFirm   extends Firm  implements ValueForShiping  {
     
  
    private  String brandOfTrailer21;
    private  String brandOfTrailer22;
    private  String brandOfTrailer23;
    private  String brandOfTrailer24;
    private  String brandOfTrailer25;
    private  String brandOfTrailer26;
    private  String brandOfTrailer27;
    private  String brandOfTrailer28;
    private  String brandOfTrailer29;
    private  String brandOfTrailer30;
    private  float petrolF2;
    private final  int numberOfTheCar=21;
    public TransportGoingTransportFirm(String brandOfTransport21, String brandOfTransport22, String brandOfTransport23, String brandOfTransport24, String brandOfTransport25, String brandOfTransport26, String brandOfTransport27, String brandOfTransport28, String brandOfTransport29, String brandOfTransport30, String brandOfTrailer21, String brandOfTrailer22, String brandOfTrailer23, String brandOfTrailer24, String brandOfTrailer25, String brandOfTrailer26, String brandOfTrailer27, String brandOfTrailer28, String brandOfTrailer29, String brandOfTrailer30, float petrolF2) {
      
        this.brandOfTrailer21 = brandOfTrailer21;
        this.brandOfTrailer22 = brandOfTrailer22;
        this.brandOfTrailer23 = brandOfTrailer23;
        this.brandOfTrailer24 = brandOfTrailer24;
        this.brandOfTrailer25 = brandOfTrailer25;
        this.brandOfTrailer26 = brandOfTrailer26;
        this.brandOfTrailer27 = brandOfTrailer27;
        this.brandOfTrailer28 = brandOfTrailer28;
        this.brandOfTrailer29 = brandOfTrailer29;
        this.brandOfTrailer30 = brandOfTrailer30;
        this.petrolF2 = petrolF2;


    }
    public void choice2()
    {
        switch (numberOfTheCar){
            case 21:
                System.out.println(brandOfTrailer21);
                break;
            case 22:
                System.out.println(brandOfTrailer22);
                break;
            case 23:
                System.out.println(brandOfTrailer23);
                break;
            case 24:
                System.out.println(brandOfTrailer24);
                break;
            case 25:
                System.out.println(brandOfTrailer25);
                break;
            case 26:
                System.out.println(brandOfTrailer26);
                break;
            case  27:
                System.out.println(brandOfTrailer27);
                break;
            case 28:
                System.out.println(brandOfTrailer28);
                break;
            case 29:
                System.out.println(brandOfTrailer29);
                break;
            case 30:
                System.out.println(brandOfTrailer30);
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
