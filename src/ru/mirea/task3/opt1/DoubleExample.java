package ru.mirea.task3.opt1;
public class DoubleExample {
    public static void main(String[] args) {
        // 1. Создание объектов класса Double с использованием метода valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // 2. Преобразование значения типа String к типу double с использованием parseDouble()
        String strValue = "5.67";
        double doubleValue = Double.parseDouble(strValue);
        System.out.println("Преобразованное значение из строки: " + doubleValue);

        // 3. Преобразование объекта Double ко всем примитивным типам
        Double doubleObj = Double.valueOf(9.81);

        // Преобразование в примитивные типы
        byte byteValue = doubleObj.byteValue();
        short shortValue = doubleObj.shortValue();
        int intValue = doubleObj.intValue();
        long longValue = doubleObj.longValue();
        float floatValue = doubleObj.floatValue();
        double doublePrimValue = doubleObj.doubleValue();  // это уже double

        System.out.println("Значение Double как byte: " + byteValue);
        System.out.println("Значение Double как short: " + shortValue);
        System.out.println("Значение Double как int: " + intValue);
        System.out.println("Значение Double как long: " + longValue);
        System.out.println("Значение Double как float: " + floatValue);
        System.out.println("Значение Double как double: " + doublePrimValue);

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Значение объекта Double: " + doubleObj);

        // 5. Преобразование литерала double в строку с использованием Double.toString()
        String doubleAsString = Double.toString(3.14);
        System.out.println("Литерал double как строка: " + doubleAsString);
    }
}
