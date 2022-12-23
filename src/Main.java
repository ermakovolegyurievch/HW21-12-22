public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.0f;
        double f = 6.0;
        System.out.println("Значение переменной a с типом int равно 1.");
        System.out.println("Значение переменной b с типом byte равно 2.");
        System.out.println("Значение переменной c с типом short равно 3.");
        System.out.println("Значение переменной d с типом long равно 4.");
        System.out.println("Значение переменной e с типом float равно 5.");
        System.out.println("Значение переменной f с типом  double равно 6.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int paper = 480;
        int everyStudentHave = paper / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + everyStudentHave + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int performanceMin = 16 / 2;
        int performance20Min = performanceMin * 20;
        int performance24Hours = performanceMin * 60 * 24;
        int performance3Days = performanceMin * 60 * 24 * 3;
        int performanceMonth = performanceMin * 60 * 24 * 30;
        System.out.println("За за 20 минут машина произвела " + performance20Min + " штук бутылок.");
        System.out.println("За за сутки машина произвела " + performance24Hours + " штук бутылок.");
        System.out.println("За за 3 дня машина произвела " + performance3Days + " штук бутылок.");
        System.out.println("За за месяц машина произвела " + performanceMonth + " штук бутылок.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int allPaint = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int allPaintClass = whitePaintOneClass + brownPaintOneClass;
        int allNumberClasses = allPaint / (allPaintClass);
        int allWhitePaint = allNumberClasses * whitePaintOneClass;
        int allBrownPaint = allNumberClasses * brownPaintOneClass;
        System.out.println("В школе, где " + allNumberClasses + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 80;
        int allBananas = banana * 5;
        int milk = 105;
        int allMilk = milk * 2;
        int iceCream = 100;
        int allIceCream = iceCream * 2;
        int egg = 70;
        int allEggs = egg * 4;
        float allWeight = allBananas + allMilk + allIceCream + allEggs;
        float allWeightInKg = allWeight / 1000;
        System.out.println(allWeightInKg);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weight = 7 * 1000;
        int dayWeightLowLoss = weight / 250;
        int dayWeightHighLoss = weight / 500;
        int dayWeightMiddleLoss = (dayWeightLowLoss + dayWeightHighLoss) / 2;
        System.out.println(dayWeightLowLoss);
        System.out.println(dayWeightHighLoss);
        System.out.println(dayWeightMiddleLoss);
    }

    public static void task8() {
        System.out.println("Задача 8");
        float masha = 67760f;
        float den = 83690f;
        float chris = 76230f;
        float monthTotalMasha = masha / 100 * 10 + masha;
        float monthTotalDen = den / 100 * 10 + den;
        float monthTotalChris = chris / 100 * 10 + chris;
        float yearTotalMasha = monthTotalMasha * 12;
        float yearTotalDen = monthTotalDen * 12;
        float yearTotalChris = monthTotalChris * 12;
        float differenceYearMasha = yearTotalMasha - masha * 12;
        float differenceYearDen = yearTotalDen - den * 12;
        float differenceYearChris = yearTotalChris - chris * 12;
        System.out.println("Маша теперь получает " + monthTotalMasha + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей.");
        System.out.println("Денис теперь получает " + monthTotalDen + " рублей. Годовой доход вырос на " + differenceYearDen + " рублей.");
        System.out.println("Кристина теперь получает " + monthTotalChris + " рублей. Годовой доход вырос на " + differenceYearChris + " рублей.");
    }
}
