print("Enter Numbers")
a=as.integer(readline())
f=1
for (i in seq(1,a)){
  for(j in seq(1,i)){
    cat("*")
  }
  cat("\n")
}