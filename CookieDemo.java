proteted void (){
String s1 = request.getParameter("unm");
Cookie ck[] = request.getCookies();
if (ck == null) {
Cookie c1 = new Cookie("anil" , "123");
c1.setMaxAge(60*60*24*5);
response.addCookie(c1);
response.sendRedirect("login.html");
}else{
response.sendRedirect("index.html");
}
}
