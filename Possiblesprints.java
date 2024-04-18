package application;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Possiblesprints {
	private TableView<TableCellData> tableView = new TableView<>();
	private Button ok;
	private Text text1,columntext;
	private Label rowlabel,coluknlabel;
	private Group gppo = new Group();
	private HBox hb = new HBox(20);
	Possiblesprints (){
		 TableColumn<TableCellData,Integer> rowcol=new TableColumn<TableCellData,Integer>("~ ROW ~");
		 rowcol.setCellValueFactory (new PropertyValueFactory<TableCellData,Integer>("row"));
		 
		 TableColumn<TableCellData,Integer> colcol=new TableColumn<TableCellData,Integer>("~ Column ~");
		 colcol.setCellValueFactory (new PropertyValueFactory<TableCellData,Integer>("column"));
		 
		 TableColumn<TableCellData,String> status=new TableColumn<TableCellData,String>("~ STATUS ~");
		 status.setCellValueFactory (new PropertyValueFactory<TableCellData,String>("status"));
		 
		 tableView.getColumns().addAll(rowcol,colcol,status);
		 
		 tableView.setMinWidth(600);
		 tableView.setMaxHeight(200);
		 tableView.setLayoutX(0);
		 tableView.setLayoutY(0);
		  
		 ok= new Button(" Ok ");
			ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
			ok.setMinSize(150, 50);
			ok.setStyle(
				        "-fx-background-radius: 10em; " +
				                "-fx-min-width: 100px; " +
				                "-fx-min-height: 50px; " +
				                "-fx-max-width: 150px; " +
				                "-fx-max-height: 50px; " +"-fx-background-color: red;"
				        );
			
			text1= new Text(" The Best Move is Row : ");
			text1.setFill(Color.WHITE);
			text1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
			
			
			columntext= new Text(" And, Column :");
			columntext.setFill(Color.WHITE);
			columntext.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
			
			
			rowlabel=new Label(" ");
			rowlabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
			rowlabel.setMinSize(150, 50);
			rowlabel.setStyle(
				        "-fx-background-radius: 10em; " +
				                "-fx-min-width: 50px; " +
				                "-fx-min-height: 50px; " +
				                "-fx-max-width: 50px; " +
				                "-fx-max-height: 50px; " +"-fx-background-color: white;"
				        );
			rowlabel.setTextFill(Color.BLACK);	
			
			
			coluknlabel=new Label(" ");
			coluknlabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
			coluknlabel.setMinSize(150, 50);
			coluknlabel.setStyle(
				        "-fx-background-radius: 10em; " +
				                "-fx-min-width: 50px; " +
				                "-fx-min-height: 50px; " +
				                "-fx-max-width: 50px; " +
				                "-fx-max-height: 50px; " +"-fx-background-color: white;"
				        );
			coluknlabel.setTextFill(Color.BLACK);
			
			hb.getChildren().addAll(text1,rowlabel,columntext,coluknlabel);
			hb.setLayoutX(50);
			hb.setLayoutY(250);
			hb.setAlignment(Pos.CENTER);
			
			ok.setLayoutX(250);
			ok.setLayoutY(350);
			Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/backwin.jpg");
			ImageView mg = new ImageView(m);
			mg.setFitHeight(400);
			mg.setFitWidth(600);
			gppo.getChildren().addAll(mg,tableView,hb,ok);		 
			
		 
		
	}
	public TableView<TableCellData> getTableView() {
		return tableView;
	}
	public Button getOk() {
		return ok;
	}
	public Text getText1() {
		return text1;
	}

	public Text getColumntext() {
		return columntext;
	}
	public Label getRowlabel() {
		return rowlabel;
	}
	public Label getColuknlabel() {
		return coluknlabel;
	}
	public Group getGppo() {
		return gppo;
	}
	public HBox getHb() {
		return hb;
	}
	public void setTableView(TableView<TableCellData> tableView) {
		this.tableView = tableView;
	}
	public void setOk(Button ok) {
		this.ok = ok;
	}
	public void setText1(Text text1) {
		this.text1 = text1;
	}
	
	public void setColumntext(Text columntext) {
		this.columntext = columntext;
	}
	public void setRowlabel(Label rowlabel) {
		this.rowlabel = rowlabel;
	}
	public void setColuknlabel(Label coluknlabel) {
		this.coluknlabel = coluknlabel;
	}
	public void setGppo(Group gppo) {
		this.gppo = gppo;
	}
	public void setHb(HBox hb) {
		this.hb = hb;
	}
	

}
