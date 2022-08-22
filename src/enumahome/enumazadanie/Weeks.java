package enumahome.enumazadanie;

public enum Weeks {
    MONDAY("Duyshombu kunu Java okuym."),
    TUESDAY("Sheyshembi kunu praktika bolot."),
    WEDNESDAY("Sharshembi kunu anglis til okuym."),
    THURSDAY("Beyshembi kunu kayra Java."),
    FRIDAY("Juma kunu kayra praktika bolot."),
    SATURDAY("Ishembi kunu orus til okuym."),
    SUNDAY("Jelkshembi kunu kaytaloo bolot.");

    String lesson;

    Weeks(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Weeks:" + " " +
                "lesson: " + lesson ;

    }
}
