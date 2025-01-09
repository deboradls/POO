public class Data {
    int dia, mes, ano;
    // Data(int dia, int mes, int ano){
    //     this.dia = dia;
    //     this.mes = mes;
    //     this.ano = ano;
    // }
    Data(int dia, int mes, int ano) throws DataException{
        if( diaValido(dia, mes) && mesValido(mes) && 1<=ano ){
            this.ano = ano;        
            this.mes = mes;
            this.dia = dia;
        }else{
            throw new DataException( String.format("%2d/%2d/%4d", dia, mes, ano) );
        }
    }    

    private boolean diaValido(int dia, int mes){
        if(dia<=0){
            return false;
        }
        if(dia<=28 && mes==2 ){
            return true;
        }
        if(dia<=30 && (mes==4 || mes==6 || mes==9 || mes==11)){
            return true;
        }
        if(dia<=31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)){
            return true;
        }
        return false;
    }
    private boolean mesValido(int mes){
        if(mes<1 || 12<mes){
            return false;
        }
        return true;
    }
    public String toString(){
        return String.format("%2d/%2d/%4d", this.dia, this.mes, this.ano);
    }
}