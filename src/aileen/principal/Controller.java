
package aileen.principal;

import aileen.parser.CalculadoraLexer;
import aileen.parser.CalculadoraParser;

import aileen.parser.MyGramaticaLexer;
import aileen.parser.MyGramaticaParser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Controller {
    @FXML
    private Button btnenviar;
    @FXML
    private Button btnborrar;
    @FXML
    private Button btntraduce;
    @FXML
    private Button btna;
    @FXML
    private TextArea txtentra;
    @FXML
    private TextArea txtentra1;
    @FXML
    private TextArea txtsale;
    public static String res="";
    public static String traducira = "";
    public static TextArea static_error;

    public static Object traducir(String s) {
        traducira += s +   "\n";
        return null;
    }


    public void Enviar() {
        txtentra.setText("");
        FileChooser jf = new FileChooser();
        jf.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = jf.showOpenDialog(null);


        if (archivo != null) {
            try {
                Scanner input = new Scanner(new File(archivo.getAbsolutePath()));
                while (input.hasNext()) {
                    txtentra.appendText(input.nextLine() + '\n');

                }
                input.close();
            } catch(FileNotFoundException ex){

                txtsale.setText("No se encontro el archivo" + archivo.getName());
            } catch(Exception ex){
                txtsale.setText(ex.getMessage());
            }
        }


    }
    public  void Borrar() {
        txtentra.setText("");
        txtsale.setText("");
        txtentra1.setText("");

    }
    public void TraducirC() {
        try {
        CharStream input = CharStreams.fromString(txtentra.getText());
        CalculadoraLexer lexico = new CalculadoraLexer(input);
        CommonTokenStream tokens = new  CommonTokenStream(lexico);
        CalculadoraParser sintactico = new CalculadoraParser(tokens);

        ParseTree arbol = sintactico.calculadora();
        MyVisitor vi = new MyVisitor();
        vi.visit(arbol);

    } catch (Exception e) {
        txtsale.setText(e.getMessage());
    }

        txtentra1.setText(traducira +"\n" + " }");
        txtsale.setText(res);
        static_error.setText(txtsale.getText());

    }
    public void TraducirL() {
        try {
            CharStream input = CharStreams.fromString(txtentra.getText());
            MyGramaticaLexer lexico = new MyGramaticaLexer(input);
            CommonTokenStream tokens = new  CommonTokenStream(lexico);
            MyGramaticaParser sintactico = new MyGramaticaParser(tokens);

            ParseTree arbol = sintactico.calculadora();
            MyLenguaje vi = new MyLenguaje();
            vi.visit(arbol);

        } catch (Exception e) {
            txtsale.setText(e.getMessage());
        }

        txtentra1.setText(traducira +"\n" + " }");
        txtsale.setText(res);
        static_error.setText(txtsale.getText());

    }


    static void add(String resul)
    {
        res+=resul+"\n";
    }

    @FXML
    public void initialize()
    {
        static_error = txtsale;

    }
}
