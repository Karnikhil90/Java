package OOPs;

public class AgeObj {
    int years, months, days;

    AgeObj(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public static void main(String[] args) {
        AgeObj current = new AgeObj(2023, 12, 26);
        AgeObj person = new AgeObj(2006, 02, 21);
        AgeObj newAge = new AgeObj(current.years - person.years, current.months - person.months,
                current.days - person.days);
        System.out.println(newAge.years);
        System.out.println(newAge.months);
        System.out.println(newAge.days);
    }
}
