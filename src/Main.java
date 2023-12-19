public class Main {

    public static void main(String[] args) {
        Serialnumber sn = Serialnumber.getSerialnumber();
        Serialnumber qw = Serialnumber.getSerialnumber();
        Serialnumber ab =  Serialnumber.getSerialnumber();
        /* yoxlamaq ucun 3 dene SerialNumber classindan obyekt yaratdim,
        3nun de hashcode si eynidi
         */
        System.out.println(sn.hashCode());
        System.out.println(qw.hashCode());
        System.out.println(ab.hashCode());
    }
}
