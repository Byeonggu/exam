class Solution {
    static int healthPoint;
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastTime = attacks[attacks.length-1][0];
        int successStreak=0;
        int attackTime=0;
        healthPoint = health;
        for(int i=0; i<=lastTime; i++){
            //공격 시
            if(attacks[attackTime][0]==i){
               attack(attacks[attackTime++][1]);
                successStreak=0;
                if(healthPoint<=0)return -1;
            }else if(i!=0){
                //공격이 아닐시
                heal(health, bandage[1]);
                successStreak++;
                if(successStreak==bandage[0]){
                    heal(health, bandage[2]);
                    successStreak=0;
                }
            }
           
        }
        return healthPoint;
    }
    
    public void attack(int attackCnt){
        healthPoint-=attackCnt;
    }
    
    
    public void heal(int maxHealth, int healCnt){
        if(healthPoint==maxHealth) return;
        else if(healthPoint+healCnt>=maxHealth) healthPoint=maxHealth;
        else healthPoint+=healCnt;
    }
}