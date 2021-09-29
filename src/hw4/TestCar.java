package hw4;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(40, 40, 6);
        double pathOdessaToKrivoeOzero = car.defineRefuel(179); //столько нужно дозаправить
        double zapravka1 = car.fillFullTank(179); // заправить бак
        double pathKrivoeOzeroToZashkov = car.defineRefuel(156);
        double zapravka2 = car.fillFullTank(156);
        double pathZashkovToKiev = car.defineRefuel(150);
        double zapravka3 = car.fillFullTank(150);

        System.out.println("Столько бензина будет потрачено: ");
        double sum = pathKrivoeOzeroToZashkov + pathOdessaToKrivoeOzero + pathZashkovToKiev;
        System.out.println(sum);
        System.out.println("Цена за 1 литр бензина 23грн");
        System.out.println("Стоимочть поездки состваит: " + (23.0 * sum) + "грн");
        double t = car.getVolumeOfTheTank() - sum;
        System.out.println("Остаток топлива: " + t);


    }


}
