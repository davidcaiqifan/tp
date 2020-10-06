package tp.cap5buddy.logic.parser;

import tp.cap5buddy.logic.commands.AddModuleCommand;
import tp.cap5buddy.logic.commands.Command;
import tp.cap5buddy.logic.parser.exception.ParseException;


/**
 * Represents the parser that handles Add Module command.
 */
public class AddModuleParser extends Parser {
    private AddModuleCommand command;

    /**
     * Represents the function call that passes info into the Command object.
     *
     * @param userInput tokenised information.
     * @return Command the respective command type.
     */
    public Command parse(String userInput) throws ParseException {
        Tokenizer token = new Tokenizer(userInput, PrefixList.MODULE_NAME_PREFIX, PrefixList.MODULE_LINK_PREFIX,
                PrefixList.MODULE_CREDIT_PREFIX, PrefixList.MODULE_GRADE_PREFIX);
        String[] parsedArguments = token.tokenize();
        String modName = parsedArguments[0];
        String modLink = parsedArguments[1];
        String modCredit = parsedArguments[2];
        String modGrade = parsedArguments[3];
        this.command = new AddModuleCommand(modName, modLink, modCredit, modGrade);
        return this.command;
    }

}
