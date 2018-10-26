//Aakash Tyagi

public class Toss {
	
	public static void estimateParameter()
	{
		double prob=0.0,estimatedprob=0.0,probabilityofhead=0.4,estimationError=0.0;
		int countp=0;
		
		for(int i=0;i<10000;i++)
			{
			  prob=Math.random();
			  if(prob<=probabilityofhead)
			  {
				  countp++;
			  }
			}	
		
		estimatedprob=(double)countp/10000;
		estimationError=(double)Math.abs((probabilityofhead-estimatedprob)/probabilityofhead);
		
		System.out.println("estimatedp "+estimatedprob);
		System.out.println("estimateError "+estimationError);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		estimateParameter();
	}

}
