package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Сипин Антон");
        student.setGroup("Стажер");
        student.setDate("15.10.2019");
        System.out.println("ФИО: " + student.getFio() + " Группа: " + student.getGroup() + " Дата поступления: " + student.getDate());
    }
}
