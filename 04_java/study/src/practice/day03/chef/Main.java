package practice.day03.chef;

public class Main {
//    public static void main(String[] args) {
//        Recipe hyunsoo = new KoreanRecipe();
//        Recipe soyoung = new VeganRecipe();
//
//        System.out.println("[현수의 추천 레시피]");
//        System.out.println(hyunsoo.getDescription());
//        System.out.println(hyunsoo);
//        System.out.println();
//
//        System.out.println("[소영의 추천 레시피]");
//        System.out.println(soyoung.getDescription());
//        System.out.println(soyoung);
//    }
//public static void main(String[] args) {
//    Recipe[] recipes = {
//            new KoreanRecipe(),
//            new VeganRecipe(),
//            new FusionRecipe()
//    };
//
//    String[] names = { "현수", "소영", "민재" };
//
//    System.out.println("[AI 꾸미의 자동 레시피 추천 결과]\n");
//
//    for (int i = 0; i < recipes.length; i++) {
//        System.out.println(names[i] + "님께 추천: " + recipes[i].getDescription());
//    }
//}
    public static void main(String[] args) {
        System.out.println("복사편집");

        Recipe[] recipes = {
            new KoreanRecipe(),
            new VeganRecipe(),
            new FusionRecipe()
        };

        for (int i=0; i<recipes.length; i++) {
            System.out.println(recipes[i].getDescription());
            if (recipes[i] instanceof KoreanRecipe) {
                KoreanRecipe recipe = (KoreanRecipe) recipes[i];
                System.out.print("-> ");
                System.out.println(recipe.getSpicinessLevel());
            }
        }
    }
}
