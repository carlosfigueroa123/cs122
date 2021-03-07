
public class Fibonacci {


public static int fibonacci(int n){

if(n<=1){
return n;
}

else{

return fibonacci(n-1) + fibonacci(n-2);

}
}

public static int fibonacci1(int n){

int f[] = new int[n+2]; // this is to say that there are two extra numbers in the sequence, 0 and 1, then it goes to 1 after n=2

int i;
  
f[0] = 0;
f[1] = 1;
 
for (i = 2; i <= n; i++){
    f[i] = f[i-1] + f[i-2];
}
  
return f[n];
}



public static void main(String[] args){ 

	System.out.println("result: " + fibonacci1(6));
} 





}


