public class Main {
    public static void main(String[] args) {

            // Задание 1

        Human Maksim = new Human(-1988, "Максим", "Минск","бренд-менеджер");
            System.out.println(Maksim);
        Human Anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
            System.out.println(Anya);
        Human Katya = new Human(1992, "", "Калининград", "продакт-менеджер");
            System.out.println(Katya);
        Human Artem = new Human(1995, "Артем", "Москва", "");
            System.out.println(Artem);

            // Задание 2
        System.out.println("//////////////////////////////////");
        Car Lada = new Car("", "Granta", 1.7, "", 2015, "России");
            Lada.carInfo();
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, " ", 2020, "Германии");
            Audi.carInfo();
        Car BMW = new Car("BMW", "Z8", -1, " черного", 2021, "");
            BMW.carInfo();
        Car Kia = new Car("Kia", "Sportage 4-го поколения", 2.4, " красного", 2018, "Южной Корее");
            Kia.carInfo();
        Car Hyundai = new Car("Hyundai", "", 1.6, "оранжевого", 2016, "Южной Корее");
            Hyundai.carInfo();
    }
}