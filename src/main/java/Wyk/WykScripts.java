package Wyk;

import javax.script.*;
import java.io.*;

public class WykScripts {

        public static void main(String[] args) {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("groovy");
            try {
                String script = "\"Ala ma kota i psa\".tokenize().each { println it + ' ' + it.length()}";
                engine.eval(script);
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }

    }




class GroovyTest2 {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("groovy");

        try {
            engine.eval(new FileReader("test1.groovy"));
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
