import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class PitagorasController
{
    PitagorasView pitView;
    Stage stage;
    Pitagoras pit;
    public TextField textFieldAltura;
    public TextField textFieldPeso;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe PitagorasController
     */
    public PitagorasController()
    {
        this.stage = new Stage();
        this.pitView = new PitagorasView();
        this.pitView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.pitView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double peso = Double.parseDouble(textFieldPeso.getText());
            Pitagoras pit = new Pitagoras(altura, peso);
            this.labelResultado.setText(pit.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldPeso.setText("");
        labelResultado.setText("");
    }    
}
