
package projeto;

import java.util.ArrayList;
import java.util.Random;
/**
 *Representacao do mundo
 *@author rafael
 */
public class Mundo {
    
    ArrayList <Pessoa> pessoas = new ArrayList<>();
    Pessoa p;
    PessoaSaudavel pe;
    Hospital hospital1= new Hospital(41,4,8);
    Hospital hospital2= new Hospital(41,4,45);
    Hospital hospital3= new Hospital(41,19,23);
    
    Random random = new Random();
    int i=0,j=1,aux, aux2 = 99;
    public Mundo() {
       /*gerando as pessoas*/ 
        while(i<102){
            int intervalo_randomico = random.nextInt(28)+1;
            int intervalo_randomico2 = random.nextInt(59)+1;
            
            if(i>99){
                p = new PessoaDoente(intervalo_randomico,intervalo_randomico2,43,true,1);
                pessoas.add(p);
            }
            else{
                p = new PessoaSaudavel(intervalo_randomico,intervalo_randomico2,44,false,false,0);
                pessoas.add(p);
            }
            i++;
        }
        
        
    }
    
    private int[][] mapa = new int[][]{
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,6,7,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,7,6,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,7,7,7,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,7,7,7,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,6,7,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,7,6,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,7,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,7,7,7,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,7,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
   
    };
    public void atualizaMundo(){
        /*verificação do tempo */
        for(int i = 0; i<pessoas.size();i++){
            if(pessoas.get(i) instanceof PessoaDoente){
                if(((PessoaDoente)pessoas.get(i)).getTempo() == 30){
                    if(pessoas.get(i).getCor()==43){
                        mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 0;
                        pessoas.get(i).setX(29);
                        mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 1;
                        pessoas.remove(i);
                   }
                   else if(pessoas.get(i).getCor()==42){
                      pessoas.get(i).setCor(45);
                   }
                    
                }
                else if(pessoas.get(i).getCor()==44){
                   ((PessoaDoente)pessoas.get(i)).setTempo(0);
                }
                else if(pessoas.get(i).getCor()==45){
                   ((PessoaDoente)pessoas.get(i)).setTempo(0);
                }
                
                
                else if(pessoas.get(i).getCor()==43 || pessoas.get(i).getCor()==42){
                   ((PessoaDoente)pessoas.get(i)).setTempo(((PessoaDoente)pessoas.get(i)).getTempo()+1);
                }
            }
            else{
                if(((PessoaSaudavel)pessoas.get(i)).getTempo() == 30){
                    if(pessoas.get(i).getCor()==43){
                        mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 0;
                        pessoas.get(i).setX(29);
                        mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 1;
                        pessoas.remove(i);
                        
                   }
                   else if(pessoas.get(i).getCor()==42){
                      pessoas.get(i).setCor(45);
                   }
                    
                }
                else if(pessoas.get(i).getCor()==44){
                   ((PessoaSaudavel)pessoas.get(i)).setTempo(0);
                }
                else if(pessoas.get(i).getCor()==45){
                   ((PessoaSaudavel)pessoas.get(i)).setTempo(0);
                }
                
                
                else if(pessoas.get(i).getCor()==43 || pessoas.get(i).getCor()==42){
                   ((PessoaSaudavel)pessoas.get(i)).setTempo(((PessoaSaudavel)pessoas.get(i)).getTempo()+1);
                }
            }
            
            
        }       
            
        //verificação de proximidade
        for(int i = 0;i<pessoas.size();i++){
            for( j = 1; j<pessoas.size();j++){
            if(pessoas.get(i).getX() == pessoas.get(j).getX()+1 && pessoas.get(i).getY() == pessoas.get(j).getY()){
               if(pessoas.get(i).getCor() == 44 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 ) ){
                       pessoas.get(i).setCor(43);
                       pessoas.get(i).setHospi(1);
                       
                    }
                    else if(pessoas.get(i).getCor() == 45 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                        pessoas.get(i).setCor(42);
                       
                    } 
            }
            else if(pessoas.get(i).getX() == pessoas.get(j).getX()-1 && pessoas.get(i).getY() == pessoas.get(j).getY()){
                if(pessoas.get(i).getCor() == 44 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 ) ){
                       pessoas.get(i).setCor(43);
                       pessoas.get(i).setHospi(1);
                        
                    }
                    else if(pessoas.get(i).getCor() == 45 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                        pessoas.get(i).setCor(42);
                       
                    }
            }
            else if(pessoas.get(i).getY() == pessoas.get(j).getY()-1 && pessoas.get(i).getX() == pessoas.get(j).getX()){
                if(pessoas.get(i).getCor() == 44 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                       pessoas.get(i).setCor(43);
                       pessoas.get(i).setHospi(1);
                    }
                    else if(pessoas.get(i).getCor() == 45 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                        pessoas.get(i).setCor(42);
                    }
            }
            else if(pessoas.get(i).getY() == pessoas.get(j).getY()+1 && pessoas.get(i).getX() == pessoas.get(j).getX()){
                if(pessoas.get(i).getCor() == 44 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 ) ){
                       pessoas.get(i).setCor(43);
                       pessoas.get(i).setHospi(1);
                       
                    }
                    else if(pessoas.get(i).getCor() == 45 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                        pessoas.get(i).setCor(42);
                       
                    }
            }
            else if(pessoas.get(i).getY() == pessoas.get(j).getY()   &&  pessoas.get(i).getX() == pessoas.get(j).getX()){
                if(pessoas.get(i).getCor() == 44 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                       pessoas.get(i).setCor(43);
                       pessoas.get(i).setHospi(1);
                       
                    }
                    else if(pessoas.get(i).getCor() == 45 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                        pessoas.get(i).setCor(42);
                       
                    }
            }
            else if(pessoas.get(i).getX() == pessoas.get(j).getX()   && pessoas.get(i).getY() == pessoas.get(j).getY()){
                if(pessoas.get(i).getCor() == 44 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 ) ){
                       pessoas.get(i).setCor(43);
                       pessoas.get(i).setHospi(1);
                       
                    }
                    else if(pessoas.get(i).getCor() == 45 && (pessoas.get(j).getCor() == 43 || pessoas.get(j).getCor() == 42 )){
                        pessoas.get(i).setCor(42);
                       
                    }
        }
            }
         j=1;
        }
        //movimentar as pessoas
        for(int i = 0; i<pessoas.size();){
            int intervalo_randomico4 = random.nextInt(4);
            
            if(pessoas.get(i) instanceof PessoaDoente){
                
                // x = x + 1
                if(intervalo_randomico4 == 0){
                    if(pessoas.get(i).getX() == 29){
                        aux = (pessoas.get(i).getX());
                        aux = aux - 28; 
                        pessoas.get(i).setX(aux);
                        mapa[29][(pessoas.get(i).getY())] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getX()>5 && pessoas.get(i).getX()<9 || pessoas.get(i).getX()>20 && pessoas.get(i).getX()<24 ) && (pessoas.get(i).getY() == 11 || pessoas.get(i).getY() == 45 || pessoas.get(i).getY() == 26 ) ){
                           pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                           mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 7; 
                        }
                        else if((pessoas.get(i).getY()==10 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==44 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==25 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==12 && pessoas.get(i).getX()==7)|| (pessoas.get(i).getY()==46 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==27 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 7;
                        }
                        else{
                            pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 6;
                        }
                    }
                    else if(pessoas.get(i).getY() == 59 || pessoas.get(i).getY() == 0 || pessoas.get(i).getX() == 0 ){
                       pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                       mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 1; 
                    }
                    else{
                        pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                        mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 0;
                    }    
                }
                
                // x = x - 1
                else if(intervalo_randomico4 == 1){
                    if(pessoas.get(i).getX() == 0){
                        aux = (pessoas.get(i).getX());
                        aux = aux + 28;
                        pessoas.get(i).setX(aux);
                        mapa[0][(pessoas.get(i).getY())] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getX()>5 && pessoas.get(i).getX()<9 || pessoas.get(i).getX()>20 && pessoas.get(i).getX()<24 ) && (pessoas.get(i).getY() == 11 || pessoas.get(i).getY() == 45 || pessoas.get(i).getY() == 26 ) ){
                           pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                           mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 7; 
                        }
                        else if((pessoas.get(i).getY()==10 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==44 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==25 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==12 && pessoas.get(i).getX()==7)|| (pessoas.get(i).getY()==46 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==27 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 7;
                        }
                        else{
                            pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 6;
                        }
                    }
                    else if(pessoas.get(i).getY() == 59 || pessoas.get(i).getY() == 0 || pessoas.get(i).getX() == 0 || pessoas.get(i).getX() == 29){
                       pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                       mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 1; 
                    }
                    else{
                        pessoas.get(i).setX((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                        mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 0;
                    }
                }
                // y = y + 1
                else if(intervalo_randomico4 == 2){ 
                  if(pessoas.get(i).getY() == 59){
                        aux = (pessoas.get(i).getY());
                        aux = aux - 58;
                        pessoas.get(i).setY(aux);
                        mapa[pessoas.get(i).getX()][59] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getY()>9 && pessoas.get(i).getY()<13 || pessoas.get(i).getY()>24 && pessoas.get(i).getY()<28 || pessoas.get(i).getY()>43 && pessoas.get(i).getY()<47 ) && (pessoas.get(i).getX() == 7 || pessoas.get(i).getX() == 22 ) ){
                           pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                           mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 7; 
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==21)){
                            pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==23)){
                            pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 7;
                        }
                        else{
                            pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 6;
                        }
                    }
                    else if(pessoas.get(i).getX() == 29 || pessoas.get(i).getX() == 0 || pessoas.get(i).getY() == 0 ){
                       pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                       mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 1; 
                    }
                    else{
                        pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                        mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 0;
                    }
                }
                // y = y - 1
                else if(intervalo_randomico4 == 3){
                  
                  if(pessoas.get(i).getY() == 0){
                        aux = (pessoas.get(i).getY());
                        aux = aux + 58; 
                        pessoas.get(i).setY(aux);
                        mapa[pessoas.get(i).getX()][0] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getY()>9 && pessoas.get(i).getY()<13 || pessoas.get(i).getY()>24 && pessoas.get(i).getY()<28 || pessoas.get(i).getY()>43 && pessoas.get(i).getY()<47 ) && (pessoas.get(i).getX() == 7 || pessoas.get(i).getX() == 22 ) ){
                           pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                           mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 7; 
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==21)){
                            pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==23)){
                            pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 7;
                        }
                        else{
                            pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 6;
                        }
                    }
                    else if(pessoas.get(i).getX() == 29 || pessoas.get(i).getX() == 0 || pessoas.get(i).getY() == 0 || pessoas.get(i).getY() == 59){
                       pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                       mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 1; 
                    }
                    else{
                        pessoas.get(i).setY((((PessoaDoente)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                        mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 0;
                    }
                }   
            
            }
        
        
            else{
                
                // x = x + 1
                if(intervalo_randomico4 == 0){
                    if(pessoas.get(i).getX() == 29){
                        aux = (pessoas.get(i).getX());
                        aux = aux - 28; 
                        pessoas.get(i).setX(aux);
                        mapa[29][(pessoas.get(i).getY())] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getX()>5 && pessoas.get(i).getX()<9 || pessoas.get(i).getX()>20 && pessoas.get(i).getX()<24 ) && (pessoas.get(i).getY() == 11 || pessoas.get(i).getY() == 45 || pessoas.get(i).getY() == 26 ) ){
                           pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                           mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 7; 
                        }
                        else if((pessoas.get(i).getY()==10 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==44 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==25 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==12 && pessoas.get(i).getX()==7)|| (pessoas.get(i).getY()==46 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==27 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 7;
                        }
                        else{
                            pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 6;
                        }
                    }
                    else if(pessoas.get(i).getY() == 59 || pessoas.get(i).getY() == 0 || pessoas.get(i).getX() == 0 ){
                       pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                       mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 1; 
                    }
                    else{
                        pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                        mapa[pessoas.get(i).getX()-1][(pessoas.get(i).getY())] = 0;
                    }    
                }
                
                // x = x - 1
                else if(intervalo_randomico4 == 1){
                    if(pessoas.get(i).getX() == 0){
                        aux = (pessoas.get(i).getX());
                        aux = aux + 28;
                        pessoas.get(i).setX(aux);
                        mapa[0][(pessoas.get(i).getY())] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getX()>5 && pessoas.get(i).getX()<9 || pessoas.get(i).getX()>20 && pessoas.get(i).getX()<24 ) && (pessoas.get(i).getY() == 11 || pessoas.get(i).getY() == 45 || pessoas.get(i).getY() == 26 ) ){
                           pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                           mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 7; 
                        }
                        else if((pessoas.get(i).getY()==10 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==44 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==25 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==12 && pessoas.get(i).getX()==7)|| (pessoas.get(i).getY()==46 && pessoas.get(i).getX()==7) || (pessoas.get(i).getY()==27 && pessoas.get(i).getX()==22)){
                            pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 7;
                        }
                        else{
                            pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                            mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 6;
                        }
                    }
                    else if(pessoas.get(i).getY() == 59 || pessoas.get(i).getY() == 0 || pessoas.get(i).getX() == 0 || pessoas.get(i).getX() == 29){
                       pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                       mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 1; 
                    }
                    else{
                        pessoas.get(i).setX((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getX());
                        mapa[pessoas.get(i).getX()+1][(pessoas.get(i).getY())] = 0;
                    }
                }
                // y = y + 1
                else if(intervalo_randomico4 == 2){ 
                  if(pessoas.get(i).getY() == 59){
                        aux = (pessoas.get(i).getY());
                        aux = aux - 58;
                        pessoas.get(i).setY(aux);
                        mapa[pessoas.get(i).getX()][59] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getY()>9 && pessoas.get(i).getY()<13 || pessoas.get(i).getY()>24 && pessoas.get(i).getY()<28 || pessoas.get(i).getY()>43 && pessoas.get(i).getY()<47 ) && (pessoas.get(i).getX() == 7 || pessoas.get(i).getX() == 22 ) ){
                           pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                           mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 7; 
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==21)){
                            pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==23)){
                            pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 7;
                        }
                        else{
                            pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 6;
                        }
                    }
                    else if(pessoas.get(i).getX() == 29 || pessoas.get(i).getX() == 0 || pessoas.get(i).getY() == 0 ){
                       pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                       mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 1; 
                    }
                    else{
                        pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                        mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())-1] = 0;
                    }
                }
                // y = y - 1
                else if(intervalo_randomico4 == 3){
                  
                  if(pessoas.get(i).getY() == 0){
                        aux = (pessoas.get(i).getY());
                        aux = aux + 58; 
                        pessoas.get(i).setY(aux);
                        mapa[pessoas.get(i).getX()][0] = 1;         
                    }
                    else if((pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11) || (pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26) || (pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11)){
                        if((pessoas.get(i).getY()>9 && pessoas.get(i).getY()<13 || pessoas.get(i).getY()>24 && pessoas.get(i).getY()<28 || pessoas.get(i).getY()>43 && pessoas.get(i).getY()<47 ) && (pessoas.get(i).getX() == 7 || pessoas.get(i).getX() == 22 ) ){
                           pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                           mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 7; 
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==6) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==21)){
                            pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 7;
                            
                        }
                        else if((pessoas.get(i).getY()==11 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==45 && pessoas.get(i).getX()==8) || (pessoas.get(i).getY()==26 && pessoas.get(i).getX()==23)){
                            pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 7;
                        }
                        else{
                            pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                            mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 6;
                        }
                    }
                    else if(pessoas.get(i).getX() == 29 || pessoas.get(i).getX() == 0 || pessoas.get(i).getY() == 0 || pessoas.get(i).getY() == 59){
                       pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                       mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 1; 
                    }
                    else{
                        pessoas.get(i).setY((((PessoaSaudavel)pessoas.get(i)).mover(intervalo_randomico4))+pessoas.get(i).getY());
                        mapa[pessoas.get(i).getX()][(pessoas.get(i).getY())+1] = 0;
                    }
                }   
               
                   
           }//fim da condição para pessoa saudavel
            //codições para quando a pessoa estiver no hospital
            if(pessoas.get(i).getCor() == 43){
                if(pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11){
                    pessoas.get(i).setCor(44);
                }
            
                else if(pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26){
                    pessoas.get(i).setCor(44);
                }
                else if(pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11){
                    pessoas.get(i).setCor(44);
                }
                
            }
            else if(pessoas.get(i).getCor() == 44){
                if(pessoas.get(i).getY()>14 && pessoas.get(i).getY()<42 && pessoas.get(i).getX()>-1 && pessoas.get(i).getX()<11){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>-1 && pessoas.get(i).getY()<60 && pessoas.get(i).getX()>-1 && pessoas.get(i).getX()<4){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>-1 && pessoas.get(i).getY()<8 && pessoas.get(i).getX()>-1 && pessoas.get(i).getX()<30){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>48 && pessoas.get(i).getY()<60 && pessoas.get(i).getX()>-1 && pessoas.get(i).getX()<30){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>-1 && pessoas.get(i).getY()<60 && pessoas.get(i).getX()>25 && pessoas.get(i).getX()<30){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>-1 && pessoas.get(i).getY()<60 && pessoas.get(i).getX()>10 && pessoas.get(i).getX()<19){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>-1 && pessoas.get(i).getY()<23 && pessoas.get(i).getX()>10 && pessoas.get(i).getX()<30){
                    pessoas.get(i).setHospi(0);
                }
                else if(pessoas.get(i).getY()>29 && pessoas.get(i).getY()<60 && pessoas.get(i).getX()>10 && pessoas.get(i).getX()<30){
                    pessoas.get(i).setHospi(0);
                }
                
                
                
                
                
                
                if(pessoas.get(i).getHospi() == 0){
                    if(pessoas.get(i).getY()>7 && pessoas.get(i).getY()<15 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11){
                        pessoas.get(i).setCor(45);  
                    }
                    else if(pessoas.get(i).getY()>22 && pessoas.get(i).getY()<30 && pessoas.get(i).getX()>18 && pessoas.get(i).getX()<26){
                        pessoas.get(i).setCor(45);
                    }
                    else if(pessoas.get(i).getY()>41 && pessoas.get(i).getY()<49 && pessoas.get(i).getX()>3 && pessoas.get(i).getX()<11){
                        pessoas.get(i).setCor(45);
                    }
                }
            
            }
            
            //transforma o item no mapa em um numero relacionado a cor da pessoa    
            if(pessoas.get(i).getCor() == 44){
               mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 3; 
            }
            else if(pessoas.get(i).getCor() == 43){
               mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 2; 
            }
            else if(pessoas.get(i).getCor()==45){
               mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 4; 
            }
                
            else if(pessoas.get(i).getCor()==42){
               mapa[pessoas.get(i).getX()][pessoas.get(i).getY()] = 5; 
            }
          
         i++; 
         
        }
      //itens para printar no terminal   
      int cont_pessoaSaudavel=0, cont_pessoaDoente=0;
        for(int i = 0; i<pessoas.size();i++){
              if(pessoas.get(i).getCor() == 44 || pessoas.get(i).getCor() == 45 || pessoas.get(i).getCor() == 42 ){
                 cont_pessoaSaudavel = cont_pessoaSaudavel + 1; 
              }
              else if(pessoas.get(i).getCor() == 43){
                  cont_pessoaDoente = cont_pessoaDoente + 1;
              }
        }
        System.out.println("Pessoas Doentes: "+cont_pessoaDoente+" Pessoas Saudaveis: "+ cont_pessoaSaudavel+ " Pessoas Vivas: "+(cont_pessoaDoente+cont_pessoaSaudavel) );   
    }
    public void desenhaMundo(){
         for(int i = 0; i<mapa.length;i++ ){
            for(int j = 0; j<mapa[i].length;j++){
                
                switch(mapa[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:/*borda*/
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2: /* pessoa doente*/
                        System.out.print("\033[43m \033[0m");
                        break;
                    case 3:/*pessoa saudavel sem vacina*/
                        System.out.print("\033[44m \033[0m");
                        break;
                    case 4:/*pessoa saudavel com vacina sem virus*/
                        System.out.print("\033[45m \033[0m");
                        break;
                    case 5:/*pessoa saudavel com vacina com virus*/
                        System.out.print("\033[42m \033[0m");
                        break;
                    case 6:/*borda-hospital*/
                        System.out.print("\033[41m \033[0m");
                        break;
                    case 7:/*cruz-hospital*/
                        System.out.print("\033[47m \033[0m");
                        break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }
    
}
