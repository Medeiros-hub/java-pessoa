public class Pessoa {
    public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;   
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome();
    }
}