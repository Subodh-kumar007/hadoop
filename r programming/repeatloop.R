print("Enter Numbers")
a=as.integer(readline())
f=1
repeat{
  f=f*a
  a=a-1
  if(a==0){
    break
  }
}
print(f)