package org.frank.entertainment;

public class PowerUp {
    private String type;

    public PowerUp(String type) {
        this.type = type;
    }

    public void activate(Paddle paddle) {
        if (type.equals("expand")) {
            // 擴大球拍
        } else if (type.equals("extra_life")) {
            // 增加生命
        }
    }
}
