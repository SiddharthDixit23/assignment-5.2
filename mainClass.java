package myPack;
import java.util.*;
interface Stack {
	
	abstract void push();
	abstract int pop();
	
}

class FixedStack implements Stack
{
	int q;
	FixedStack()
	{
		System.out.println("What will be the size of the Fixedstack? ");
		Scanner obj = new Scanner(System.in);
		q = obj.nextInt();
		System.out.println("Start pushing integers into the FixedStack.");
	}
	@Override
	public void push() {
		// TODO Auto-generated method stub
		int[] a = new int[q];
		int count = 0;
		Scanner obj1 = new Scanner(System.in);
		for(int i=0;i<q*2;i++)
		{
			
			a[i]=obj1.nextInt();
			count = count + 1;
			if(count == q)
			{
				System.out.println("Stack overflow.");
				break;
			}
			
		}
		
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
class VariableStack implements Stack
{
	int q;
	VariableStack()
	{
		System.out.println("What will be the size of the Variablestack? ");
		Scanner obj = new Scanner(System.in);
		q = obj.nextInt();
		System.out.println("Start pushing integers into the VariableStack.");
	}
	@Override
	public void push() {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		Scanner obj1 = new Scanner(System.in);
		for(int i=0;i<q*200;i++)
		{
			
			a[i]=obj1.nextInt();
			q++;

			
		}
		
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

class mainClass
{
	public static void main(String[] args)
	{
		FixedStack s = new FixedStack();
		s.push();
		VariableStack s1 = new VariableStack();
		s1.push();
	}
}