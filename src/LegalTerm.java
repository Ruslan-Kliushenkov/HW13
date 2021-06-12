import java.time.LocalDate;
import java.time.Period;


public class LegalTerm {

    public static boolean calcLegal(LocalDate oldDate) throws LegalException {

        Period period = Period.between(oldDate, LocalDate.now());

        if (period.getYears() >= 30) {
            throw new LegalException("Срок водительского удостоверения истёк");
        }
        return true;
    }
}
