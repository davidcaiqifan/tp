package tp.cap5buddy.logic.parser;

import tp.cap5buddy.logic.commands.CalculateCapCommand;
import tp.cap5buddy.logic.commands.Command;
import tp.cap5buddy.logic.commands.ViewModuleCommand;

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
    public Command parse(String userInput) {
        Tokenizer token = new Tokenizer(userInput);
        String[] mod = token.getWords();
        return new CalculateCapCommand(mod);
    }
}
