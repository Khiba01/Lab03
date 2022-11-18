package it.unibo.composition;

public class Professor implements User {

    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    Professor(final int id, final String name, final String surname, final String pas, final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = pas;
        this.courses=courses;
    }    

    public void replaceCourse(final String s, final int i) {
        this.courses[i] = s;
    }

    public void replaceCourseAllCourses(final String[] aS) {
        this.courses = aS;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.name + " " + this.surname;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
