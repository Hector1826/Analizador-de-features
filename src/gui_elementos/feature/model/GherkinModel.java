package gui_elementos.feature.model;

import gui_elementos.feature.utils.Regex;
import gui_elementos.feature.vo.Gherkin;

/**
 *
 * @author "Hector Hdez E."
 */
public class GherkinModel {

    public GherkinModel() {
    }

    /**
     * Obtiene el tag del gherkin
     *
     * @param item
     * @return tagID
     */
    public String getTag(String item) {
        return new FindPattern(item).getCoincidencie(Regex.TAG_GHERKIN_REGEX);
    }

    /**
     * Indica si el Gherkin es manual
     *
     * @param item
     * @return
     */
    public boolean isManual(String item) {
        return new FindPattern(item).isFound(Regex.MANUAL_REGEX);
    }

    /**
     * Indica si el gherkin es outline
     *
     * @param item
     * @return
     */
    public boolean isOutLine(String item) {
        return new FindPattern(item).isFound(Regex.NAME_SCENARIO_OUTLINE_REGEX,0);
    }

    /**
     * Indica si el gherkin es factible
     *
     * @param item
     * @return
     */
    public boolean isFactible(String item) {
        return new FindPattern(item).isFound(Regex.FACTIBLE_REGEX);
    }

    /**
     * Obtiene el nombre del gherkin
     *
     * @param item
     * @return Nombre del Gherkin
     */
    public String getNameGherkin(String item) {
        return new FindPattern(item).getCoincidencie(Regex.NAME_GHERKIN_REGEX).replace("Scenario Outline:", "").replace("Scenario:", "").trim();
    }

    /**
     * Retorna el Jira asosiado
     *
     * @return Jira asociado
     */
    public String getJira(String item) {
        return new FindPattern(item).getCoincidencie(Regex.TAG_JIRA);
    }

    public Gherkin getGherkin(String item) {
        return new Gherkin(getTag(item), getNameGherkin(item), isManual(item), isOutLine(item),
                isFactible(item), getJira(item).replace("@JIRA.", ""), item);
    }
}
