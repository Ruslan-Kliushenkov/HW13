import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Driver {
    private String name;
    private Integer driverHash;

    private boolean aOne;
    private boolean a;
    private boolean bOne;
    private boolean b;
    private boolean cOne;
    private boolean c;
    private boolean dOne;
    private boolean d;
    private boolean t;
    private LocalDate dateOfRegistration;
    static HashSet<Integer> hashSet = new HashSet<>();


    Driver(Integer driverHash, String name) throws ExistException {
        if (hashSet.contains(driverHash)) {
            throw new ExistException("Водитель с таким номером лицензии уже существует");
        }

        hashSet.add(driverHash);
        this.driverHash = driverHash;
        this.name = name;
        dateOfRegistration = LocalDate.now();
    }

    Driver(Integer driverHash, String name, boolean aOne, boolean a, boolean bOne, boolean b, boolean cOne, boolean c,
           boolean dOne, boolean d, boolean t, LocalDate dateOfRegistration) throws ExistException {
        if (hashSet.contains(driverHash)) {
            throw new ExistException("Водитель с таким номером лицензии уже существует");
        }
        hashSet.add(driverHash);
        this.driverHash = driverHash;
        this.name = name;
        this.aOne = aOne;
        this.a = a;
        this.bOne = bOne;
        this.b = b;
        this.cOne = cOne;
        this.c = c;
        this.dOne = dOne;
        this.d = d;
        this.t = t;
        this.dateOfRegistration = dateOfRegistration;
    }


    public void setaOne(boolean aOne) {
        this.aOne = aOne;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public void setbOne(boolean bOne) {
        this.bOne = bOne;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void setcOne(boolean cOne) {
        this.cOne = cOne;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public void setdOne(boolean dOne) {
        this.dOne = dOne;
    }

    public void setD(boolean d) {
        this.d = d;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public ArrayList<String> getInfo() throws LegalException {
        LegalTerm.calcLegal(dateOfRegistration);
        ArrayList<String> category = new ArrayList<>();
        if (aOne) category.add("A1");
        if (a) category.add("A");
        if (bOne) category.add("B1");
        if (b) category.add("B");
        if (cOne) category.add("C1");
        if (c) category.add("C");
        if (dOne) category.add("D1");
        if (d) category.add("D");
        if (t) category.add("T");

        return category;
    }

    public void showInfo() throws LegalException {
        System.out.println("Открытые категории водителя: " + getInfo());
    }


}
