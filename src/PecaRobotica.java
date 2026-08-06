public class PecaRobotica {
    private String nome;
    private Double voltagemMaxima;

    public PecaRobotica(String tipo,Double voltagemMaxima){
        this.nome = tipo;
        this.voltagemMaxima = voltagemMaxima;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String valor) {
        this.nome = valor;
    }

    public Double getVoltagemMaxima() {
        return this.voltagemMaxima;
    }

    public void setVoltagemMaxima(Double valor) {
        this.voltagemMaxima = valor;
    }

    @Override
    public String toString() {
        return  "Tipo:"+this.nome +"\n"+
                "Voltagem:"+this.voltagemMaxima +"\n";
    }
}
