package util;

public class Validacoes {

    private Validacoes(){

    }

    public static boolean nomeValido(String nome){
        return !(nome == null ||
                 nome.trim().isEmpty() ||
                 nome.matches(".*\\d+.*")
        );
    }

    public static String mensagemErroNome(String nome){
        if (nome == null ||nome.trim().isEmpty()){
            return "Erro: o mome nao pode ser vazio";
        }else if (nome.matches(".*\\d+.*")){
            return "Erro: o nome nao pode conter numero";
        }
        return "";
    }

    public static boolean generoValido(String genero){
        return !(genero == null ||
                 genero.trim().isEmpty() ||
                 genero.matches(".*\\d+.*")
        );
    }

    public static String mensagemErroGenero(String genero){
        if (genero == null ||genero.trim().isEmpty()){
            return "Erro: o gênero nao pode ser vazio";
        }else if (genero.matches(".*\\d+.*")){
            return "Erro: o gênero nao pode conter numero";
        }
        return "";
    }
    
    public static boolean lancamentoValida(int lancamento){
        return lancamento >= 0 && lancamento <= 2030;
    }

    public static String mensagemErroLancamento(int lancamento){
        if(lancamento < 0){
            return "Erro: lançamento nao pode ser negativa";
        }else if (lancamento > 2030){
            return "Erro: lançamento invalido";
        }
        return "";
    }
}
