
public class OnlineCourse extends Course {

    @Override
    public String toString() {
        return String.format("#%d: %s-%03d (%s), %s, %s",
                getCrn(), getNumber(), getSection(), getName(),
                getInstructor(), getType());
    }

    public boolean conflictsWith(Course c) {
        boolean conflicts = false;

        if (getCrn() == c.getCrn()) {
            conflicts = true;
        }

        if (getNumber().equals(c.getNumber())) {
            conflicts = true;
        }

        return conflicts;
    }
}
