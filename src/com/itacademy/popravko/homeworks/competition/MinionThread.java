package com.itacademy.popravko.homeworks.competition;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class MinionThread extends Thread {

    private String lordName;
    private List<Detail> dump;
    private CrazyScientist lord;

    @Override
    public void run() {
        for (int i = 0; i < NightConstants.NIGHTS_NUMBER; i++) {
            collectDetailsFromDump();
        }
    }

    private void collectDetailsFromDump() {
        synchronized (dump) {
            try {
                dump.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i <= DetailRandomUtil.getRandomDetailsNumber(); i++) {
                if (dump.size() == 0) {
                    System.out.println("Приспешник " + lordName + " рыскает безуспешно");
                    break;
                } else {
                    Detail randomDetail = DetailRandomUtil.getRandomDetailFromList(dump);
                    lord.getWorkshop().merge(randomDetail, 1,
                            (oldValue, newValue) -> oldValue + newValue);
                    System.out.println("Приспешник " + lordName + " нашел " + randomDetail);
                    dump.remove(randomDetail);
                }
            }
        }
    }
}
