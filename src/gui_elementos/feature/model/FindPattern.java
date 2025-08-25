

package gui_elementos.feature.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author "Hector Hdez E."
 */
public class FindPattern {
    private Pattern pattern;
    private Matcher matcher;
    private String data;
    private List<String> items;
    
    /**
     *
     */
    public FindPattern(){}
    
    public FindPattern(String _data){
        this.data = _data;
    }
    
    /**
     * Indica si encontro alguna coincidencia del patron en el texto que recibe como parametro
     * @param pat Patron a buscar
     * @return
     */
    public boolean isFound(String pat){
        pattern = Pattern.compile(pat);
        matcher = pattern.matcher(data);
        return matcher.find();
    }
    public boolean isFound(String pat, int i){
        pattern = Pattern.compile(pat,Pattern.MULTILINE);
        matcher = pattern.matcher(data);
        return matcher.find();
    }
    /**
     * Obtiene el patron encontrado
     * @param pat Patron a buscar
     * @return Retorna la coincidencia encontrada
     */
    public String getCoincidencie(String pat){
        pattern = Pattern.compile(pat, Pattern.MULTILINE);
        matcher = pattern.matcher(data);
        return matcher.find() ? matcher.group().trim() : "";
    }
    
    /**
     * Obtiene el patron encontrado en el indice indicado
     * @param pat Patron a buscar
     * @param index Indice del grupo de la coincidencia a retornar
     * @return Retorna la coincidencia encontrada
     */
    public String getCoincidencie(String pat, int index){
        pattern = Pattern.compile(pat, Pattern.MULTILINE);
        matcher = pattern.matcher(data);
        return matcher.find() ? matcher.group(index).trim() : "";
    }
    
    /**
     * Obtiene lista de coincidencias encontradas
     * @param pat Patron a buscar
     * @param index Indice del grupo de la coincidencia a retornar
     * @return Retorna la coincidencia encontrada
     */
    public List<String> getList(String pat, int index){
        items = new ArrayList<>();
        pattern = Pattern.compile(pat);
        matcher = pattern.matcher(data);
        while(matcher.find()){
            items.add(matcher.group(index));
        }
        return items;
    }
}