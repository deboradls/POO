public class Livro extends Produto {
    private String autores;
    private String isbn;
    private String editora; 

    Livro(String nome, String descricao, double preco, String autores, String isbn, String editora){
        super(nome, descricao, preco);
        this.autores = autores;
        this.isbn = isbn;
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    @Override
    public void equals() {
        super.equals();
    }
    @Override
    public String toString() {
        return "Livro: "+ getNome()+", "+ getDescricao()+"\nPreço: R$"+getPreco()+"\nAutores: "+this.autores+"\nISBN: "+this.isbn+"\nEditora:"+this.editora;
    }


}
