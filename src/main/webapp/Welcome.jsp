<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
   <jsp:include page="forwel.jsp"/>
      <!-- header section start -->
        
      <!-- header section end -->
      <!-- about section start -->
      <div class="about_section layout_padding">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-6">
              <div class="about_taital">
                <h4 class="about_text">Welcome!!!</h4>
                <h1 class="highest_text">Please login or Register to visit the site</h1>
                <p class="lorem_text">Our Hospital provide many services which include short-term hospitalization. Further, it also offers emergency room services and general and speciality surgical services. Moreover, they also offer x-ray and radiology and laboratory services.</p>
                <div class="read_bt"><a href="reg.jsp">Register</a></div><pr>
                  <div class="read_bt"><a href="login.jsp">Login</a></div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="image_2" href="#"><img src="images/img-2.png"></div>
            </div>
          </div>
        </div>
      </div>
      <!-- about section end -->
      <!-- footer section start -->
      <!-- info section -->
      <jsp:include page="footer.jsp"/>
    <!-- end info section -->
    <!-- footer section end -->
    <!-- copyright section start -->
    <div class="copyright_section">
      <div class="container">
        <p class="copyright">2020 All Rights Reserved. Design by <a href="https://jsp.design">Free jsp  Templates</a></p>
      </div>
    </div>
    <!-- copyright section end -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <!-- javascript --> 
      <script src="js/owl.carousel.js"></script>
      <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
   

</body>
</html>