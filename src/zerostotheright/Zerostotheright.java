/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zerostotheright;

/**
 *
 * @author O'JAY MTHIMUNYE
 */
public class Zerostotheright {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println( printarr()); 
        
        int Rev[]= {8,1,0,2,1,0,3};
        int j = 0;
        
//        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

        
        for (int i =0; i < Rev.length; i++){
        
            if(Rev[i] != 0 && Rev[j]==0){
                
                int temp = Rev[i];
                Rev[i] = Rev[j];
                Rev[j] = temp;
            
            }
             if(Rev[j] != 0){
                
             j++; 
            }
    }
        System.out.println("Reversed Zeros: ");
        for (int i =0; i < Rev.length; i++){
        System.out.println( Rev[i]);
        }
    /*public  static void printarr(){
        
        int Rev[]= {8,1,0,2,1,0,3};
        for (int i =0; i < Rev.length; i++){
        
            System.out.println("N " + Rev[i]);
        }
        
    
    }*/
    
    
   /* public void  RevZerosToRight(){
    
        
        
        }
        */
        
      
    
    }
    
}
