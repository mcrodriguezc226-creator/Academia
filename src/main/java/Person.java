public class Person {
    /// Atributos
    private int id;
    private String name;
    private String email;
    /// Constructores
    ///  Los frameworks ORM (hibernate/JPA) utilizan reflexión para crear instancias
    /// de las clases cuando recuperan datos de la base de datos
    public Person (){}

    /// Constructor con todos los parametros
    /// Este constructor se usa cuando creamos un objeto Persona con todos sus datos conocidos
    public Person (int id, String   name,  String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    /// Constructor solo con name y email
    public  Person(String name, String email){
        this.name = name;
        this.email = email;
    }
    /// Metodos
    /// Permisos / Retorno / Nombre/ (Parametros)
    public String mostrarinfo(){
        return "ID: " +id + "\n" +
                "NOMBRE: " + name + "\n" +
                "EMAIL: " + email;
    }
    /// Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

