package nomenclature;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chase
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TheGame {
    
    public static int totalIonic = 2011;
    public static int totalCovalent = 39;
    public static int totalAcids = 37;
    public static int totalAnions = 48;
    public static int totalCations = 42;
    private final static String db_URL = "jdbc:mysql://localhost:3306/nomenclature3?useSSL=false"; 
    private final static String db_username = "root"; 
    private final static String db_password = "root";
    private static QueryBuilder builder = new QueryBuilder();
    public static String name;
    public static String formula;
    
    
    public TheGame()
    {
        
    }
    
    public static int ionicSelection()
    {
        int returnValue;
        Random gen = new Random();
        returnValue = gen.nextInt((totalIonic - 1)) + 1;
        return returnValue;
    }
    
    public static int covalentSelection()
    {
        int returnValue;
        Random gen = new Random();
        returnValue = gen.nextInt((totalCovalent - 1)) + 1;
        return returnValue;
    }
    
    public static int acidsSelection()
    {
        int returnValue;
        Random gen = new Random();
        returnValue = gen.nextInt((totalAcids - 1)) + 1;
        return returnValue;
    }
    
    public static int anionsSelection()
    {
        int returnValue;
        Random gen = new Random();
        returnValue = gen.nextInt((totalAnions - 1)) + 1;
        return returnValue;
    }
    
    public static int cationsSelection()
    {
        int returnValue;
        Random gen = new Random();
        returnValue = gen.nextInt((totalCations - 1)) + 1;
        return returnValue;
    }
    
    public static boolean displayChoice()
    {
        Random gen = new Random();
        if((gen.nextInt() % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static String randomTableGenerator()
    {
        String returnValue = "";
        Random gen = new Random();
        
        int temp = gen.nextInt(5) + 1;
        if(temp == 1)
        {
            returnValue = "cations";
        }
        else if(temp == 2)
        {
            returnValue = "anions";
        }
        else if(temp == 3)
        {
            returnValue = "acids";
        }
        else if(temp == 4)
        {
            returnValue = "covalent";
        }
        else if(temp == 5)
        {
            returnValue = "ionic";
        }
        
        return returnValue;
    }
    
    public static void databaseAccess(String table)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Unable to load driver!");
            System.exit(1);
        }
        catch(IllegalAccessException ex)
        {
            System.out.println("Error: access problem while loading!");
            System.exit(2);
        }
        catch(InstantiationException ex)
        {
            System.out.println("Error: unable to instanstiate driver!");
        }
        
        if (table.equals("anions"))
        {
            Connection db_connection = null;
            Statement db_statement = null;
            ResultSet db_resultSet = null;
            try{
                db_connection = DriverManager.getConnection(db_URL, db_username, db_password);
                db_statement = db_connection.createStatement();
                db_resultSet = db_statement.executeQuery(builder.queryAnions(TheGame.anionsSelection()));
                if(db_resultSet.next())
                {
                    name =db_resultSet.getString(2);
                    formula = SubScriptFinder.changer2(db_resultSet.getString(1));
                }
            }
            catch(SQLException ex)
            {
            }
            finally
            {
                try {
                    db_connection.close();
                    db_statement.close();
                    db_resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PracticeGameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if (table.equals("cations"))
        {
            Connection db_connection = null;
            Statement db_statement = null;
            ResultSet db_resultSet = null;
            try{
                db_connection = DriverManager.getConnection(db_URL, db_username, db_password);
                db_statement = db_connection.createStatement();
                db_resultSet = db_statement.executeQuery(builder.queryCations(TheGame.cationsSelection()));
                if(db_resultSet.next())
                {
                    name =db_resultSet.getString(2);
                    formula = SubScriptFinder.changer2(db_resultSet.getString(1));
                }
            }
            catch(SQLException ex)
            {
            }
            finally
            {
                try {
                    db_connection.close();
                    db_statement.close();
                    db_resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PracticeGameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        }
        else if (table.equals("acids"))
        {
            Connection db_connection = null;
            Statement db_statement = null;
            ResultSet db_resultSet = null;
            try{
                db_connection = DriverManager.getConnection(db_URL, db_username, db_password);
                db_statement = db_connection.createStatement();
                db_resultSet = db_statement.executeQuery(builder.queryAcids(TheGame.acidsSelection()));
                if(db_resultSet.next())
                {
                    name =db_resultSet.getString(2);
                    formula = SubScriptFinder.changer2(db_resultSet.getString(1));
                }
            }
            catch(SQLException ex)
            {
            }
            finally
            {
                try {
                    db_connection.close();
                    db_statement.close();
                    db_resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PracticeGameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        }
        else if (table.equals("ionic"))
        {
            Connection db_connection = null;
            Statement db_statement = null;
            ResultSet db_resultSet = null;
            try{
                db_connection = DriverManager.getConnection(db_URL, db_username, db_password);
                db_statement = db_connection.createStatement();
                db_resultSet = db_statement.executeQuery(builder.queryIonic(TheGame.ionicSelection()));
                if(db_resultSet.next())
                {
                    name =db_resultSet.getString(2);
                    formula = SubScriptFinder.changer2(db_resultSet.getString(1));
                }
            }
            catch(SQLException ex)
            {
            }
            finally
            {
                try {
                    db_connection.close();
                    db_statement.close();
                    db_resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PracticeGameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        }
        else if (table.equals("covalent"))
        {
            Connection db_connection = null;
            Statement db_statement = null;
            ResultSet db_resultSet = null;
            try{
                db_connection = DriverManager.getConnection(db_URL, db_username, db_password);
                db_statement = db_connection.createStatement();
                db_resultSet = db_statement.executeQuery(builder.queryCovalent(TheGame.covalentSelection()));
                if(db_resultSet.next())
                {
                    name =db_resultSet.getString(2);
                    formula = SubScriptFinder.changer2(db_resultSet.getString(1));
                }
            }
            catch(SQLException ex)
            {
            }
            finally
            {
                try {
                    db_connection.close();
                    db_statement.close();
                    db_resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PracticeGameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}

