package Data;

import java.util.Date;

public class Proyecto {

    //atributos
    private ProjectManager manager;

    private int fechaInicioPlan;
    private int fechaFinPlan;
    private int fechaInicioReal;
    private int fechaFinReal;

    protected String Status; //DEBE SER --->  “EN INICIO”, “EN EJECUCIÓN” O “FINALIZADO”

    //Constructor
    public Proyecto(ProjectManager manager, int fechaInicioPlan, int fechaFinPlan, int fechaInicioReal, int fechaFinReal, String status) {
        this.manager = manager;
        this.fechaInicioPlan = fechaInicioPlan;
        this.fechaFinPlan = fechaFinPlan;
        this.fechaInicioReal = fechaInicioReal;
        this.fechaFinReal = fechaFinReal;
        Status = status;
    }

    public Proyecto() { }

    //Getter & Setter
    public ProjectManager getManager() { return manager; }
    public void setManager(ProjectManager manager) { this.manager = manager; }

    public int getFechaInicioPlan() { return fechaInicioPlan; }
    public void setFechaInicioPlan(int fechaInicioPlan) { this.fechaInicioPlan = fechaInicioPlan; }

    public int getFechaFinPlan() { return fechaFinPlan; }
    public void setFechaFinPlan(int fechaFinPlan) { this.fechaFinPlan = fechaFinPlan; }

    public int getFechaInicioReal() { return fechaInicioReal; }
    public void setFechaInicioReal(int fechaInicioReal) { this.fechaInicioReal = fechaInicioReal; }

    public int getFechaFinReal() { return fechaFinReal; }
    public void setFechaFinReal(int fechaFinReal) { this.fechaFinReal = fechaFinReal; }

    public String getStatus() { return Status; }
    public void setStatus(String status) { Status = status; }

    //Method
    public Boolean finalizacion(){
        if (this.fechaFinPlan==this.fechaFinReal && this.Status=="FINALIZADO"){
            return true;
        }else{
            return false;
        }
    }

}

