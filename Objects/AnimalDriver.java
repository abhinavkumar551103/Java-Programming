class AnimalDriver {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        System.out.println("==============Before Initalization====================");


        System.out.println("The First animal details are: ");
        System.out.println(animal1.Category);
        System.out.println(animal1.Name);
        System.out.println(animal1.weight);   


        System.out.println("The Second animal details are: ");
        System.out.println(animal2.Category);
        System.out.println(animal2.Name);
        System.out.println(animal2.weight);

        System.out.println("The Third animal details are: ");
        System.out.println(animal3.Category);
        System.out.println(animal3.Name);
        System.out.println(animal3.weight);



        System.out.println("==========After Initialization============");
        animal1.Category= "Herbivores";
        animal1.Name= "Cow";
        animal1.weight=180;

        System.out.println("The First animal details are: ");
        System.out.println(animal1.Category);
        System.out.println(animal1.Name);
        System.out.println(animal1.weight);

        animal2.Category="Carnivores";
        animal2.Name="Tiger";
        animal2.weight=250;

        System.out.println("The Second Animal Details are : ");
        System.out.println(animal1.Category);
        System.out.println(animal1.Name);
        System.out.println(animal1.weight);


        animal3.Category="Omnivores";
        animal3.Name="Bear";
        animal3.weight=350;
        
        System.out.println("The Third Animal Details are : ");
        System.out.println(animal1.Category);
        System.out.println(animal1.Name);
        System.out.println(animal1.weight);

    }
}