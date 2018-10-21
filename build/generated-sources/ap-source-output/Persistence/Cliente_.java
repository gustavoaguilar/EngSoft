package Persistence;

import Persistence.Endereco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T20:08:05")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile SingularAttribute<Cliente, Endereco> endereco;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile SingularAttribute<Cliente, String> email;

}