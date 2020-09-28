package tp.cap5buddy.commands;

import tp.cap5buddy.modules.Module;

import java.util.ArrayList;

/**
 * Represents the AddModuleCommand class.
 */
public class ViewModuleCommand extends Command {
    private static final String SUCCESS_MESSAGE = "Module details have been displayed successfully!";
    private ArrayList<Module> modules;

    //need a storage system
    public ViewModuleCommand(String ... modules) {
        for (String s : modules) {

        }
    }

    /**
     * Executes the main function of this command, to create a new module.
     * @return String success message.
     */
    public ResultCommand execute() {
        return new ResultCommand(SUCCESS_MESSAGE);
    }
}