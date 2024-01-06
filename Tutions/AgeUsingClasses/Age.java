package Tutions.AgeUsingClasses;

public class Age {
    int year, month, day;

    Age(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        int Y, M, D;
        Age currentDate = new Age(2024, 1, 6);

        Age userDate = new Age(2006, 2, 21);

        // Process of counting the age
        Y = currentDate.year - userDate.year;
        M = currentDate.month - userDate.month;
        D = currentDate.day - userDate.day;

        if (D < 0) {
            M--;
            D += 30;
        }
        if (M < 0) {
            Y--;
            M += 12;
        }

        // The third object for getting the date
        Age ageObj = new Age(Y, M, D);

        System.out.println(ageObj.year);
        System.out.println(ageObj.month);
        System.out.println(ageObj.day);
    }
}
