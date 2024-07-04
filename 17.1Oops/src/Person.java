import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Cat [] cat;

    public Person(Cat[] cat, String name, int age) {
        this.cat = cat;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat[] getCat() {
        return cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCat(Cat[] cat) {
        this.cat = cat;
    }




    @Override
    public String toString() {
        StringBuilder catNames = new StringBuilder();
        catNames.append("[");
        if (cat != null && cat.length > 0) {
            for (int i = 0; i < cat.length; i++) {
                catNames.append(cat[i].getName());
                if (i < cat.length - 1) {
                    catNames.append(", ");
                }
            }
        }
        catNames.append("]");

        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat names=" + catNames.toString() +
                '}';
    }




}
