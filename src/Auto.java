public class Auto {

    private String marca;
    private int cilindrata;
    private String targa;
    private String modello;

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Auto(String marca, int cilindrata, String targa, String modello) {
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.modello = modello;
    }
}
