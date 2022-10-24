public class node4 {
int data;
node4 next;

node4(int data){
    this.data=data;
}
 static void insert(node4 start, int x){
    node4 p=start;
    if(start==null || start.data>x){
        start=new node4(x);
//        return start;
    }
    while(p.next!=null){
        if(p.next.data>x){break;}
        p.next=new node4(x);
    }
//      return start;
}


    public static void main(String args[]) {
      node4 start=new node4(1);
      node4 p=start;
      for(int i=2;i<6;i++){
          p=p.next=new node4(i*2);
      }
//    
   insert(start,6);
    
    
      for(node4 q=start; q!=null; q=q.next){
          System.out.println(" "+q.data);
      }
}
}