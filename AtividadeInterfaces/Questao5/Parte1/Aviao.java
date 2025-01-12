public class Aviao extends TransporteAereo implements Motorizado{
    private int numeroMotores;
    
    public boolean estaParado(){
        if(velocidadeAtual==0){
            return true;
        }
        return false;
    }

    public void subir(int metros){
        altitudeAtual += metros;        
    }
    public void descer(int metros){
        altitudeAtual -= metros;        
    }
    public void curvar(float angulo){  

    }
    public void abastecer(int numlitros){  

    }
    public void ligarMotor(){  
            
    }

}
