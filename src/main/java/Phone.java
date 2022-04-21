public class Phone {
    private String model;
    private String kolor;
    private int seria;
    private boolean kamera;

    public Phone(String model, String kolor, int seria){
        this.model = model;
        this.kolor = kolor;
        this.seria = seria;
    }
    public  Phone(String model, String kolor, int seria, boolean kamera){
        this.model = model;
        this.kolor = kolor;
        this.seria = seria;
        this.kamera = true;
    }
    public String getModel(){
        return model;
    }
public int getSeria(){
        return seria;
}
public void setModel(String model){
        this.model = model;
}
public void setSeria(int seria){
        this.seria = seria;
}
}
