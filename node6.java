public class node6 {
 int data;
 node6 next;
 
 node6(int data){
     this.data=data;
 }
  node6(int data,node6 next){
       this.data=data;
       this.next=next;}
 
 public static void merg(node6 start1, node6 start2){  //merging
     node6 p;
     for(p=start1; p.next!=null; p=p.next){ }
     p.next=start2;}

public static void insert(node6 start,int x){
    node6 p=start;
    for(p=start; p!=null;p=p.next){
        if(start==null){
            start=new node6(x);
            break;
        }
        if(p.next==null){
            p.next=new node6(x);
            break;
        }
    }
    }



//     searching
 public static void search(int x, node6 start){
     node6 p=start;
     boolean fal=false;
     for(node6 i=start; i!=null; i=i.next ){
         if(p.data==x){
             System.out.println("Element found "+x);
             fal=true;
             break;}
             p=p.next;}
         if(fal==false){
         System.out.print("Element not found");}}
 
 public static void copy(node6 start){
   node6 copy=new node6(start.data);
      node6 tem=copy;
      for(node6 p=start.next; p!=null; p=p.next){
       tem=tem.next=new node6(p.data);}
      System.out.println("Copy finished");}
  
// deting element
 public static node6 deletelast(node6 start, int x){
     if(start.data==x){
      start=start.next;
     }
     if(start==null|| start.data>x){
      return  start; }
     for(node6 i=start; i!=null; i=i.next){
         if(i.next==null){
            i=null;}
         if(i.next.next==null){
             i.next=null;}}
         System.out.println("Deleted number");
         return start;}
     //min
  
    public static void large(node6 start){
        int large=0;
        node6 p=start;
        large=p.data;
        for(p=start; p.next!=null; p=p.next){
            if(large<=p.next.data){
                large=p.next.data;    }
        }
        System.out.println("Large Number is "+large);
    }
    
    public static void Small(node6 start){
        int small=0;
        node6 p=start;
        small=p.data;
        for(p=start; p.next!=null; p=p.next){
            if(small>=p.next.data){
                small=p.next.data;    }
        }
        System.out.println("Small Number is "+small);
    } 
public static void sum(node6 start){
    int sum=0;
    while(start!=null){
        sum+=start.data;
        start=start.next;
    }
    System.out.println("The sum of linkedlist is "+sum);
} 
   public static void size(node6 start){
    int size=0;
    while(start!=null){
        size++;
        start=start.next;
    }
    System.out.println("The Size of linkedlist is "+size);    
   }
   
   public static void deletlast(node6 start){
       if(start==null){
           System.out.println(start);}
       for(node6 p=start; p!=null; p=p.next){
           if(p.next==null){
               p=null;  }
           if(p.next.next==null){
               p.next=null; }   }     }
   //Replace methoode
        public static void replace(node6 start, int pos, int data){
            int count=0;
            node6 p=start;
            while(p!=null){
                if(count==pos){
                    break;   }
                p=p.next;
                count++;
                p.next=new node6(data,p.next.next);
            }}
    public static void main(String args[]) {
    
        
        node6 start=new node6(1);
        node6 p=start;
        for(int i=1; i<4; i++){
            p=p.next=new node6(2*i);
        }
       for(node6 q=start; q!=null; q=q.next){
           System.out.println(q.data);
       } 
       
     
    }

}
