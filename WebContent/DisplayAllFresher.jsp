<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html><head>
<meta charset=utf-8>
<title>Assignment 1</title>
</head>
<body>

	<h1>This is a fresher display page</h1>
      <ul>
         <li><p><b>Full Name:</b>
            <%= request.getParameter("fullName")%>
         </p></li>
         <li><p><b>Department</b>
            <%= request.getParameter("department")%>
         </p></li>
      </ul>
</body>
</html>