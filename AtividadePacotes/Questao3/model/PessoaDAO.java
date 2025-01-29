package model;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class PessoaDAO {

    public void salvarPessoa( Pessoa p )  {
        
        try(FileWriter fw = new FileWriter("nomes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(p.getNome());
            
        } catch (IOException e) {
            System.out.println("Erro na escrita");
        }
    }
}
