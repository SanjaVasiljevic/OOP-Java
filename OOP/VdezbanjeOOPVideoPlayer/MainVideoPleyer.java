package VdezbanjeOOPVideoPlayer;

import java.util.ArrayList;

public class MainVideoPleyer {
    public static void main(String[] args) {
        VideoPlayer v = new VideoPlayer(100, 40, 25, 720);
        ArrayList<Control> kontrole = new ArrayList<Control>();
        Control tc1 = new TimeControl(true);
        Control tc2 = new TimeControl(true);
        Control tc3 = new TimeControl(true);
        Control ac1 = new AudioControl(true);
        Control ac2 = new AudioControl(false);
        Control ac3 = new AudioControl(false);
        Control ac4 = new AudioControl(false);
        Control ac5 = new AudioControl(false);
        Control qc = new QualityOptimizerControl(20);

        kontrole.add(tc1);
        kontrole.add(tc2);
        kontrole.add(tc3);
        kontrole.add(ac1);
        kontrole.add(ac2);
        kontrole.add(ac3);
        kontrole.add(ac4);
        kontrole.add(ac5);
        kontrole.add(qc);

        for (int i = 0; i < kontrole.size(); i++) {
            kontrole.get(i).izvrsiAkciju(v);
        }

        v.stampaj();
    }

    }

