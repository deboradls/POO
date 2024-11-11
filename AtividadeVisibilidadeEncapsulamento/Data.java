public class Data {
    private int dia;
    private int mes;
    private int ano;
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data getData(){
        return new Data(dia, mes, ano);
    }

    public void setData(Data novaData){
        this.dia = novaData.dia;
        this.mes = novaData.mes;
        this.ano = novaData.ano;
    }

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }    

    public String getDataFormatada(){
        return String.format("%2d/%2d/%4d", this.dia, this.mes, this.ano);
    }
}
