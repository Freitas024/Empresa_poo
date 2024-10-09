public class App {
    public static void main(String[] args)  {

        Pessoa P = new Pessoa("SeuNome", "00000000000", "SeuGenero", 21);

        System.out.println("Classe Pessoa");
        System.out.println("Nome: " + P.getName());
        System.out.println("CPF: " + P.getCpf());
        System.out.println("Genero: " + P.getGenero());
        System.out.println("Idade: " + P.getIdade());

        System.out.println("===========================================================");

        Funcionarios F = new Funcionarios("Marinho", "5462465813258", "Masculino", 24, 2000, 10000, "31", "Matelo, Chave Inglesa");

        System.out.println("Classe Funcionario");
        System.out.println("Nome: " + F.getName());
        System.out.println("CPF: " + F.getCpf());
        System.out.println("Genero: " + F.getGenero());
        System.out.println("Idade: " + F.getIdade());
        
        F.estadoAtual();
        
        System.out.println("===========================================================");

        Produtos Pro = new Produtos("156", "Movel", 1500, "Marinha");

        Pro.estadoAtual();

        System.out.println("===========================================================");
        
        Empresa empresa = new Empresa("Todos", "Todos que você imaginar", "Varias");
        
        empresa.estadoatual();
        
        System.out.println("===========================================================");
    }
}
