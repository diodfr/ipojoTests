package fr.diodfr.essai.extender;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;

@Component
@Provides
@Instantiate
public class FrameService implements IFrame {

	public void addMenu(String name) {
		System.out.println("FrameService.addMenu() => " + name);
	}

}
