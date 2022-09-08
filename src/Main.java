import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    int bredde = 50;
    public static void setAntal(int personer) {
    }

    public static void main(String[] args) {
        Main Program = new Main();
        velkommen();
        Program.start();

    }

    private static void velkommen() {
        System.out.printf("\u001b[32m%n", "velkommen til din kage omregner");
        System.out.println("skriv hvor mange personer kagen er til");
        System.out.println("----------------------------------------");
    }

    public void start(){
        Ingredien[] ingredienser;
        Opskrift opskrift = new Opskrift();


        ingredienser = Opskrift.getIngredienser();
        //TODO: angive antal personer og giv det til Opksrift class
        int personer = scanner.nextInt();
        opskrift.setAntal(personer);

        System.out.println("----------------------------------------");

        String længde = "\u257e";
        System.out.printf("%n\u250d" + længde.repeat(bredde) + "\u2511");
        System.out.printf("%n\u2502%-34s%-16s\u2502", "ingredients", "mængde MåleEnhed");
        System.out.printf("%n\u251d" + længde.repeat(bredde) + "\u2525");
        for (Ingredien data : ingredienser) {
            System.out.printf("%n\u2502%-34s%7.7s%9s\u2502",data.getNavn(), data.beregnVægt(), data.getMåleEnhed());

        }
        System.out.printf("%n\u2514" + længde.repeat(bredde) + "\u2518");


        System.out.printf("%n\u250d" + længde.repeat(bredde) + "\u2511");
        System.out.printf("%n\u2502%-34s%-10.7s%6s\u2502", "dit total vægt er ", opskrift.beregnTotalVægt(), "gram");
        System.out.printf("%n\u2502%-34s%-10.7s%6s\u2502", "dit total kj er ", opskrift.beregnTotalKJ(), "kj");
        System.out.printf("%n\u2502%-34s%-10.7s%6s\u2502", "dit gennemsnitlig kj er ", opskrift.beregnTotalKJ() / personer, "kj");
        System.out.printf("%n\u2514" + længde.repeat(bredde) + "\u2518");

    }

}