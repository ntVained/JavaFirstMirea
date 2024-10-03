package ru.mirea.task4.opt1;

public class Seasons {
    // Перечисление (Enum) для времен года
    public enum Season {
        WINTER(-15),
        SPRING(10),
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(10);

        private double averageTemperature;

        Season(double averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public double getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }

    public static void printFavoriteSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.SPRING;

        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printFavoriteSeason(favoriteSeason);

        System.out.println("\nИнформация о всех временах года:");
        for (Season season : Season.values()) {
            System.out.println(season + " - Средняя температура: " + season.getAverageTemperature() + "°C, Описание: " + season.getDescription());
        }
    }
}
