package Practise_set;

public class Chapter_3 {
    public static void main(String[] args) {

    // Problem 1 : Write a java program to convert a string to lowercase ?


    String name = "KAmAL and HemanT" ;
    name = name.toLowerCase();
    System.out.println(name);

    // Problem 2 : Write a java program to replace space with underscores.

    String text = "How are you Kunal";
    text = text.replace(" " , "_");
    //System.out.println(text.replace(" " , "_"));  // It also work directly
    System.out.println(text);

    //Problem 3 :

    String letter = "Dear <|name|> , Thanks a lot ";
    letter = letter.replace("<|name|>", "Kamal");
    System.out.println(letter);

    //Problem 4 : Write a java program to detect double and triple space in a string

    String mystring = "What  are  you   doing in your whole day ";
    System.out.println(mystring.indexOf(" "));
    System.out.println(mystring.indexOf("   "));


    //Problem 5 :  Write a java program to format the following letters using escape sequence characters
        //  " Dear Kamal, This java course is Nice .Thanks! "

    String words = "Dear Kamal,\n\tThis java course is Nice.\nThanks! ";
    System.out.println(words);


    }
}
