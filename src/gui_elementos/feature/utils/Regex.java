

package gui_elementos.feature.utils;

/**
 *
 * @author "Hector Hdez E."
 */
public class Regex {
     /**
     * Expression regular para encontrar los gherkins en un archivo .feature.
     */
    public static final String GHERKIS_REGEX = "@[A-Z]{2,4}[0-9]{3}.*?(?:\\n\\s*\\n|$)";

    /**
     * Expression regular para encontrar el nombrere de la Feature
     */
    public static final String NAME_FEATURE_REGEX = "Feature:\\s*(.+)";

    /**
     * Expression regular para encontrar el nombre de un Gherkin.
     */
    public static final String NAME_GHERKIN_REGEX = "Scenario(?: Outline)?:\\s*(.+)";

    /**
     * Expression regular para encontrar el nombre de un escenario.
     */
    public static final String NAME_SCENARIO_REGEX = "Scenario: (.+)";

    /**
     * Expression regular para encontrar el nombre de un escenario outline.
     */
    public static final String NAME_SCENARIO_OUTLINE_REGEX = "Scenario Outline:\\s*(.*)$";

    /**
     * Expression regular para encontrar los Gherkins con tah manual
     */
    public static final String MANUAL_REGEX = "@manual|@JIRA";

    /**
     * Expression regular para encontrar los Gherkins con tag factible
     * (tag @backend-smoke).
     */
    public static final String FACTIBLE_REGEX = "@backend-smoke\\b";

    /**
     * Expression regular para encontrar el tag de cada Gherkin
     * @[A-Z]{2,4}[0-9]{3}
     */
    //public static final String TAG_GHERKIN_REGEX = "@\\w+\\d{3}\\b";
    
    public static final String TAG_GHERKIN_REGEX = "@[A-Z]{2,4}[0-9]{3}";

    /**
     * Ezxpression regular para encontrar los criterios de entrada
     */
    public static final String CRITERIA_REGEX = "criteria[\\s\\S]*?\\n([\\s\\S]*?)\\n\\s*(When|And)";

    public static final String TABLE_EXAMPLE = "Examples:";
    
    public static final String TAG_JIRA = "@JIRA.\\b[A-Z]{2,10}-\\d+\\b";
}
