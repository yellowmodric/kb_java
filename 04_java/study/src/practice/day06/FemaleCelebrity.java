package practice.day06;

public class FemaleCelebrity implements Celebrity{
    private String name;

    public FemaleCelebrity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return getName().equals(((FemaleCelebrity)obj).getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "여자 연예인: " + getName();
    }
}
