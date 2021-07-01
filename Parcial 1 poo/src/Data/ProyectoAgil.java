package Data;

public class ProyectoAgil extends Proyecto{

    //atributos
    private int sprintsProyecto;
    private int sprintActual;
    private String tipoEstimacion;

    //Constructor
    public ProyectoAgil(ProjectManager manager, int fechaInicioPlan, int fechaFinPlan, int fechaInicioReal, int fechaFinReal, String status, int sprintsProyecto, int sprintActual, String tipoEstimacion) {
        super(manager, fechaInicioPlan, fechaFinPlan, fechaInicioReal, fechaFinReal, status);
        this.sprintsProyecto = sprintsProyecto;
        this.sprintActual = sprintActual;
        this.tipoEstimacion = tipoEstimacion;
    }
    public ProyectoAgil() { }

    //Getter & Setter
    public int getSprintsProyecto() { return sprintsProyecto; }
    public void setSprintsProyecto(int sprintsProyecto) { this.sprintsProyecto = sprintsProyecto; }

    public int getSprintActual() { return sprintActual; }
    public void setSprintActual(int sprintActual) { this.sprintActual = sprintActual; }

    public String getTipoEstimacion() { return tipoEstimacion; }
    public void setTipoEstimacion(String tipoEstimacion) { this.tipoEstimacion = tipoEstimacion; }

    //Method
    public void Comparar(ProyectoAgil pAgil){
        if(this.sprintsProyecto > pAgil.sprintsProyecto){
            System.out.println("Mi proyecto tiene mas Sprint, ergo es mas agil");
        }else if(this.sprintsProyecto < pAgil.sprintsProyecto){
            System.out.println("Mi proyecto tiene menos Sprint, ergo es menos agil");
        }else{
            System.out.println("Ambos son iguales de agiles");
        }
    }
}
