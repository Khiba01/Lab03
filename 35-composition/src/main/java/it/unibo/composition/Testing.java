package it.unibo.composition;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.imageio.spi.RegisterableService;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student primo = new Student(1, "bruno", "manz", "lol", 2000);
        Student sec = new Student(2, "lello", "kkk", "nonso", 2001);
        Student third = new Student(3, "Bob", "man", "gesu", 2019);
        // 2)Creare 2 docenti a piacere
        Professor uno = new Professor(1, "gioria", "napoli", "so", new String[]{"piedi", "ani", "susThing"});
        Professor due = new Professor(2, "cazzo", "bushido", "yoo", new String[]{"negus", "bababoi"});
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom stanzone = new ExamRoom(80, "un bel posto", false, true);
        ExamRoom stanzina = new ExamRoom(100, "un piccolo cinema", true, true);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam test1 = new Exam(1, 2, "Jojoleria", due, stanzina);
        Exam test2 = new Exam(2, 10, "sax ", uno, stanzone);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        test1.registerStudents(primo);
        test1.registerStudents(sec);
        test1.registerStudents(third);
        test2.registerStudents(primo);
        test2.registerStudents(sec);
        test2.registerStudents(third);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(test1);
        System.out.println(test2);
        
    }
}
