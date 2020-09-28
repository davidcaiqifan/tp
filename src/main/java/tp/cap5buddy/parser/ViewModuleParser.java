package tp.cap5buddy.parser;

import tp.cap5buddy.commands.Command;
import tp.cap5buddy.commands.ResultCommand;
import tp.cap5buddy.commands.ViewModuleCommand;

/**
 * Represents the parser that handles Add Module command.
 */
public class ViewModuleParser extends Parser {
    private ViewModuleCommand command;

    public Command parse(String[] words) {
        this.command = new ViewModuleCommand();
        return this.command;
    }

    /**
     * Executes the command based on the info inside.
     * @return ResultCommand the result container.
     */
    public ResultCommand execute() {
        return this.command.execute();
    }
}
