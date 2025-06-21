protected void ....(){
HttpSession hs = request.getSession(true);
PrintWriter pw = response.getWriter();
Integer i = (Integer)hs.getAttribute("key");
if(i==null){
pw.println("You are visiting 1 Time ");
hs.setAttribute("key",1);
}else{
int x=i;
x +=1;
pw.println("You are visiting "+x+"time");
hs.setAttribute("key",x);
}
}
