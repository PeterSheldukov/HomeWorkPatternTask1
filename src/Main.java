public class Main {
    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Peter")
                .setSurname("Johnson")
                .setAge(55)
                .setAdress("Amsterdam")
                .build();
        Person daughter = dad.newChildBuilder()
                .setName("Sju")
                .build();

        System.out.println("Dady " + dad + "has daughter" + daughter);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            new PersonBuilder().setAge(-55).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
