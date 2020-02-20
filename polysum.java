import java.util.Scanner; 

 

class Polysum 

{ 

public int max(int m,int n) 

{ 

return(m>n)?m:n; 

} 

public int[] add(int a[],int b[],int m,int n) 

{ 

Polysum p=new Polysum(); 

int i; 

int size=p.max(m,n); 

int sum[]=new int[size]; 

for( i=0;i<size;i++) 

{ 

sum[i]=a[i]; 

} 

for(i=0;i<size;i++) 

{ 

sum[i]=sum[i]+b[i]; 

} 

return sum; 

} 

public void printpoly(int poly[],int size) 

{ 

int n=1; 

int i; 

for( i=0;i<size;i++) 

{ 

 if(i==0) 

 { 

 System.out.print(poly[i]); 

 if(i<size-1) 

 System.out.print(" + "); 

 } 

 else 

 { 

 

 if(poly[i]==0) 

System.out.print("0"); 

 else 

System.out.print(poly[i]+"x^"+n++); 

 if(i<size-1) 

System.out.print(" + "); 

            }  

} 

} 

public static void main(String args[]) 

{ 

Polysum p=new Polysum(); 

int a[]=new int[10], b[]=new int[10],i,m,n,size,sum[]=new int[10],x,y; 

Scanner sc=new Scanner(System.in); 

System.out.println("enter the degree of 1st polynomial"); 

x=sc.nextInt(); 

m=x+1; 

System.out.println("enter the values of 1st polynomial of the form a + bx^1 + cx^2 + . . ."); 

for(i=0;i<m;i++) 

{ 

a[i]=sc.nextInt(); 

} 

System.out.println("enter the degree of 2nd polynomial"); 

y=sc.nextInt(); 

n=y+1; 

System.out.println("enter the values of 2nd polynomial of the form a + bx^1 + cx^2 + . . ."); 

for(i=0;i<n;i++) 

{ 

b[i]=sc.nextInt(); 

} 

System.out.println("1st polynomial is"); 

System.out.println(""); 

p.printpoly(a,m); 

System.out.println(""); 

System.out.println("2nd polynomial is"); 

System.out.println(""); 

p.printpoly(b,n); 

 sum=p.add(a,b,m,n); 

size=p.max(m,n); 

System.out.println(""); 

System.out.println("sum of polynomial is"); 

System.out.println(""); 

p.printpoly(sum,size); 

} 

} 