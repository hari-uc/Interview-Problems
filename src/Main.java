import java.util.Scanner;



public class Main{
    public static void main(String args[]){

        //input = r3d4a2c5
        //output = rrrddddaaccccc

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String userinput = sc.next();

        for(int i=0;i<userinput.length()-1;i++){
            char fletter = userinput.charAt(i);
            char snumber = userinput.charAt(i+1);
            int chartonum  = Integer.parseInt(String.valueOf(snumber));

            countnadd(fletter,chartonum);
            i++;
        }
    }
    public static void countnadd(char character, int count){
        for (int i=0;i<count;i++){
            System.out.print(character);
        }
    }


}
