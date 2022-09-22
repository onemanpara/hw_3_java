package me.mwi;

public class DataTypes {

    public static void main(String[] args) {
        int valueFirst = 125;
        int valueSecond = 3;
        double valueTochka = 1.15;
        String valueText = "Text";
        //Использование математических операторов
        System.out.println(valueFirst + valueSecond);
        System.out.println(valueFirst - valueSecond);
        System.out.println(valueFirst * valueSecond);
        System.out.println(valueFirst / valueSecond);
        System.out.println(valueFirst % valueSecond);
        //Переполненение переменной при вычислении
        byte valueThird = 120;
        byte valueFourth = 10;
        byte summ = (byte) (valueThird + valueFourth);
        System.out.println(summ);

        //Условные операторы
        if (valueThird > valueFourth) {
            System.out.println("Третье значение больше");
        } else if (valueThird < valueFourth) {
        System.out.println("Четвёртое значение больше");
        } else System.out.println("Значения равны");

        if (valueFirst != valueSecond) {
            System.out.println("Первое и второе значения не равны.");
        }
        if (valueFirst > valueSecond && valueFirst > valueTochka) {
            System.out.println("Первое значение больше второго и третьего");
        }
        if (valueTochka < valueSecond || valueTochka < valueFirst) {
            System.out.println("Значение с плавающей точкой меньше второго или первого значения");
        }

        //Вычисление между разными типами данных:
            //Int плюс строка:
        System.out.println(valueTochka + valueText);
            //Int умножить на double:
        System.out.println(valueFirst * valueTochka);
    }
}
