public void outputW7(){
    int n=3;
    System.out.print("⚪️");
    while(n!=0){
        for (int i=0; i<n; i++){
            sumb1=sumb1+ b;
        }
        //System.out.print(sumb1);
        for (int i=0; i<n+1; i++){
            sumsnake+=snake;
        }
        //System.out.print(sumb1+sumsnake);
        for(int j=0; j<n-1; j++){
            sumr1+=r;
        }
        for (int k=1; k<n+1; k++){
            sumblk1+=blk;
        }
        for(int l=2; l<n; l++){
            sumr2+=r;
        }
        for(int l=1; l<n; l++){
            sumwm+=wm;
        }
        
        for (int m=0; m<n+1; m++){
            sumb2+=b;
        }
       
        for(int j=1; j<n-1; j++){
            sumr3+=r;
        }
        
        for (int m=1; m<n+1; m++){
            sumfrog+=frog;   
        }
        
        for (int o=2; o<n-1; o++){
            sumblk2+=blk;
        }
        System.out.print(sumb1+ sumsnake+ sumr1+sumblk1+sumr2+sumb2+sumr3+sumfrog);
        
        n--;
    } 
    System.out.println();
    System.out.println();
}