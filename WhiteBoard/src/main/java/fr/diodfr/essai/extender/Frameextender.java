package fr.diodfr.essai.extender;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.whiteboard.Wbp;
import org.osgi.framework.ServiceReference;

@Component
@Wbp(filter="objectclass=fr.diodfr.essai.extender.IFrame", onArrival="onArrival", onDeparture="onDeparture", onModification="onModification")
public class Frameextender {
	public Frameextender() {
		System.out.println("Frameextender.Frameextender()");
	}
	public void onArrival(ServiceReference<IFrame> serviceReference) {
		System.out.println("Frameextender.onArrival()");
	}

	public void onDeparture(ServiceReference<IFrame> serviceReference) {
		System.out.println("Frameextender.onDeparture()");
	}

	public void onModification(ServiceReference<IFrame> serviceReference) {
		System.out.println("Frameextender.onModification()");
	}

}
