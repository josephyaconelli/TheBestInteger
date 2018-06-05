/*
 * A significantly better integer written by Joseph Yaconelli
 */


public class BetterInteger{
  private int _num = 0;
  private int _increasedBy = 0;
  private int _decreasedBy = 0;
  
  
  public BetterInteger(int n){
    _num = n;
  }
  
  public int getNum(){
   return _num + _increasedBy - _decreasedBy; 
  }
  
  public void increaseInt(){
    BetterInteger temp = new BetterInteger(1);
    _increasedBy = _increasedBy + temp.getNum();
  }
  
  public void decreaseInt(){
    BetterInteger temp = new BetterInteger(1);
    _decreasedBy = _decreasedBy + temp.getNum();
  }
  
  public void increaseBy(int n){
    BetterInteger temp = new BetterInteger(0);
    
    while(temp.getNum() < n){
      temp.increaseInt(); 
    }
    
    
   this.add(temp);
    
    
  }
  
  public void add(BetterInteger n) {
	  BetterInteger temp = new BetterInteger(this.getNum());
    if(n.getNum() < 0){
      while((temp.getNum() + n.getNum()) < this.getNum()) {
       this.decreaseInt(); 
      }
    } else if (n.getNum() >= 0) {
	  while((temp.getNum() + n.getNum()) > this.getNum()) {
       this.increaseInt(); 
      }    }
  }
  
}