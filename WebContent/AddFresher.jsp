<%@ page pageEncoding="utf-8" language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddFresher.html" method="POST">
    <div>
        <div height="20px"></div>
    </div>
    <div>
        <div>
            <label><b>CODE (*)</b></label>  
        </div>
         <div>
            <input type="text" maxlength="45" name="code"/>
        </div>
    </div>
    <div>
        <div>
            <label><b>FullName (*)</b></label> 
        </div>
        <div>
            <input type="text" maxlength="45" name="fullName"/>
        </div>
    </div>
    <div>
        <div>
            <label><b>IdNumber (*)</b></label> 
        </div>
        <div>
            <input type="text" maxlength="45" name="id"/>
        </div>
    </div>
     <div>
        <div>
            <label><b>Department (*)</b></label> 
        </div>
        <div>
            <input type="text" maxlength="45" name="department"/>
        </div>
    </div>
    <div>
        <div>
            <label><b>University (*)</b></label> 
        </div>
        <div>
            <input type="text" maxlength="45" name="university"/>
        </div>
    </div>
    <div>
        <div>
            <label><b>All of quiz point (*)</b></label>
        </div>
        <div>
            <input type="text" maxlength="45" name="quizPoint"></textarea>
        </div>
    </div>
    <div>
        <div>
            <label><b>Mock project point (*)</b></label> 
        </div>
        <div>
            <input type="text" maxlength="11" name="mockPoint"/>
        </div>
    </div>
     <div>
        <div>
            <label><b>divainer comment (*)</b></label>
        </div>
        <div>
            <input type="text" maxlength="245" name="comment"></textarea>
        </div>
    </div>
    <div>
           
             <div>
               <input type="submit" value="submit" name="submit">
             </div>
        </div>
</form>
</body>
</html>