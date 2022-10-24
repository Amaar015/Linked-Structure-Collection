public class node1 {
int data;
node1 next;

node1(int data){
    this.data=data;
}
 static node1 insert(node1 start, int x){
    node1 p=start;
    if(start==null || start.data>x){
        start=new node1(x);
        return start;
    }
    while(p.next!=null){
        if(p.next.data>x){break;}
        p.next=new node1(x);
    }
      return start;
}


    public static void main(String args[]) {
      node1 start=new node1(1);
      node1 p=start;
      for(int i=2;i<6;i++){
          p=p.next=new node1(i*2);
      }
//    
   insert(start,6);
    
    
      for(node1 q=start; q!=null; q=q.next){
          System.out.println(" "+q.data);
      }
}
}