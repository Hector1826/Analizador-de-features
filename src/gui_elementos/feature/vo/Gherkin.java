package gui_elementos.feature.vo;

/**
 *
 * @author "Hector Hdez E."
 */
public class Gherkin {

    private String tag;
    private String name;
    private boolean isManual;
    private boolean isOutline;
    private boolean isFactible;
    private String blok;
    private String jira;

    public Gherkin(String tag, String name, boolean isManual, boolean isOutline, boolean isFactible, String _jira, String _block) {
        this.tag = tag;
        this.name = name;
        this.isManual = isManual;
        this.isOutline = isOutline;
        this.isFactible = isFactible;
        this.jira = _jira;
        this.blok = _block;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsManual() {
        return isManual;
    }

    public void setIsManual(boolean isManual) {
        this.isManual = isManual;
    }

    public boolean isIsOutline() {
        return isOutline;
    }

    public void setIsOutline(boolean isOutline) {
        this.isOutline = isOutline;
    }

    public boolean isIsFactible() {
        return isFactible;
    }

    public void setIsFactible(boolean isFactible) {
        this.isFactible = isFactible;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public String getJira() {
        return jira;
    }

    public void setJira(String jira) {
        this.jira = jira;
    }
    public int fac = 0;
    /**
     * Define si el gherkin es Manual o factible
     * @param g Gherkin a evaliar
     * @return Manual o si
     */
    public String factibilidad(Gherkin g){
        if(g.isManual){
            return "Manual";
        }else if(g.isFactible){
            fac++;
            return "Si";
            
        }
        return "Descartado";
    }
}
