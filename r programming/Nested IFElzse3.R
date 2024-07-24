num1 = readline(prompt="Enter number");
num2 = readline(prompt="Enter number");
num3 = readline(prompt="Enter number");
if (num1>num2 && num1>num3){
  cat(num1," is Greater")
}else if(num2>num1 && num2>num3){
  cat(num2," is Greater")
}else if(num3>num1 && num3>num2){
  cat(num3," is Greater")
}else{
  print("All Are qual")
}

