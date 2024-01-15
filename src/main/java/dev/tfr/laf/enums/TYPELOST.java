package dev.tfr.laf.enums;

public enum TYPELOST {

    LOSTWITHVALUE(1, "LOST WITH VALUE"),
    LOSTWITHOUTVALUE(2, "LOST WITHOUT VALUE"),
    OTHERLOST(3, "OTHER LOST");

    private int cod;
    private String description;

    private TYPELOST(int cod, String description){
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }
    public static TYPELOST toEnum(Integer type){
        if (type == null){
            return null;
        }
        for (TYPELOST x : TYPELOST.values()){
            if(type.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("invalod code (type)");
    }
}
