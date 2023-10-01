public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        StringBuilder reverse=new StringBuilder();
        for(String word:words){
            StringBuilder reversedWord=new StringBuilder(word);
            reversedWord.reverse();
            reverse.append(reversedWord).append(" ");
        }
        return reverse.toString().trim();

    }
}
