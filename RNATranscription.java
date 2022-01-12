class RnaTranscription {

    String transcribe(String dnaStrand) {
        String ans = "";
        for(char c : dnaStrand.toCharArray()){
        if(c == 'G')
            ans+= "C";
        else if(c == 'C')
            ans+= "G";
        else if(c == 'T')
            ans+=  "A";
        else if(c == 'A')
            ans+=  "U";
            }
        return ans;
    }

}
