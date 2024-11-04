class OperadorTernario{
    public static void main(String[] args) {
        int x=80;
        int y;

        while(x>1){
            y = (x%2==0) ? x/2 : 3*x + 1;
            System.out.println( "Y: " + y );
            x = y;
        }
    }
}