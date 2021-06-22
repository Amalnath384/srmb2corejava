
class PrimeNumber
{
   public static void main(String args[])
   {
int num=47;	
  int temsum=num; 
	int temp;
	 boolean isPrime= true;
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   int out=0;
  while(temsum!=0){
      int last=temsum%10;
      out=out+last;
      temsum=temsum/10;
  }
  System.out.println("addition of two numbers="+out);
   }
}
