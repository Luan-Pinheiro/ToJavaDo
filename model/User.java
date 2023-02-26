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
package model;
//importações
import java.io.Serializable;

public class User implements Serializable{
  //atributos da classe
  private String username;
  private String senha;
  private String task;
  private String day;

  //Contrutores
  public User (String username, String senha){
    this.username = username;
    this.senha = senha;
  }
  public User(String username, String task, String day){
    this.task = task;
    this.day = day;
  }

  //Getters 
  public String getDay() {
    return day;
  }
  public String getTask() {
    return task;
  }
  public String getUsername() {
    return username;
  }
  public String getSenha() {
    return senha;
  }
}
