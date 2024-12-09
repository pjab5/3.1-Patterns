package Level1;

import java.util.ArrayList;

public class Undo {
    private ArrayList<String> commands;
    private static Undo myundo;
    private Undo(){
        commands = new ArrayList<>();
    }

    public static Undo getUndo(){
        if (myundo == null){
            myundo = new Undo();
        }
        return myundo;
    }
    public ArrayList<String> getCommand() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }
    public void deleteCommand(String command) {
        commands.remove(command);
    }
}
