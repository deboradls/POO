public class DataException extends Exception{
    String dataInvalida;

    DataException(String dataInvalida) throws DataException{
        this.dataInvalida = dataInvalida;
    }
}
