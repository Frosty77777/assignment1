public class task30 {
    public static String city = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String localCity, double localPopulation) {
        System.out.println("Население города " + localCity + " составляет " + localPopulation + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + city + " население составляет " + population + " млн человек.");
    }
}
