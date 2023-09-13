import java.util.*;

public class Country {
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private int capital;
    private List<City> cities;
    {
        cities = new ArrayList<>();
    }

    public Country() {

    }

    public Country(String code, String name, String continent,
                   int population, double surfaceArea, double gnp, 
            int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.capital = capital;
        this.gnp = gnp;
    }
    
    
}