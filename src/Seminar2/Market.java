package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.name + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor: actorList){
            System.out.println(actor.name + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.name + " встал в очередь");
        this.queue.add(actor);
    }


    @Override
    public void takeOrders() {
        for (Actor actor: queue) {
            if (!actor.isTakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.name + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor: queue) {
            if (!actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.name + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (!actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.name + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
