import java.util.List;

public class ContinentPopulation{

  public enum Continent{
    NORTH_AMERICA, SOUTH_AMERICA, EUROPE, AFRICA, ASIA, AUSTRALIA, ANTACTICA
  }

  public static class Country{
    public int population;
    public String name;
    public Continent continent;

    public Country(int pop, String myName, Continent myContinent){
      this.population = pop;
      this.name = myName;
      this.continent = myContinent;
    }

  }

  public static void main(String[] args) {
    System.out.println("I'll be calculating the population of a continent given the name of a Country");

    Country USA = new Country(327200000, "United", Continent.NORTH_AMERICA);

    Country Mexico = new Country(129200000, "Mexico", Continent.NORTH_AMERICA);

    Country Russia = new Country(144500000, "Russia", Continent.ASIA);

    Country[] countryList = {USA, Mexico, Russia};

    System.out.println("Sum of North America: " + sumPopulation(countryList, Continent.NORTH_AMERICA));
    System.out.println("Sum of Asia: " + sumPopulation(countryList, Continent.ASIA));

  }

  public static int sumPopulation(Iterable<Country> countries, Continent continent){
    int sum = 0;
    for(Country country : countries){
      if(country.continent == continent) sum += country.population;
    }

    return sum;
  }

  public static int sumPopulation(Country[] countries, Continent continent){
    int sum = 0;
    for(Country country : countries){
      if(country.continent == continent) sum += country.population;
    }

    return sum;
  }
}