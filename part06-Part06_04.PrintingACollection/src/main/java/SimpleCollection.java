
import java.util.ArrayList;

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
//
//        for (String element: elements) {
//            names = names + element + "\n";
//        }
//        for (String element: elements) {
//            names += "\n" + element;
//        }
        int i = 0;
        for(String element: this.elements){
            if(i < this.elements.size()-1){
                names += element + "\n";
            }else{
                names += element;
            }
            i++;
        }

        if(this.elements.isEmpty()){
            return "The collection " + name + " is empty.";
        }else if(this.elements.size() == 1){
            return "The collection " + name + " has 1 element:\n" + names;
        }else{
            return "The collection " + name + " has " + this.elements.size() + " elements:\n" + names;
        }
    }
}
