package Validar;


import Persistence.Cliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Resende
 */

public class Valida {
    private final String regexCpf = "^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}";
    private final String regexNome = "^[\\p{L} .'-]{5,100}$";
    private final String regexId = "\\d{0,18}";
    private final String regexTelefone = "^\\([1-9]{2}\\)[0-9]{4,5}\\-[0-9]{4}$";
    private final String nomeRuaBairroRegex = "[\\d\\p{L} ]{3,30}";
    private final String nomeCidadeRegex = "[\\p{L} ]{3,50}";
    private final String numeroRegex = "[\\d]{1,5}";
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._-]{2,}+@[A-Z0-9.-]+\\.[A-Z]{1,}$", Pattern.CASE_INSENSITIVE);
    
    public static boolean validaEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    public void validaCliente(Cliente cli) throws ValidaException{
        if(!cli.getCpf().matches(regexCpf)){
            throw new ValidaException("CPF invalido! (Formato invalido)");
        }
        int aux = 10;
        int valor = 0;
        for(int i=0; i< 11; i++){
            if(cli.getCpf().charAt(i)=='.')
                continue;
   
            valor+=((aux)*Character.getNumericValue(cli.getCpf().charAt(i)));
            aux--;
        }
        if((valor*10)%11!=Character.getNumericValue(cli.getCpf().charAt(12))){
            throw new ValidaException("CPF invalido! (Digito verificador incorreto)");
        }
        aux = 11;
        valor = 0;
        for(int i=0; i< 13; i++){
            if(cli.getCpf().charAt(i)=='.'||cli.getCpf().charAt(i)=='-')
                continue;
   
            valor+=((aux)*Character.getNumericValue(cli.getCpf().charAt(i)));
            aux--;
        }
        if((valor*10)%11!=Character.getNumericValue(cli.getCpf().charAt(13))){
            throw new ValidaException("CPF invalido! (Digito verificador incorreto)");
        }
        // if(!String.valueOf(cli.getId()).matches(regexId)){
            // System.out.println("ID Inválido");
        //    throw new ValidaException("ID INVALIDO");
        //}
        if(!cli.getNome().matches(regexNome)){
            // System.out.println("Nome Inválido");
            throw new ValidaException("NOME INVÁLIDO");
        }
        if(!validaEmail(cli.getEmail()) || cli.getEmail().length() > 64){
            // System.out.println("Email Inválido");
            throw new ValidaException("EMAIL INVALIDO");
        }
        if(!cli.getTelefone().matches(regexTelefone)){
            throw new ValidaException("TELEFONE INVÁLIDO");
        }
         if (!cli.getEndereco().getRua().matches(nomeRuaBairroRegex))
            throw new ValidaException("NOME DA RUA INVÁLIDO");
         if (!cli.getEndereco().getBairro().matches(nomeRuaBairroRegex))
            throw new ValidaException("BAIRRO INVÁLIDO");
         if (!cli.getEndereco().getCidade().matches(nomeCidadeRegex))
            throw new ValidaException("CIDADE INVÁLIDA");
         if (!String.valueOf(cli.getEndereco().getNumero()).matches(numeroRegex))
            throw new ValidaException("NUMERO DA RUA INVÁLIDO");
    }
}
