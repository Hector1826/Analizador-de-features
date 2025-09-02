package gui_elementos.feature.utils;

import gui_elementos.feature.vo.Gherkin;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author "Hector Hdez E."
 */
public class HelperTable {

    private final DefaultTableModel model;
    private final JTable table;
    private int factibles = 0;
    public HelperTable(JTable _tb) {
        this.model = new DefaultTableModel();
        this.table = _tb;
        table.setModel(model);
    }

    /**
     * Asigna los encabezados de la tabla
     *
     * @param _header encabezados separados por comas ß
     */
    public void setHeader(String _header) {
        model.setColumnIdentifiers(("N°,"+_header).split(","));
        table.setModel(model);
    }

    public void addItem(Gherkin _gherkin, int contador) {
        model.addRow(new Object[]{
            contador,
            _gherkin.getTag(),
            _gherkin.getName(),
            _gherkin.factibilidad(_gherkin),
            _gherkin.getJira(),
            _gherkin.isIsOutline()
        });
        if(_gherkin.isIsFactible())
            factibles++;
    }

    public void addItemOutline(Gherkin _gherkin, String i, int contador) {
        model.addRow(new Object[]{
            contador,
            _gherkin.getTag(),
            i,
            _gherkin.factibilidad(_gherkin),
            _gherkin.getJira(),
            _gherkin.isIsOutline()
        });
        if(_gherkin.isIsFactible())
            factibles++;
    }

    public void clearTable() {
        model.setRowCount(0);
        factibles = 0;
    }

    
    public int getFactibles(){
        return factibles;
    }
    public String printInfo(String ac) {
        return ac;
    }
    
    
    public void muestra(String type){
        
    }

}
