public class Clientes extends Pessoa {
    // atributos
    private int cnpj;
    private String compras;
    private float saldo;

    public Clientes(String name, String cpf, String genero, int idade, int cnpj, String compras, float saldo) {
        super(name, cpf, genero, idade);
        this.cnpj = cnpj;
        this.compras = compras;
        this.saldo = saldo;
    }

    //método para mostrar o estado atual
    @override
    public void estadoAtual() {
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Itens comprados: " + this.getCompras());
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) { //para verificação necessitaria a criação de uma lista
        this.cnpj = cnpj;
    }
    public String getCompras() { //registro de compras realizadas
        return compras;
    }
    public void setCompras(String compras) {
        this.compras = compras;
    }
    
    public float getSaldo() { //caso o sistema tivesse interação com saldo 
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    //métodos especiais
    //Caso fosse adicionar o método de realizar compra, deveria verificar se houve o pagamento do produto, para depois extrair da 
    // lista o produto registrado e traze-lá para o banco de clientes.
}