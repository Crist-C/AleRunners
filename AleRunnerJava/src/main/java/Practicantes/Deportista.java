package Practicantes;
import java.util.*;
/**
 * 
 */
public class Deportista extends Persona {

    /**
     * Default constructor
     */
    public Deportista(float IMC, String NivelGeneral, int NivelIndividual, float TotalKmRecorridos, float TotalHorasEntrenamiento, String Deportes, float Peso, float Altura, String FechaUltimoChequeoMédico, Participaciones misCompetencias, Trofeos misReconocimientos, String Nombre, String Apellido, int Edad, String Genero, String FechaNacimiento, String correo, String telefono) {
        super(Nombre, Apellido, Edad, Genero, FechaNacimiento, correo, telefono);
        this.IMC = IMC;
        this.NivelGeneral = NivelGeneral;
        this.NivelIndividual = NivelIndividual;
        this.TotalKmRecorridos = TotalKmRecorridos;
        this.TotalHorasEntrenamiento = TotalHorasEntrenamiento;
        this.Deportes = Deportes;
        this.Peso = Peso;
        this.Altura = Altura;
        this.FechaUltimoChequeoMédico = FechaUltimoChequeoMédico;
        this.misCompetencias = misCompetencias;
        this.misReconocimientos = misReconocimientos;
    }



    private float IMC;
    private String NivelGeneral;
    private int NivelIndividual;
    private float TotalKmRecorridos;
    private float TotalHorasEntrenamiento;
    private String Deportes;
    private float Peso;
    private float Altura;
    private String FechaUltimoChequeoMédico;
    private Participaciones misCompetencias;
    private Trofeos misReconocimientos;

}