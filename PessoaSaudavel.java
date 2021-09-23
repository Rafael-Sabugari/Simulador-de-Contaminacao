
package projeto;

/**
 *Simula uma pessoa saudavel
 *@author rafael
 */
public class PessoaSaudavel extends Pessoa implements IMovable {
    boolean vacinada;
    boolean virus;
    int x,y,cor;
    int tempo;
    public PessoaSaudavel( int x, int y, int cor,boolean vacinada, boolean virus,int hospi) {
        super(x, y, cor,hospi);
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.vacinada = vacinada;
        this.virus = virus;
        this.tempo = 0;
    }
    
    
    
    @Override
    public int mover(int num){
         if(num == 0){
         
         return 1;
        }
        else if(num == 1){
         
         return -1;
        }
        else if(num == 2){
            
            return +1;
        }
        else{
        
        return -1;
        }       
    }

    public boolean isVirus() {
        return virus;
    }

    public void setVirus(boolean virus) {
        this.virus = virus;
    }

    

    public void setVacinada(boolean vacinada) {
        this.vacinada = vacinada;
    }
    public boolean isVacinada() {
        return vacinada;
    }
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
}
