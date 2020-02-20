import java.util.*; 

 

class Prime 

{ 

public static void main(String args[]) 

{ 

int i,j,flag=0,no,lim,count=0; 

Scanner sc=new Scanner(System.in); 

System.out.println("Enter a limit"); 

lim=sc.nextInt(); 

System.out.println("Enter the no. of prime numbers to print"); 

no=sc.nextInt(); 

for(i=0;i<=lim;i++) 

{ 

for(j=2;j<i;j++) 

{ 

if(i%j==0) 

{ 

flag=0; 

break; 

} 

else 

{ 

flag=1; 

} 

} 

if(flag==1) 

{ 

count=count+1; 

if(count<=no) 

    System.out.println(i); 

} 

 

    } 

 

} 

} 

 