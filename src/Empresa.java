public class Empresa {
    private String funcionarios;
    private String materiais;
    private String ferramentas;

    public Empresa(String funcionarios, String materiais, String ferramentas) {
        this.funcionarios = funcionarios;
        this.materiais = materiais;
        this.ferramentas = ferramentas;
    }
    
    public void estadoatual() {
        System.out.println("Funcionários da empresa: " + this.getFuncionarios());
        System.out.println("Materiais disponiveis: " + this.getMateriais());
        System.out.println("Ferramentas: " + this.getFerramentas());
    }

    public String getFuncionarios() {
        return funcionarios;
    }
    public void setFuncioanrios(String funcionarios) {
        this.funcionarios = funcionarios;
    }
    public String getMateriais() {
        return materiais;
    }
    public void setMateriais(String materiais) {
        this.materiais = materiais;
    }
    public String getFerramentas() {
        return ferramentas;
    }
    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }

    
}
