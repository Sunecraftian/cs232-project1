import java.time.LocalTime;

public abstract class Course {
        
        /* Fields */
        
        private String name;
        private int crn;
        private String number;
        private int section;
        private int credits;
        private LocalTime start;
        private LocalTime stop;
        private String days;
        private String room;
        private String type;
        private String instructor;

        /* Getters */

        public String getName() {
            return name;
        }
        
        public int getCrn() {
            return crn;
        }
        
        public String getNumber() {
            return number;
        }
        
        public int getSection() {
            return section;
        }
        
        public int getCredits() {
            return credits;
        }
        
        public LocalTime getStart() {
            return start;
        }
        
        public LocalTime getStop() {
            return stop;
        }
        
        public String getDays() {
            return days;
        }

        public String getRoom() {
            return room;
        }
        
        public String getType() {
            return type;
        }
        
        public String getInstructor() {
            return instructor;
        }
        
        /* Setters */
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setCrn(int crn) {
            this.crn = crn;
        }
        
        public void setNumber(String number) {
            this.number = number;
        }
        
        public void setSection(int section) {
            this.section = section;
        }
        
        public void setCredits(int credits) {
            this.credits = credits;
        }
        
        public void setStart(LocalTime start) {
            this.start = start;
        }
        
        public void setStop(LocalTime stop) {
            this.stop = stop;
        }
        
        public void setDays(String days) {
            this.days = days;
        }

        public void setRoom(String room) {
            this.room = room;
        }
        
        public void setType(String type) {
            this.type = type;
        }
        
        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }
       

        /* Methods */

        public abstract boolean conflictsWith(Course c);
}
