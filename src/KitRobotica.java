import java.util.ArrayList;

public class KitRobotica {
    private ArrayList<PecaRobotica> pecas = new ArrayList<>();

    public void inserirPeca(PecaRobotica p){
        this.pecas.add(p);
    }

    public void varrerLista(){

        for(int i = 0;i<=pecas.size()-1;i++){
            System.out.println(pecas.get(i));
        }
    }

    public Integer verificarLimite(Double limiteEstabelecido){
        Integer quantidadeTotal = 0;

        for(int i = 0;i <= pecas.size()-1;i++){

            PecaRobotica p = pecas.get(i);

            if (p.getVoltagemMaxima() <= limiteEstabelecido){

                quantidadeTotal++;
            }
        }
        return quantidadeTotal;
    }

    public ArrayList<PecaRobotica> pegarPecasEspecificas (String pecaEspecifica){
        ArrayList<PecaRobotica> pecasEspecificas = new ArrayList<>();

        for(int i = 0; i<=pecas.size()-1; i++){

            PecaRobotica p = pecas.get(i);

            if (p.getNome().equalsIgnoreCase(pecaEspecifica)){
                pecasEspecificas.add(p);
            }
        }
        return pecasEspecificas;
    }
}
