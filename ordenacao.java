package ordins;


public class OrdIns {
public static double[] insercao(double[] vet){
   double atual;
   int j;
    for (int i = 1; i < vet.length; i++) {
      atual = vet[i];
      j = i - 1;
      while(j >= 0 && v[j])
    }




}
    
    public static int[] main(String[] args) {
       int[] vetI = {1,8,3,7,9,2,11};
           
       int i;
       for (i = 2;i < vetI.length; i++) {
            atual = vetI[i];
            j = i - 1;
            while (j>0 && vetI[j]>atual){
                  vetI[j+1] = vetI[j];
            }
       return vetI;
                   
       
   }
    
    }
}
