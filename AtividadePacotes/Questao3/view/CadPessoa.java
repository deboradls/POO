package view;

import java.util.Scanner;

import controller.CtrlPessoa;
import model.Pessoa;

public class CadPessoa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();
        
        Pessoa p =  new Pessoa(nome);

        CtrlPessoa cp = new CtrlPessoa();
        try{
            cp.salvarPessoa(p);
        }catch(Exception e){
            System.out.println("Operacao invalida. Nome nulo ou vazio");
        }
    }

}
