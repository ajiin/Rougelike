class CResources extends CBase{
  private int maxHP, HP, maxMana, mana, nakedDefense, nakedAttack;
  public int currentDefense, currentAttack;;
  
  public void equipA(Armor i){
    currentDefense+=i.armorDefense;
  }
  
  public void equipW(Weapon i){
    currentAttack+=i.damage;
  }
  
  public void unequipA(Armor i){
    currentDefense-=i.armorDefense;
  }
  
  public void unequipW(Weapon i){
    currentAttack-=i.damage;
  }
  
  public CResources(Entity o){
    super(o);
  }
}
