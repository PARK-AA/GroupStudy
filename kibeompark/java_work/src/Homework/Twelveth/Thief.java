package Homework.Twelveth;

public class Thief extends Adventurer implements Skills {
    @Override
    public void skill1(int num) {
        super.skill1(num);
    }

    @Override
    public void skill2(int num) {
        if (num == 3) System.out.println("도적 스킬 1 (데미지 77)");
        else if (num == 4) System.out.println("도적 스킬 2 (데미지 95)");
    }

    @Override
    public void skill3(int num) {
        super.skill3(num);
    }
}
