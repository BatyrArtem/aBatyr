package hw4;

public class Car {
    private double volumeOfTheTank;
    private double residue;
    private double consumption;

    public Car(double volumeOfTheTank, double residue, double consumption) {
        this.volumeOfTheTank = volumeOfTheTank;
        this.residue = residue;
        this.consumption = consumption;
    }

    public double getVolumeOfTheTank() {
        return volumeOfTheTank;
    }

    public double getResidue() {
        return residue;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setVolumeOfTheTank(int volumeOfTheTank) {
        this.volumeOfTheTank = volumeOfTheTank;
    }

    public void setResidue(double residue) {
        this.residue = residue;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public double fillFullTank(double n) {
        double x = defineResidueOfTheTank(n); // остаток топлива по преодолении N км
        double y = getVolumeOfTheTank() - x;
        setResidue(x + y);
        return getVolumeOfTheTank();
    }
    public double defineResidueOfTheTank(double n) {
        double balance =   getConsumption() / 100 * n; // стольто топлива израсходовалось за N км
        double x = getResidue() - balance; // остаток в баке
        setResidue(x);
        return x;
    }
    public double defineRefuel(int n) {
        return (double) getVolumeOfTheTank() - defineResidueOfTheTank(n);
    }

}
