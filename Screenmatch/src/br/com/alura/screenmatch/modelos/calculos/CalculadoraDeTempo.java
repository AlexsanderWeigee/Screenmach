package br.com.alura.screenmatch.modelos.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo.getNome() + ".");
        this.tempoTotal += titulo.getDuracamEmMinutos();
    }
}
