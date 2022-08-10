import java.util.Objects;

public class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;


    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getPopulation() == city.getPopulation() && Objects.equals(getName(), city.getName()) && Objects.equals(getRegion(), city.getRegion()) && Objects.equals(getDistrict(), city.getDistrict()) && Objects.equals(getFoundation(), city.getFoundation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegion(), getDistrict(), getPopulation(), getFoundation());
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
