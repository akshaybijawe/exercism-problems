import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap<Character,Character> rna = new HashMap<Character, Character>();
        rna.put('G','C');
        rna.put('C','G');
        rna.put('T','A');
        rna.put('A','U');

        StringBuilder sb = new StringBuilder();

        for(char c : dnaStrand.toCharArray()){
            sb.append(rna.get(c));
        }

        return sb.toString();
    }

}
