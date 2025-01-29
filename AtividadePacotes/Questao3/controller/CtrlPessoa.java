package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa {
    public void salvarPessoa(Pessoa pessoa) throws Exception{
        if(pessoa.getNome() == "" || pessoa.getNome() == null){
            throw new Exception();
        }else{
            PessoaDAO pDAO = new PessoaDAO();
            pDAO.salvarPessoa(pessoa);
        }
    }
}
