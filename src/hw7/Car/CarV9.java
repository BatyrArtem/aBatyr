package hw7.Car;

public class CarV9 {
    String location;
    int tankMax;
    double tank;
    double consumption;
    double fuelPrice;
    int km;
    String stop;
    double needLiters;
    int distance;
    double totalPrice;
    double getLiters;

    public CarV9(String location) {
        tankMax = (int)(Math.random()*30)+30;
        tank = tankMax;
        consumption = (Math.random()*10)+5;
    }

    public void setTripDistance(int km) {
        this.km = km;
    }

    public void fillFullTank(double fuelPrice) {
        this.fuelPrice = fuelPrice;
        System.out.println("Заправляем полный бак.");
        tank += needLiters;
        double result = needLiters * fuelPrice;
        System.out.printf("Заправлено %.2f л. Оплачено %.2f грн.", needLiters, result);
        totalPrice += result;
    }

    public void drive(int km, String stop) {
        this.km = km;
        this.stop = stop;
        System.out.println("\nЕдем в " + stop + ". " + km + " км...");
        distance += km;
    }

    public void fillTank(double getLiters, double fuelPrice) {
        this.getLiters = getLiters;
        this.fuelPrice = fuelPrice;
        double result;
        if(getLiters > needLiters){
            result = needLiters * fuelPrice;
            tank += needLiters;
            System.out.printf("Возможно заправить только %.2f л. Заправлено. Оплачено %.2f грн."
                    ,needLiters, result);
        }else{
            result = getLiters * fuelPrice;
            tank += getLiters;
            System.out.printf("Заправлено %.2f литров. Оплачено %.2f грн.", getLiters, result);
        }
        totalPrice += result;
    }

    public void printTripReport() {
        System.out.println("----------Отчет о поездке----------");
        System.out.printf("Остаток топлива в баке %.2f л. Всего проехали " + distance +
                " км. Всего потрачено %.2f грн. Местоположение авто - Киев.", tank, totalPrice);
    }

    public double getFuelInTank() {
        tank = tank - (double) km/100*consumption;
        needLiters = tankMax - tank;
        return tank;
    }
}
