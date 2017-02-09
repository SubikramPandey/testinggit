package BasicThings;


public class ThingWithBell extends BasicThing {
	public void shout() {
		System.out.println("LOUD BELL SOUNDS");
	}
	public Double size;
	BasicThing thingWithSize = new BasicThing(400.00);
	public ThingWithBell() {
	}
	public void shoutsize() {
		System.out.println("I am so large I have size: " + thingWithSize.size);
}
}
