
package equipomedico;

import javax.swing.JOptionPane;

public class MonitorSignosVitales extends EquipoMedico {
    private String tipoDeFrecuencias;

    
    public void registrar() {
        super.registrar(); 

        
        String opciones = "1. Frecuencia Cardiaca\n" +
                          "2. Presión Arterial\n" +
                          "3. Saturación de oxígeno en la sangre\n" +
                          "4. Temperatura corporal\n" +
                          "5. Máquina de Anestesia"; 

        String seleccion = JOptionPane.showInputDialog(
            null,
            "Selecciona el tipo de frecuencia:\n" + opciones,
            "Tipo de Frecuencia",
            JOptionPane.QUESTION_MESSAGE
        );

        
        try {
            int opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    tipoDeFrecuencias = "Frecuencia Cardiaca";
                    JOptionPane.showMessageDialog(null, "Tu frecuencia está de manera saludable");
                    break;
                case 2:
                    tipoDeFrecuencias = "Presión Arterial";
                    String presion = JOptionPane.showInputDialog("Ingresa tu presión arterial:");
                    try {
                        int valorPresion = Integer.parseInt(presion);
                        if (valorPresion < 120) {
                            JOptionPane.showMessageDialog(null, "Tu presión arterial es saludable");
                        } else {
                            JOptionPane.showMessageDialog(null, "Necesitas ver un médico");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada no válida, por favor ingresa un número.");
                    }
                    break;
                case 3:
                    tipoDeFrecuencias = "Saturación de oxígeno en la sangre";
                    JOptionPane.showMessageDialog(null, "Necesitas ir al Hospital");
                    break;
                case 4:
                    tipoDeFrecuencias = "Temperatura corporal";
                    JOptionPane.showMessageDialog(null, "Necesitas ir al Hospital");
                    break;
                case 5:
                    tipoDeFrecuencias = "Máquina de Anestesia"; 
                    JOptionPane.showMessageDialog(null, "La máquina de anestesia está lista para su uso.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Selección no válida.");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida, por favor ingresa un número del 1 al 5.");
        }
    }

    
    public void consultar() {
        super.consultar(); 
        JOptionPane.showMessageDialog(null, "Tipo de Frecuencia: " + tipoDeFrecuencias);
    }

    
    public void mostrar() {
        super.mostrar(); 
    }
}




