/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Persistence.Cliente;
import Persistence.Endereco;
import Validar.Valida;
import Validar.ValidaException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author joao
 */
public class JUnitTest {
    
    private Cliente cliente;
    private Endereco endereco;
    private Valida valida = new Valida();
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void teste01(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Aline Rudsit");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Violetas");
		endereco.setBairro("Vale Florido");
		endereco.setNumero(419);
		endereco.setCidade("Piratininga");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("alinerud@gmail.com");

		valida.validaCliente(cliente);
		
		
	} catch(ValidaException e){
		fail(e.getMessage());
	}
    }
    
    @Test
    public void teste02(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Ana");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Violetas");
		endereco.setBairro("Vale Florido");
		endereco.setNumero(419);
		endereco.setCidade("Piratininga");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("alinerud@gmail.com");

		valida.validaCliente(cliente);
		
		fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
            
		assertEquals("NOME INVÁLIDO", e.getMessage());
	}
    }

    @Test
    public void teste03(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Violetas");
		endereco.setBairro("Vale Florido");
		endereco.setNumero(419);
		endereco.setCidade("Piratininga");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("alinerud@gmail.com");

		valida.validaCliente(cliente);
		
		fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("NOME INVÁLIDO", e.getMessage());
	}
    }

    @Test
    public void teste04(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Gustav0 Resend3");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Violetas");
		endereco.setBairro("Vale Florido");
		endereco.setNumero(419);
		endereco.setCidade("Piratininga");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("alinerud@gmail.com");

		valida.validaCliente(cliente);
		
		fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("NOME INVÁLIDO", e.getMessage());
	}
    }

    @Test
    public void teste05(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Aline Bini João Squinelato de Melo Gustavo Aguilar Resende Luis Gustavo Lucas Akio Fagner Onesko Vitor Gregório Rudsit");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Violetas");
		endereco.setBairro("Vale Florido");
		endereco.setNumero(419);
		endereco.setCidade("Piratininga");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("alinerud@gmail.com");

		valida.validaCliente(cliente);
		
		fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("NOME INVÁLIDO", e.getMessage());
	}
    }

    @Test
    public void teste06(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Aguilar/ Resend+");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Violetas");
		endereco.setBairro("Vale Florido");
		endereco.setNumero(419);
		endereco.setCidade("Piratininga");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("alinerud@gmail.com");

		valida.validaCliente(cliente);
		
		fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("NOME INVÁLIDO", e.getMessage());
	}
    }

    @Test
    public void teste07(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("João Guilherme");
		cliente.setCpf("432.267.980-30");
		endereco.setRua("Goiás");
		endereco.setBairro("Centro");
		endereco.setNumero(958);
		endereco.setCidade("Cornélio Procópio");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5732");
		cliente.setEmail("joao@guilherme.com");

		valida.validaCliente(cliente);
                
	} catch(ValidaException e){
		fail(e.getMessage());
	}
    }
    
