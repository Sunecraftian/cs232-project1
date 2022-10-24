public class TraditionalCourse extends Course {

    @Override
    public String toString() {
        return String.format("#%d: %s-%03d (%s), %s, %s, %s - %s, %s, %s",
                getCrn(), getNumber(), getSection(), getName(), getInstructor(), getType(), getStart(), getStop(), getDays(), getRoom()); 
    }

    public boolean conflictsWith(Course c) {
        boolean conflicts = false;

        if (getCrn() == c.getCrn()) {
            conflicts = true;
        }

        if (getNumber().equals(c.getNumber())) {
            conflicts = true;
        }

        if (getDays().equals(c.getDays())) {
            if (getStart().isBefore(c.getStop()) && getStop().isAfter(c.getStart())) {
                conflicts = true;
            }

            if (getStart().isAfter(c.getStart()) && getStart().isBefore(c.getStop())) {
                conflicts = true;
            }

            if (getStop().isAfter(c.getStart()) && getStop().isBefore(c.getStop())) {
                conflicts = true;
            }

            if (getStart().equals(c.getStart()) && getStop().equals(c.getStop())) {
                conflicts = true;
            }

            if (getStart().isBefore(getStart()) && getStop().isAfter(c.getStop())) {
                conflicts = true;
            }

        }

        return conflicts;
    }
}
