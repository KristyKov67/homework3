import javax.xml.transform.SourceLocator;

public class Main {
    public static void main(String[] args) {
        int apple = 1568495;
        float tigrTo = (float) 4.3246;
        byte learn = 45;
        short bob = -12129;
        long king = 12454546;
        double kind = 124.54556456745346;
        System.out.println("Задание 1 ");
        System.out.println(" Значение переменной apple с типом int равно " + apple);
        System.out.println(" Значение переменной tigrTo с типом float равно " + tigrTo);
        System.out.println(" Значение переменной learn с типом byte равно " + learn);
        System.out.println(" Значение переменной bob с типом short равно " + bob);
        System.out.println(" Значение переменной king с типом long равно " + king);
        System.out.println(" Значение переменной kind с типом double равно " + kind);

        System.out.println("Задание 2 ");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        char e = 569;
        short g = -159;
        int l = 27897;
        byte m = 67;

        System.out.println("Задание 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short buy = 480;
        System.out.println("На каждого ученика рассчитано " + (buy/(teacher1+teacher2+teacher3))+ " листов бумаги");

        System.out.println("Задание 4");
        byte prMin = 16/2; //в минуту
        int pr20Min = prMin * 20; // за 20 минут
        int pr1Day = prMin * 60 * 24; //за сутки
        int pr3Day = pr1Day * 3; // за 3 дня
        int pr1Month = pr1Day * 30; // за месяц
        System.out.println("За минуту машины произвела бутылок " + prMin + " штук");
        System.out.println("За 20 минут машины произвела бутылок " + pr20Min + " штук");
        System.out.println("За 1 день машины произвела бутылок " + pr1Day + " штук");
        System.out.println("За 3 дня машины произвела бутылок " + pr3Day + " штук");
        System.out.println("За 1 месяц машины произвела бутылок " + pr1Month + " штук");

        System.out.println("Задание 5");
        byte all = 120;
        byte remWhite = 2; //белой краски на 1 класс
        byte remRed = 4; // коричневой краски на 1 класс
        int kolClass = all/(remRed+remWhite);
        int kovWhite = kolClass * 2;
        int kovRed = kolClass * 4;
        System.out.println("В школе, где "+ kolClass + " классов, нужно "+ kovWhite + " банок белой краски и "+ kovRed + " банок коричневой краски");

        System.out.println("Задание 6");
        byte bananaWeigh = 80;
        byte bananaKol = 5;
        byte milkWeigh = 105;
        byte milkKol = 2;
        byte iceWeigh = 100;
        byte iceKol = 2;
        byte eggsWeigh = 70;
        byte eggsKol = 4;
        int rec = bananaWeigh * bananaKol + milkWeigh * milkKol + iceWeigh * iceKol + eggsKol * eggsWeigh ;
        int recKg = rec / 1000;
        int recG = rec % 1000;
        System.out.println("Вес завтрака составляет " + recKg + " кг и " + recG + " грамм" );

        System.out.println("Задание 7");
        byte weigh = 7;
        double minDieta = 0.2;
        double maxDieta = 0.5;
        double kolMinDieta = weigh / minDieta;
        double kolMaxDieta = weigh / maxDieta;
        double kolDieta = (kolMinDieta + kolMaxDieta) / 2;
        System.out.println("Если спортсмен будет терять по 200 грамм, то потребуется "+ kolMinDieta + "дней, если по 500 грамм, то " + kolMaxDieta + "дней, среднее количество дней " +kolDieta);

        System.out.println("Задание 8");
        int zpMasha = 67760;
        double zpNewMasha = zpMasha * 1.1;
        int zpDenis = 83690;
        double zpNewDenis = zpDenis * 1.1;
        int zpKristina = 76230;
        double zpNewKristina = zpKristina * 1.1;
        double godMasha = (zpNewMasha - zpMasha) * 12;
        double godDenis = (zpNewDenis - zpDenis) * 12;
        double godKristina = (zpNewKristina - zpKristina) * 12;
        System.out.println("Маша теперь получает "+zpNewMasha + " рублей. Годовой доход вырос на " + godMasha + " рублей" );
        System.out.println("Денис теперь получает "+zpNewDenis + " рублей. Годовой доход вырос на " + godDenis + " рублей" );
        System.out.println("Кристина теперь получает "+zpNewKristina + " рублей. Годовой доход вырос на " + godKristina + " рублей" );


    }
}