@Test    
public void teste8() {
    	 
     	try{
        	cliente = new Cliente();
        	endereco = new Endereco();

        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("");
        	endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
       	 
        	fail("[ERRO] - o sistema não detectou erro!");
       	 
    	}catch(ValidaException ve){
       	 
        	assertEquals("CPF invalido! (Formato invalido)", ve.getMessage());
       	 
    	}}
    
	@Test
	public void teste9(){
    	try{
        	cliente = new Cliente();
        	endereco = new Endereco();

       	 

        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("928345367289384");
        	endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
       	 
        	fail("[ERRO] - o sistema não detectou erro!");
       	 
    	}catch(ValidaException ve){
       	 
        	assertEquals("CPF invalido! (Formato invalido)", ve.getMessage());
       	 
    	}}
   	 
    
	@Test
	public void teste10(){
    	try{
        	cliente = new Cliente();
        	endereco = new Endereco();
       	 
       	 
        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("l3tra5n0cpf'");
        	endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
        	fail("[ERRO] - o sistema não detectou erro!");
       	 
    	}catch(ValidaException ve){
       	 
        	assertEquals("CPF invalido! (Formato invalido)", ve.getMessage());
       	 
    	}}
    
	@Test
	public void teste11(){
   	 
    	try{
        	cliente = new Cliente();
        	endereco = new Endereco();
       	 
        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("1-2.5,7/800");
        	endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
        	fail("[ERRO] - o sistema não detectou erro!");
       	 
    	}catch(ValidaException ve){
       	 
        	assertEquals("CPF invalido! (Formato invalido)", ve.getMessage());
       	 
    	}}
    
	@Test
	public void teste12(){
     	try{
        	cliente = new Cliente();
        	endereco = new Endereco();

        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("045.302.650-80");
        	endereco.setRua("Alberto");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
       	 
    	}catch(ValidaException ve){
       	 
        	fail(ve.getMessage());
       	 
    	}}
    
	@Test
	public void teste13(){
    	try{
        	cliente = new Cliente();
        	endereco = new Endereco();

       	 
       	 
        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("045.302.650-80");
        	endereco.setRua("");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
      	  fail("Erro");
    	}catch(ValidaException ve){
       	 
      	  assertEquals("NOME DA RUA INVÁLIDO", ve.getMessage());
       	 
    	}}
    
	@Test
	public void teste14(){
    	try{
        	cliente = new Cliente();
        	endereco = new Endereco();
       	 
        	cliente.setNome("Gustavo Aguilar");
        	cliente.setCpf("045.302.650-80");
        	endereco.setRua("Oi");
        	endereco.setBairro("Centro");
        	endereco.setNumero(384);
        	endereco.setCidade("Rio Preto");
        	cliente.setEndereco(endereco);
        	cliente.setTelefone("(43)98374-6352");
        	cliente.setEmail("gust@avo.br");

        	valida.validaCliente(cliente);
        	fail("Erro");
    	}catch(ValidaException ve){
        	assertEquals("NOME DA RUA INVÁLIDO", ve.getMessage());
       	 
    	}}

    @Test
    public void teste15(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Aguilar");
            cliente.setCpf("045.302.650-80");
            endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
            endereco.setBairro("Centro");
            endereco.setNumero(384);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("NOME DA RUA INVÁLIDO", ve.getMessage());
            
        } 
    }
    
    @Test
    public void teste16(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Aguilar");
            cliente.setCpf("045.302.650-80");
            endereco.setRua("G0*AS");
            endereco.setBairro("Centro");
            endereco.setNumero(384);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("NOME DA RUA INVÁLIDO", ve.getMessage());
            
        } 
    }
    
    @Test
    public void teste17(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Resende");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Santos");
            endereco.setBairro("Centro");
            endereco.setNumero(384);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            
        }catch(ValidaException ve){
            
            fail(ve.getMessage());
            
        } 
    }
    
    @Test
    public void teste18(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Resende");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Santos");
            endereco.setBairro("");
            endereco.setNumero(468);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("BAIRRO INVÁLIDO", ve.getMessage());
            
        }
    }

    @Test
    public void teste19(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Resende");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Santos");
            endereco.setBairro("0i");
            endereco.setNumero(468);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("BAIRRO INVÁLIDO", ve.getMessage());
            
        }
    }
    
    @Test
    public void teste20(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Resende");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Santos");
            endereco.setBairro("Centro Cornelio Procopio Bela Vista Nove Esperança Estoril");
            endereco.setNumero(468);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("BAIRRO INVÁLIDO", ve.getMessage());
            
        }
    }
    
    @Test
    public void teste21(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Gustavo Resende");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Santos");
            endereco.setBairro("B3la V1*ta");
            endereco.setNumero(468);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)8374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("BAIRRO INVÁLIDO", ve.getMessage());
            
        }
    }
    
