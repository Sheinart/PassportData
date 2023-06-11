public class Main {
    public static void main(String[] args) {

        Findings findings = new Findings();

        findings.name = "Андрей";
        findings.surname = "Сергеевич";
        findings.patronymic = "Манохав";
        findings.passport = 113213;
        findings.subscription = true;

        System.out.println(findings.passport);

        Birthday birthday = new Birthday();

        birthday.day = 25;
        birthday.month = 10;
        birthday.year = 1995;

        System.out.println(birthday.year);
    }
}
