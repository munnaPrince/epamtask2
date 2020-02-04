package com.epam.sample.munna;


 class Sweet1 implements Comparable{
		int weight=1;
		String name="";
		String color="yellow";
		float calories=100;
		public int compareTo(Object o) {
		return 0;
		}
		}
		class Chocolate extends Sweet1{}
		class FiveStar extends Chocolate
		{
		FiveStar ()
		{
		this.name="xFiveStar";
		}
		}
		class KitKat extends Chocolate{
		KitKat()
		{
		this.name="aKitKat";
		}
		}
	public class Sweet {
		public static void main(String[] args) {
		Sweet1[]  allsweets = new Sweet1[3];
		allsweets [0]= new FiveStar();
		allsweets [1]= new FiveStar();
		allsweets [2]= new KitKat();
		float tw =0;
		for (int i = 0; i < allsweets.length; i++) {
		Sweet1 s = allsweets[i];
		tw += s.weight;
		}
		System.out.println(" The total weight is  = "+tw);
		System.out.println(" Printing the sweets ");
		for (int i = 0; i < allsweets.length; i++) {
		Sweet1 s = allsweets[i];
		System.out.println(s.name);
		}
		System.out.println(" sort all objects using name");
}
	
}

