package ReviewClass4;

public class Fruit {

    protected String name;
    String shape;
    private String color;

    public static boolean fresh;

   public  Fruit(String name){
        this.name=name;
    }
    Fruit(String name, String shape,String color){
       this(name);
       this.shape=color;
       this.color=color;
    }

    void grow(){
        System.out.println("All fruits grow fresh"+fresh);
    }
    void haveBenefits(){
        System.out.println("All fruits good for your health");
    }


}
