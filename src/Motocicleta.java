public class Motocicleta {
    private int id;
    private String marca;
    private int cilindraje;
    private String color;
    private float precio;

    public Motocicleta(int id, String marca, int cilindraje, String color, float precio) {
        this.id = id;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Motocicleta{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", cilindraje=" + cilindraje +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
