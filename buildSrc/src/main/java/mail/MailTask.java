package mail;

import org.gradle.api.*;
import org.gradle.api.tasks.*;

public class MailTask extends DefaultTask {
    private String to;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @TaskAction
    public void sendMail() throws Exception {
        getLogger().lifecycle("Sending mail... " + to);
    }
}
