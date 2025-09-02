

package gui_elementos.feature;
import gui_elementos.feature.view.GUIElements;
import gui_elementos.feature.view.View;

/**
 * 
 * @date 2025-08-12
 * @author Héctor Hdez E.
 */

public class GUI_ElementosFeature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new View().setVisible(true);
       //new GUIElements().setVisible(true);
       //show();
    }
    
//    public static final String EXJ = "    @CARL005\n" +
//"    @MX @backend(test) @vbank\n" +
//"    @ios @android @web\n" +
//"    @web-done @smokeTest\n" +
//"    Scenario Outline: A user who <mailStatus> succesfully requests a car loan\n" +
//"        Given a user with the following criteria\n" +
//"            | criteria |\n" +
//"            | car loan |\n" +
//"            | <user>   |\n" +
//"        And the user accesses to the car loan offer from \"opportunities\"\n" +
//"        And the user continues to the \"summary\" step\n" +
//"        When the user accepts the summary\n" +
//"        Then the user sees the following items in the screen\n" +
//"            | item                    | value        |\n" +
//"            | header title            |              |\n" +
//"            | exit button             |              |\n" +
//"            | banner icon             |              |\n" +
//"            | banner title            |              |\n" +
//"            | date                    |              |\n" +
//"            | ammount                 |              |\n" +
//"            | car type                |              |\n" +
//"            | term                    |              |\n" +
//"            | mensual payment         |              |\n" +
//"            | interest rate           |              |\n" +
//"            | commision for opperture |              |\n" +
//"            | cat                     |              |\n" +
//"            | folio                   |              |\n" +
//"            | notification icon       |              |\n" +
//"            | notification text       |              |\n" +
//"            | notification phone      |              |\n" +
//"            | mail text               | <mailStatus> |\n" +
//"            | mail                    | <mailStatus> |\n" +
//"            | extra info              |              |\n" +
//"            | accept button           |              |\n" +
//"\n" +
//"        Examples:\n" +
//"            | mailStatus       | user                  |\n" +
//"            | doesnt have mail | car loan without mail |\n" +
//"            | has mail         | car loan with mail    |\n" +
//"\n" +
//"    @CARL006\n" +
//"    @MX @backend(test) @vbank\n" +
//"    @ios @android @web\n" +
//"    @web-done @alternate-scenarios-smoke\n" +
//"    Scenario: The user selects the used option\n" +
//"        Given a user with the following criteria\n" +
//"            | criteria           |\n" +
//"            | car loan           |\n" +
//"            | car loan with mail |\n" +
//"        And the user accesses to the car loan offer from \"opportunities\"\n" +
//"        When the user selects the \"used\" car option\n" +
//"        Then the user sees the following items in the screen\n" +
//"            | item              | value     |\n" +
//"            | new radio button  | unchecked |\n" +
//"            | used radio button | checked   |\n" +
//"            | cat description   |           |\n" +
//"\n" +
//"    @CARL007\n" +
//"    @MX @backend(test) @vbank\n" +
//"    @ios @android @web\n" +
//"    @web-done @alternate-scenarios-smoke\n" +
//"    Scenario Outline: The user modifys the loan ammount with <ammount>\n" +
//"        Given a user with the following criteria\n" +
//"            | criteria           |\n" +
//"            | car loan           |\n" +
//"            | car loan with mail |\n" +
//"        And the user accesses to the car loan offer from \"opportunities\"\n" +
//"        When the user inputs \"<ammount>\" as a loan ammount\n" +
//"        Then the user sees the following items in the screen\n" +
//"            | item         | value     |\n" +
//"            | import input | <ammount> |\n" +
//"\n" +
//"        Examples:\n" +
//"            | ammount |\n" +
//"            | 500000  |\n" +
//"            | empty   |";
//    public static void show(){
//        System.out.println(EXJ);
//    }

}
