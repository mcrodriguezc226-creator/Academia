public class Main {
    static void main() {
        ///  Introducir aquí la base del programa
        Person person1 = new Student(1, "Marco Antonio", "mcrodriguezc226@gmail.com","DAW", 8 );
        Person person2 = new Teacher(2, "Lorenzo", "lorenzo.poderoso@ceacfp.com", "DAW", 2000);

        System.out.println(person1.mostrarinfo());
        System.out.println(person2.mostrarinfo());

    }
}
