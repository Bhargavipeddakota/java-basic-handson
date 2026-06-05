class  Money {
   int value;
  Money(int num){
  this.value=num;
  }
  Money add(Money obj){
   int val = this.value + obj.value;
   return new Money(val);
  }

   Money minus(Money obj){
   int val = this.value - obj.value;
   return new Money(val);
  }
}