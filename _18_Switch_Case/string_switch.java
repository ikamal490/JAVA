package _18_Switch_Case;

public class string_switch {
    public static void main(String[]args){

        String var = " shefali ";
    switch(var){
        case " kamal ":
            System.out.println("You are a Awesome guy");
            break;
        case " shubham ":
            System.out.println("You are ugly guy");
            break;
        case " shefali ":
            System.out.println("She is most prettiest girl in whole universe");
            break;
        default:
            System.out.println("Type correct ");

        }
// We can also write this code in enhanced form ::

        String str = " kamal ";
        switch (str) {
            case " kamal " -> System.out.println("You are a Awesome guy");
            case " shubham " -> System.out.println("You are ugly guy");
            case " shefali " -> System.out.println("She is most prettiest girl in whole universe");
            default -> System.out.println("Type correct ");
        }



    }
}
