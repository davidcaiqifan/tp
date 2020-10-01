package tp.cap5buddy.logic.commands;

import java.util.ArrayList;

import tp.cap5buddy.modules.Module;
import tp.cap5buddy.modules.ModuleList;



/**
 * Represents the CalculateCapCommand class.
 */
public class CalculateCapCommand extends Command {
    private static final String SUCCESS_MESSAGE = "Module details have been displayed successfully!";
    private ArrayList<Module> modules;
    private String moduleName;

    public CalculateCapCommand(String[] commandArguments) {
        this.moduleName = commandArguments[3];
    }

    /**
     * Executes the main function of this command, to calculate and show CAP.
     * @return String success message.
     */
    public ResultCommand execute(ModuleList modules) {
        double cap = calculateCap(modules);
        return new ResultCommand("Your CAP is : " + cap + "\n"
                + SUCCESS_MESSAGE, isExit());
    }

    private double calculateCap(ModuleList modules) {
        double totalMC = 0.0;
        double totalGradePoints = 0.0;
        for (Module m : modules.getModules()) {
            totalMC += m.getCredits();
            totalGradePoints += m.getGrade() * m.getCredits();
        }
        return totalGradePoints / totalMC;
    }
    /**
     * Indicates if the application session has ended.
     *
     * @return False since the sessions has not been terminated.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
