package test;

public class Asiento {
	public String color;
    public int precio;
    public int registro;

    public void cambiarColor (String color){
        switch (color){
            case"rojo":
            case"verde":
            case"amarillo":
            case"negro":
            case"blanco": {
            this.color = color;
            break;
            }
        }

    }
}
