package _015_Questions_on_String;
/*
    Problem : Write a java program to fill in a letter template which looks like below:
                letter = "Dear<|name|>, Thanks a lot"
                Replace <\name\> with a String (some name)
 */
public class Question03 {
    public static void main(String[] args) {
        String str = "Dear <|name|> , Thanks a lot! ";
        System.out.println(str.replace("<|name|>","Kallu"));
    }
}
