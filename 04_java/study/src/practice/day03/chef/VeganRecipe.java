package practice.day03.chef;

public class VeganRecipe extends Recipe {
    public VeganRecipe() {
        this.title = "두부 샐러드";
        this.cookTime = 10;
        this.isVegan = true;
    }

    @Override
    public String getDescription() {
        return "신선한 두부 샐러드를 추천합니다.";
    }

    public String toString() {
        if (this.isVegan) {
            String vegan = "비건";
            return (title + " (" + cookTime + "분) - " + vegan);
        }
        else {
            String vegan = "비건 아님";
            return (title + " (" + cookTime + "분) - " + vegan);
        }
    }
}
