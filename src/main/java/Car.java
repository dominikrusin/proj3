public class Car {
    private String marka; //deklaracja zmiennych
    private int year;
    private boolean isItWork;
    private String petrol;

    public Car() {
    }//konstruktor bezparametrowy

    public Car(String marka, int year, boolean isItWork) {   // parametrowy konstruktor klasy
        this.marka = marka; //uzupełnianie zmiennych
        this.year = year;
        this.isItWork = isItWork;
    }

    public Car(String marka, int year, boolean isItWork, String petrol) {
        this.marka = marka;
        this.petrol = petrol;
        this.year = year;
        this.isItWork = isItWork;
    }

    public void carDetails() {// ta metoda tylko wyświetla a nie zwraca wartości
        System.out.println(marka + " " + year + " " + isItWork + " " + petrol);
    }

    public String getMarka() {   // get ery i set ery
        return marka;
    }

    public int getYear() {
        return year;
    }

    public boolean getisItWork() {
        return isItWork;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setItWork(boolean isItWork) {
        this.isItWork = isItWork;
    }
}
