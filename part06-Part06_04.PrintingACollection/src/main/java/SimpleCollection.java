
import java.util.ArrayList;
import jdk.internal.joptsimple.internal.Strings;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String names = "";

        for (String element: elements) {
            names = names + element + "\n";
        }

        if(elements.isEmpty()){
            return "The collection " + name + " is empty.";
        }else if(elements.size() == 1){
            return "The collection " + name + " has 1 element:\n" + names;
        }else{
            return "The collection " + name + " has " + elements.size() + " elements:\n" + names;
        }
    }
}
