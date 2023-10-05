package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task4 {
    private int numberOfStudents;
    private Season currentSeason;
    private int getNumberOfStudents;

    enum Season {
        SPRING("Весна"),
        SUMMER("Літо"),
        AUTUMN("Осінь"),
        WINTER("Зима");
        private final String seasonName;

        Season(String seasonName) {

            this.seasonName = seasonName;
        }

        public String getSeasonName() {

            return seasonName;
        }
    }
    public void Taks4 (int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }
    public int getNumberOfStudents() {
        return getNumberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    public Season getCurrentSeason() {
        return currentSeason;
    }
    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість студентів:");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Виберіть поточний сезон:");
        System.out.println("1. Весна");
        System.out.println("2. Літо");
        System.out.println("3. Осінь");
        System.out.println("4. Зима");
        System.out.print("Виберіть сезон:");
        int seasonChoice = scanner.nextInt();
        Season currentSeason;
        switch (seasonChoice) {
            case 1:
                currentSeason = Season.SPRING;
                break;
            case 2:
                currentSeason = Season.SUMMER;
                break;
            case 3:
                currentSeason = Season.AUTUMN;
                break;
            case 4:
                currentSeason = Season.WINTER;
                break;
            default:
                System.out.println("некорректний вибір сезону");
                return;
        }
        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println("Інформація про факультет:");
        System.out.println("Кількість студентів:" + faculty.getNumberOfStedents());
        System.out.println("Поточний сезон" + faculty.getCurrentSeason().getSeasonName());
    }




}
