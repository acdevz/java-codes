package oops.design.events;


import java.util.ArrayList;
import java.util.List;

class Event{
    private String eventName;
    public Event(String eventName){
        this.eventName = eventName;
    }
    public String getEventName() {
        return eventName;
    }
}

class EventNotifier{
    private List<EventListener> listeners = new ArrayList<>();
    public void addEventListener(EventListener listener){
        listeners.add(listener);
    }
    public void removeEventListener(EventListener listener){
        listeners.remove(listener);
    }
    public void notifyEvent(Event event){
        for(EventListener listener: listeners){
            listener.handleEvent(event);
        }
    }
}

interface EventListener{
    void handleEvent(Event event);
}

class EventReceiver implements EventListener{
    private String receiverName;
    public EventReceiver(String receiverName) {
        this.receiverName = receiverName;
    }
    @Override
    public void handleEvent(Event event) {
        System.out.println(receiverName + " notified of event: " + event.getEventName());
    }
}

public class Main {
    public static void main(String[] args) {
        EventNotifier notifier = new EventNotifier();

        EventReceiver receiver1 = new EventReceiver("Receiver 1");
        EventReceiver receiver2 = new EventReceiver("Receiver 2");
        EventReceiver receiver3 = new EventReceiver("Receiver 3");

        notifier.addEventListener(receiver1);
        notifier.addEventListener(receiver2);
        notifier.addEventListener(receiver3);

        notifier.notifyEvent(new Event("Event 1"));
        notifier.notifyEvent(new Event("Event 2"));

        notifier.removeEventListener(receiver2);

        notifier.notifyEvent(new Event("Event 3"));
    }
}
