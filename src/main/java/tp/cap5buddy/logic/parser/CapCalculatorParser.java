package tp.cap5buddy.logic.parser;

import tp.cap5buddy.logic.commands.AddModuleCommand;
import tp.cap5buddy.logic.commands.CalculateCapCommand;
import tp.cap5buddy.logic.commands.Command;
import tp.cap5buddy.logic.commands.ViewModuleCommand;
import tp.cap5buddy.logic.parser.exception.ParseException;

/**
 * Represents the parser that handles CapCalculator command.
 */
public class CapCalculatorParser extends Parser {

    /**
     * Parses a user input for a command to Calculate CAP.
     *
     * @param userInput
     * @return
     */
    public Command parse(String userInput) throws ParseException {
        return new CalculateCapCommand();
    }
}
