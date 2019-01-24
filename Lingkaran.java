public class Lingkaran {
    double JariJari = 20;
    double Phi = 3.14;
    int Keliling;

    public static void main(String[] Raul) {
        Lingkaran LI = new Lingkaran();
        LI.Keliling();
    }

    public void Keliling() {
        double Keliling = 2 * Phi * JariJari ;
        System.out.println("Jadi Keliling Lingkaran = " + Keliling);
    }
}
