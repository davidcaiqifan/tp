package tp.cap5buddy.logic.commands;

import tp.cap5buddy.modules.Module;
import tp.cap5buddy.modules.ModuleList;

/**
 * Represents the AddModuleCommand class.
 */
public class AddModuleCommand extends Command {
    private static final String SUCCESS_MESSAGE = " has been added successfully!";
    private final String name;
    private final String link;
    private final String grade;
    private final String credits;

    /**
     * Represents the constructor to making the AddModuleCommand object.
     *
     * @param info array of tokenised info.
     */
    public AddModuleCommand(String modName, String modLink) {
        this.name = modName;
        this.link = modLink;
        this.grade = "4";
        this.credits = "4";
    }

    public AddModuleCommand(String modName, String modLink, String modCredits, String modGrade) {
        this.name = modName;
        this.link = modLink;
        this.credits = modCredits;
        this.grade = modGrade;
    }

    /**
     * Executes the main function of this command, to create a new module.
     *
     * @return ResultCommand ResultCommand object.
     */
    public ResultCommand execute(ModuleList modules) {
        if (this.link == null && this.grade == null) {
            Module mod = new Module(this.name);
            modules.addModule(mod);
        } else if (this.grade == null && this.credits == null) {
            Module mod = new Module(this.name, this.link);
            modules.addModule(mod);
        } else if (this.credits == null) {
            double grade = Double.parseDouble(this.grade);
            Module mod = new Module(this.name, this.link, grade);
            modules.addModule(mod);
        }
        else {
            double grade = Double.parseDouble(this.grade);
            double credits = Double.parseDouble(this.credits);
            Module mod = new Module(this.name, this.link, credits, grade);
            modules.addModule(mod);
        }
        return new ResultCommand(this.name + SUCCESS_MESSAGE, isExit());
    }
    @Override
    public boolean isExit() {
        return false;
    }
}
