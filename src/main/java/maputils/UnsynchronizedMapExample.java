package maputils;

import lombok.Getter;
import org.apache.commons.collections4.MapUtils;

import java.util.HashMap;
import java.util.Map;

@Getter
public class UnsynchronizedMapExample implements Runnable {
    private Map map;

    public UnsynchronizedMapExample() {
        map = new HashMap<String, String>();
        map.put("red", "apple");
        map.put("apple", "delicious");
        map.put("delicious", "banana");
        map.put("banana", "long");
        map.put("long", "train");
        map.put("train", "long");
    }

    @Override
    public void run() {
        try {
            flashHyunaOnRed();
        } catch (InterruptedException e) {
        }
    }

    public void flashHyunaOnRed() throws InterruptedException {
        map.put("red", "Hyuna");
        int randomMiliSecons = (int) Math.random() * 10;
        Thread.sleep(0, randomMiliSecons);
        map.put("red", "apple");
    }

}
