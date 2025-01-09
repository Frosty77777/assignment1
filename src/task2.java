public class task2 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];
    public static void main(String[] args) {
        for(int i = 0; i<strings.length; i++){
            if(i % 2 == 0) {
                strings[i] = EVEN;
            }
            else{
                strings[i] = ODD;
            }
        }
        for(int i = 0; i<strings.length; i++){
            System.out.print(i+ "=");
            System.out.println(strings[i]);
        }
    }

}
