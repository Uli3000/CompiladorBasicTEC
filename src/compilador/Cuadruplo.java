/*:-----------------------------------------------------------------------------
 *:                       INSTITUTO TECNOLOGICO DE LA LAGUNA
 *:                     INGENIERIA EN SISTEMAS COMPUTACIONALES
 *:                         LENGUAJES Y AUTOMATAS II           
 *: 
 *:                  SEMESTRE: ENE-JUN/2023     HORA: 18-19 HRS
 *:                                   
 *:               
 *:    # Clase con la funcionalidad del Generador de COdigo Intermedio
 *:                 
 *:                           
 *: Archivo       : Cuadruplo.java
 *: Autor         : Fernando Gil  
 *: Fecha         : 03/Octubre/2013
 *: Compilador    : Java JDK 7
 *: Descripción   :  
 *:                  
 *:           	     
 *: Ult.Modif.    :
 *:  Fecha      Modificó            Modificacion
 *:=============================================================================
 *:-----------------------------------------------------------------------------
 */
package compilador;


public class Cuadruplo {
    public String op;
    public String arg1;
    public String arg2;
    public String resultado;

    public Cuadruplo(String op, String arg1, String arg2, String resultado) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.resultado = resultado;
    }
    
    
}
