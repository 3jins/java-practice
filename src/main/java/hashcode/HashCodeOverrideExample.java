package hashcode;

import hashcode.object.HashCodeNotOverridedRectangle;
import hashcode.object.HashCodeOverridedRectangle;

import java.util.*;

public class HashCodeOverrideExample {
    public void showHashCodeOverrideExample() {
        /*
         * [Effective Java - item 11] equals를 재정의하려거든 hashCode도 재정의하라
         *
         * HashSet, HashMap 등의 자료구조 사용시 재정의 된 equals로는 분명 두 값이 같지만, 해쉬값이 달라서 같은 값으로 인식이 안 되는 경우가 있음.
         * 따라서, 같은 값을 넣어서 덮어쓰려고 했지만, 중복해서 값이 들어가버리는 참사가 발생할 수 있음.
         */

        /* wrong */
        final HashCodeNotOverridedRectangle notOverridedRectangle1 = new HashCodeNotOverridedRectangle(2, 9);
        final HashCodeNotOverridedRectangle notOverridedRectangle2 = new HashCodeNotOverridedRectangle(2, 9);
        System.out.println("hash code of rectangle1: " + notOverridedRectangle1.hashCode());
        System.out.println("hash code of rectangle1: " + notOverridedRectangle2.hashCode());
        final HashMap<HashCodeNotOverridedRectangle, Integer> map1 = new HashMap();
        map1.put(notOverridedRectangle1, notOverridedRectangle1.getArea());
        map1.put(notOverridedRectangle2, notOverridedRectangle1.getArea());
        System.out.println("map1 size: " + map1.size());
        System.out.println("map1 value List: " + map1.values());


        System.out.println("\n====\n");

        /* correct */
        final HashCodeOverridedRectangle overridedRectangle1 = new HashCodeOverridedRectangle(2, 9);
        final HashCodeOverridedRectangle overridedRectangle2 = new HashCodeOverridedRectangle(2, 9);
        System.out.println("hash code of rectangle1: " + overridedRectangle1.hashCode());
        System.out.println("hash code of rectangle1: " + overridedRectangle2.hashCode());
        final HashMap<HashCodeOverridedRectangle, Integer> map2 = new HashMap();
        map2.put(overridedRectangle1, overridedRectangle1.getArea());
        map2.put(overridedRectangle2, overridedRectangle1.getArea());
        System.out.println("map2 size: " + map2.size());
        System.out.println("map2 value List: " + map2.values());
    }
}
