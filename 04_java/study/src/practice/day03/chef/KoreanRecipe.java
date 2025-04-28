package practice.day03.chef;

public class KoreanRecipe extends Recipe {
    public KoreanRecipe() {
        this.title = "김치찌개";
        this.cookTime = 20;
        this.isVegan = false;
    }

    @Override
    public String getDescription() {
        return "매콤한 김치찌개를 추천합니다!";
    }

    @Override
    public String toString() {
        if (this.isVegan) {
            String vegan = "비건";
            return (title + " (" + cookTime + "분) - " + vegan);
        } else {
            String vegan = "비건 아님";
            return (title + " (" + cookTime + "분) - " + vegan);
        }
    }

    public String getSpicinessLevel() {
        return "맵기: ★★★☆☆";
    }
}
