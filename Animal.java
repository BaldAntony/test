package DataStructure;

import java.time.Period;
import java.util.Objects;

public class Animal implements Comparable {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int a = this.name.hashCode();
        int b = this.name.hashCode();
        return a+b;
    }

    @Override
    public int compareTo(Object o) {
        Animal a = (Animal)o;
        if (this.name != a.getName()){
            return 1;
        }
        else if (this.getAge() != a.getAge()){
            return 1;
        }
        else return 0;
    }
}
