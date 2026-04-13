package model;


public class Filme {
    
    private String nome; 
    private int genero;  
    private int lancamento;  

    public Filme(String nome, String genero, int lancamento) {
        this.nome = nome;
        this.genero = genero;
        this.lancamento = lancamento;
    }

    public Filme() {
        this.nome = "Filme Padrão";
        this.genero = "Aventura";
        this.lancamento = 120;
    }

    public void exibirDetalhes() {
        System.out.println("Filme: " + nome + "| Gênero: " + genero + "| Lançamento: " + lancamento );
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }
  

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", genero=" + genero + ", lancamento=" + lancamento + "]";
    }
}
