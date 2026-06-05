class MyCircularQueue
{
 int Q[];
 int f, r, k;

 public MyCircularQueue(int k)
 {
  this.Q = new int[k];
  this.k = k;
  this.f = -1; this.r = -1;
 }

 
 public boolean enQueue(int value)
 {
  if(isFull())
  {return false;}
  else
  {
   if(isEmpty())
   {this.f=0; this.r=0;}
   else
   {
    if(this.r == this.k-1)
    {r=0;}
    else
    {r++;}
   }

   this.Q[r] = value;
  }

  return true;
 }
 

 public boolean deQueue()
 {
  if(isEmpty())
  {return false;}
  else
  {
   if(this.f == this.r)
   {f=-1; r=-1;}
   else
   {
    if(this.f == this.k-1)
    {this.f = 0;}
    else
    {this.f++;}
   }
  }

  return true;
 }
 

 public int Front()
 {
  if(!isEmpty())
  {return this.Q[this.f];}

  return -1;
 }
 

 public int Rear()
 {
  if(!isEmpty())
  {return this.Q[this.r];}

  return -1;
 }
 

 public boolean isEmpty()
 {
  if(this.f == -1)
  {return true;}

  return false;
 }
 

 public boolean isFull()
 {
  if((this.f == 0 && this.r == this.k-1)||(this.r == this.f-1))
  {return true;}

  return false;
 }
}




class Test
{
 public static void main(String[] args)
 {
  MyCircularQueue obj = new MyCircularQueue(3);
  // boolean param_1 = obj.enQueue(1);
  // boolean param_2 = obj.deQueue();
  // int param_3 = obj.Front();
  // int param_4 = obj.Rear();
  // boolean param_5 = obj.isEmpty();
  // boolean param_6 = obj.isFull();

  // System.out.println(param_1, param_2, param_3, param_4, param_5, param_6);


  System.out.println(obj.enQueue(1));
  System.out.println(obj.enQueue(2));
  System.out.println(obj.enQueue(3));
  System.out.println(obj.enQueue(4));
  System.out.println(obj.Rear());
  System.out.println(obj.isFull());
  System.out.println(obj.deQueue());
  System.out.println(obj.enQueue(4));
  System.out.println(obj.Rear());

  // System.out.println(obj.enQueue(12)+"\n"+obj.q[1]);
 }
}