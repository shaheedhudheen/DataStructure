import java.util.Scanner; 

 

class Matrixmul 

{ 

public static void main(String args[]) 

{ 

int m,n,p,q,i,j,k,a[][]=new int[10][10],b[][]=new int[10][10],c[][]=new int[10][10],temp=0; 

Scanner sc=new Scanner(System.in); 

System.out.println("enter the no of row and coloumn of 1st matrix"); 

        m=sc.nextInt(); 

        n=sc.nextInt(); 

        System.out.println("enter the 1st matrix elements"); 

        for(i=0;i<m;i++) 

        { 

        for(j=0;j<n;j++) 

        { 

        a[i][j]=sc.nextInt(); 

        } 

        } 

        System.out.println("enter the no of row and coloumn of 2nd matrix"); 

        p=sc.nextInt(); 

        q=sc.nextInt(); 

        System.out.println("enter the 2nd matrix elements"); 

        for(i=0;i<p;i++) 

        { 

        for(j=0;j<q;j++) 

        { 

        b[i][j]=sc.nextInt(); 

        } 

        } 

        if(n==p) 

        { 

         for(i=0;i<m;i++) 

         { 

          for(j=0;j<q;j++) 

          { 

          for(k=0;k<n;k++) 

          { 

          temp=temp+(a[i][k]*b[k][j]); 

          } 

          c[i][j]=temp; 

          temp=0; 

          } 

         } 

         System.out.println("matrix after multiplication"); 

         for(i=0;i<m;i++) 

         { 

         for(j=0;j<q;j++) 

         { 

         System.out.print(c[i][j]+" "); 

         } 

         System.out.println(""); 

         }  

        } 

        else 

        { 

        System.out.println("multiplication not possible"); 

        } 

 

} 

} 