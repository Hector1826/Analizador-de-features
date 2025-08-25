

package gui_elementos.feature.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import gui_elementos.feature.utils.Regex;
/**
 *
 * @author "Hector Hdez E."
 */
public class FeatureModel {
    private String feature;
    private List<String> listBlockGherkin;
    public FeatureModel(String _feature){
        this.feature = _feature;
        initScan(feature);
    }
    /**
     * Obtiene cada gherking de la feature y lo giarda en un Stirng
     * @param feature
     * @return Lista con el bloque que corresponde a cada gherkin
     */
    private void initScan(String feature) {
        listBlockGherkin = new ArrayList<>();
        Pattern pattern = Pattern.compile(Regex.GHERKIS_REGEX,
                Pattern.DOTALL);
        Matcher matcher = pattern.matcher(feature);
        while (matcher.find()) {
            listBlockGherkin
                    .add(matcher.group().trim());
        }
    }

    /**
     * Retorna el blocke de texto que corresponde a cada gherkin
     * @return Listado en forma de blocl
     */
    public List<String> getListGherkinsBlock(){        
        return listBlockGherkin;
    }
    
    
    
    
    public int numberGherkin(){
        return listBlockGherkin.size();
    }
    
    public String getNameFeature(){
        return new FindPattern(feature).getCoincidencie(Regex.NAME_FEATURE_REGEX,1);
    }
}
