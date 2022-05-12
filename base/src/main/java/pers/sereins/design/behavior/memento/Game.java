package pers.sereins.design.behavior.memento;

// 需要被恢复的对象：我们并不会完全存储这个对象，而是存储这个对象的状态来恢复
public class Game {

    // 当前这个对象需要被保存的状态
    private int score;

    // 存档
    public Memento saveProcess() {
        return new Memento(score);
    }

    // 恢复(读档案)
    public void restoreGame(Memento memento) {
        score = memento.getState();
    }

    // 进行游戏
    public void playGame() {
        score++;
    }

    public void exitGame() {
        score = 0;
        System.out.println("-------退出游戏--------");
    }

    public void showScore() {
        System.out.println("当前分数" + score);
    }
}
