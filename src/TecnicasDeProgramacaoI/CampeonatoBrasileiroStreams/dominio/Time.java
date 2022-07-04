package TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.dominio;

public record Time(String nome){
    @Override
    public String toString() {
        return  nome;
    }
}