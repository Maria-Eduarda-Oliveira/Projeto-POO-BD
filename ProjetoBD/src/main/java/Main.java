import Model.Time;
import br.inatel.DAO.JogadoresDAO;
import Model.Jogadores;

public class Main {

    public static void main(String[] args) {

        JogadoresDAO jogadoresDAO = new JogadoresDAO();
        Jogadores j1 = new Jogadores(12345,"Joao",168,72,6);
        Jogadores j2 = new Jogadores(67890,"Pedro",188,83,10);
        Jogadores j3 = new Jogadores(54321,"Lucas",175,78,8);
        Jogadores j4 = new Jogadores(18403,"Gabriel",170,75,7);
        Jogadores j5 = new Jogadores(89356,"Henrique",180,80,9);

        jogadoresDAO.insertJogadores(j1);
        jogadoresDAO.insertJogadores(j2);
        jogadoresDAO.insertJogadores(j3);
        jogadoresDAO.insertJogadores(j4);
        jogadoresDAO.insertJogadores(j5);

        jogadoresDAO.selectJogadores();
    }
}
