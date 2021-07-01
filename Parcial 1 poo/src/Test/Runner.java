package Test;

import Data.ProjectManager;
import Data.Proyecto;
import Data.ProyectoAgil;
import Data.ProyectoTradicional;

public class Runner {
    public static void main(String[] args) {

        ProjectManager jefe1= new ProjectManager("Camilo","Garzon",1234,"dcf453");
        ProjectManager jefe2= new ProjectManager("Laura","Perez",5678,"dse762");

        ProyectoTradicional trad1=new ProyectoTradicional(jefe1,20120413,20140129,20120415,20140129,"FINALIZADO","Diseño");

        ProyectoAgil agil1=new ProyectoAgil(jefe1,20201010,20211231,20201010,20220102,"En Ejecucion",5,4,"estimado beta");
        ProyectoAgil agil2=new ProyectoAgil(jefe2,20201010,20211231,20201010,20220102,"En Ejecucion",3,4,"estimado epsilon");

        System.out.println("TRADICIONAL");
        if (trad1.finalizacion ()){
            System.out.println("Finalizo en la fecha planeada");
        }else{
            System.out.println("NO Finalizo en la fecha planeada");
        }

        if (trad1.faseDiseño()){
            System.out.println("Esta en fase de diseño");
        }else{
            System.out.println("NO Esta en fase de diseño");
        }

        System.out.println("AGIL");
        if (agil1.finalizacion ()){
            System.out.println("Finalizo en la fecha planeada");
        }else{
            System.out.println("NO Finalizo en la fecha planeada");
        }

        agil1.Comparar(agil2);


    }
}
