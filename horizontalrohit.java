public class horizontalrohit{

    public void displayrohit(int size){

        int x = 0;

        if(size%2 == 0 ){
            x = size+3;
        }
        else{
            x = size+2;
        }
        int cnt =1;
        for (int ln = 1 ; ln <= 2*size+1; ln ++){
            if(ln == 1 ){
              
                for(int star = 0 ; star < x; star++){
                    System.out.print("*");
                }
                System.out.print(" ");

            System.out.print("  ");

                System.out.print(" ");
                for(int star = 1 ; star < x; star++){
                    System.out.print("*");
                }
                System.out.print("  ");

            System.out.print(" ");
                
                System.out.print("*");
                for(int space = 1 ; space < x ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

            System.out.print("  ");

                for(int star = 0 ; star < x; star++){
                    System.out.print("*");
                }
             
            System.out.print("  ");

                for(int star = 0 ; star < x; star++){
                    System.out.print("*");
                }

            System.out.print("\n");
            }

            else if(ln == size+1){
                
                for(int star = 0 ; star < x; star++){
                    System.out.print("*");
                }
                System.out.print(" ");

            System.out.print("  ");

                System.out.print("*");
                for(int space = 1 ; space < x; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

            System.out.print("  ");
                
                for(int star = 0 ; star <=x; star++){
                    System.out.print("*");
                }

            System.out.print("  ");

                for(int space = 0 ; space < x/2 ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                
                for(int space = 0 ; space < x/2; space++){
                    System.out.print(" ");
                }

            System.out.print("  ");

                for(int space = 0 ; space < x/2 ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int space = 0 ; space < x/2; space++){
                    System.out.print(" ");
                }

            System.out.print("\n");
            }

            else if(ln == 2*size+1){

                System.out.print("*");

                for(int space = 1 ; space< cnt ; space++){
                    System.out.print(" ");
                }
                cnt++;
                
                System.out.print("*");
                for( int j = cnt; j <x ; j++){
                    System.out.print(" ");
                }
                System.out.print("  ");
            
            System.out.print(" ");

                System.out.print(" ");
                for(int star = 1 ; star < x; star++){
                    System.out.print("*");
                }
                System.out.print("  ");
            
            System.out.print(" ");

                System.out.print("*");
                for(int space = 1 ; space < x ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

            System.out.print("  ");
                
                for(int star = 0 ; star < x; star++){
                    System.out.print("*");
                }
            
            System.out.print("  ");
                
            for(int space = 0 ; space < x/2 ; space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int space = 0 ; space < x/2; space++){
                System.out.print(" ");
            }

            System.out.print("\n");
            }

            else if(ln > size+1){

                System.out.print("*");

                for(int space = 1 ; space< cnt ; space++){
                    System.out.print(" ");
                }
                cnt++;

                System.out.print("*");
                for( int j = cnt; j <=x ; j++){
                    System.out.print(" ");
                }

            System.out.print("  ");

                System.out.print("*");
                for(int space = 1 ; space < x; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

            System.out.print("  ");
                
                System.out.print("*");
                for(int space = 1 ; space < x ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

            System.out.print("  ");

                for(int space = 0 ; space < x/2 ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                
                for(int space = 0 ; space < x/2; space++){
                    System.out.print(" ");
                }

            System.out.print("  ");

                for(int space = 0 ; space < x/2 ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int space = 0 ; space < x/2; space++){
                    System.out.print(" ");
                }

            System.out.print("\n");

            }

            else{
                System.out.print("*");
                for(int space = 1 ; space < x; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

                System.out.print("  ");

                System.out.print("*");
                for(int space = 1 ; space < x; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

                System.out.print("  ");
                
                System.out.print("*");
                for(int space = 1 ; space < x ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");

                System.out.print("  ");

                for(int space = 0 ; space < x/2 ; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                
                for(int space = 0 ; space < x/2; space++){
                    System.out.print(" ");
                }

                System.out.print("  ");

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
        horizontalrohit p = new horizontalrohit();

        p.displayrohit(3);
        System.out.println();
        p.displayrohit(4);
        System.out.println();
        p.displayrohit(5);
        System.out.println();
        p.displayrohit(6);
        System.out.println();

    }
}