package Transport;


import java.util.Locale;

public class Car {
    private String brand;
    private String model;
    public float engineVolume;
    public String color;
    private int productionYear;
    private String productionCountry;
    public String transmission;
    private String bodyType;
    public String registrationNumber;
    private int numberOfSeats;
    public String typeOfRubber;
    private Key remoteEngineStart;
    private Key keylessAccessString;
    private Insurance costOfInsurance;
    public Insurance insuranceNumber;
    private InsuranceValidityPeriod insuranceYear;
    private InsuranceValidityPeriod insuranceMonth;
    private InsuranceValidityPeriod insuranceDay;


    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               String typeOfRubber, String remoteEngineStart, String keylessAccessString, int insuranceYear,
               int insuranceMonth, int insuranceDay, int costOfInsurance, String insuranceNumber) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;

        if (transmission.isEmpty() || transmission.isBlank()) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, "
                    + this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry +
                    ", (Информация не указана), " + this.bodyType + ", " + this.registrationNumber + ", число мест -  " +
                    this.numberOfSeats + ", " + this.typeOfRubber);
        }
        if (bodyType.isEmpty() || bodyType.isBlank()) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " +
                    this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry +
                    ", " + this.transmission + ", (Информация не указана), " + this.registrationNumber + ", число мест - " +
                    this.numberOfSeats + ", " + this.typeOfRubber);
        }
        if (registrationNumber.isEmpty()) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " + this.color +
                    ", год выпуска - " + this.productionYear + ", " + this.productionCountry + ", " + this.transmission + ", " +
                    this.bodyType + ", (Информация не указана), число мест - "
                    + this.numberOfSeats + ", " + this.typeOfRubber);
        }
        if (registrationNumber.substring(0, 1).chars().allMatch(Character::isLetter)
                && registrationNumber.substring(1, 4).chars().allMatch(Character::isDigit) &&
                registrationNumber.substring(4, 6).chars().allMatch(Character::isLetter)
                && registrationNumber.substring(6).chars().allMatch(Character::isDigit)) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " + this.color +
                    ", год выпуска - " + this.productionYear + ", " + this.productionCountry + ", " + this.transmission + ", " +
                    this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber);
        } else {
            System.out.println("Некорректный регистрационный номер");

        }

        if (numberOfSeats <= 0) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " + this.color +
                    ", год выпуска - " + this.productionYear + ", " + this.productionCountry + ", " + this.transmission + ", " +
                    this.bodyType + ", " + this.registrationNumber + ", число мест - (Информация не указана), "
                    + this.typeOfRubber);
        }
        if (typeOfRubber.isEmpty() || typeOfRubber.isBlank()) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " + this.color +
                    ", год выпуска - " + this.productionYear + ", " + this.productionCountry + ", " + this.transmission + ", " +
                    this.bodyType + ", " + this.registrationNumber + ", число мест - " +
                    this.numberOfSeats + ", (Информация не указана)");
        }
        if (brand == "" && model == "" && productionCountry == "") {
            System.out.println("default");
        }
        if (engineVolume == 0) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + " 1,5 л, "
                    + this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry + ", " + this.transmission + ", " +
                    this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber);
        }
        if (color == "") {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, "
                    + "цвет кузова - белый, " + "год выпуска - " + this.productionYear + ", " + this.productionCountry +
                    ", " + this.transmission + ", " + this.bodyType + ", " + this.registrationNumber + ", чисор мест -  " + this.numberOfSeats + ", " + this.typeOfRubber);
        }
        if (productionYear == 0) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, "
                    + this.color + ", " + "год выпуска - 2000 " + ", " + this.productionCountry + ", " + this.transmission + ", " +
                    this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public String toString() {
        return this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " + this.color +
                ", год выпуска - " + this.productionYear + ", " + this.productionCountry + ", " + this.transmission +
                ", " + this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " +
                this.typeOfRubber + this.remoteEngineStart + this.keylessAccessString + " год оформления страховки, "
                + this.insuranceYear + ", Месяц оформления страховки " + this.insuranceMonth + "," +
                " День оформления страховки " + this.insuranceDay + ", Стоисмость страховки " +
                this.costOfInsurance + " рублей + " + ", Номер страховки " + this.insuranceNumber;

    }

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {

            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
            if (remoteEngineStart.isEmpty() || remoteEngineStart.isBlank() || remoteEngineStart == null) {
                System.out.println(" Информация не указана");
            } else {
                System.out.println(" Удаленный запуск двигателя");
                if (keylessAccess.isEmpty() || keylessAccess.isBlank() || keylessAccess == null) {
                    System.out.println(" Информация не указана");
                } else {
                    System.out.println(" Безключевой доступ");
                }
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "key{" +
                    "remoteEngineStart='" + remoteEngineStart + '\'' +
                    ", keylessAccess='" + keylessAccess + '\'' +
                    '}';
        }

    }

    public class Insurance {
        private String insuranceValidityPeriod;
        private int costOfInsurance;
        private String insuranceNumber;


        public Insurance(String insuranceValidityPeriod, int costOfInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            this.costOfInsurance = costOfInsurance;
            this.insuranceNumber = insuranceNumber;
            if (insuranceValidityPeriod.isEmpty() || insuranceValidityPeriod == null || insuranceValidityPeriod.isBlank()) {
                System.out.println(" Информация не указана");
            } else {
                System.out.println(" Срок действия страховки: " + insuranceValidityPeriod);
            }
            if (costOfInsurance <= 0) {
                System.out.println(" Стоимость страхавки не указана");
            } else {
                System.out.println(" Стоимость страховки " + costOfInsurance + " рублей");
            }
            if (insuranceNumber.isEmpty() || insuranceNumber == null || insuranceNumber.isBlank()) {
                System.out.println(" Информация не указана");
            }
            insuranceNumber = String.format("000000000");
            if (insuranceNumber != String.format("000000000")) {
                System.out.println(" Номер страховки некорректный!");
            } else {
                System.out.println(" Номер страховки " + insuranceNumber);

            }
        }

        public String getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public int getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        @Override
        public String toString() {
            return "insurance{" +
                    "insuranceValidityPeriod='" + insuranceValidityPeriod + '\'' +
                    ", costOfInsurance=" + costOfInsurance +
                    ", insuranceNumber='" + insuranceNumber + '\'' +
                    '}';
        }
    }

    public class InsuranceValidityPeriod {
        public int yearNow;
        public int monthNow;
        public int dayNow;
        private int insuranceYear;
        private int insuranceMonth;
        private int insuranceDay;

        public InsuranceValidityPeriod() {
            this.yearNow = yearNow;
            this.monthNow = monthNow;
            this.dayNow = dayNow;
            this.insuranceYear = insuranceYear;
            this.insuranceMonth = insuranceMonth;
            this.insuranceDay = insuranceDay;
            if (insuranceYear < yearNow && insuranceMonth <= monthNow && insuranceDay <= dayNow) {
                System.out.println(" Нужно срочно ехать оформлять новую страховку!");
            }
        }


        public int getYearNow() {
            return yearNow;
        }

        public void setYearNow(int yearNow) {
            this.yearNow = yearNow;
        }

        public void setMonthNow(int monthNow) {
            this.monthNow = monthNow;
        }

        public int getInsuranceYear() {
            return insuranceYear;
        }

        public int getInsuranceMonth() {
            return insuranceMonth;
        }

        public int getInsuranceDay() {
            return insuranceDay;
        }

        public void setDayNow(int dayNow) {
            this.dayNow = dayNow;
        }

        public int getMonthNow() {
            return monthNow;
        }

        public int getDayNow() {
            return dayNow;
        }

        @Override
        public String toString() {
            return "InsuranceValidityPeriod{" +
                    "yearNow=" + yearNow +
                    ", monthNow=" + monthNow +
                    ", dayNow=" + dayNow +
                    ", insuranceYear=" + insuranceYear +
                    ", insuranceMonth=" + insuranceMonth +
                    ", insuranceDay=" + insuranceDay +
                    '}';
        }

    }


}



