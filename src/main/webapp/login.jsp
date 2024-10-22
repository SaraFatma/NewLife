<!DOCTYPE jsp>
<jsp lang="en">
 <body>
  <head>  <jsp:include page="forwel.jsp"/></head>
     
    <body>
     
    <div class="contact_section layout_padding">
<div class="container">
<div class="row">
<div class="col-md-6">
<h1 class="contact_text">login details</h1>
<form action="Checklogin" method="post">
<div class="form-group">
<input type="text"   placeholder="UserName" name="nm">
</div>
<div class="form-group">
<input type="password"  placeholder="password" name="pw">


</div>
<input type="submit" value="submit" />

</form>
 
</div> 
</div>
</div>
</div>
       <jsp:include page="footer.jsp"/>
     
   </body>
   </jsp>