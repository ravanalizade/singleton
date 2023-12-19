public class Serialnumber {
    private static  Serialnumber serialnumber;

    String serialNumber = "salam123";

    public static  Serialnumber getSerialnumber(){
        if (serialnumber==null) serialnumber = new Serialnumber();
        return serialnumber;
    }
    private  Serialnumber(){}

}