@Test
    public void test22(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Luis Gustavo");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Amazonas");
            endereco.setBairro("Centro");
            endereco.setNumero(9800);
            endereco.setCidade("Limeira");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("luis@gustavo.br");

            valida.validaCliente(cliente);
            
        }catch(ValidaException ve){
            
            fail(ve.getMessage());
            
        }
    }
    
    @Test
    public void test23(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Luis Gustavo");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Amazonas");
            endereco.setBairro("Centro");
            endereco.setNumero(-1);
            endereco.setCidade("Limeira");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("luis@gustavo.br");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("NUMERO DA RUA INVÁLIDO", ve.getMessage());
            
        }
    }
    
    @Test
    public void test24(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Luis Gustavo");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Amazonas");
            endereco.setBairro("Centro");
            endereco.setNumero(1000000);
            endereco.setCidade("Limeira");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("luis@gustavo.br");
            
            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("NUMERO DA RUA INVÁLIDO", ve.getMessage());
            
        }
    }
    @Test
    public void test25(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Luis Gustavo");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Amazonas");
            endereco.setBairro("Centro");
            endereco.setNumero(1000000);
            endereco.setCidade("Limeira");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("luis@gustavo.br");
            
            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("NUMERO DA RUA INVÁLIDO", ve.getMessage());
            
        }
    }
    
    @Test
    public void test26(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("Londrina");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
                        
        }catch(ValidaException ve){
            
            fail(ve.getMessage());
            
        }
    }
    
    @Test
    public void test27(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
                        
        }catch(ValidaException ve){
            
            assertEquals("CIDADE INVÁLIDA", ve.getMessage());
            
        }
    }
    @Test
    public void test28(){
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("Ai");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
                        
        }catch(ValidaException ve){
            
            assertEquals("CIDADE INVÁLIDA", ve.getMessage());
            
        }
    }
    
 
   @Test
    public void teste29(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("C0rn3li0 Pr0c0p10");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("CIDADE INVÁLIDA", ve.getMessage());
            
        }
    }
    @Test
    public void teste30(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("Cornélio Procópio Curitiba Foz do Iguaçu Toledo Londrina Pato Branco");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("CIDADE INVÁLIDA", ve.getMessage());
            
        }
    }
    @Test
    public void teste31(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Fagner Onesko");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Santos Dumont");
            endereco.setBairro("Centro");
            endereco.setNumero(28374);
            endereco.setCidade("Ivaiporã");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("onesko@fagner.fag");

            valida.validaCliente(cliente);
            
        }catch(ValidaException ve){
            
            fail(ve.getMessage());
            
        } 
    }
    @Test
    public void teste32(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("Ivaiporã");
            cliente.setEndereco(endereco);
            cliente.setTelefone("");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("TELEFONE INVÁLIDO", ve.getMessage());
            
        }
    }
    @Test
    public void teste33(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("Ivaiporã");
            cliente.setEndereco(endereco);
            cliente.setTelefone("93847564534231");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("TELEFONE INVÁLIDO", ve.getMessage());
            
        }
    }
    @Test
    public void teste34(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Lucas Zakio");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Goiás");
            endereco.setBairro("Centro");
            endereco.setNumero(563);
            endereco.setCidade("Ivaiporã");
            cliente.setEndereco(endereco);
            cliente.setTelefone("9dh56v6242ckd");
            cliente.setEmail("zakio@akio.com");

            valida.validaCliente(cliente);
            
            fail("[ERRO] - o sistema não detectou erro!");
            
        }catch(ValidaException ve){
            
            assertEquals("TELEFONE INVÁLIDO", ve.getMessage());
            
        }
    }
    @Test
    public void teste35(){
        
        try{
            
            cliente = new Cliente();
            endereco = new Endereco();

            cliente.setNome("Vitor Gregório");
            cliente.setCpf("097.948.030-22");
            endereco.setRua("Tiradentes");
            endereco.setBairro("Centro");
            endereco.setNumero(8743);
            endereco.setCidade("Ibiporã");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6353");
            cliente.setEmail("greg@vit.br");

            valida.validaCliente(cliente);
            
        }catch(ValidaException ve){
            
            fail(ve.getMessage());
            
        } 
    }
    
           
 @Test
    public void teste36(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Vitor Gregório");
		cliente.setCpf("097.948.030-22");
		endereco.setRua("Tiradentes");
		endereco.setBairro("Centro");
		endereco.setNumero(8743);
		endereco.setCidade("Ibiporã");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5737");
		cliente.setEmail("oiio.c");
		valida.validaCliente(cliente);
                
                fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("EMAIL INVALIDO", e.getMessage());
	}
    }
    
    @Test
    public void teste37(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Vitor Gregório");
		cliente.setCpf("097.948.030-22");
		endereco.setRua("Tiradentes");
		endereco.setBairro("Centro");
		endereco.setNumero(8743);
		endereco.setCidade("Ibiporã");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5738");
		cliente.setEmail("aksi*is(i)@i&ss.%$.!!!");
		valida.validaCliente(cliente);
                
                fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("EMAIL INVALIDO", e.getMessage());
	}
    }
    
    @Test
    public void teste38(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Vitor Gregório");
		cliente.setCpf("097.948.030-22");
		endereco.setRua("Tiradentes");
		endereco.setBairro("Centro");
		endereco.setNumero(8743);
		endereco.setCidade("Ibiporã");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5739");
		cliente.setEmail("");
		valida.validaCliente(cliente);
                
                fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("EMAIL INVALIDO", e.getMessage());
	}
    }
    
    @Test
    public void teste39(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Vitor Gregório");
		cliente.setCpf("097.948.030-22");
		endereco.setRua("Tiradentes");
		endereco.setBairro("Centro");
		endereco.setNumero(8743);
		endereco.setCidade("Ibiporã");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5740");
		cliente.setEmail("alinebinijoaoguilhermegustavoaguilar@gustavoresende.luisgustavo.br");
		valida.validaCliente(cliente);
                
                fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("EMAIL INVALIDO", e.getMessage());
	}
    }
    
    @Test
    public void teste40(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Vitor Gregório");
		cliente.setCpf("097.948.030-22");
		endereco.setRua("Tiradentes");
		endereco.setBairro("Centro");
		endereco.setNumero(8743);
		endereco.setCidade("Ibiporã");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5741");
		cliente.setEmail("i@i.i");
		valida.validaCliente(cliente);
                
                fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("EMAIL INVALIDO", e.getMessage());
	}
    }
    
    @Test
    public void teste41(){
        
        try{
		cliente = new Cliente();
		endereco = new Endereco();

		cliente.setNome("Vitor Gregório");
		cliente.setCpf("097.948.030-22");
		endereco.setRua("Tiradentes");
		endereco.setBairro("Centro");
		endereco.setNumero(8743);
		endereco.setCidade("Ibiporã");
		cliente.setEndereco(endereco);
		cliente.setTelefone("(14)99846-5742");
		cliente.setEmail("a@a");
		valida.validaCliente(cliente);
                
                fail("[ERRO] - o sistema não detectou erro!");
		
	} catch(ValidaException e){
		assertEquals("EMAIL INVALIDO", e.getMessage());
	}
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    //JACOCO CASES
    @Test
    public void teste42(){
    	try{
            cliente = new Cliente();
            endereco = new Endereco();
       	 
       	 
            cliente.setNome("Gustavo Aguilar");
            cliente.setCpf("175.140.900-71");
            endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
            endereco.setBairro("Centro");
            endereco.setNumero(384);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
       	 
    	}catch(ValidaException ve){
       	 
        	assertEquals("CPF invalido! (Digito verificador incorreto)", ve.getMessage());
       	 
    }}
    @Test
    public void teste43(){
    	try{
            cliente = new Cliente();
            endereco = new Endereco();
       	 
       	 
            cliente.setNome("Gustavo Aguilar");
            cliente.setCpf("175.140.900-80");
            endereco.setRua("15 de novembro santo alberto minas gerais mato grosso");
            endereco.setBairro("Centro");
            endereco.setNumero(384);
            endereco.setCidade("Rio Preto");
            cliente.setEndereco(endereco);
            cliente.setTelefone("(43)98374-6352");
            cliente.setEmail("gust@avo.br");

            valida.validaCliente(cliente);
            fail("[ERRO] - o sistema não detectou erro!");
       	 
    	}catch(ValidaException ve){
       	 
        	assertEquals("CPF invalido! (Digito verificador incorreto)", ve.getMessage());
       	 
    	}}
}
