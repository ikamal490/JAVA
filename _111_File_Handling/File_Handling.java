package _111_File_Handling;

public class File_Handling {
    public static void main(String[] args) {

        // Code to create a new File:
        /*
        File myFile = new File("Langur_ne_khaye_angur.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create");
            e.printStackTrace();
        }

        // Code to write to a File:
        try {
            FileWriter fileWriter = new FileWriter("Langur_ne_khaye_angur.txt");
            fileWriter.write("BC dimag kharab ho gya langur ko angur khilate khilate\n okay bhai me jaa rha hu");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        // Reading a file
        File myFile = new File("Langur_ne_khaye_angur.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
         */

        // Deleting a file:
//        File myFile = new File("Angur khatam ho gye");
//        if(myFile.delete()){
//            System.out.println("I have deleted " +myFile.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting the file");
//        }
    }
}
