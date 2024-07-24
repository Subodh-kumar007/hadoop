a=readline(prompt = "Enter first number")
b=as.integer(a)
t=b
s=0
while(t>0){
  d=t%%10
  s=s+(d*d*d)
  t=as.integer(t/10)
}
if(b==s){
  print("Armstrong Number")
}else{
  print("Not Armstrong Number")
}