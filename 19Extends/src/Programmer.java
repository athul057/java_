import java.util.Arrays;
import java.util.Objects;

public class Programmer extends Employee{
    private String[] programmingLanguages;

    public Programmer(String name, int age, int empId, int experience, String[] programmingLanguages) {
        super(name, age, empId, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                "} "+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Objects.deepEquals(programmingLanguages, that.programmingLanguages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(programmingLanguages));
    }

    @Override
    public void saysHi() {
        System.out.println(this.name);
        System.out.println("Hello soooooper");
    }
}
