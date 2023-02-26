/* ***
* Autor............: Luan Pinheiro Azevedo
* Matricula........: 202110904
* Inicio...........: 13/02/2023
* Ultima alteracao.: 18/02/2023
* Nome.............: ToJavaDO
* Funcao...........: Uma aplicação que permite agendar e organizar afazeres em seus dias específicos
utilizando arquivos para armazenamento de dados cadastrados. No programa há a possibilidade de manipulação
dos horários agendados.
**/
//pacote em que o arquivo se encontra
package controller;
//importações
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import view.ChangeScreen;

public class StartScreenController{
  //atributos para as contruções das tags do FXML

  @FXML
  private Button btnOpen;

  @FXML
  private ImageView imgStart;

  @FXML
  void OnClickBtnOpen(ActionEvent event) {
    ChangeScreen.changeScene("login"); //mudando para a tela de login
  }

}