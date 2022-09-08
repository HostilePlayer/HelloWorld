public class Opskrift
{

    private static Ingredien[] ingredienser;
    int personer;
    private String navn;

    public int getPersoner(int personer){
        return personer;
    }

    public Ingredien[] Ingredienser;


    //TODO: Lav setAntal metode der løkker gennem hver ingrediens og sætter antal person
    public void setAntal(int personer){
        for (Ingredien ingredient : ingredienser) {
            ingredient.setPersoner(personer);
        }
    }

    public Opskrift()
    {
        this.navn = navn;

        Ingredien kakao = new Ingredien("kakao", 2.0, "gram", 2.0, 4.0);
        kakao.setPersoner(personer);

        Ingredien hvedemel = new Ingredien( "hvedemel", 20.83, "gram", 20.83, 3.43);
        hvedemel.setPersoner(personer);

        Ingredien natron = new Ingredien( "natron", 0.08, "tsk",0.08 * 5,0.08 * 5 * 3.43);
        natron.setPersoner(personer);

        Ingredien sukker = new Ingredien( "sukker", 25.0, "gram", 25.0, 25.0 * 4);
        sukker.setPersoner(personer);

        Ingredien bagepulver = new Ingredien( "bagepulver", 0.08, "tsk", 0.08 * 5, 0.09  * 5 * 1.75);
        bagepulver.setPersoner(personer);

        Ingredien salt = new Ingredien( "salt", 0.08, "knsp", 0.08 * 5, 0);
        salt.setPersoner(personer);

        Ingredien æg = new Ingredien( "æg", 0.17, "gram", 0.17, 0.17 * 1.38);
        æg.setPersoner(personer);;

        Ingredien smør = new Ingredien("smør", 12.17, "gram", 12.17, 12.17 * 7.41);
        smør.setPersoner(personer);

        Ingredien vand = new Ingredien( "vand", 0.21, "dl", 0.21 * 100, 0);
        vand.setPersoner(personer);

        ingredienser = new Ingredien[]{kakao, hvedemel, natron, sukker, bagepulver, salt, smør, vand};
    }

    public static Ingredien[] getIngredienser() {
        return ingredienser;
    }

    public double beregnTotalVægt(){
        double totalVægt = 0;
        for (Ingredien beregnVægt : ingredienser){
            totalVægt += beregnVægt.beregnVægt();
        }
        return totalVægt;
    }

    public double beregnTotalKJ(){
        double totalKJ = 0;
        for (Ingredien beregnTotalKJ : ingredienser){
            totalKJ += beregnTotalKJ.beregnKiloJoule();
        }
        return totalKJ;
    }

}

