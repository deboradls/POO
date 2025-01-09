public class Execucao {
    public static void main(String[] args) {
        try{
            Data d1 = new Data(22, 02, 1999);
            System.out.println(d1);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Data d1 = new Data(29, 02, 1999);
            System.out.println(d1);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Data d1 = new Data(12, 2, 0);
            System.out.println(d1);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Data d1 = new Data(-1, 2, 1999);
            System.out.println(d1);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Data d1 = new Data(12, 13,1999);
            System.out.println(d1);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
