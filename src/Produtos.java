public class Produtos {
    // atributos
    private String id;
    public String categoria;
    public float preco;
    private String produtor;

    public Produtos(String id, String categoria, float preco, String produtor) {
        this.id = id;
        this.categoria = categoria;
        this.preco = preco;
        this.produtor = produtor;
    }

    // propriedades do produto
    public void estadoAtual() {
        System.out.println("id: " + this.getId());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("preço: " + this.getPreco());
        System.out.println("Produtor : " + this.getProdutor());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) { // identificador de cada produto
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getProdutor() { // espécie de ''gota d'agua'' para saber quem produziu, a fim de registrar a produção dos funcionários
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
    // métodos especiais

}
