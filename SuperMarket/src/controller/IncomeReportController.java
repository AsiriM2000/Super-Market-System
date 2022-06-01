package controller;

import bo.BOFactory;
import bo.custom.QueryBO;
import com.jfoenix.controls.JFXTextField;
import dto.IncomeDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class IncomeReportController {
    public JFXTextField txtDailyIncome;
    public AnchorPane incomeAnchor;
    private final QueryBO queryBO = (QueryBO) BOFactory.getBoFactory().getBO(BOFactory.BOType.QUERYBO);
    public DatePicker cmbDate;

    public void navigateToHome(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage)incomeAnchor.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Main-Form-Administrator.fxml"))));
        stage.centerOnScreen();
    }

    public void checkOnAction(ActionEvent actionEvent) {
        try {
            String date = String.valueOf(cmbDate.getValue());
            IncomeDTO dto = queryBO.getDailyIncome(date);
            txtDailyIncome.setText(String.valueOf(dto.getTotal()));

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
