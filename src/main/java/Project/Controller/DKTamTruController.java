
package Project.Controller;
import Project.Model.TamTru;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DKTamTruController implements Initializable {

    @FXML
    private Button btnHuy;

    @FXML
    private Button btnXacNhan;

    @FXML
    private DatePicker dateDenNgay;

    @FXML
    private DatePicker dateTuNgay;

    @FXML
    private TextField txtCCCD;

    @FXML
    private TextArea txtLyDo;

    @FXML
    private TextField txtMaGiay;

    @FXML
    private TextField txtNoiTamTru;
    TamTru tamTru = new TamTru();
    @FXML
    void actDenNgay(ActionEvent event) {

    }

    @FXML
    void actHuy(ActionEvent event) {

    }

    @FXML
    void actTuNgay(ActionEvent event) {

    }

    @FXML
    void actXacNhan(ActionEvent event) {

    }

    @FXML
    public  void actXacNhan(ActionEvent event){
        tamTru.setMaGiayTamTru(txtMaGiay.getText());
        tamTru.setNoiTamTru(txtNoiTamTru.getText());
        tamTru.setTuNgay(dateTuNgay.get);
        tamTru.setDenNgay(java.sql.Date.valueOf(txtDenNgay.getText()));
        tamTru.setLyDo(txtLyDo.getText());
        tamTru.setID(TamTruManager.List.size() + 1);
        tamTru.setIdNhanKhau(NhanKhauManager.nhanKhauList.size() + 1);

        Stage stage = (Stage) btnXacNhan.getScene().getWindow();
        stage.close();

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public TamTru getTamTru(){
        return tamTru;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}