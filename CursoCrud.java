package crud.curso;

import java.util.List;
import java.util.ArrayList;


public class CursoJava{
    public class Curso{

        private String id;
        private String nome;
        private String codCurso;
        private String nomeCoord;
        private int qtdAlunos;

        public String getId (){
            return this.id;
        }

        public void setId(String id){
            This.id = id;
        }

        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            This.nome = nome;
        }

        public String getCodCurso(){
            return this.codCurso;
        }

        public void setCodCurso(String codCurso){
            this.codCurso = codCurso;
        }

        public String getNomeCoord(){
            return this.nomeCoord;
        }

        public void setNomeCoord(String getNomeCoord){
            this.nomeCoord = nomeCoord;
        }

        public int getQtdAlunos(){
            return this.qtdAlunos;
        }

        public void setQtdAlunos(int qtdAlunos){
            this.qtdAlunos = qtdAlunos;
        }

    }

    public class Control{
        ArrayList <Curso> lista = new ArrayList<>();

        public void adicionar

    }

    public class Boundary{

    }
}