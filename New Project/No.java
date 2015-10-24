public class No
{
    public int item;
    public No esq, dir;
    
    /** Constutores **/
    public No(int item){
        this(item,null,null);
    } 
    public No(int item, No esq, No dir){
        this.item = item;
        this.esq = esq; 
        this.dir = dir;
    }
    /** sets e gets **/
    public void setItem(int item){this.item = item; }
    public void setEsq(No esq){this.esq = esq;}
    public void setDir(No dir){this.dir = dir;}
    public int getItem(){return item;}
    public No getEsq(){return esq;}
    public No getDir(){return dir;}
}
