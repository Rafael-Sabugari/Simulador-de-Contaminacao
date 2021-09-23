
package projeto;
/**
 *Main
 *@author rafael
 *@version 1.0
 */
public class Projeto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mundo mapa = new Mundo();
        int cont=0;
        
        while(true){

            System.out.println("Legenda{ "+"\033[43m \033[0m doente  "+
                    "\033[44m \033[0m saudavel sem vacina  "+
                    "\033[45m \033[0m saudavel com vacina sem virus  "+
                    "\033[42m \033[0m saudavel com vacina com virus  }"+
                    "Tempo: "+cont);
            
            
            mapa.desenhaMundo();
            mapa.atualizaMundo();
            try{
                Thread.sleep(900);
            }
            catch(Exception e){
                e.printStackTrace();
            }

            cont++;
        }
    }
    
}
