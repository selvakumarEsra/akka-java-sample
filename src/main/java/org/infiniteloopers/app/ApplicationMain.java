package org.infiniteloopers.app;


import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import org.infiniteloopers.actor.SimpleActor;
import org.infiniteloopers.model.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationMain {

    public static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) throws InterruptedException {
        ActorSystem actorSystem = ActorSystem.create("Actor-simple");
        Thread.sleep(5000);
        ActorRef actorRef = actorSystem.actorOf(Props.create(SimpleActor.class), "simple-actor");
        actorRef.tell(new Command("CMD 1"), null);
        actorRef.tell(new Command("CMD 2"), null);
        actorRef.tell(new Command("CMD 3"), null);
        actorRef.tell(new Command("CMD 4"), null);
        actorRef.tell(new Command("CMD 5"), null);

        actorRef.tell("echo", null);

        Thread.sleep(5000);

        log.debug("Actor System Shutdown Starting...");

        actorSystem.shutdown();
    }
}
