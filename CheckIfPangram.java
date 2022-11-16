//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabets.length(); i++) {
            if (sentence.indexOf(alphabets.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}