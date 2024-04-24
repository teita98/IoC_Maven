package org.app.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //creamos objeto tipo bean factory
        BeanFactory factory = context; //permite que accedamos al contenedor de bean

        Medico med = (Medico) factory.getBean("opera"); //bean generado en el xml
        med.operar(); //para ver con que utensilio esta operando --> sale jeringa gracias a que estamos invocando al bean desde el context

    }
}
