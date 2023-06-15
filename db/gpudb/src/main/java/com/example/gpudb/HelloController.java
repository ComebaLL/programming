/**  GPU class db */
/**  @author Kuvykin Nikita */
package com.example.gpudb;

import com.sun.javafx.menu.MenuItemBase;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public TableView<GPU> TableGPU;

    @FXML
    public TableColumn<GPU, String> producer_id;

    @FXML
    public TableColumn<GPU, String> GPU_id;

    @FXML
    public TableColumn<GPU, String> memoryType_id;

    @FXML
    public TableColumn<GPU, Integer> memorySize_id;

    @FXML
    public TableColumn<GPU, String> connectionType_id;

    @FXML
    public TableColumn<GPU, Integer> price_id;

    @FXML
    public TextField TextFiled_producer;

    @FXML
    public TextField TextField_GPU;

    @FXML
    public TextField TextFiled_memorysize;

    @FXML
    public TextField TextFiled_memorytype;

    @FXML
    public TextField TextFiled_connectiontype;

    @FXML
    public TextField TextFiled_price;

    @FXML
    public Button addButton;

    dbgpu dbgpus = new dbgpu();
    private final ObservableList<GPU> data = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        addButton.setOnAction(actionEvent -> {
           GPU gpu1 = new GPU (TextFiled_producer.getText(), TextField_GPU.getText(),TextFiled_memorysize.getText(),TextFiled_memorytype.getText(),TextFiled_connectiontype.getText(),TextFiled_price.getText());
           data.add(gpu1);
        });
        try {
            addinfboutGPU();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        producer_id.setCellValueFactory(new PropertyValueFactory<>(" producer"));

        GPU_id.setCellValueFactory(new PropertyValueFactory<>(" GPU"));

        memorySize_id.setCellValueFactory(new PropertyValueFactory<>(" memorySize"));

        memoryType_id.setCellValueFactory(new PropertyValueFactory<>(" memoryType"));

        connectionType_id.setCellValueFactory(new PropertyValueFactory<>(" connectionType"));

        price_id.setCellValueFactory(new PropertyValueFactory<>(" price"));

        TableGPU.setItems(data);

    }

    private void addinfboutGPU() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ResultSet gpus = dbgpus.getGPUU();

            try{
                while (gpus.next()){
                    GPU gpus0 = new GPU(gpus.getString( 1 ),
                                        gpus.getString( 2),
                                        gpus.getInt(3),
                                        gpus.getString(4),
                                        gpus.getString(5),
                                        gpus.getInt(6));
                    data.add(gpus0);
                }
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
    }
}