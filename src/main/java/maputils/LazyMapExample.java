package maputils;

import lombok.Getter;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.MapUtils;

import java.util.*;

@Getter
public class LazyMapExample {
    private Map map;

    public LazyMapExample() {
        map = new HashMap<String, String>();
        map.put("red", "apple");
        map.put("apple", "delicious");
        map.put("delicious", "banana");
        map.put("banana", "long");
        map.put("long", "train");
        map.put("train", "long");
    }

    public void showLazyMapExample() {
        Factory factory = new Factory() {
            public Object create() {
                return new Date();
            }
        };

        Map lazyMap = MapUtils.lazyMap(new HashMap<>(), factory);
        Object obj = lazyMap.get("test1");
        System.out.println(new Date());
        System.out.println(obj);

        try {
            Thread.sleep(3000);
            System.out.println("3 seconds later...");
            System.out.println(lazyMap.get("test1"));
            System.out.println(lazyMap.get("test2"));
        } catch (InterruptedException e) {
        }
    }

}
