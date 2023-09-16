package br.com.faguirre;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        ReflectionExecute();
    }

private static Object ReflectionExecute(){
    Tabela tab = new Tabela();
    Annotation[] annotations =  tab.getClass().getAnnotations();

        if(tab.getClass().isAnnotationPresent(TabelaAnotation.class)){
            TabelaAnotation an = tab.getClass().getAnnotation(TabelaAnotation.class);
                System.out.println("O valor da anotação é: " + an.nome());
            }
    return null;
}
}
