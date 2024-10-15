public class BalokKubusBeraksi {
    public static void main(String[] args) {
        Kubus u = new Kubus();

        u.SetData(5);
        u.SetData(3,4,5);

        System.out.println("Volume Kubus = " + u.volume());
        System.out.println("Luas Permukaan Kubus = " + u.luasPermukaan());

        System.out.println("Volume Balok = " + u.volume());
        System.out.println("Luas Permukaan Balok = " + u.luasPermukaan());
    }
}
