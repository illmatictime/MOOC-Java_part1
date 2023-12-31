public class Birds {

    private String englishName;
    private String latinName;
    private int observations;

    public Birds(String englishName, String latinName) {
        this.englishName = englishName;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservations() {
        return this.observations;
    }

    public void addObservation() {
        this.observations++;
    }

    @Override
    public String toString() {
        return this.englishName + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
