public class Lingkaran {
    private double JariJari = 20;
    private double Phi = 3.14;
    private double Keliling;

    public void kelilinglingkaran() {
        this.Keliling = 2 * Phi * JariJari;
    }

    public void setJariJari(int JariJari) {
        this.JariJari = JariJari;
    }

    public double getKeliling() {
        return Keliling;
    }
}
