import DAO.ClienteDAO;
import DAO.EnderecoDAO;
import Interface.ClienteView;
import Persistence.Cliente;
import Persistence.Endereco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joao
 */
public class EngSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClienteDAO clienteDao = new ClienteDAO();
        EnderecoDAO enderecoDao = new EnderecoDAO();
              
        ClienteView ci = new ClienteView(clienteDao, enderecoDao);
        ci.setVisible(true);
        ci.setTitle("Cadastro");
        ci.setResizable(false);
        
        
    }
    
}
