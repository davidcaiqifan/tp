package tp.cap5buddy.modules;

/**
 * Represents the Module creation class.
 */
public class Module {
    private final String name;
    private final String zoomLink;
    private final double grade;
    private final double credits;

    /**
     * Represents the module object constructor.
     * @param name name of module
     * @param zoomLink zoom link attached to module
     */
    public Module(String name, String zoomLink) {
        this.name = name;
        this.zoomLink = zoomLink;
        this.grade = 0;
        this.credits = 4;
    }

    /**
     * Represents the module object constructor.
     * @param name name of module
     * @param zoomLink zoom link attached to module
     * @param grade module grade
     */
    public Module(String name, String zoomLink, double grade) {
        this.name = name;
        this.zoomLink = zoomLink;
        this.grade = grade;
        this.credits = 4;
    }
    /**
     * Represents the module object constructor.
     * @param name name of module
     * @param zoomLink zoom link attached to module
     * @param grade module grade
     * @param credits modular credits;
     */
    public Module(String name, String zoomLink, double grade, double credits) {
        this.name = name;
        this.zoomLink = zoomLink;
        this.grade = grade;
        this.credits = credits;
    }
    /**
     * Represents the module object constructor.
     * @param name name of module
     */
    public Module(String name) {
        this.name = name;
        this.zoomLink = null;
        this.grade = 0;
        this.credits = 4;
    }

    /**
     * Returns the module name.
     * @return String module name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the zoom link of the module.
     * @return String zoom link.
     */
    public String getLink() {
        return this.zoomLink;
    }

    /**
     * Adds the zoom link for this module.
     * @param zoomLink zoom link.
     * @return Module a new Module with the input zoom link.
     */
    public Module addZoomLink(String zoomLink) {
        return new Module(this.getName(), zoomLink);
    }

    /**
     * Returns the grade of the module
     * @return Double grade
     */
    public double getGrade() {
        return this.grade;
    }
    public double getCredits() {
        return this.credits;
    }
    /**
     * Returns the credits of the module
     * @return Double grade
     */
    @Override
    public String toString() {
        return String.format("The zoom link for %s is %s", getName(), getLink());
    }
}
