public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2();
        System.out.println("konfersi fahrenheit ke reamur:"+suhu.fahrenheitToReamur(100));
        System.out.println("konfersi celcius ke fahrenheit:"+suhu.celciusToFahrenheit(100));
        System.out.println("konfersi celcius ke reamur:"+suhu.celciusToReamur(100));
    }
}