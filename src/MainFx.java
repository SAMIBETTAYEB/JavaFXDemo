import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainFx extends Application {
	Button btn;
	Label label;
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox p=new HBox();
		btn=new Button("Button");
		label=new Label("My label");
		BorderPane bp=new BorderPane();
		p.getChildren().addAll(label,btn);
		bp.setTop(p);
		Scene scene=new Scene(bp,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My title!");
		btn.setOnAction(e->{
			boolean b=AlertBox.display("Title should be here!", "Message should be here!");
			AlertBox.display("Choosing!", "Your choice was: "+(b?"Yes":"No"));
		});
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
