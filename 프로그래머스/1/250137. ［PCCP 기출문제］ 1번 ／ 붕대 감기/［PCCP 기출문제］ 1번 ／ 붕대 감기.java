class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
		int length = attacks.length;
        int finalAttack = attacks[length - 1][0];
        int[] damages = new int [finalAttack + 1];
        
        int hp = health;
        int count = 0;
        int time = bandage[0];
        int healPerSec = bandage[1];
        int plusHeal = bandage[2];
        
        boolean survive = true;
        
        for (int i = 0; i < length; i++) {
        	int index = attacks[i][0];
            damages[index] = attacks[i][1];
        }
        
        for (int i = 0; i <= finalAttack; i++) {
            if (damages[i] != 0) {
                hp -= damages[i];
                count = 0;
                if (hp <= 0) {
                    return -1;
                }
            } else {
                if (hp < health) {
                    hp += healPerSec;
                    if (hp >= health) hp = health;
                    count++;
                    if (count == time) {
                        hp += plusHeal;
                        if (hp > health) {
                            hp = health;
                        }
                        count = 0;
                    }
                } else if (hp >= health) {
                	count++;
                };
            }
        }
        
        return hp;
    }
}