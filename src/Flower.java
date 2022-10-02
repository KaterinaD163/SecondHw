public class Flower {
    public String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
        if (this.lifeSpan <= 0) {
            this.lifeSpan = 3;
        }
        if (country.isEmpty() || country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        String resultCost = String.format("%.2f", cost);
        if (cost < 0 || cost == 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
        if (flowerColor.isEmpty() || flowerColor == null) {
             this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;

        }
    }


    public String getFlowerColor() {

        return this.flowerColor;
    }

    public String getCountry() {

        return this.country;
    }

    public double getCost() {
        return this.cost;
    }

    public void setFlowerColor(String flowerColor) {
            this.flowerColor = flowerColor;
        }


    public void setCountry(String country) {
            this.country = country;
        }



    public void setCost(double cost) {
        this.cost = cost;

    }


    public String toString() {
        return this.flowerName + ", цвет " + this.flowerColor + ", страна происхождения - " + this.country +
                ", стоимость " + this.cost + " рублей," + " срок стояния - " + this.lifeSpan + " дней";
    }

}
