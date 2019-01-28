public class Main {

    public static void main (String [] args){
        Lingkaran bulat = new Lingkaran();
        BujungSangkar persegi = new BujungSangkar();

        bulat.setJariJari(100);
        bulat.kelilinglingkaran();
        System.out.println("Jadi Keliling Lingkaran Adalah = " + bulat.getKeliling());

        persegi.setsisi(200);
        persegi.kelilingbujungsangkar();
        System.out.println("Jadi Keliling Bujung Sangkar Adalah = " + persegi.getKeliling());
    }







}
