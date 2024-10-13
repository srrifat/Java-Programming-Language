public class hellowRectanglePattern {
    public static void hellow_ractangle(int totRows,int totCols){
        //outer loop
        for(int i = 1; i<=totRows; i++){
               //inner - column
               for(int j=1;j<=totCols; j++){
                //cell - (i,j)
                if(i == 1 || i==totRows || j ==1 || j == totCols){
                    System.out.print("*");
                }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
               }
              
        }
        public static void main(String[] args) {

            hellow_ractangle(4, 5);
        }
        
    }
    

