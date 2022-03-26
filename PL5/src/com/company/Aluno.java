package com.company;

    public class Aluno implements Comparable<Aluno> {

        private String name;
        private int year;
        private String student_class;

        public Aluno(String name, int year, String sclass) {
            this.name = name;
            this.year = year;
            this.student_class = sclass;
        }

        public Aluno(Aluno student) {
            this.name = student.getName();
            this.year = student.getYear();
            this.student_class = student.getStudentClass();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getStudentClass() {
            return student_class;
        }

        public void setStudentClass(String student_class) {
            this.student_class = student_class;
        }

        public Aluno clone() {
            return new Aluno(this);
        }

        /**
         * Método da ordem natural
         */

        public int compareTo(Aluno a) {
            return this.name.compareTo(a.getName());
        }

    }
