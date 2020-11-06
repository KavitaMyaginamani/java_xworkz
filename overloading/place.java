public class Place {
  public static String finder(int fromDistance)
  {
	  System.out.println("invoked method finder");
	  System.out.println("fromDistance "+fromDistance);
        if(fromDistance==150){
			System.out.println("Haveri");
			return "Haveri";
			
		}
		if(fromDistance==800){
			System.out.println("Gadag");
			return "Gadag";
			
	  }
	  if(fromDistance==1500){
			System.out.println("Mysore");
			return "Mysore";
	  }
	  if(fromDistance==50){
			System.out.println("Hubli");
			return "Hubli";
	  }
	  if(fromDistance==150){
			System.out.println("Haveri");
			return "Haveri";
	  }
	  return "place not found";
  }
}
	  