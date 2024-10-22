<!DOCTYPE jsp>
<jsp lang="en">
 <body>
  <head>  <jsp:include page="header.jsp"/></head>
     
    <body>
    <div class="contact_section layout_padding">
<div class="container">
<div class="row">
<div class="col-md-6">

<h1 class="contact_text">Appointment Form</h1>

<form action="Apservlet" method="post">

<div class="form-group">
<input type="text"   placeholder="Patient name" name="pnm">
</div>

<div class="form-group">
<input type="text"  placeholder="Patient Age" name="age">
</div>

<div class="form-group">
 
<input type="text"  placeholder="Patient contact" name="cnt">
</div>

<div class="form-group" > 
   <h4>
    Select Doctor
    </h4>
    <input type="checkbox" checked=true name="dr"  > 
    MBBS
     <br>
     <input type="checkbox"  name="dr"  >
    Pediatrician
    <br>
      <input type="checkbox"  name="dr" >
    Cardiologist
   
    <br>
      <input type="checkbox"  name="dr" >
    Neurologist
   
     <br>
   
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