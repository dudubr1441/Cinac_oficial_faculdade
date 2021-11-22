/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author maste
 */
public class Analisacaracter {
    
public static boolean Validacao_senha(String password) 
{

    if(password.length()>=8)
    {
        Pattern letrasminusculas = Pattern.compile("[a-z]");
        Pattern numeros = Pattern.compile("[0-9]");
        Pattern letrasmaiusculas = Pattern.compile("[A-Z]");
        Pattern especias = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        //Pattern eight = Pattern.compile (".{8}");


           Matcher hasletrasminusculas = letrasminusculas.matcher(password);
           Matcher hasnumeros = numeros.matcher(password);
           Matcher hasletrasmaiusculas = letrasmaiusculas.matcher(password);
           Matcher hasespecias = especias.matcher(password);

           return hasletrasminusculas.find() && hasnumeros.find() && hasespecias.find() && hasletrasmaiusculas.find();

    }
    else
        return false;

}}
