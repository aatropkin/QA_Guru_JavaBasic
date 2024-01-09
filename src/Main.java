
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Типы данных:
//        byte a = 15; // byte — целочисленный тип, хранит целое число от -128 до 127 и занимает 1 байт памяти.
//        short b = 12; // short — целочисленный тип, хранит целое число от -32768 до 32767 и занимает 2 байта памяти.
//        int c = 123123; // int — целочисленный тип, хранит целое число от -2147483648 до 2147483647 и занимает 4 байта памяти.
//        long d = 234324132434234l; // long — целочисленный тип, хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт памяти.
//        float e = 32423432.23F; //float — хранит число с плавающей точкой от -3.4E+38 до 3.4E+38.
//        double k = 32423432.234324; //float — хранит число с плавающей точкой от -3.4E+38 до 3.4E+38.
//        char m = 'a'; //char — хранит одиночный символ и занимает 2 байта памяти
//        String car = "VAZ"; // String — строковые переменные, не представляют собой примитивы и хранят в себе целые строки
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b)); //30
        System.out.println("a - b = " + (a - b)); //-10
        System.out.println("a * b = " + (a * b)); //200
        System.out.println("b / a = " + (b / a)); //2
        System.out.println("b % a = " + (b % a)); //0
        System.out.println("c % a = " + (c % a)); // 5
        System.out.println("a++   = " +  (a++)); //10
        System.out.println("b--   = " +  (a--)); //11
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++)); // = 25 (сначала выводим потом инкриментим, будет 26)
        System.out.println("++d   = " +  (++d)); //27  (инкрементим 26 + 1 и выводим будет 27)
        byte R = 127;
        byte M = (byte) (R + 1);
        System.out.println(M); // = -128 отсчет начинается заново - как стрелка часов мотает по кругу

        boolean isAct = true;
        boolean isEquipment = false;
        a = 10;
        b = 20;
        System.out.println("Если a = " + a + ", " + "b = " + b);
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        a = 10;
        b = 10;
        System.out.println("Если a = " + a + ", " + "b = " + b);
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
        a = 10;
        b = 9;
        System.out.println("Если a = " + a + ", " + "b = " + b);
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        boolean isString = "Вася" instanceof String;
        System.out.println(isString); // true

        boolean x = true;
        boolean y = false;
        System.out.println("a && b = " + (x && y));
        System.out.println("a || b = " + (x || y) );
        System.out.println("!(a && b) = " + !(x && y));


    }
}
