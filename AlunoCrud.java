package crud.aluno;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class AlunoCrud {

    public class Aluno {

        private long id;
        private String ra;
        private String nome;
        private LocalDate nascimento;

        //getters e setters
        public long getId(){
            return this.id;
        }

        public void setId(long id){
            this.id = id;
        }

        public String getRa(){
            return this.ra;
        }

        public void setRa(String ra){
            this.ra = ra;
        }

        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public LocalDate getNascimento(){
            return this.nascimento;
        }

        public void setNascimento(LocalDate nascimento){
            this.nascimento = nascimento;
        }
    }

    public class Control {

        //array list do tipo aluno
        private List<Aluno> lista = new ArrayList<>();

        public void adicionar (Aluno a){
            //adicionando para a lista um aluno (a)
            list.add(a);
        }

        public Aluno pesquisarPorNome (String nome){
            //fazendo um laço de repetição para procurar por aluno dentro da lista
            for (Aluno a : lista){
                if(a.getNome().contains(nome)){
                    return a;
                }
            }
            return null;
            }
        }
    }

    public class Boundary extends Application {

        //declare os componentes graficos necessários
        private TextField txtId = new TextField();
        private TextField txtRa = new TextField();
        private TextField txtNome = new TextField();
        private TextField txtNascimento = new TextField();

        //start
        @Override
        public void start (Stage stage){
            GridPane pane = new GridPane();

            //definindo colunas
            ColumnConstraints col30 = new ColumnConstraints();
            col30.setPercentWidth = (30.0);
            ColumnConstraints col70 = new ColumnConstraints();
            col70.setPercentWidth = (70.0);

            pane.getColumnConstraints().addAll(col30, col70);

            //definindo linhas
            RowConstraints row25 = new RowConstraints();
            row25.setPercentHeight = (25.0);

            pane.getRowConstraints().addAll(row25, row25, row25 , row25);

            //cria uma cena
            Scene scn = new Scene(pane, 600, 400);

            //cria botoes
            Button btnAdicionar = new Button("Adicionar");
            Button btnPesquisar = new Button("Pesquisar");
            
            //posiciona elementos no pane
            pane.add(new Label("Id: "), 0, 0);
            pane.add(txtId, 1, 0);
            
            pane.add(new Label("Ra: "), 0, 1);
            pane.add(txtRa, 1, 1);

            pane.add(new Label("Nome: "), 0, 2);
            pane.add(txtNome, 1, 2);

            pane.add(new Label("Data de Nascimento: "), 0, 3)
            pane.add(txtNascimento, 1, 3);

            pane.add(btnAdicionar, 0, 4);
            pane.add(btnPesquisar, 1, 4);
  
            //registra funcoes aos botoes
            btnGravar.setOnAction( e -> {
                Aluno a = boundaryToEntity();
                control.adicionar(a);
                Alert alert = new Alert(AlertType.INFORMATION, "Aluno registrado com sucesso");
                alert.showAndWait();
                txtId.setText("");
                txtRa.setText("");
                txtNome.setText("");
                txtNascimento.setText("");

            });

            btnPesquisar.setOnAction( e -> {
                Aluno a = control.pesquisarPorNome(txtNome.getText());
                if(a == null){
                    Alert alert = new Alert(AlertType.WARNING, "Não há aluno com esse nome");
                    alert.showAndWait();
                } else {
                    entityToBoundary(a);
                }
            });

            stage.setScene(scn);
            stage.setTitle("Agenda de Contatos");
            stage.show();
        }

        //adicionando do form para entidade
        public Aluno boundaryToEntity(){
            Aluno a = new Aluno();
            //definindo valores na entidade, baseado no formulario
            a.setId(txtId.getText());
            a.setRa(txtRa.getText());
            a.setNome(txtNome.getText());
            a.setNascimento(txtNascimento.getText());
            return a;
        }

        //exibindo da entidade para o form
        public void entityToBoundary(<Aluno> a){
            if(a != null){
                txtId.setText(a.getId());
                txtRa.setText(a.getRa());
                txtNome.setText(a.getNome());
                txtNascimento.setText(a.getNascimento());
            }
        }

        //main para iniciar
        public static void main (String [] args){
            Application.launch(Boundary.class, args);
        }
    }
}