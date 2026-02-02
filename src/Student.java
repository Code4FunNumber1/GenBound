import java.util.Objects;

/**
 * Represents a student.
 *
 */
public final class Student implements HasId {
    private final int id;
    private final String name;


    /**
     * Constructs a new student with id and name.
     *
     * @param id   id of student
     * @param name name of student
     */
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the name of the student.
     *
     * @return Name of the student.
     */
    public String name() {
        return name;
    }

    @Override
    public int id() {
        return id;
    }
}
