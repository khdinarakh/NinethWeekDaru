package com.company.student;

import java.util.Date;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int studyYear;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public int incrementYear() {
        return getStudyYear() + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && studyYear == student.studyYear && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), studyYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studyYear=" + studyYear +
                '}';
    }
}
