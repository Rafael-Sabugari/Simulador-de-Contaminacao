
package projeto;

/**
 *Simula pessoa
 *@author rafael
 */
abstract class Pessoa {
    private int x,y,cor,hospi;
    
    public Pessoa(int x, int y, int cor,int hospi) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.hospi = hospi;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getHospi() {
        return hospi;
    }

    public void setHospi(int hospi) {
        this.hospi = hospi;
    }

    
    
}
