package application;
	
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		 Label lb1=new Label("CGPA Calculator");
		
		 lb1.setFont(Font.font( "Verdana", FontWeight.BOLD, 20));
		 Label lb2=new Label("Name: ");
		 Label lb3=new Label("ID: ");
		 Label lb4=new Label("Course");
		 Label lb5=new Label("Credits");
		 Label lb6=new Label("Grade");
		 lb2.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
		 lb3.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
		 lb4.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
		 lb5.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
		 lb6.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
		 TextField tf1=new TextField();
		 TextField tf2=new TextField();
		 Label lb7=new Label("Course 1: ");
		 Label lb8=new Label("Course 2: ");
		 Label lb9=new Label("Course 3: ");
		 Label lb10=new Label("Course 4: ");
		 Label lb11=new Label("Course 5: ");
		 Label lb0=new Label(" ");
		 lb7.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
		 lb8.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
		 lb9.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
		 lb10.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
		 lb11.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
		
		 
		 Line line1 = new Line(); 
		  line1.setStartX(100.0); 
	      line1.setStartY(150.0); 
	      line1.setEndX(800.0); 
	      line1.setEndY(150.0); 
	      
	      Line line2 = new Line(); 
	      line2.setStartX(100.0); 
	      line2.setStartY(150.0); 
	      line2.setEndX(800.0); 
	      line2.setEndY(150.0); 
		 
		 
		 
		 ComboBox combo1 = new ComboBox();
		 ComboBox combo2 = new ComboBox();
		 ComboBox combo3 = new ComboBox();

		 combo1.getItems().add("CSE 115 ");
	        combo1.getItems().add("CSE 115L");
	        combo1.getItems().add("CSE 215 ");
	        combo1.getItems().add("CSE 215L");
	        combo1.getItems().add("CSE 173");
	        combo1.getItems().add("CSE 225");
	        combo1.getItems().add("CSE 225L");
	        combo1.getItems().add("CSE 231");
	        combo1.getItems().add("CSE 231L");
	        combo1.getItems().add("CSE 299");
	        combo1.getItems().add("EEE 141");
	        combo1.getItems().add("EEE 141L");
	        combo1.getItems().add("EEE111");
	        combo1.getItems().add("EEE111L");
	        combo1.getItems().add("CSE 311");
	        combo1.getItems().add("CSE 311L");
	        combo1.getItems().add("CSE 323");
	        combo1.getItems().add("CSE 327");
	        combo1.getItems().add("CSE 331");
	        combo1.getItems().add("CSE 331L");
	        combo1.getItems().add("CSE 332");
	        combo1.getItems().add("CSE 373");
	        combo1.getItems().add("CSE325");
	        combo1.getItems().add("CSE498");
	        combo1.getItems().add("CSE499A");
	        combo1.getItems().add("CSE499B");
	        combo1.getItems().add("CSE 417");
	        combo1.getItems().add("CSE 401");
	        combo1.getItems().add("CSE 418"); 
	        combo1.getItems().add("CSE 426"); 
	        combo1.getItems().add("CSE 473");
	        combo1.getItems().add("CSE 491");
	        combo1.getItems().add("CSE 411");
	        combo1.getItems().add("CSE 424");
	        combo1.getItems().add("CSE 427");
	        combo1.getItems().add("CSE 428");
	        combo1.getItems().add("CSE 429");
	        combo1.getItems().add("CSE 492");
	        combo1.getItems().add("CSE 422");
	        combo1.getItems().add("CSE 438");
	        combo1.getItems().add("CSE 482");
	        combo1.getItems().add("CSE 485");
	        combo1.getItems().add("CSE 486");
	        combo1.getItems().add("CSE 493");
	        combo1.getItems().add("CSE 433");
	        combo1.getItems().add("CSE 435");
	        combo1.getItems().add("CSE 413");
	        combo1.getItems().add("CSE 414");
	        combo1.getItems().add("CSE 494");
	        combo1.getItems().add("CSE 419");
	        combo1.getItems().add("CSE 440");
	        combo1.getItems().add("CSE 445");
	        combo1.getItems().add("CSE 465");
	        combo1.getItems().add("CSE 467");
	        combo1.getItems().add("CSE 468");
	        combo1.getItems().add("CSE 470");
	        combo1.getItems().add("CSE 495");
	        combo1.getItems().add("CSE 446");
	        combo1.getItems().add("CSE 447");
	        combo1.getItems().add("CSE 448");
	        combo1.getItems().add("CSE 449");
	        combo1.getItems().add("CSE 496");
	        combo1.getItems().add("ENG 102");
	        combo1.getItems().add("ENG 103");
	        combo1.getItems().add("ENG 111");
	        combo1.getItems().add("PHI 101");
	        combo1.getItems().add("PHI 104");
	        combo1.getItems().add("LBA 101");
	        combo1.getItems().add("LBA 102");
	        combo1.getItems().add("POL 101");
	        combo1.getItems().add("POL 104");
	        combo1.getItems().add("ECO 101");
	        combo1.getItems().add("ECO 104");
	        combo1.getItems().add("SOC 101");
	        combo1.getItems().add("ENV203/GEO205");
	        combo1.getItems().add("ANT 101");
	        combo1.getItems().add("BIO 103");
	        combo1.getItems().add("MAT 116");
	        combo1.getItems().add("MAT 120");
	        combo1.getItems().add("MAT 125");
	        combo1.getItems().add("MAT 130");
	        combo1.getItems().add("MAT 250");
	        combo1.getItems().add("MAT 350");
	        combo1.getItems().add("MAT 361");
	        combo1.getItems().add("PHY 107");
	        combo1.getItems().add("PHY 108");
	        combo1.getItems().add("CHE 101");
	        combo1.getItems().add("EEE 452");
	        combo1.getItems().add("EEE154");
	        
	        combo2.getItems().add("0.0");
	        combo2.getItems().add("1.0");
	        combo2.getItems().add("1.5");
	        combo2.getItems().add("3.0");
	        
	        combo3.getItems().add("A");
	        combo3.getItems().add("A-");
	        combo3.getItems().add("B+");
	        combo3.getItems().add("B");
	        combo3.getItems().add("B-");
	        combo3.getItems().add("C+");
	        combo3.getItems().add("C");
	        combo3.getItems().add("C-");
	        combo3.getItems().add("D+");
	        combo3.getItems().add("D");
	        combo3.getItems().add("F");
	       
	       combo1.setPromptText("Select Course");
	       combo2.setPromptText("Choose Credits");
	       combo3.setPromptText("Select Grade");
	       
	       
	       ComboBox combo4 = new ComboBox();
		   ComboBox combo5 = new ComboBox();
		   ComboBox combo6 = new ComboBox();

		    combo4.setPromptText("Select Course");
		    combo5.setPromptText("Choose Credits");
		    combo6.setPromptText("Select Grade");
		    
		    combo4.getItems().add("CSE 115 ");
	        combo4.getItems().add("CSE 115L");
	        combo4.getItems().add("CSE 215 ");
	        combo4.getItems().add("CSE 215L");
	        combo4.getItems().add("CSE 173");
	        combo4.getItems().add("CSE 225");
	        combo4.getItems().add("CSE 225L");
	        combo4.getItems().add("CSE 231");
	        combo4.getItems().add("CSE 231L");
	        combo4.getItems().add("CSE 299");
	        combo4.getItems().add("EEE 141");
	        combo4.getItems().add("EEE 141L");
	        combo4.getItems().add("EEE 111");
	        combo4.getItems().add("EEE 111L");
	        combo4.getItems().add("CSE 311");
	        combo4.getItems().add("CSE 311L");
	        combo4.getItems().add("CSE 323");
	        combo4.getItems().add("CSE 327");
	        combo4.getItems().add("CSE 331");
	        combo4.getItems().add("CSE 331L");
	        combo4.getItems().add("CSE 332");
	        combo4.getItems().add("CSE 373");
	        combo4.getItems().add("CSE 325");
	        combo4.getItems().add("CSE 498");
	        combo4.getItems().add("CSE 499A");
	        combo4.getItems().add("CSE 499B");
	        combo4.getItems().add("CSE 417");
	        combo4.getItems().add("CSE 401");
	        combo4.getItems().add("CSE 418"); 
	        combo4.getItems().add("CSE 426"); 
	        combo4.getItems().add("CSE 473");
	        combo4.getItems().add("CSE 491");
	        combo4.getItems().add("CSE 411");
	        combo4.getItems().add("CSE 424");
	        combo4.getItems().add("CSE 427");
	        combo4.getItems().add("CSE 428");
	        combo4.getItems().add("CSE 429");
	        combo4.getItems().add("CSE 492");
	        combo4.getItems().add("CSE 422");
	        combo4.getItems().add("CSE 438");
	        combo4.getItems().add("CSE 482");
	        combo4.getItems().add("CSE 485");
	        combo4.getItems().add("CSE 486");
	        combo4.getItems().add("CSE 493");
	        combo4.getItems().add("CSE 433");
	        combo4.getItems().add("CSE 435");
	        combo4.getItems().add("CSE 413");
	        combo4.getItems().add("CSE 414");
	        combo4.getItems().add("CSE 494");
	        combo4.getItems().add("CSE 419");
	        combo4.getItems().add("CSE 440");
	        combo4.getItems().add("CSE 445");
	        combo4.getItems().add("CSE 465");
	        combo4.getItems().add("CSE 467");
	        combo4.getItems().add("CSE 468");
	        combo4.getItems().add("CSE 470");
	        combo4.getItems().add("CSE 495");
	        combo4.getItems().add("CSE 446");
	        combo4.getItems().add("CSE 447");
	        combo4.getItems().add("CSE 448");
	        combo4.getItems().add("CSE 449");
	        combo4.getItems().add("CSE 496");
	        combo4.getItems().add("ENG 102");
	        combo4.getItems().add("ENG 103");
	        combo4.getItems().add("ENG 111");
	        combo4.getItems().add("PHI 101");
	        combo4.getItems().add("PHI 104");
	        combo4.getItems().add("LBA 101");
	        combo4.getItems().add("LBA 102");
	        combo4.getItems().add("POL 101");
	        combo4.getItems().add("POL 104");
	        combo4.getItems().add("ECO 101");
	        combo4.getItems().add("ECO 104");
	        combo4.getItems().add("SOC 101");
	        combo4.getItems().add("ENV203/GEO205");
	        combo4.getItems().add("ANT 101");
	        combo4.getItems().add("BIO 103");
	        combo4.getItems().add("MAT 116");
	        combo4.getItems().add("MAT 120");
	        combo4.getItems().add("MAT 125");
	        combo4.getItems().add("MAT 130");
	        combo4.getItems().add("MAT 250");
	        combo4.getItems().add("MAT 350");
	        combo4.getItems().add("MAT 361");
	        combo4.getItems().add("PHY 107");
	        combo4.getItems().add("PHY 108");
	        combo4.getItems().add("CHE 101");
	        combo4.getItems().add("EEE 452");
	        combo4.getItems().add("EEE154");
	      
	        combo5.getItems().add("0.0");
	        combo5.getItems().add("1.0");
	        combo5.getItems().add("1.5");
	        combo5.getItems().add("3.0");
	        
	        combo6.getItems().add("A");
	        combo6.getItems().add("A-");
	        combo6.getItems().add("B+");
	        combo6.getItems().add("B");
	        combo6.getItems().add("B-");
	        combo6.getItems().add("C+");
	        combo6.getItems().add("C");
	        combo6.getItems().add("C-");
	        combo6.getItems().add("D+");
	        combo6.getItems().add("D");
	        combo6.getItems().add("F");
		       
		    ComboBox combo7 = new ComboBox();
			ComboBox combo8 = new ComboBox();
			ComboBox combo9 = new ComboBox();

			 combo7.setPromptText("Select Course");
			 combo8.setPromptText("Choose Credits");
			 combo9.setPromptText("Select Grade");
			 
			 combo7.getItems().add("CSE 115 ");
		        combo7.getItems().add("CSE 115L");
		        combo7.getItems().add("CSE 215 ");
		        combo7.getItems().add("CSE 215L");
		        combo7.getItems().add("CSE 173");
		        combo7.getItems().add("CSE 225");
		        combo7.getItems().add("CSE 225L");
		        combo7.getItems().add("CSE 231");
		        combo7.getItems().add("CSE 231L");
		        combo7.getItems().add("CSE 299");
		        combo7.getItems().add("EEE 141");
		        combo7.getItems().add("EEE 141L");
		        combo7.getItems().add("EEE111");
		        combo7.getItems().add("EEE111L");
		        combo7.getItems().add("CSE 311");
		        combo7.getItems().add("CSE 311L");
		        combo7.getItems().add("CSE 323");
		        combo7.getItems().add("CSE 327");
		        combo7.getItems().add("CSE 331");
		        combo7.getItems().add("CSE 331L");
		        combo7.getItems().add("CSE 332");
		        combo7.getItems().add("CSE 373");
		        combo7.getItems().add("CSE325");
		        combo7.getItems().add("CSE498");
		        combo7.getItems().add("CSE499A");
		        combo7.getItems().add("CSE499B");
		        combo7.getItems().add("CSE 417");
		        combo7.getItems().add("CSE 401");
		        combo7.getItems().add("CSE 418"); 
		        combo7.getItems().add("CSE 426"); 
		        combo7.getItems().add("CSE 473");
		        combo7.getItems().add("CSE 491");
		        combo7.getItems().add("CSE 411");
		        combo7.getItems().add("CSE 424");
		        combo7.getItems().add("CSE 427");
		        combo7.getItems().add("CSE 428");
		        combo7.getItems().add("CSE 429");
		        combo7.getItems().add("CSE 492");
		        combo7.getItems().add("CSE 422");
		        combo7.getItems().add("CSE 438");
		        combo7.getItems().add("CSE 482");
		        combo7.getItems().add("CSE 485");
		        combo7.getItems().add("CSE 486");
		        combo7.getItems().add("CSE 493");
		        combo7.getItems().add("CSE 433");
		        combo7.getItems().add("CSE 435");
		        combo7.getItems().add("CSE 413");
		        combo7.getItems().add("CSE 414");
		        combo7.getItems().add("CSE 494");
		        combo7.getItems().add("CSE 419");
		        combo7.getItems().add("CSE 440");
		        combo7.getItems().add("CSE 445");
		        combo7.getItems().add("CSE 465");
		        combo7.getItems().add("CSE 467");
		        combo7.getItems().add("CSE 468");
		        combo7.getItems().add("CSE 470");
		        combo7.getItems().add("CSE 495");
		        combo7.getItems().add("CSE 446");
		        combo7.getItems().add("CSE 447");
		        combo7.getItems().add("CSE 448");
		        combo7.getItems().add("CSE 449");
		        combo7.getItems().add("CSE 496");
		        combo7.getItems().add("ENG 102");
		        combo7.getItems().add("ENG 103");
		        combo7.getItems().add("ENG 111");
		        combo7.getItems().add("PHI 101");
		        combo7.getItems().add("PHI 104");
		        combo7.getItems().add("LBA 101");
		        combo7.getItems().add("LBA 102");
		        combo7.getItems().add("POL 101");
		        combo7.getItems().add("POL 104");
		        combo7.getItems().add("ECO 101");
		        combo7.getItems().add("ECO 104");
		        combo7.getItems().add("SOC 101");
		        combo7.getItems().add("ENV203/GEO205");
		        combo7.getItems().add("ANT 101");
		        combo7.getItems().add("BIO 103");
		        combo7.getItems().add("MAT 116");
		        combo7.getItems().add("MAT 120");
		        combo7.getItems().add("MAT 125");
		        combo7.getItems().add("MAT 130");
		        combo7.getItems().add("MAT 250");
		        combo7.getItems().add("MAT 350");
		        combo7.getItems().add("MAT 361");
		        combo7.getItems().add("PHY 107");
		        combo7.getItems().add("PHY 108");
		        combo7.getItems().add("CHE 101");
		        combo7.getItems().add("EEE 452");
		        combo7.getItems().add("EEE154");
		      
		        combo8.getItems().add("0.0");
		        combo8.getItems().add("1.0");
		        combo8.getItems().add("1.5");
		        combo8.getItems().add("3.0");
		        
		        combo9.getItems().add("A");
		        combo9.getItems().add("A-");
		        combo9.getItems().add("B+");
		        combo9.getItems().add("B");
		        combo9.getItems().add("B-");
		        combo9.getItems().add("C+");
		        combo9.getItems().add("C");
		        combo9.getItems().add("C-");
		        combo9.getItems().add("D+");
		        combo9.getItems().add("D");
		        combo9.getItems().add("F");
			       			       
			 
			 ComboBox combo10 = new ComboBox();
			 ComboBox combo11 = new ComboBox();
			 ComboBox combo12 = new ComboBox();
				        
			 combo10.setPromptText("Select Course");
			 combo11.setPromptText("Choose Credits");
			 combo12.setPromptText("Select Grade");
			 
			 combo10.getItems().add("CSE 115 ");
		        combo10.getItems().add("CSE 115L");
		        combo10.getItems().add("CSE 215 ");
		        combo10.getItems().add("CSE 215L");
		        combo10.getItems().add("CSE 173");
		        combo10.getItems().add("CSE 225");
		        combo10.getItems().add("CSE 225L");
		        combo10.getItems().add("CSE 231");
		        combo10.getItems().add("CSE 231L");
		        combo10.getItems().add("CSE 299");
		        combo10.getItems().add("EEE 141");
		        combo10.getItems().add("EEE 141L");
		        combo10.getItems().add("EEE111");
		        combo10.getItems().add("EEE111L");
		        combo10.getItems().add("CSE 311");
		        combo10.getItems().add("CSE 311L");
		        combo10.getItems().add("CSE 323");
		        combo10.getItems().add("CSE 327");
		        combo10.getItems().add("CSE 331");
		        combo10.getItems().add("CSE 331L");
		        combo10.getItems().add("CSE 332");
		        combo10.getItems().add("CSE 373");
		        combo10.getItems().add("CSE325");
		        combo10.getItems().add("CSE498");
		        combo10.getItems().add("CSE499A");
		        combo10.getItems().add("CSE499B");
		        combo10.getItems().add("CSE 417");
		        combo10.getItems().add("CSE 401");
		        combo10.getItems().add("CSE 418"); 
		        combo10.getItems().add("CSE 426"); 
		        combo10.getItems().add("CSE 473");
		        combo10.getItems().add("CSE 491");
		        combo10.getItems().add("CSE 411");
		        combo10.getItems().add("CSE 424");
		        combo10.getItems().add("CSE 427");
		        combo10.getItems().add("CSE 428");
		        combo10.getItems().add("CSE 429");
		        combo10.getItems().add("CSE 492");
		        combo10.getItems().add("CSE 422");
		        combo10.getItems().add("CSE 438");
		        combo10.getItems().add("CSE 482");
		        combo10.getItems().add("CSE 485");
		        combo10.getItems().add("CSE 486");
		        combo10.getItems().add("CSE 493");
		        combo10.getItems().add("CSE 433");
		        combo10.getItems().add("CSE 435");
		        combo10.getItems().add("CSE 413");
		        combo10.getItems().add("CSE 414");
		        combo10.getItems().add("CSE 494");
		        combo10.getItems().add("CSE 419");
		        combo10.getItems().add("CSE 440");
		        combo10.getItems().add("CSE 445");
		        combo10.getItems().add("CSE 465");
		        combo10.getItems().add("CSE 467");
		        combo10.getItems().add("CSE 468");
		        combo10.getItems().add("CSE 470");
		        combo10.getItems().add("CSE 495");
		        combo10.getItems().add("CSE 446");
		        combo10.getItems().add("CSE 447");
		        combo10.getItems().add("CSE 448");
		        combo10.getItems().add("CSE 449");
		        combo10.getItems().add("CSE 496");
		        combo10.getItems().add("ENG 102");
		        combo10.getItems().add("ENG 103");
		        combo10.getItems().add("ENG 111");
		        combo10.getItems().add("PHI 101");
		        combo10.getItems().add("PHI 104");
		        combo10.getItems().add("LBA 101");
		        combo10.getItems().add("LBA 102");
		        combo10.getItems().add("POL 101");
		        combo10.getItems().add("POL 104");
		        combo10.getItems().add("ECO 101");
		        combo10.getItems().add("ECO 104");
		        combo10.getItems().add("SOC 101");
		        combo10.getItems().add("ENV203/GEO205");
		        combo10.getItems().add("ANT 101");
		        combo10.getItems().add("BIO 103");
		        combo10.getItems().add("MAT 116");
		        combo10.getItems().add("MAT 120");
		        combo10.getItems().add("MAT 125");
		        combo10.getItems().add("MAT 130");
		        combo10.getItems().add("MAT 250");
		        combo10.getItems().add("MAT 350");
		        combo10.getItems().add("MAT 361");
		        combo10.getItems().add("PHY 107");
		        combo10.getItems().add("PHY 108");
		        combo10.getItems().add("CHE 101");
		        combo10.getItems().add("EEE 452");
		        combo10.getItems().add("EEE154");
		      
		        combo11.getItems().add("0.0");
		        combo11.getItems().add("1.0");
		        combo11.getItems().add("1.5");
		        combo11.getItems().add("3.0");
		        
		        combo12.getItems().add("A");
		        combo12.getItems().add("A-");
		        combo12.getItems().add("B+");
		        combo12.getItems().add("B");
		        combo12.getItems().add("B-");
		        combo12.getItems().add("C+");
		        combo12.getItems().add("C");
		        combo12.getItems().add("C-");
		        combo12.getItems().add("D+");
		        combo12.getItems().add("D");
		        combo12.getItems().add("F");
			       	
			 
			 ComboBox combo13 = new ComboBox();
			 ComboBox combo14 = new ComboBox();
			 ComboBox combo15 = new ComboBox();

			  combo13.setPromptText("Select Course");
			  combo14.setPromptText("Choose Credits");
			  combo15.setPromptText("Select Grade");
			  
			  combo13.getItems().add("CSE 115 ");
		        combo13.getItems().add("CSE 115L");
		        combo13.getItems().add("CSE 215 ");
		        combo13.getItems().add("CSE 215L");
		        combo13.getItems().add("CSE 173");
		        combo13.getItems().add("CSE 225");
		        combo13.getItems().add("CSE 225L");
		        combo13.getItems().add("CSE 231");
		        combo13.getItems().add("CSE 231L");
		        combo13.getItems().add("CSE 299");
		        combo13.getItems().add("EEE 141");
		        combo13.getItems().add("EEE 141L");
		        combo13.getItems().add("EEE111");
		        combo13.getItems().add("EEE111L");
		        combo13.getItems().add("CSE 311");
		        combo13.getItems().add("CSE 311L");
		        combo13.getItems().add("CSE 323");
		        combo13.getItems().add("CSE 327");
		        combo13.getItems().add("CSE 331");
		        combo13.getItems().add("CSE 331L");
		        combo13.getItems().add("CSE 332");
		        combo13.getItems().add("CSE 373");
		        combo13.getItems().add("CSE325");
		        combo13.getItems().add("CSE498");
		        combo13.getItems().add("CSE499A");
		        combo13.getItems().add("CSE499B");
		        combo13.getItems().add("CSE 417");
		        combo13.getItems().add("CSE 401");
		        combo13.getItems().add("CSE 418"); 
		        combo13.getItems().add("CSE 426"); 
		        combo13.getItems().add("CSE 473");
		        combo13.getItems().add("CSE 491");
		        combo13.getItems().add("CSE 411");
		        combo13.getItems().add("CSE 424");
		        combo13.getItems().add("CSE 427");
		        combo13.getItems().add("CSE 428");
		        combo13.getItems().add("CSE 429");
		        combo13.getItems().add("CSE 492");
		        combo13.getItems().add("CSE 422");
		        combo13.getItems().add("CSE 438");
		        combo13.getItems().add("CSE 482");
		        combo13.getItems().add("CSE 485");
		        combo13.getItems().add("CSE 486");
		        combo13.getItems().add("CSE 493");
		        combo13.getItems().add("CSE 433");
		        combo13.getItems().add("CSE 435");
		        combo13.getItems().add("CSE 413");
		        combo13.getItems().add("CSE 414");
		        combo13.getItems().add("CSE 494");
		        combo13.getItems().add("CSE 419");
		        combo13.getItems().add("CSE 440");
		        combo13.getItems().add("CSE 445");
		        combo13.getItems().add("CSE 465");
		        combo13.getItems().add("CSE 467");
		        combo13.getItems().add("CSE 468");
		        combo13.getItems().add("CSE 470");
		        combo13.getItems().add("CSE 495");
		        combo13.getItems().add("CSE 446");
		        combo13.getItems().add("CSE 447");
		        combo13.getItems().add("CSE 448");
		        combo13.getItems().add("CSE 449");
		        combo13.getItems().add("CSE 496");
		        combo13.getItems().add("ENG 102");
		        combo13.getItems().add("ENG 103");
		        combo13.getItems().add("ENG 111");
		        combo13.getItems().add("PHI 101");
		        combo13.getItems().add("PHI 104");
		        combo13.getItems().add("LBA 101");
		        combo13.getItems().add("LBA 102");
		        combo13.getItems().add("POL 101");
		        combo13.getItems().add("POL 104");
		        combo13.getItems().add("ECO 101");
		        combo13.getItems().add("ECO 104");
		        combo13.getItems().add("SOC 101");
		        combo13.getItems().add("ENV203/GEO205");
		        combo13.getItems().add("ANT 101");
		        combo13.getItems().add("BIO 103");
		        combo13.getItems().add("MAT 116");
		        combo13.getItems().add("MAT 120");
		        combo13.getItems().add("MAT 125");
		        combo13.getItems().add("MAT 130");
		        combo13.getItems().add("MAT 250");
		        combo13.getItems().add("MAT 350");
		        combo13.getItems().add("MAT 361");
		        combo13.getItems().add("PHY 107");
		        combo13.getItems().add("PHY 108");
		        combo13.getItems().add("CHE 101");
		        combo13.getItems().add("EEE 452");
		        combo13.getItems().add("EEE154");
		      
		        combo14.getItems().add("0.0");
		        combo14.getItems().add("1.0");
		        combo14.getItems().add("1.5");
		        combo14.getItems().add("3.0");
		        
		        combo15.getItems().add("A");
		        combo15.getItems().add("A-");
		        combo15.getItems().add("B+");
		        combo15.getItems().add("B");
		        combo15.getItems().add("B-");
		        combo15.getItems().add("C+");
		        combo15.getItems().add("C");
		        combo15.getItems().add("C-");
		        combo15.getItems().add("D+");
		        combo15.getItems().add("D");
		        combo15.getItems().add("F");
			       			       
			  Button btn=new Button("CALCULATE");
			  btn.setFont(Font.font( "Verdana", FontWeight.BOLD, 12));
				 
				 btn.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent arg0) {
							
							 Label lb0=new Label("     ");
							 Label lb0_0=new Label(" ");
							 Label lb1=new Label("CGPA");
							 lb1.setFont(Font.font( "Verdana", FontWeight.BOLD, 20));
							 Label lb2=new Label("Name: "+tf1.getText().toString());
							 lb2.setFont(Font.font( "Verdana", FontWeight.BOLD, 12));
							 Label lb3=new Label("ID: "+tf2.getText().toString());
							 lb3.setFont(Font.font( "Verdana", FontWeight.BOLD, 12));
							 Label lb4=new Label("    Course");
							 Label lb5=new Label("    Credits ");
							 Label lb6=new Label("  Grade");
							 lb4.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
							 lb5.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
							 lb6.setFont(Font.font( "Verdana", FontWeight.BOLD, 11));
						
						
							 Label lb7=new Label("Course 1:");
							 Label lb8=new Label("Course 2:");
							 Label lb9=new Label("Course 3:");
							 Label lb10=new Label("Course 4:");
							 Label lb11=new Label("Course 5:");
							 
							 lb7.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
							 lb8.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
							 lb9.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
							 lb10.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
							 lb11.setFont(Font.font( "Verdana", FontWeight.BOLD, 10));
							 
							 Line line1 = new Line();
							 line1.setStartX(100.0); 
						     line1.setStartY(150.0); 
						     line1.setEndX(800.0); 
						     line1.setEndY(150.0); 
						      
						     Line line2 = new Line(); 
						     line2.setStartX(100.0); 
						     line2.setStartY(150.0); 
						     line2.setEndX(800.0); 
						     line2.setEndY(150.0);
						     
						     Label c1= new Label(combo1.getValue().toString());
						     Label c2= new Label(combo2.getValue().toString());
						     Label c3= new Label(combo3.getValue().toString());
						     Label c4= new Label(combo4.getValue().toString());
						     Label c5= new Label(combo5.getValue().toString());
						     Label c6= new Label(combo6.getValue().toString());
						     Label c7= new Label(combo7.getValue().toString());
						     Label c8= new Label(combo8.getValue().toString());
						     Label c9= new Label(combo9.getValue().toString());
						     Label c10= new Label(combo10.getValue().toString());
						     Label c11= new Label(combo11.getValue().toString());
						     Label c12= new Label(combo12.getValue().toString());
						     Label c13= new Label(combo13.getValue().toString());
						     Label c14= new Label(combo14.getValue().toString());
						     Label c15= new Label(combo15.getValue().toString());
						     Label cgpa= new Label("Your CGPA: ");
						     
						     String grade1= combo3.getValue().toString();
						     String grade2= combo6.getValue().toString();
						     String grade3= combo9.getValue().toString();
						     String grade4= combo12.getValue().toString();
						     String grade5= combo15.getValue().toString();
						     
						     double credit1=Double.parseDouble(combo2.getValue().toString());
						     double credit2=Double.parseDouble(combo5.getValue().toString());
						     double credit3=Double.parseDouble(combo8.getValue().toString());
						     double credit4=Double.parseDouble(combo11.getValue().toString());
						     double credit5=Double.parseDouble(combo14.getValue().toString());
						     
						     double gp1,gp2,gp3,gp4,gp5;
						    
						     gp1=gradeChecker(grade1);
						     gp2=gradeChecker(grade2);
						     gp3=gradeChecker(grade3);
						     gp4=gradeChecker(grade4);
						     gp5=gradeChecker(grade5);
			                 
						     double sumOf_credit=credit1+credit2+credit3+credit4+credit5;
						     
						     double avg = ((credit1*gp1)+(credit2*gp2)+(credit3*gp3)+(credit4*gp4)+(credit5*gp5)) / sumOf_credit;
						     DecimalFormat df=new DecimalFormat(".##");
						     String ans=(String.valueOf(df.format(avg)));
						     
						     Label lb_ans= new Label("Your CGPA:");
						     Label cgValue= new Label(ans);
						     lb_ans.setFont(Font.font( "Verdana", FontWeight.BOLD, 12));
						     cgValue.setFont(Font.font( "Verdana", FontWeight.BOLD, 12));
						     
						   
						     HBox hb1=new HBox(10,lb1);
						     HBox hb2=new HBox(10,lb2,lb3);
						     HBox hb3=new HBox(90,lb0,lb4,lb5,lb6,lb0_0); 
						     HBox hbox1 = new HBox(130,lb7,c1,c2,c3);
							 HBox hbox2 = new HBox(130,lb8,c4,c5,c6);
							 HBox hbox3 = new HBox(130,lb9,c7,c8,c9);
							 HBox hbox4 = new HBox(130,lb10,c10,c11,c12);
							 HBox hbox5 = new HBox(130,lb11,c13,c14,c15);
						    
							 hbox1.setAlignment(Pos.CENTER);
							 hbox2.setAlignment(Pos.CENTER);
							 hbox3.setAlignment(Pos.CENTER);
							 hbox4.setAlignment(Pos.CENTER);
							 hbox5.setAlignment(Pos.CENTER);
							 
							 hb1.setAlignment(Pos.CENTER);
							 hb2.setAlignment(Pos.CENTER);
							 hb3.setAlignment(Pos.CENTER_RIGHT);
							 
							 HBox cgHeading = new HBox(10,lb_ans);
							 HBox hboxres = new HBox(10,cgValue);
							 hboxres.setAlignment(Pos.CENTER);
							 cgHeading.setAlignment(Pos.CENTER);
						     VBox root = new VBox(20,hb1,hb2,line1,hb3,hbox1,hbox2,hbox3,hbox4,hbox5,line2,cgHeading,hboxres);
							 root.setAlignment(Pos.CENTER);
								   
						     
						    
								        Scene scene=new Scene(root,700,600);  
								 
								        primaryStage.setScene(scene);
								        
								        primaryStage.setTitle("Your CGPA");  
								        primaryStage.show();
							
						
							
						}
					});		       
	       
	     HBox hb1=new HBox(10,lb1); 
		 HBox hb2=new HBox(10,lb2,tf1,lb3,tf2);
		 HBox hb3=new HBox(100,lb0,lb4,lb5,lb6);
		 HBox hb = new HBox(10,btn);
		 HBox hbox1 = new HBox(50,lb7,combo1,combo2,combo3);
		 HBox hbox2 = new HBox(50,lb8,combo4,combo5,combo6);
		 HBox hbox3 = new HBox(50,lb9,combo7,combo8,combo9);
		 HBox hbox4 = new HBox(50,lb10,combo10,combo11,combo12);
		 HBox hbox5 = new HBox(50,lb11,combo13,combo14,combo15);
		 hb.setAlignment(Pos.CENTER);
		 hb1.setAlignment(Pos.CENTER);
		 hb2.setAlignment(Pos.CENTER);
		 hb3.setAlignment(Pos.CENTER);
		 hbox1.setAlignment(Pos.CENTER);
		 hbox2.setAlignment(Pos.CENTER);
		 hbox3.setAlignment(Pos.CENTER);
		 hbox4.setAlignment(Pos.CENTER);
		 hbox5.setAlignment(Pos.CENTER);
		    
        VBox root = new VBox(20,hb1,hb2,line1,hb3,hbox1,hbox2,hbox3,hbox4,hbox5,line2,hb);
		root.setAlignment(Pos.CENTER);
		    
		        Scene scene=new Scene(root,700,600);  
		 
		        primaryStage.setScene(scene);
		        
		        primaryStage.setTitle("CGPA Calculator");  
		        primaryStage.show();  
			
	}
	
	public static double gradeChecker(String grade) {
		double cgp;
		switch (grade) {
	     
	     case "A":
	     cgp = 4.0;
	     break;
	     
	     case "A-":
	     cgp = 3.7;
	     break;
	     
	     case "B":
	     cgp = 3.0;
	     break;
	     
	     case "B+":
	     cgp = 3.3;
	     break;
	     
	     case "B-":
	     cgp = 2.7;
	     break;
	     
	     case "C":
	     cgp = 2.0;
	     break;
	     
	     case "C+":
	     cgp = 2.3;
	     break;
	     
	     case "C-":
	     cgp = 1.7;
	     break;
	     
	     case "D+":
		     cgp = 1.3;
		     break;
		     
	     case "D":
	     cgp = 1.0;
	     break;
          
	     default:
	    	 cgp =0.0;
	    	 break;
	    	 
	 }
		return cgp;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
