/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomenclature;

/**
 *
 * @author Chase
 */

public class QueryBuilder 
{
    private final String formulaQuery = "Select formula, name FROM ";
    private final String whereNumber = "WHERE Number = ";
    
    
    public QueryBuilder()
    {
    }
    
    public String queryIonic(int index)
    {
        String returnValue;
        returnValue = formulaQuery.concat("Ionic ").concat(whereNumber).concat(String.valueOf(index));
        return returnValue;
    }
    
    public String queryCovalent(int index)
    {
        String returnValue;
        returnValue = formulaQuery.concat("Covalent ").concat(whereNumber).concat(String.valueOf(index));
        return returnValue;
    }
    
    public String queryAcids(int index)
    {
        String returnValue;
        returnValue = formulaQuery.concat("Acids ").concat(whereNumber).concat(String.valueOf(index));
        return returnValue;
    }
    
    public String queryCations(int index)
    {
        String returnValue;
        returnValue = formulaQuery.concat("Cations ").concat(whereNumber).concat(String.valueOf(index));
        return returnValue;
    }
    
    public String queryAnions(int index)
    {
        String returnValue;
        returnValue = formulaQuery.concat("Anions ").concat(whereNumber).concat(String.valueOf(index));
        return returnValue;
    }
    
    //public static String deleteQuery(String chemicalName)
    //{
        
    //}
}