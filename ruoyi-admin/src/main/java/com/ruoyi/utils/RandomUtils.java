package com.ruoyi.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.ruoyi.system.domain.DrawItem;

public class RandomUtils {

    // String 可以为任意类型 也可以自定义类型
    static Map<DrawItem, Integer> keyChanceMap = new HashMap();
    static {
        keyChanceMap.put(new DrawItem("先知水晶12"), (int) (0.01*1000));
        keyChanceMap.put(new DrawItem("英雄经验50000000"), (int) (0.02*1000));
        keyChanceMap.put(new DrawItem("金币50000000"), (int) (0.03*1000));
        keyChanceMap.put(new DrawItem("符文精华12000"), (int) (0.04*1000));
        keyChanceMap.put(new DrawItem("天赋秘典10"), (int) (0.05*1000));
        keyChanceMap.put(new DrawItem("英雄经验5000000"), (int) (0.06*1000));
        keyChanceMap.put(new DrawItem("高级探宝卷2"), (int) (0.07*1000));
        keyChanceMap.put(new DrawItem("符文精华5000"), (int) (0.08*1000));
        keyChanceMap.put(new DrawItem("奥术之尘20"), (int) (0.17*1000));
        keyChanceMap.put(new DrawItem("原初结晶50"), (int) (0.18*1000));
        keyChanceMap.put(new DrawItem("英雄经验500000"), (int) (0.18*1000));
        keyChanceMap.put(new DrawItem("金币500000"), (int) (0.14*1000));
    }

    public static void main(String[] args) {
        Map<String, Integer> count = new HashMap<String, Integer>();
        List<String> list = new ArrayList<>();
        String item = null;
        for (int i = 0; i < 1000; i++) {
            item = chanceSelect(keyChanceMap).getName();
            list.add(item);

            if (count.containsKey(item)) {
                count.put(item, count.get(item) + 1);
            } else {
                count.put(item, 1);
            }
        }
        System.out.println("==============抽奖总次数1000次==========================");
        for (String id : count.keySet()) {
            System.out.println(id + "\t出现了 " + count.get(id) + " 次");
        }

        Random rand = new Random();
        int num = rand.nextInt(1000);
        System.out.println("最终选择的随机数为："+list.get(num));
        System.out.println("==============抽奖总次数1000次==========================");
    }

    public static DrawItem chanceSelect(Map<DrawItem, Integer> keyChanceMap) {
        if (keyChanceMap == null || keyChanceMap.size() == 0){
            return null;
        }

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