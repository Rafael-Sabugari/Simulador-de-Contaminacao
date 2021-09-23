
package projeto;

/**
 *Simula uma pessoa doente
 *@author rafael
 */
public class PessoaDoente extends Pessoa implements IMovable{
    boolean virus;
    int x,y,cor;
    int tempo;
    public PessoaDoente(int x, int y, int cor,boolean virus,int hospi) {
        super(x, y, cor,hospi);
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.tempo = 0;
        this.virus = virus;
        
        
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

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
}
