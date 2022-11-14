import javax.swing.JOptionPane;

public class Locadora{
    public static void main(String[] args) {

        //ARRAY DE GENEROS
        String[] generos = new String[] {
            "Animação", "Comédia", "Drama", "Fanstasia", "Mistério", "Sair"
        };

        //ARRAY DE FILMES DE ANIMACAO
        String[] filmesAnima = new String[] {
            "Luca", "Divertida Mente", "Viva a Vida é uma Festa", "Rei Leão (1994)", "WALL-E", "Kung Fu Panda", "Toy Story 3", "A Viagem de Chihiro", "Shrek", "Os Incríveis", "Voltar" 
        };

        //ARRAY DE FILMES DE COMÉDIA    
        String[]filmesComedia = new String[]{
            "O Auto da Compadecida", "Curtindo a Vida Adoidado", "Deadpool", "O Diabo Veste Prada", "Esposa de Mentirinha", "As Branquelas", "Se Beber, Não Case!", "Anjos da Lei", "Família do Bagulho", "Loucademia de Policia", "Voltar"
        };

        //ARRAY DE FILMES DE DRAMA
        String[] filmesDrama = new String[]{
            "Crepúsculo", "Ela", "História de um Casamento", "Questão de Tempo", "Me Chame Pelo Seu Nome", "Palm Springs", "A Forma da Água", "Nasce uma Estrela", "Forrest Gump", "Um Sonho de Liberdade", "Voltar"
        };

        //ARRAY DE FILMES DE DRAMA
        String[] filmesFantasia = new String[]{
           "Piratas do Caribe", "Vingadores", "Harry Potter", "O Senhor dos Anéis", "Mulher Maravilha", "The Batman", "A Fantástica Fábrica de Chocolate", "As Crônias de Nárnia", "Avatar", "Malévola",
        };


        String[] filmesMisterio = new String[]{
            "Zodiaco", "Parasita", "A Visita", "Jogos Mortais", ""
        };
        //
        int animaEsc = 0;
        int comediaEsc = 0;
        int dramaEsc = 0;
        int fantaEsc = 0;
        int misterioEsc = 0;
        int generoEsc = 0;
        
        //PAINEL DE GENEROS
        while(generoEsc != 5) {
            generoEsc = JOptionPane.showOptionDialog(
                null, 
                "Selecione o genero", 
                "Locadora do Roberto", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                generos, 
                0
            );

            if (generoEsc == 0) {
                animaEsc = JOptionPane.showOptionDialog(
                null, 
                "Selecione a Animação", 
                "Locadora do Roberto", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                filmesAnima, 
                0
                );
            }

            if (generoEsc == 1) {
                comediaEsc = JOptionPane.showOptionDialog(
                null, 
                "Selecione o filme de Comédia", 
                "Locadora do Roberto", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                filmesComedia, 
                0
                );
            }

            if (generoEsc == 2) {
                dramaEsc = JOptionPane.showOptionDialog(
                null, 
                "Selecione o filme de Drama/Romance", 
                "Locadora do Roberto", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                filmesDrama, 
                0
                );
            }

            if (generoEsc == 3) {
                fantaEsc = JOptionPane.showOptionDialog(
                null, 
                "Selecione o filme de Fantasia", 
                "Locadora do Roberto", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                filmesFantasia, 
                0
                );
            }

            if (generoEsc == 4) {
                misterioEsc = JOptionPane.showOptionDialog(
                null, 
                "Selecione o filme de Suspense/Terror", 
                "Locadora do Roberto", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                filmesMisterio, 
                0
                );
            }

        }
        
    }
}
