import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AlertBox {
	static boolean b=false;
	public static boolean display(String title,String message){
		Stage stage=new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		Button btn1=new Button("Yes"),btn2=new Button("No");
		btn1.setOnAction(e->{
			b=true;
			stage.close();
		});
		btn2.setOnAction(e->{
			b=false;
			stage.close();
		});
		HBox vbox=new HBox();
		vbox.getChildren().addAll(btn1,btn2);
		VBox hbox=new VBox();
		Label label=new Label(message);
		hbox.getChildren().addAll(label,vbox);
		Scene scene=new Scene(hbox);
		stage.setScene(scene);
		stage.setTitle(title);
		stage.setOnCloseRequest(e->{
			e.consume();
			b=false;
		});
		stage.showAndWait();
		return b;
	}
	
	private AlertBox() {
		
	}

}
