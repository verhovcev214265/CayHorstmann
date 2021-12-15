package enums;

public enum Size {
    SMALL("S"), MEDIUM("M") ,LARGE("L"), EXTRA_LARGE("XL");

    Size(String addreviation){
        this.addreviation = addreviation;
    }

    public String getAddreviation(){
        return addreviation;
    }

    private String addreviation;
}
