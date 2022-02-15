package xyz.iconc.dev.api.server.serverResources;

import org.restlet.data.Status;
import org.restlet.resource.ServerResource;
import xyz.iconc.dev.api.shared.objects.Message;
import xyz.iconc.dev.api.shared.objects.User;
import xyz.iconc.dev.api.shared.resources.MessageResource;
import xyz.iconc.dev.api.shared.utilities.Validation;

public class MessageServerResource extends ServerResourceAbstract implements MessageResource {

    private volatile Message message;

    @Override
    public void doInit() {
        super.doInit();
        message = new Message(identifier);
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