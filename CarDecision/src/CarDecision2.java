import java.util.Scanner; 

public class CarDecision2 {

public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Cost of regular car");
		int regularCost = in.nextInt(); 
		System.out.println("Enter MIles per gallon of regular car:");
		int regularMpg = in.nextInt();		
		System.out.println("Enter Cost Of hybrid car ");
		int hybridcost = in.nextInt();	
		System.out.println("Enter Miles per gallon of hybrid car");
		int hybridMpg = in.nextInt();	
		System.out.println("Enter miles travled in a year");
		int MilesPY = in.nextInt();	
		System.out.println("Enter Cost per gallon of gas");
		double CostPg = in.nextDouble();	
		
		
		double regularTotal = regularCost+(MilesPY/regularMpg)*CostPg ; 
		double hybridTotal = hybridcost+(MilesPY/hybridMpg)*CostPg;
		double regularTotalyear2 = regularTotal+(MilesPY/regularMpg)*CostPg;
		double hybridTotalyear2 = hybridTotal+(MilesPY/hybridMpg)*CostPg;
		double regularTotalyear3 = regularTotalyear2+(MilesPY/regularMpg)*CostPg;
		double hybridTotalyear3 = hybridTotalyear2+(MilesPY/hybridMpg)*CostPg;
		double regularTotalyear4 = regularTotalyear3+(MilesPY/regularMpg)*CostPg;
		double hybridTotalyear4 = hybridTotalyear3+(MilesPY/hybridMpg)*CostPg;
		double regularTotalyear5 = regularTotalyear4+(MilesPY/regularMpg)*CostPg;
		double hybridTotalyear5 = hybridTotalyear4+(MilesPY/hybridMpg)*CostPg;
		
		System.out.println("Cost to own after year 1 for regular car"+regularTotal+" Cost to own after year 1 for hybrid car "+hybridTotal);
		System.out.println("Cost to own after year 2 for regular car"+regularTotalyear2+" Cost to own after year 2 for hybrid car "+hybridTotalyear2);
		System.out.println("Cost to own after year 3 for regular car"+regularTotalyear3+" Cost to own after year 3 for hybrid car "+hybridTotalyear3);
		System.out.println("Cost to own after year 4 for regular car"+regularTotalyear4+" Cost to own after year 4 for hybrid car "+hybridTotalyear4);
		System.out.println("Cost to own after year 5 for regular car"+regularTotalyear5+" Cost to own after year 5 for hybrid car "+hybridTotalyear5);
		
		if(hybridTotalyear5<regularTotalyear5)
			

	{System.out.println("The hybrid car pays back after 5 years");} 
		
				
		
		
		
		
		// TODO Auto-generated method stub

}
}