import java.io.*;
import java.util.Scanner;
public class node55 {

int data;
node55 next;
 node55(int data){
    this.data=data;
}
 node55(int data, node55 next){
     this.data=data;
     this.next=next;
 }
 public static void merg(node55 start1, node55 start2){
       node55 p;
       for(p=start1; p!=null; p=p.next){ }
       p.next=start2;}
 
 
 public static void copy(node55 start){
        node55 copy=new node55(start.data);
        node55 temp=copy;
        node55 p=start;
        while(p!=null){
        temp=temp.next=new node55(p.data);
        p=p.next;}
 System.out.println("Copy finished");
        for(node55 s=copy.next;s!=null; s=s.next){
        System.out.println(s.data); }}
 
 
 
 
 public static void delete(int x,node55 start){
       node55 p=start;
       if(p==null|| p.data>x){
       System.out.println(p);}
       if(p.data==x){
       p=p.next;}
  for(node55 i=start; i!=null; i=i.next){
      if(i.next.data==x){
      i.next=i.next.next;
      break;}}
      System.out.println("Deleted number is"+x);
 for(node55 s=start;s!=null; s=s.next){
      System.out.println(s.data);}}

 public static void sum(node55 start){
         int sum=0;
         node55 p=start;
     for(p=start; p!=null; p=p.next){
         sum+=p.data;}
         System.out.println("Sum is "+sum);}
 
 
 
 public static void size(node55 start){
         int size=0;
         node55 p=start;
     for(p=start; p!=null; p=p.next){
         size++;}
         System.out.println("Size is "+size);}
 
 public static void search(int x, node55 start){
         node55 p=start;
         boolean fal=false;
     if(start==null||start.data>x){
         System.out.println(start);}
     while(p!=null){
         if(p.data==x){
         System.out.println("Element found");
         fal=true; }  break;}
     if(fal==false)
         {System.out.println("Element not found");}}
 
 
 
 
 public static void maximum(node55 start){
        int max=0;
        node55 p=start;
        max=p.data;
    for(p=start; p.next!=null; p=p.next){
        if(max<=p.next.data){
        max=p.next.data;  }}
        System.out.println("Large Number is "+max);}
 
    public static void minimum(node55 start){
        int min=0;
        node55 p=start;
        min=p.data;
     for(p=start; p.next!=null; p=p.next){
        if(min>=p.next.data){
        min=p.next.data;}}
        System.out.println("minmum number is "+min);}    
 
    
    public static void insert(int x,node55 start){
        node55 p=start;
        if(start==null|| start.data>x){
            p=new node55(x,start);
         for(node55 s=start;s!=null; s=s.next){
      System.out.println(s.data);}
        }
       
        while(p!=null){
            if(p.next.data>x){break;}
            p=p.next;
        }
        p.next=new node55(x,p.next);
         for(node55 s=start;s!=null; s=s.next){
      System.out.println(s.data);}
    }
    
    
    
    
    public static void deletelast(node55 start){
       if(start==null){
            System.out.println(start);}
       for(node55 p=start; p!=null; p=p.next){
            if(p.next==null){
            p=null; }
            if(p.next.next==null){
            p.next=null;}}
       for(node55 s=start;s!=null; s=s.next){
            System.out.println(s.data);}}
    public static void replace(int pos, int data, node55 start){
             int count=0; 
             node55 p=start;
     while(p!=null){
             if(count==pos){break;}
             p=p.next;
             count++;}
             p.next=new node55(data,p.next);
     for(node55 s=start;s!=null; s=s.next){
              System.out.println(s.data);} }
 
    public static void main(String args[]) {
      
         node55 start2=new node55(4);
      node55 q=start2;
     for(int i=1;i<4;i++){
         q=q.next=new node55(i*2);
     }
      node55 start1=new node55(2);
      node55 p=start1;
     for(int i=1;i<4;i++){
         p=p.next=new node55(i*2);
     }
       for(node55 s=start1;s!=null; s=s.next){
       System.out.println(s.data);
      }
       for(node55 s=start2;s!=null; s=s.next){
       System.out.println(s.data);
      }
           merg(p,q);
              copy(start1);
     delete(4,start1);
      sum(start1);
     size(start1);
    search(7,start1);
     maximum(start1);
   minimum(start1);
       insert(4,start1);
         deletelast(start1);   
    replace(3,4,start1);
    }
}
