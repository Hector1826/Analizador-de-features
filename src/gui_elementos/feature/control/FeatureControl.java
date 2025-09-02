package gui_elementos.feature.control;

import java.util.ArrayList;
import java.util.List;

import gui_elementos.feature.model.FeatureModel;
import gui_elementos.feature.model.GherkinModel;
import gui_elementos.feature.vo.Gherkin;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author "Hector Hdez E."
 */
public class FeatureControl {

    private FeatureModel featureModel;
    private GherkinModel gherkinModel;

    public FeatureControl(String feature) {
        this.featureModel = new FeatureModel(feature);
        gherkinModel = new GherkinModel();
    }

    public void show(String opt) {
        switch (opt) {
            case "NAME_FEATURE" ->
                nameFeature();
            case "TOTAL_GHERKINS" ->
                totalGherkins();
        }
    }

    private void nameFeature() {
        System.out.println("# Nombre feature: " + featureModel.getNameFeature());
    }

    public String getNameFeature() {
        return featureModel.getNameFeature();
    }

    public int totalGherkins() {
        return featureModel.numberGherkin();
    }

    public List<Gherkin> listGherkin() {
        List<Gherkin> gherkinsList = new ArrayList<>();
        for (String block : featureModel.getListGherkinsBlock()) {
            gherkinsList.add(gherkinModel.getGherkin(block));
        }

        return gherkinsList;
    }

    /*
    public List<GherkinManual> listGherkinManual(){
        List<GherkinManual> gherkinsList = new ArrayList<>();
        for(String block :  featureModel.getListGherkinsBlock()){
            gherkinsList.add(gherkinModel.getGherkinManual(block));
        }
        
        return gherkinsList;
    }
    
    
    public List<GherkinOutline> listGherkinOutline(){
        List<GherkinOutline> gherkinsList = new ArrayList<>();
        for(String block :  featureModel.getListGherkinsBlock()){
            gherkinsList.add(gherkinModel.getGherkinOutline(block));
        }
        
        return gherkinsList;
    }
     */
    public int gherkinsFactibles() {
        int cont = 0;
        for (Gherkin g : listGherkin()) {
            if(g.isIsFactible()){
                if (!g.isIsManual()) {
                    cont++;
                }
            }
        }
        return cont;

    }

    public int gherkinsManuales() {
        int cont = 0;
        for (Gherkin g : listGherkin()) {
            if (g.isIsManual()) {
                cont++;
            }
        }
        return cont;
    }

    public int gherkinsOutline() {
        int cont = 0;
        for (Gherkin g : listGherkin()) {
            if (g.isIsOutline()) {
                cont++;
            }
        }
        return cont;
    }

    public List<String> expandScenarioOutlines(String featureContent) {
        //String regex = "Scenario Outline:\\s*(.+?)\\n([\\s\\S]*?)Examples:\\s*\\n([\\s\\S]*?)(?=\\n\\s*\\n|\\z)";
        String regex = "(?s)Scenario Outline:\\s*(.+?)\\n([\\s\\S]*?)(?:\\n(?:@.*|#.*|\\s*)*)?Examples:\\s*\\n([\\s\\S]*?)(?=\\n\\s*\\n|\\Z)";
        List<String> scenarioNames = new ArrayList<>();
        Pattern outlinePattern = Pattern.compile(regex,
                Pattern.MULTILINE);
        Matcher outlineMatcher = outlinePattern.matcher(featureContent);
        int contador = 0;
        while (outlineMatcher.find()) {
            contador++;
            String outlineName = outlineMatcher.group(1).trim();
            String examplesBlock = outlineMatcher.group(3);

            // Extraer encabezados y filas de la tabla Examples
            String[] lines = examplesBlock.split("\\n");
            if (lines.length < 2) {
                continue; // Debe haber al menos encabezado y una fila
            }
            String[] headers = Arrays.stream(lines[0].split("\\|"))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toArray(String[]::new);

            for (int i = 1; i < lines.length; i++) {
                if (!lines[i].contains("|")) {
                    continue;
                }
                String[] values = Arrays.stream(lines[i].split("\\|"))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .toArray(String[]::new);
                String scenarioInstance = outlineName;
                for (int j = 0; j < headers.length && j < values.length; j++) {
                    scenarioInstance = scenarioInstance.replace("<" + headers[j] + ">", values[j]);
                }
                scenarioNames.add(scenarioInstance);
            }
        }
        return scenarioNames;
    }

}
