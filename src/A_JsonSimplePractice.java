import org.json.simple.JSONObject;

public class A_JsonSimplePractice {

    public static void main(String[] args) {
        A_JsonSimplePractice makeJsonPractice = new A_JsonSimplePractice();
    }

    public A_JsonSimplePractice() {
        // create your own JSON object
        JSONObject file = new JSONObject();
        file.put("Full Name", "Henry Coates");
        file.put("Student ID", 1704310046);
        file.put("Tuition Fees", 63950);

        // print the whole JSON
        System.out.println("JSON: " + file);

        // extract one value from the JSON
        System.out.print("Tuition cost: " + file.get("Tuition Fees"));
        System.out.println(" The Student ID;" + file.get(" Student ID"));
    }
}

