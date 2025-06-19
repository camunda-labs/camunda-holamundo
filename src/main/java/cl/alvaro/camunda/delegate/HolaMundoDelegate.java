package cl.alvaro.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("holaMundoDelegate")
public class HolaMundoDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("🌟 Hola Mundo desde Camunda 7 Delegate!");
	}
}
