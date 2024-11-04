class Fatorial{
    public static void main(String[] args) {
        int fat = 1;
        int qtd = 10;

        for(int c=1; c<=qtd; c++){
            fat *= c;            
            System.out.printf("%d! = %d\n", c, fat);
        }
    }
    
}