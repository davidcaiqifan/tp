package seedu.address.logic.commands.todolistcommands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.task.Task;


/**
 * Deletes a task identified using it's displayed index from the todo list.
 */
public class DeleteTodoCommand extends Command {

    public static final String COMMAND_WORD = "deletetask";

    public static final String MESSAGE_USAGE = COMMAND_WORD
        + ": Deletes the task identified by the index number used in the displayed todo list.\n"
        + "Parameters: INDEX (must be a positive integer)\n"
        + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_DELETE_TASK_SUCCESS = "Deleted Task: %1$s";

    private final Index targetIndex;

    public DeleteTodoCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Task> lastShownList = model.getFilteredTodoList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_TASK_DISPLAYED_INDEX);
        }

        Task taskToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deleteTask(taskToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_TASK_SUCCESS, taskToDelete));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof DeleteTodoCommand // instanceof handles nulls
            && targetIndex.equals(((DeleteTodoCommand) other).targetIndex)); // state check
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
