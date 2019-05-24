package optional;

public class TeaParty {
	
	public String welcome(String name, boolean isWomen, boolean wasKnighted) {
		String add;
		
		boolean isWoman = true;
		if(isWoman) {
			add = "Ms.";
			if(wasKnighted)
				add = "Dame";
		}
		else {
			add = "Mr.";
			if(wasKnighted)
				add = "Sir";
		}
		
		return "Hello " + add + " " + name;
	}
	
	

}
