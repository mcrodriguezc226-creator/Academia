public class Student extends Person {
    /// Atributos
    private String curso;
    private double notaMedia;
    /// Constructores
    /// Constructor vacio
    public Student() {}

    public Student(int id, String name, String email, String curso, double notaMedia) {
        super(id, name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public Student(String name, String email, String curso, double notaMedia) {
        super(name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }
    /// Metodos
    /// Permisos / Retorno/ Nombre/ (Parametros)
    @Override
    public String mostrarinfo(){
        return "CURSO: " +curso + "\n" +
                "NOTA MEDIA: " + notaMedia;

    }
    /// Getters y Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

}
