public class Ingredien {
    final private String navn;     // navn på ingrediens

    final private double mængde;    // mængde

    final private String måleEnhed;    // måleenhed, f.eks: gram, stk

    final private double enhedsVægt;// vægt pr enhed: er 1 ved måleenhed gram

    final private double kiloJoule; // enregi i Kj for denne ingrediens

    final private int OPRINDELIGT_ANTAL = 1;

    private int personer;


    public Ingredien(String navn, double mængde, String måleEnhed, double enhedsVægt, double kiloJoule) {
        this.navn = navn;
        this.mængde = mængde;
        this.måleEnhed = måleEnhed;
        this.enhedsVægt = 1;
        this.kiloJoule = kiloJoule;
    }

    public void setPersoner(int personer)
    {
        this.personer = personer;
    }

    public  String getNavn() {
        return navn;
    }

    public String getMåleEnhed() {
        return måleEnhed;
    }

    public double beregnMængde() {
        double beregnet = mængde * OPRINDELIGT_ANTAL * personer;
        return beregnet;
    }
    public double beregnVægt() {
        double vægt = mængde / OPRINDELIGT_ANTAL * personer * enhedsVægt ;
        return vægt;
    }
    public  double beregnKiloJoule() {
        double kj = kiloJoule / OPRINDELIGT_ANTAL * personer * kiloJoule;
        return kj;
    }

}
