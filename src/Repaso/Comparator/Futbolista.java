package Repaso.Comparator;

public class Futbolista implements Comparable{
    String name;
    String team;
    int age;
    Position position;

    public Futbolista(String name, String team, int age, Position position) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Futbolista) {
            Futbolista futbolista = (Futbolista) o;
            return this.getName().compareTo(futbolista.getName());
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}
