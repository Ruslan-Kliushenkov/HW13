import java.time.LocalDate;

public class main {
    public static void main(String[] args) throws LegalException, ExistException {

        Driver driver1 = new Driver(1111, "Alex Abrams");
        driver1.setA(true);
        driver1.setaOne(true);
        driver1.setB(true);

        driver1.showInfo();

        Driver driver2 = new Driver(21111, "Alex Abrams");
        driver2.setA(true);
        driver2.setaOne(true);
        driver2.setB(true);

        driver2.showInfo();

        Driver driver3 = new Driver(1222, "Alex Abrams");
        driver3.setA(true);
        driver3.setaOne(true);
        driver3.setB(true);
        driver3.setDateOfRegistration(LocalDate.parse("1991-06-08"));

        driver3.showInfo();
    }
}
