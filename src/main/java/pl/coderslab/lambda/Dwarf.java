package pl.coderslab.lambda;

public class Dwarf implements Comparable<Dwarf>{
    private int age;

    public Dwarf(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dwarf dwarf) {

        return 0;
    }
}
