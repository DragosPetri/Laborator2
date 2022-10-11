package MyPackage;

public class main {
    public static void main(String[] args) {

        Model model = retrieveData();
        View view = new View();
        Controller controller = new Controller(model,view);

        controller.updateView();

        controller.setName("NotTest");
        System.out.println("get bazuz\n");

        controller.updateView();

        controller.DisplayStorage();
        controller.AppendToStorage(model);
        controller.DisplayStorage();

    }

    private static Model retrieveData(){
        Model model = new Model();
        model.setName("Test");
        model.setId("01");
        model.setCategory("Bamboozllle");
        model.setAuthor("Dragos");
        return model;
    }
}
