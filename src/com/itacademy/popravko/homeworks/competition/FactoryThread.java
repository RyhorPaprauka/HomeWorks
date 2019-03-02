package com.itacademy.popravko.homeworks.competition;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FactoryThread extends Thread {

    private List<Detail> dump;

    @Override
    public void run() {
        firstNightThrowingOut();
        restNightsThrowingOut();
    }

    private void firstNightThrowingOut() {
        synchronized (dump) {
            try {
                dump.wait(NightConstants.NIGHTS_LENGTH);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1 Ночь началась...");
            dump.notifyAll();
            for (int i = 0; i < NightConstants.FIRST_NIGHT_DETAIL_NUMBER; i++) {
                Detail randomDetail = DetailRandomUtil.getRandomDetail(Detail.class);
                dump.add(randomDetail);
                System.out.println("Фабрика выкинула: " + randomDetail);
            }
        }
    }

    private void restNightsThrowingOut() {
        for (int i = NightConstants.SECOND_NIGHT_START; i <= NightConstants.NIGHTS_NUMBER; i++) {
            synchronized (dump) {
                try {
                    dump.wait(NightConstants.NIGHTS_LENGTH);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " Ночь началась...");
                dump.notifyAll();
                throwRandomNumberDetails();
            }
        }
    }

    private void throwRandomNumberDetails() {
        for (int i = 0; i <= DetailRandomUtil.getRandomDetailsNumber(); i++) {
            Detail randomDetail = DetailRandomUtil.getRandomDetail(Detail.class);
            dump.add(randomDetail);
            System.out.println("Фабрика выкинула: " + randomDetail);
        }
    }
}
