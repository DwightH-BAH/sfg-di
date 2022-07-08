package dee.sprongframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import dee.sprongframework.sfgdi.controllers.ConstructorInjController;
import dee.sprongframework.sfgdi.controllers.MyController;
import dee.sprongframework.sfgdi.controllers.PropertyInjectController;
import dee.sprongframework.sfgdi.controllers.SetterInjectdController;

@ComponentScan(basePackages = {"dee.sprongframework.sfgdi","pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController =(MyController) ctx.getBean("myController");

		String greeting = myController.sayHEllo();
		System.out.println(greeting);


		System.out.println("----Constructor");

		ConstructorInjController coninjcon = (ConstructorInjController) ctx.getBean("constructInjController");
		System.out.println((coninjcon.getGreeting()));

		System.out.println("----Property");

		PropertyInjectController projcon = (PropertyInjectController) ctx.getBean("propertyinjectcontroller");
		System.out.println((projcon.getGreeting()));

		System.out.println("----Setter");

		SetterInjectdController setterinjcon = (SetterInjectdController) ctx.getBean("setterInjectdController");
		System.out.println((setterinjcon.getGreeting()));
		
		
		
		
	}

}
