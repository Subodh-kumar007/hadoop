print("1. Add 2 Numbers")
print("2. Multiply 2 Numbers")
print("3. Divide 2 Numbers")
print("4. Subtract 2 Numbers")

print("Enter choice between 1 to 4");
ch <- readline()

print("Enter 2 numbers")
a=as.integer(readline())

b=as.integer(readline())
switch(
  ch,
  "1"=cat("Result:- ",(a+b)),
  "2"=cat("Result:- ",(a-b)),
  "3"=cat("Result:- ",(a*b)),
  "4"=cat("Result:- ",(a/b))
)
