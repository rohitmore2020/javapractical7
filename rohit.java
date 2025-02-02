public class rohit {
    public void displaypatternr(int size){
        int x=0;

        if(size%2 == 0 ){
            x = size+1;
        }
        else{
            x = size+2;
        }
        int cnt = 3;
    for (int ln = 1 ; ln <= 2*size+1; ln ++){

        if(ln == 1 || ln == size +1){
          
            for(int star = 0 ; star < x; star++){
                System.out.print("*");
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

public void displaypatternh(int size){
    int x=0;
    if(size%2 == 0 ){
        x = size+1;
    }
    else{
        x = size+2;
    }
for (int ln = 1 ; ln <= 2*size +1; ln ++){
    
    if(ln == (size+1)){
        for(int star = 0 ; star <=x; star++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    else{
        System.out.print("*");
        for(int space = 1 ; space < x ; space++){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.print("\n");
    }
}
}

public void displaypatterni(int size){

    int x=0;
    if(size%2 == 0 ){
        x = size+1;
    }
    else{
        x = size+2;
    }
for (int ln = 1 ; ln <= 2*size+1; ln ++){
   
    if(ln == 1 || ln == 2*size +1){
        
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
    rohit p = new rohit();

    p.displaypatternr(4);
    System.out.println();
    p.displaypattern0(4);
    System.out.println();
    p.displaypatternh(4);
    System.out.println();
    p.displaypatterni(4);
    System.out.println();
    p.displaypatternt(4);
    System.out.println();
}
}
