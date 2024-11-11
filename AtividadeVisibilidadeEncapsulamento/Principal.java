public class Principal {
    public static void main(String[] args) {
        Funcionario f1, f2, f3;
        f1 = new Funcionario();
        f2 = new Funcionario();
        f3 = new Funcionario();

        f1.setNome("Lucas");
        f1.setSalario(2971.56);
        f1.setDataAdmissao( new Data(12, 2, 2013) );

        f2.setNome("Débora");
        f2.setSalario(917.53);
        f2.setDataAdmissao( new Data(5, 3, 2016) );

        f3.setNome("Igor");
        f3.setSalario(1902.87);
        f3.setDataAdmissao( new Data(15, 3, 2001) );

        System.out.println( f2.getIdentificador() );

    }
}
