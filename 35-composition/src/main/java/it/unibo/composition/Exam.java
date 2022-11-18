package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room;
    private Student[] students;

    public Exam(final int id, final int max, final String courseName, final Professor prof, final ExamRoom room) {
        this.id = id;
        this.maxStudents = max;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = prof;
        this.room = room;
        this.students = new Student[0];
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getRegistered() {
        return registeredStudents;
    }

    public void setRegistered(int registered) {
        this.registeredStudents = registered;
    }

    public void registerStudents(Student student) {
        if (getRegistered() < getMaxStudents() ) {
            students = Arrays.copyOf(students, students.length + 1);
            students[registeredStudents] = student;
            registeredStudents ++;
        }   
           
    }
    public String toString() {
        return "id esame: " + id + "\nnumero massimo studenti: " + getMaxStudents()
        + "\nstudenti già registrati: " + getRegistered() + "\nnome corso: " + courseName
        + "\nprofessore: " + professor.getUsername() + "\nstanza: " + room.getDescription()
        + "\nstudenti: " + Arrays.toString(students);
    }
}


