class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        Set<Character> checkPangram = new HashSet<>();

        for (int i = 0; i < n; i++){
            char characters = sentence.charAt(i);
            checkPangram.add(characters);
        }

        if(checkPangram.size() == 26){
            return true;
        } else {
            return false;
        }
    }
}