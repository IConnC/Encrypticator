package xyz.iconc.dev.api.server.serverResources;

import org.restlet.resource.ServerResource;
import xyz.iconc.dev.api.shared.objects.Message;
import xyz.iconc.dev.api.shared.objects.User;
import xyz.iconc.dev.api.shared.resources.MessageResource;

public class MessageServerResource extends ServerResource implements MessageResource {

    private volatile Message message;

    @Override
    public void doInit() {
        message = new Message(getAttribute("getIdentifier"));
    }

    @Override
    public User retrieve() {
        return null;
    }

    @Override
    public void store(Message message) {

    }

    @Override
    public void remove() {

    }
}
