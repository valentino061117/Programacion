package garaje_hash;

class Entrada {
    private String brand;
    private String model;
    private int repairCost;
    private String licensePlate;

    public Entrada(String brand, String model, int repairCost, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.repairCost = repairCost;
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getRepairCost() {
        return repairCost;
    }

    @Override
    public String toString() {
        return "Marca: " + brand + ", Modelo: " + model + ", Coste reparación: " + repairCost + ", Matrícula: " + licensePlate;
    }
}