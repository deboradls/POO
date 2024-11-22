public class Trem {
    Vagao vagoes[];
    Locomotiva locomotiva; 

    Trem (Locomotiva locomotiva, Vagao... vagoes ){
        this.locomotiva = locomotiva;

        //tem forma melhor de ser feito isso??
        if(vagoes.length>149){
            System.out.println("Quantidade de vagoes em excesso. \nSerao consideados apenas 150, incluindo a locomotiva.");
            for(int c=0; c<149; c++){ 
                this.vagoes[c] = vagoes[c];
            }
        }else{
            this.vagoes = vagoes; 
        }
        
    }

}

