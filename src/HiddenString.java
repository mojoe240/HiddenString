// Hidden String Class

public class HiddenString {
	
	/** 
	 * @author  Raun and Joe
	 * @version 1.0
	 * It's essentially Hangman */
	
	String f;
	String s;
	int count = 0;
	
	/**
	 * 
	 * @return s
	 */
	public String getS() {
		return s;
	}

	/**
	 * 
	 * @param s
	 * sets value of the String s
	 */
	public void setS(String s) {
		this.s = s;
	}
	
	/**
	 * 
	 * @return f
	 * gets value of the Hidden String
	 */
	public String getHiddenString(){
		return f;
	}
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean allFound(){
		if (f.equalsIgnoreCase(s))
			return true;
		else 
			return false;
	}
	/**
	 * 
	 * @param s1
	 */
	

	public HiddenString(String s1){
		
		f = s1;
		s = s1.toLowerCase();
		s = s.replaceAll("[a-zA-Z]", "-");
		
	}
	/**
	 * 
	 * @param shown
	 * @return count
	 */
	
	public int show(String shown){
		String newShown = shown.toLowerCase();
		String testString = f;
		
		int count = 0;
		
		for (int i =0; i< f.length(); i++){
			 if (shown.equalsIgnoreCase(f.substring(i, i+1))){
				 count ++;
				 
				 s = s.substring(0,i) + shown + (s.substring(i+1));
				 
			 }
		 }	
		
		return count; 
	}
	
}
