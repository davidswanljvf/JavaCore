package lesson3;

import lesson1.maraphon.competitors.Competitor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{5, 7, 3, 3, 8};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(5);
//        list.add(1, 588);
//
//        System.out.println(list);
//
//        list.remove((Integer) 3);
////        list.remove( 3);
//        System.out.println(list);
//        System.out.println("list.get(0) " + list.get(0));
//
//        list.set(1, 888);
//        System.out.println(list);
//
//        list.add(2);
//        list.add(2);
//        list.add(2);
////        list.removeIf(x -> x.equals(2));
//
////        Iterator<Integer> iter = list.iterator();
////        while (iter.hasNext()){
////            if(iter.next().equals(2)){
////                iter.remove();
////            }
////        }
//
//
//        System.out.println(list);

//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());
//        list.sort(Comparator.comparingInt(x->x.intValue()));
//        System.out.println(list);


//        Queue<String> queue = new LinkedList<>();
//        queue.offer("1");
//        queue.offer("2");
//        queue.offer("3");
//        System.out.println(queue.poll());
//
//        LinkedList<Integer> stack = new LinkedList<>();
//        stack.push(123);
//        stack.push(234);
//        stack.push(345);
//        System.out.println(stack.pop());

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        Set<Integer> set1 = new TreeSet<>();

//        set.add(4);
//        set.add(99);
//        set.add(56);
//        set.add(1);
//        set.add(168);
//        set.add(1);


//        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        set1.addAll(Arrays.asList(6,7,8,9,10,11,12,13));
//
//        System.out.println(set);
//        System.out.println(set1);

//        set.addAll(set1);// объединение
//        System.out.println(set);

//        set.retainAll(set1); //пересечение
//        System.out.println(set);

//        set.removeAll(set1); // удалить общие
//        System.out.println(set);

//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
//        Map<String, Integer> map = new TreeMap<>();

//        map.put("Vaska", 4);
//        map.put("Murka", 1);
//        map.put("Tigrik", 5);
//        map.put("Murka", 10);
//
//        System.out.println(map);
//
//        map.forEach((k, v) -> {
//            System.out.println("key = " + k + " val = " + v);
//        });

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        Set<String> keys = map.keySet();
//        System.out.println(keys);
//
//        Collection<Integer> values = map.values();
//
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        System.out.println(entries);

//        Map<Integer, List<String>> map1;

        Map<Integer, Integer> mapCounts = new HashMap<>();
////        mapCounts.put(3,56);
//        System.out.println(mapCounts.get(3));

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
//            Integer getnum = mapCounts.get(num);
//            mapCounts.put(num, getnum == null ? 1 : getnum + 1);
            mapCounts.put(num,mapCounts.getOrDefault(num,0) + 1);
        }

        System.out.println(mapCounts);



    }
}
