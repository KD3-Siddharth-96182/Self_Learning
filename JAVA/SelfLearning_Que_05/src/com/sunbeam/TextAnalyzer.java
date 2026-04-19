package com.sunbeam;

public class TextAnalyzer {

    public static class Result {
        int vowels;
        int consonants;
        int digits;
        int spaces;
        int specialChars;
        int totalChars;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Total Characters: ").append(totalChars).append("\n");
            sb.append("Vowels: ").append(vowels).append("\n");
            sb.append("Consonants: ").append(consonants).append("\n");
            sb.append("Digits: ").append(digits).append("\n");
            sb.append("Spaces: ").append(spaces).append("\n");
            sb.append("Special Characters: ").append(specialChars).append("\n");

            if (totalChars > 0) {
                sb.append("Vowel %: ").append((vowels * 100.0) / totalChars).append("\n");
                sb.append("Consonant %: ").append((consonants * 100.0) / totalChars).append("\n");
            }

            return sb.toString();
        }
    }

    public static Result analyze(String text) {
        Result res = new Result();

        for (char ch : text.toCharArray()) {
            res.totalChars++;

            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    res.vowels++;
                else
                    res.consonants++;
            } else if (Character.isDigit(ch)) {
                res.digits++;
            } else if (Character.isWhitespace(ch)) {
                res.spaces++;
            } else {
                res.specialChars++;
            }
        }

        return res;
    }
}