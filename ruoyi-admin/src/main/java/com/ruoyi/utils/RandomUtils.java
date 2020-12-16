package com.ruoyi.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.ruoyi.system.domain.DrawItem;

public class RandomUtils {

    // String 可以为任意类型 也可以自定义类型
    static Map<String, Integer> keyChanceMap = new HashMap<String, Integer>();
    static {
        keyChanceMap.put("aaa", 1);
        keyChanceMap.put("bbb", 2);
        keyChanceMap.put("ccc", 3);
        keyChanceMap.put("ddd", 4);
        keyChanceMap.put("eee", 21);
        keyChanceMap.put("fff", 22);
        keyChanceMap.put("ggg", 23);
        keyChanceMap.put("hhh", 24);
    }

    public static void main(String[] args) {
//        Map<String, Integer> count = new HashMap<String, Integer>();
//        List<String> list = new ArrayList<>();
//        String item = null;
//        for (int i = 0; i < 1000; i++) {
//            item = chanceSelect(keyChanceMap);
//            list.add(item);
//
//            if (count.containsKey(item)) {
//                count.put(item, count.get(item) + 1);
//            } else {
//                count.put(item, 1);
//            }
//        }
//        for (String id : count.keySet()) {
//            System.out.println(id + "\t出现了 " + count.get(id) + " 次");
//        }
//
//        Random rand = new Random();
//        int num = rand.nextInt(1000);
//        System.out.print("最终选择的随机数为："+list.get(num));
    }

    public static DrawItem chanceSelect(Map<DrawItem, Integer> keyChanceMap) {
        if (keyChanceMap == null || keyChanceMap.size() == 0)
            return null;

        Integer sum = 0;
        for (Integer value : keyChanceMap.values()) {
            sum += value;
        }
        // 从1开始
        Integer rand = new Random().nextInt(sum) + 1;

        for (Map.Entry<DrawItem, Integer> entry : keyChanceMap.entrySet()) {
            rand -= entry.getValue();
            // 选中
            if (rand <= 0) {
                return entry.getKey();
            }
        }
        return null;
    }
}