package com.softserve.edu09.hw.task02;

public class Subject {
        private String subjectName;
        private int grade;

        public Subject() {
        }

        public Subject(String subjectName, int grade) {
            this.subjectName = subjectName;
            this.grade = grade;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Subject{" +
                    "subjectName='" + subjectName + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }

