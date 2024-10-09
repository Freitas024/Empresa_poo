public class Funcionarios extends Pessoa {
    private int DataEntrada; 
    private float salario;
    public String itensproduzidos;
    private String ferramentas;

    public Funcionarios(String name, String cpf, String genero, int idade, int DataEntrada, float salario,
            String itensproduzidos, String ferramentas) {
        super(name, cpf, genero, idade);
        this.DataEntrada = DataEntrada;
        this.salario = salario;
        this.itensproduzidos = itensproduzidos;
        this.ferramentas = ferramentas;
    }

    //Metodos
    @override
    public void estadoAtual() {
        System.out.println("Data de ingresso: " + this.getDataEntrada());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Itens Produzidos: " + this.getItensproduzidos());
        System.out.println("Ferramentas: " +this.getFerramentas());
    }
    
    //GETTERS E SETTERS
    public int getDataEntrada() {
        return DataEntrada;
    }
    public void setDataEntrada(int data) {
        this.DataEntrada = data;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getItensproduzidos() {
        return itensproduzidos;
    }
    public void setItensproduzidos(String itensproduzidos) {
        this.itensproduzidos = itensproduzidos;
    }
    public String getFerramentas() {
        return ferramentas;
    }
    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }
    

}
