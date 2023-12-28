
package hms;
class CNode{

   Checkup cu;
   CNode next,pre;

   public CNode(Checkup cu){
        this.cu= cu;
        next = null;
        pre = null;
        }
   }

public class CheckUpList {
    CNode head,tail; 
    public CheckUpList() {
        head = null;
       tail = null; 
    }
    public void Enqueue(Checkup cu)
{
    CNode node = new CNode(cu);
if (head==null || tail==tail)
{
    head=node;
    tail=node;
}
else if (head.cu.getPriority()<cu.getPriority())
    
{
    head.next=node;
    node.pre=head;
    head=node;
}
else if (tail.cu.getPriority()>cu.getPriority())
{
    tail.pre=node;
    node.next=tail;
    tail=node;
}
else 
{
    CNode temp= tail;
    
    while(temp!=null);
    {
        if(temp.cu.getPriority()>=cu.getPriority())
        {
           // break;
        }
        temp=temp.next;
    }
    node.next=temp;
    node.pre=temp.pre;
    temp.pre.next=node;
    temp.pre=node;
}
}
    public Checkup dequeue()
    {
        if(head==null)
        {
            return null;
        }
        CNode checkup=head;
        head=head.next;
        return checkup.cu;
        
    }
    
    public void Print()
    {
        CNode temp=head;
        while(temp!=null)
        {
            System.out.println(temp.cu.getPriority()+" "+temp.cu.getRecomendation());
            temp=temp.pre;
            
        }
    }
 
}
