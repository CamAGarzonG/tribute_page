package Data;

public class ProyectoTradicional extends Proyecto{

    //atributos
    private String implementacion; //“ANÁLISIS”, “DISEÑO”, “PROGRAMACIÓN”, “TESTING”, “IMPLEMENTACIÓN”

    //Constructor
    public ProyectoTradicional(ProjectManager manager, int fechaInicioPlan, int fechaFinPlan, int fechaInicioReal, int fechaFinReal, String status, String implementacion) {
        super(manager, fechaInicioPlan, fechaFinPlan, fechaInicioReal, fechaFinReal, status);
        this.implementacion = implementacion;
    }

    public ProyectoTradicional() { }

    //Getter & Setter
    public String getImplementacion() { return implementacion; }
    public void setImplementacion(String implementacion) { this.implementacion = implementacion; }

    //Methods
    public Boolean faseDiseño(){
        if (this.implementacion.equals("Diseño")){
            return true;
        }
        return false;
    }
}
