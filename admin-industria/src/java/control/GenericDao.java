/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.List;

/**
 *
 * @author brunoazzi
 */
public abstract class GenericDao {

    /**
     * Persiste este objeto no Banco de Dados
     */
    public void add(){
        Conexao.persist(this);
    }
    
    /**
     * Remove este objeto no Banco de Dados
     */
    public void delete(){
        Conexao.remove(this);
    }
    
    //TODO melhorar
    /**
     * Retorna uma lista de todos os objetos deste mesmo tipo.
     * @return Uma lista de objetos deste mesmo tipo.
     */
    public List<Object> list(){
        return Conexao.namedQuery(getEntityName()+".findAll");
    }
    
    //TODO abstratir update se possivel;
    
     /**
      * Retorna o nome da Entidade
      * @return Uma String contendo o nome da Entidade.
      */
    public String getEntityName(){
        return this.getClass().getSimpleName();
        
    }
    
    //TODO problemas com findByCOdigo
    //public abstract Object findByCodigo(String codigo);
    
}
