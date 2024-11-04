class Main{
    public static void main(String[] args) {
        int n=4;

        for(int c=1; c<=n; c++){
            for(int i=1; i<=c; i++){
                System.out.printf("%d ", c*i );
            }
            System.out.println();
        }
        
    }
}