public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();

        //a = 97 .... z = 122
        boolean[] asciiValues = new boolean[123];

        for(char c: input.toCharArray()){
            asciiValues[(int)c] = true;
        }

        for(int i = 97; i < 123; i++){
            if(asciiValues[i] == false){
                return false;
            }
        }
        return true;
    }

}
