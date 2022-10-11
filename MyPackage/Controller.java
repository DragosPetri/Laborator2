package MyPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {

    private Model model;
    private View view;

    private ArrayList<Model> storage;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        storage = new ArrayList<Model>();
        storage.add(model);
    }

    public void AppendToStorage(Model e){
        this.storage.add(e);
    }

    public boolean RemoveFromStorage(Model e){
        return this.storage.remove(e);
    }

    public void DisplayStorage() {
        for (Model m : this.storage) {
            System.out.println(m.getName() + " " + m.getId() + " " + m.getCategory() + " " + m.getAuthor());
        }
    }

    public void setName(String name) {
        this.model.setName(name);
    }

    public String getName() {
        return this.model.getName();
    }

    public void setId(String  id) {
        this.model.setId(id);
    }

    public String getId() {
        return this.model.getId();
    }

    public void setCategory(String category) {
        this.model.setCategory(category);
    }

    public String getCategory() {
        return this.model.getCategory();
    }

    public void setAuthor(String author) {
        this.model.setAuthor(author);
    }

    public String getAuthor() {
        return this.model.getAuthor();
    }

    public void updateView() {
        this.view.printData(this.model.getName(),this.model.getId(),this.model.getCategory(),this.model.getAuthor());
    }

}
