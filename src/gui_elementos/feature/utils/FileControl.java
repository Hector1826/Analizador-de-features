package gui_elementos.feature.utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;


/**
 *
 * @author "Hector Hdez E."
 */
public class FileControl {
    private final JFileChooser fileChooser;
    
    public FileControl(){
        this.fileChooser = new JFileChooser();
    }
    
    /**
     * Abre ventana para seleccionar el archivo que se requiere analizar
     */
    private File selectFile( ) {
        File directorioInicial = new File("/Users/mtptulamac007/Desktop/Releases repor/R25.80-Spherica/glomo-mx/test/e2e/lib/features/epics"); // Reemplaza con la ruta deseada
        fileChooser.setCurrentDirectory(directorioInicial);
        int seleccion = fileChooser.showOpenDialog(null);
        File archivo = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo = fileChooser.getSelectedFile();
            //System.out.println("### "+archivo.getAbsolutePath() +" ###");
            //mostrarContenido(archivo);
        }
        return archivo;
    }
    
    
    /**
     * Obtiene el contenido del archivo seleccionado. 
     * @param v
     * @return Contenido del archivo en un String
     */
    public String mostrarContenido( ) {    
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(selectFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
        }
        return contenido.toString();
    }

}
