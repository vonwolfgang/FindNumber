package FindNumber;

public class FindNumber {

    void findNumbers(int[] liste){
        
        int[] duplicate = new int[(liste.length)];
        int startIndex = 0;

        for(int i=0; i<liste.length; i++){
        
            for(int j=0; j<liste.length; j++){
        
                if((i!=j) && (liste[i] == liste[j])){

                    if (!isIn(duplicate, liste[i])) {
        
                        duplicate[startIndex++] = liste[i];    
                    }
                    
                }
            }
        }

        for(int k : duplicate){
            System.out.println(k);
        }
    }

    static boolean isIn(int[] arr, int value){

        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
        
    }
    
}
