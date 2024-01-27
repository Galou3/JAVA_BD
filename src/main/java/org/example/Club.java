package org.example;

public class Club {
    private long id;
    private int version;
    private String fabricant;
    private Double poids;

    public Club(long id, int version, String fabricant, Double poids) {
        this.id = id;
        this.version = version;
        this.fabricant = fabricant;
        this.poids = poids;
    }
    public Club(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", version=" + version +
                ", fabricant='" + fabricant + '\'' +
        ", poids=" + poids +
                '}';
    }
}