import java.util.*; 

 

class node 

{ 

int data; 

node next; 

node(int x) 

{ 

data=x; 

} 

} 

 

class link 

{ 

node start; 

void insert(int d) 

{ 

node newnode=new node(d); 

newnode.next=start; 

start=newnode; 

} 

 

void insertkey(int key,int d) 

{ 

node newnode=new node(d); 

node ptr=start; 

while(ptr!=null) 

{ 

if(ptr.data==key) 

newnode.next=ptr.next; 

ptr.next=newnode; 

return; 

} 

ptr=ptr.next; 

} 

 

void insertlast(int d) 

{ 

node newnode=new node(d); 

if(start==null) 

{ 

start=newnode; 

return; 

} 

node ptr=start; 

while(ptr.next!=null) 

ptr=ptr.next; 

ptr.next=newnode; 

} 

 

void display() 

{ 

if(start==null) 

{ 

System.out.print("empty list"); 

return; 

} 

else 

    { 

node ptr=start; 

System.out.println("list data"); 

System.out.println(""); 

System.out.print(ptr.data); 

ptr=ptr.next; 

while(ptr!=null) 

{ 

System.out.print(" -> "+ptr.data); 

    ptr=ptr.next; 

} 

System.out.println(""); 

}     

 

} 

 

void deletefirst() 

{ 

if(start!=null) 

{ 

start=start.next; 

System.out.println("deleted first element"); 

 

} 

else 

System.out.println("list is empty"); 

} 

 

void delete(int data) 

{ 

if(start.data==data) 

{ 

start=start.next; 

return; 

} 

node ptr=start; 

while(ptr.next!=null) 

{ 

if(ptr.next.data==data) 

{ 

ptr.next=ptr.next.next; 

return; 

} 

ptr=ptr.next; 

if(ptr.next==null) 

{ 

ptr=null; 

} 

} 

 

} 

} 

 

class Linklist 

{ 

public static void  main(String args[]) 

{ 

int opt,data; 

Scanner s=new Scanner(System.in); 

link l=new link(); 

do 

{ 

System.out.println("1.insert at beginning , 2.insert after a key , 3.delete at beginning , 4.delete a specific element , 5.insert last , 6.display , 7.exit"); 

opt=s.nextInt(); 

switch(opt) 

{ 

case 1: System.out.println("enter the node value"); 

        data=s.nextInt(); 

        l.insert(data); 

        break; 

 

case 2: System.out.println("enter the key and newnode value"); 

        int key=s.nextInt(); 

        data=s.nextInt(); 

        l.insertkey(key,data); 

        break; 

 

case 3: l.deletefirst(); 

        break; 

 

case 4: System.out.println("enter value of node to delete"); 

        data=s.nextInt(); 

        l.delete(data); 

        break; 

 

case 5: System.out.println("enter the node value:"); 

        data=s.nextInt(); 

        l.insertlast(data); 

        break; 

 

case 6: l.display(); 

        break; 

 

case 7: System.out.println("Bye"); 

        break; 

         

default: System.out.println("invalid input"); 

         break; 

 

} 

 

}while(opt!=7); 

} 

} 