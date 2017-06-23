<%--
  Created by IntelliJ IDEA.
  User: wicker
  Date: 2017/6/22
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传页面</title>
</head>
<body>
   <form action="/springUpload/FileManage/uploadFiles.do" method="post" enctype="multipart/form-data">
       <table border="1">
          <thead>
          <tr>
              <td>描述</td>
              <td>证件</td>
          </tr>
          </thead>
           <tr>
               <td><input type="text" name="describe1"/></td>
              <td><input type="file" name="targetFile"/></td>
           </tr>
           <tr>
               <td><input type="text" name="describe2"/></td>
             <td><input type="file" name="targetFile"/></td>
           </tr>
       </table>
       <input type="submit" value="提交"/>
   </form>
</body>
</html>
