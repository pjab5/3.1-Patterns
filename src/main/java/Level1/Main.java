package Level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Undo undo = Undo.getUndo();
        int n=3;
        while(n>0){
            undo.addCommand(input.nextLine());
            n--;
        }
        undo.deleteCommand(undo.getCommand().get(2));
        System.out.println(undo.getCommand());
    }
}
