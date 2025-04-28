package practice.day06;

public class MaleCelebrity implements Celebrity{
    private String name;

    public MaleCelebrity(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return getName().equals(((MaleCelebrity) obj).getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "남자 연예인: " + getName();
    }
}
