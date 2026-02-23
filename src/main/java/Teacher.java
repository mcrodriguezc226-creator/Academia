public class Teacher extends Person {
    /// Atributos
    private String speciallity;
    private double salary;

    /// Constructores
    public Teacher() {
    }

    public Teacher(int id, String name, String email, String speciallity, double salary) {
        super(id, name, email);
        this.speciallity = speciallity;
        this.salary = salary;
    }

    public Teacher(String name, String email, String speciallity, double salary) {
        super(name, email);
        this.speciallity = speciallity;
       this.salary = salary;
    }

    ///  Metodos

    @Override
    public String mostrarInfo() {
        return "Profesor{" +
                " Id=" + getId() +
                ", Nombre= '" + getName() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Especialidad='" + speciallity + '\'' +
                ", Salario='" + salary + '\'' +
                "}";
//        return "Profesor =" + getId() + getName() + getEmail() +  getSpeciallity ()+ getSalary ();
    }

}



