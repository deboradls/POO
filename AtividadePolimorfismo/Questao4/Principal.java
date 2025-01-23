import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int esc=0;     
        Scanner scan = new Scanner(System.in);   
        ArrayList<Produto> produtos = new ArrayList<Produto>() ;

        do{
            menu();
            esc = scan.nextInt();
            switch (esc) {
                case 1:
                    produtos.add( cadastrarProduto() ); 
                    break;
                case 2:
                    listarProdutos(produtos);
                    break;  
                case 3:
                    produtos.add( cadastrarLivro() );   
                case 4:
                    listarLivros(produtos);
                default:
                    break;
            }     
        }while(esc!=0);
        
    }

    public static void menu(){
        System.out.println("[1] Cadastrar produto");        
        System.out.println("[2] Listar produtos");   
        System.out.println("[3] Cadastrar livro");   
        System.out.println("[4] Listar livros");   
        System.out.println("[5] Imprimir tudo");   
        System.out.println("[0] Sair");   
    }
 
    public static Produto cadastrarProduto(){
        String nome ;
        String descricao ;
        double preco ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Descricao: ");
        descricao = scan.nextLine();
        System.out.print("Preco: ");
        preco = scan.nextDouble();
        
        Produto p = new Produto(nome, descricao, preco);
        return p;        
    }

    public static void listarProdutos(ArrayList<Produto> produtos){
        int c=0;
        System.out.println(">>> Lista de Produtos <<<");
        for(Produto p : produtos ){
            System.out.printf("%dº ", ++c);
            System.out.println( p.toString() );
        }
    }

    public static Livro cadastrarLivro(){
        String nome ;
        String descricao ;
        double preco ;
        String autores;
        String isbn;
        String editora; 

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Descricao: ");
        descricao = scan.nextLine();
        System.out.print("Preco: ");
        preco = scan.nextDouble();
        scan.nextLine();
        System.out.print("Autores: ");
        autores = scan.nextLine();
        System.out.print("ISBN: ");
        isbn = scan.nextLine();
        System.out.print("Editora: ");
        editora = scan.nextLine();
        
        Livro livro = new Livro(nome, descricao, preco, autores, isbn, editora);
        return livro;        
    }

    public static void listarLivros(ArrayList<Produto> produtos) {
        int c=0;
        Livro l = new Livro("", "", 0, "", "", "");
        System.out.println(">>> Lista de Livros <<<");
        for(Produto p: produtos){
            if(p.getClass() == l.getClass()){
                System.out.printf("%dº ", ++c);
                System.out.println(p.toString());
            }
        }
    }
}