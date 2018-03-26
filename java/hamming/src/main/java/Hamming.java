import java.lang.*;

class Hamming {

	public String leftStrand;
	public String rightStrand; 

    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if(leftStrand.length() != rightStrand.length()){
        	throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }else{
        	this.leftStrand = leftStrand;
        	this.rightStrand = rightStrand;
        	getHammingDistance();
        }
    }

    int getHammingDistance() {
    	int counter = 0;
    	char[] leftStrandCharArray = leftStrand.toCharArray();
    	char[] rightStrandCharArray = rightStrand.toCharArray();

        for(int i = 0; i < leftStrand.length(); i++){
        	if(leftStrandCharArray[i] != rightStrandCharArray[i]){
        		counter++;
        	}
        }
        return counter;
    }

}
