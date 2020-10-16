package seedu.address.model.task;

import java.util.Optional;

import seedu.address.model.tag.Tag;

/**
 * Represents a Task in the todo list.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Task {
    private final TaskName name;
    private final Tag tag;
    private final Priority priority;
    private final Date date;
    private final Status status;

    /**
     * Only name of the task is compulsory.
     *
     * @param name name of the task
     * @param tag tags related to the task
     * @param priority priority of the task
     * @param date date of the task
     * @param status status of the task
     */
    public Task(TaskName name, Tag tag, Priority priority, Date date, Status status) {
        this.name = name;
        this.tag = tag;
        this.priority = priority;
        this.date = date;
        this.status = status;
    }

    /**
     * Constructor to avoid having null as arguments.
     *
     * @param name name of the task
     */
    public Task(TaskName name) {
        this.name = name;
        this.tag = null;
        this.priority = null;
        this.date = null;
        this.status = null;
    }

    public Optional<TaskName> getName() {
        return Optional.ofNullable(this.name);
    }

    public Task setName(TaskName name) {
        return new Task(name, this.tag, this.priority, this.date, this.status);
    }

    public Optional<Tag> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public Task setTag(Tag tag) {
        return new Task(this.name, tag, this.priority, this.date, this.status);
    }

    public Optional<Priority> getPriority() {
        return Optional.ofNullable(this.priority);
    }

    public Task setPriority(Priority priority) {
        return new Task(this.name, this.tag, priority, this.date, this.status);
    }

    public Optional<Date> getDate() {
        return Optional.ofNullable(this.date);
    }

    public Task setDate(Date date) {
        return new Task(this.name, this.tag, this.priority, date, this.status);
    }

    public Optional<Status> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public Task setStatus(Status status) {
        return new Task(this.name, this.tag, this.priority, this.date, status);
    }

    /**
     * Returns true if both task of the same name have the same type and date.
     * This defines a weaker notion of equality between two tasks.
     *
     * @param otherTask other task to be compared
     * @return true if both task has the same name, type, and date
     */
    public boolean isSameTask(Task otherTask) {
        if (this == otherTask) {
            return true;
        }

        return getTag().equals(otherTask.getTag())
            && getName().equals((otherTask.getName()))
            && getDate().equals(otherTask.getDate());
    }

    /**
     * Checks if two tasks are equal.
     * This defines a stronger equality between two tasks.
     *
     * @param other other task to be compared
     * @return true if both task have the same name, type, priority, date, and status
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Task)) {
            return false;
        }

        Task otherTask = (Task) other;
        return otherTask.getName().equals(getName())
            && otherTask.getTag().equals(getTag())
            && otherTask.getPriority().equals(getPriority())
            && otherTask.getDate().equals(getDate())
            && otherTask.getStatus().equals(getStatus());
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(" *Name: ")
                .append(getName())
                .append("\n")
                .append(" *Tag: ")
                .append(getTag())
                .append("\n")
                .append(" *Priority: ")
                .append(getPriority())
                .append("\n")
                .append(" *Date: ")
                .append(getDate())
                .append("\n")
                .append("Status: ")
                .append(getStatus())
                .append("\n");
        return builder.toString();
    }

}
