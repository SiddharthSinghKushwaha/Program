import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer> Arr=new ArrayList <Integer>();
		Arr.add(4);
		Arr.add(8);
		Arr.add(6);
		Arr.add(1,7); //7 is added at the index 1
		System.out.println("Size of the arraylist is" +Arr.size());
	

		//method 1- to print arrayList
System.out.println("Elements of arraylist are" +Arr);
Arr.add(300);
Arr.set(3,31);
// method 2
for(int j=0;j<Arr.size();j++)
System.out.print(Arr.get(j)+" ");
	//method 3 using Iterator
Iterator<Integer> i=Arr.iterator();
while(i.hasNext())
{
	System.out.print(i.next() +" ");
	}
}
