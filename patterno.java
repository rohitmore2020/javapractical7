public class patterno {
    public void displaypattern0(int size){
            int x=0;

            if(size%2 == 0 ){
                x = size+1;
            }
            else{
                x = size+2;
            }
        for (int ln = 1 ; ln <= 2*size+1; ln ++){

            if(ln == 1 || ln == 2*size +1){
              
                System.out.print(" ");
                for(int star = 1 ; star < x; star++){
                    System.out.print("*");
                }
                System.out.print(" ");
             
                System.out.print("\n");
            }
            else{
                System.out.print("*");
                for(int space = 1 ; space < x; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");
            }
        }
    }

    public static void main(String a[]){
        patterno p =  new patterno();

        p.displaypattern0(3);
    }
}