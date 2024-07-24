student.data<-data.frame(
  Sid=c(1:6),
  sname=c("Ashish","Shikha","Harish","Gautam","Kiran","Kamal"),
  course=c("Bca","Mba","Mca","Bca","Bba","Bca"),
  fee=c(5600,8500,9500,7400,6300,5200)
)
print(student.data)
print(str(student.data))
d<-data.frame(student.data$Sid)
print(d)

r<-student.data[2,]
print(r)