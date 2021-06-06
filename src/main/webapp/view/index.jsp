<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  To submit your value
  <form action="submit" method="post">
  Enter id:<input type="text" name="aid"><br>
  Enter name:<input type="text" name="aname"><br>
  <input type="submit">
  </form>
  
  <br>
 Get all aliens from database
  
  <form action="getAlien" method="post">
 
   <input type="submit">
  </form>
  <br>
   
 Find aliens from database
  
  <form action="FindAlien" method="post">
 Enter id:<input type="text" name="aid"><br>
   <input type="submit">
  </form>
  
 <br>
 To add value in database 
 <form action="dbadd" method="post">
  Enter id:<input type="text" name="aid"><br>
  Enter name:<input type="text" name="aname"><br>
  <input type="submit">
  </form>
  <br>
  Delete aliens from database
  
  <form action="DeleteAlien" method="post">
 Enter id:<input type="text" name="aid"><br>
   <input type="submit">
  </form>
  
  
  
</body>
</html>