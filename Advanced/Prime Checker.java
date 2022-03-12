import static java.lang.System.in;

/* first add this 👆 to the import to handle the BUFFERED ERROR that was mentioned in the question.  
this is because in solution they have not written SYSTEM.IN  part to we have to import system.in 
just below import  write this code 👇*/ 




class Prime{
    public void checkPrime(int... arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<2){                   //checking if no is less than 2
                
            }
            else if(arr[i]==2){                  //handling if input is 2
                System.out.print(arr[i] + " ");
            }
            else{
                int flag=1;
                for(int j=2;j<arr[i];j++){
                    if(arr[i]%j==0){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    System.out.print(arr[i]+ " ");
                }
            }
        }
            
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
        System.out.println();
        
    }
}
