package indentacao;

public class BoletimEstudantil {

        int media = 6;
        public void imprimirResultado(Double nota){
            if(nota > media){
                System.out.println("APROVADO");
            }else if(nota == media ) {
                System.out.println("PROVA REFORÇO");
            }
            else{
                System.out.println("REPROVADO");
            }
        }

        public void loopingMedia(Double nota){
            for(int i=0; i<media; i++){
                imprimirResultado(nota);
            }
        }


}
