import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class B_JsonArrayPractice {

    public static void main(String[] args) throws ParseException {
        B_JsonArrayPractice practice = new B_JsonArrayPractice();
    }

    public B_JsonArrayPractice() throws ParseException {
        String s = "{\"name\":\"Darth Vader\",\"height\":\"202\",\"mass\":\"136\",\"hair_color\":\"none\",\"skin_color\":\"white\",\"eye_color\":\"yellow\",\"birth_year\":\"41.9BBY\",\"gender\":\"male\",\"homeworld\":\"https://swapi.dev/api/planets/1/\",\"films\":[\"https://swapi.dev/api/films/1/\",\"https://swapi.dev/api/films/2/\",\"https://swapi.dev/api/films/3/\",\"https://swapi.dev/api/films/6/\"],\"species\":[],\"vehicles\":[],\"starships\":[\"https://swapi.dev/api/starships/13/\"],\"created\":\"2014-12-10T15:18:20.704000Z\",\"edited\":\"2014-12-20T21:17:50.313000Z\",\"url\":\"https://swapi.dev/api/people/4/\"}\n";

        JSONParser parser = new JSONParser();// parser can take a string and turn it into a JSON object;
        JSONObject json = (JSONObject) (parser.parse(s));

        System.out.println("String format: " + s);

        System.out.println("JSON format: " + json);


        // get a single value out of the json
        String birthYear = (String) json.get("birth_year");
        System.out.println("Year: " + birthYear);

        System.out.println("FILMS: " + json.get("films)")); // prints ugly

        String height = (String) json.get("height");
        System.out.println("HEIGHT: " + height);

        // use .get() to print the value of Darth Vader's birth Year
        // get a json array out of the json
        JSONArray filmsArray = (JSONArray) json.get("films");
        int n = filmsArray.size();
        System.out.println("number of films: " + n);
        System.out.println("FILMS: ");
        for (int i = 0; i < n; i++) {
            String film = (String) filmsArray.get(i); // .get(i) instead of [i]
            System.out.println(film);
        }


        JSONArray StarshipArray = (JSONArray) json.get ( "starships");
        int k = StarshipArray.size();
        System.out.println("Starship:");
        for( int m = 0;  m< k; m++ ){

            String Starship = (String) StarshipArray.get(m); // .get(m) instead of [m]
            System.out.println(Starship);
        }

        // practice: print all Darth Vader's starships ( they are stored in a JSON Array)
        // use for a loop

    } // end of constructor
}
