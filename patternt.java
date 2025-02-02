public class patternt {
    public void displaypatternt(int size){

            int x=0;
            if(size%2 == 0 ){
                x = size+1;
            }
            else{
                x = size+2;
            }
        for (int ln = 1 ; ln <= 2*size+1; ln ++){
           
                if(ln == 1 ){
                for(int star = 0 ; star < x; star++){
                    System.out.print("*");
                }
             
                System.out.print("\n");
            }
            else{
                for(int space = 0 ; space < x/2 ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int space = 0 ; space < x/2; space++){
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String a[]){
        patternt p =  new patternt();

        p.displaypatternt(3);
    }
}