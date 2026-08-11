class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCase=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c))upperCase++;
        }
        return upperCase==word.length() || upperCase==0 || (upperCase==1 && Character.isUpperCase(word.charAt(0)));
    }
}