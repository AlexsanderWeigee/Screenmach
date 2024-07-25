package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int eposodioPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEposodioPorTemporada() {
        return eposodioPorTemporada;
    }

    public void setEposodioPorTemporada(int eposodioPorTemporada) {
        this.eposodioPorTemporada = eposodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracamEmMinutos() {
        return temporadas * eposodioPorTemporada * minutosPorEpisodio;

    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
