import java.util.Scanner; 

 

class Arrayop 

{ 

public static void main(String args[]) 

{ 

Scanner sc=new Scanner(System.in); 

int a[]=new int[50],m,n,flag=0,op,i,pos,elm,b[]=new int[50]; 

char cond; 

System.out.println("enter the array size"); 

m=sc.nextInt(); 

System.out.println("enter the array elements"); 

for(i=0;i<m;i++) 

{ 

a[i]=sc.nextInt(); 

} 

        System.out.println("current array is"); 

for(i=0;i<m;i++) 

{ 

System.out.print(a[i]+" "); 

} 

do 

     { 

     System.out.println(" "); 

System.out.println("choose any operation"); 

System.out.println("1.insertion  2.deletion  3.merge"); 

op=sc.nextInt(); 

switch(op) 

{ 

case 1: System.out.println("enter the position of insertion"); 

        pos=sc.nextInt(); 

        pos=pos-1; 

        System.out.println("enter the element"); 

        elm=sc.nextInt(); 

        for(i=m;i>pos;i--) 

        { 

        a[i]=a[i-1]; 

        } 

        a[pos]=elm; 

        m++; 

        System.out.println("current array is"); 

            for(i=0;i<m;i++) 

            { 

            System.out.print(a[i]+" "); 

            } 

        break; 

 

case 2: if(flag==0) 

        { 

        System.out.println("enter the position of deletion"); 

        pos=sc.nextInt(); 

        pos=pos-1; 

        for(i=pos;i<m-1;i++) 

        { 

        a[i]=a[i+1]; 

        } 

        m--; 

        if(m==0) 

        flag=1; 

        System.out.println("current array is"); 

                for(i=0;i<m;i++) 

                { 

                System.out.print(a[i]+" "); 

                } 

        } 

        else 

        System.out.println("array is empty"); 

        break; 

 

case 3: System.out.println("enter the array size of array to be merged"); 

        n=sc.nextInt(); 

        System.out.println("enter the array elements"); 

        for(i=0;i<n;i++) 

        b[i]=sc.nextInt(); 

        for(i=0;i<n;i++) 

        { 

        a[m+i]=b[i]; 

        } 

        System.out.println("current array is"); 

            for(i=0;i<m+n;i++) 

            { 

            System.out.print(a[i]+" "); 

            } 

                         break; 

 

                default : System.out.println("invalid input"); 

                          break; 

            }     

            System.out.println("want to continue ?  (y/n).."); 

cond= sc.next().charAt(0);  

}while(cond=='y'); 

} 

}  