import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KitRobotica k1 = new KitRobotica();

        PecaRobotica p1 = new PecaRobotica("LED", 5.5);
        PecaRobotica p2 = new PecaRobotica("Resistor",10.5);
        PecaRobotica p3 = new PecaRobotica("Jumpers",4.5);
        PecaRobotica p4 = new PecaRobotica("Monitor",6.5);
        PecaRobotica p5 = new PecaRobotica("LED", 5.5);


        k1.inserirPeca(p1);
        k1.inserirPeca(p2);
        k1.inserirPeca(p3);
        k1.inserirPeca(p4);
        k1.inserirPeca(p5);

        k1.varrerLista();

        System.out.print("Digite uma voltagem limite:");
        double limite = sc.nextDouble();
        System.out.println(k1.verificarLimite(limite));
        sc.nextLine();
        System.out.println("Digite um tipo específico de pecaEspecifica:");
        String pecaEspecifica = sc.nextLine();

        ArrayList<PecaRobotica> pecasEspecificas = k1.pegarPecasEspecificas(pecaEspecifica);

        for (int i = 0;i<= pecasEspecificas.size()-1;i++){
            System.out.println(pecasEspecificas.get(i));
        }

    }
}