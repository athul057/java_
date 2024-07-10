public class Person {
    private String name;
    private int num;
    public static int count=0;
    Gender sex;

    public Person(String name, int num, Gender sex) {
        this.name = name;
        this.num = num;
        this.sex = sex;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", sex=" + sex +
                '}';
    }
}
