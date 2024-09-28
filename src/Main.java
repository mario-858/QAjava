//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int eaters = 5; // сколько людей будут есть
        int water = 3000; // миллитров воды
        int potatoes = 5; // картофель
        int chicken = 6; // куринных бедер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп на одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелен(а/ы)");
        System.out.println((chicken / eaters) + " куринных(ое) бедер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");

    }
}