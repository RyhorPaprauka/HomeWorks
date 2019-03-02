package com.itacademy.popravko.homeworks.competition;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class CompetitionDemo {

    public static void main(String[] args) throws InterruptedException {
        List<Detail> dump = new ArrayList<>();

        FactoryThread factory = new FactoryThread(dump);

        CrazyScientist mad = new CrazyScientist("Мэд", new EnumMap<Detail, Integer>(Detail.class));
        CrazyScientist psycho = new CrazyScientist("Псих", new EnumMap<Detail, Integer>(Detail.class));

        MinionThread mads = new MinionThread("Мэда", dump, mad);
        MinionThread psychos = new MinionThread("Психа", dump, psycho);

        factory.start();
        mads.start();
        psychos.start();

        mads.join();
        psychos.join();
        factory.join();

        System.out.println(dump);
        System.out.println(mad.getWorkshop());
        System.out.println(psycho.getWorkshop());
        System.out.println(mad.getName() + " собрал " + mad.getMaxNumberOfRobots() + " роботов");
        System.out.println(psycho.getName() + " собрал " + psycho.getMaxNumberOfRobots() + " роботов");
        System.out.println("Победитель - " + mad.getTheCraziest(psycho));


    }
}
