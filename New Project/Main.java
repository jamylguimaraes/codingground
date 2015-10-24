public class Main{

     public static void main(String []args){
        System.out.println("Hello World");
     }
     
     
     class removerNo(int Item, No P){
         if (P == null){
             System.out.println("Registro nao encontrado");
         }
         else if (Item < P.Item){ P.esq = removerNo(Item, P.esq);}
         else if (Item > P.Item){ P.dir = removerNo(Item, P.dir);}
         else
            if(P.dir == null){ P = P.esq;} 
            else if(p.esq == null ){ p = p.dir;}
            else p.esq = antecessor (p, p.esq);
        return p;
     }
     
}
