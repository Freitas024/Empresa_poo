public class Pessoa {
    private String Name;
    private String Cpf;
    private String Genero;
    private int Idade;

    public Pessoa(String name, String cpf, String genero, int idade) {
        Name = name;
        Cpf = cpf;
        Genero = genero;
        Idade = idade;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf= cpf;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public void estadoAtual() {
        System.out.println("sou pessoa");
    }

    
}
