package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Blob;
import java.sql.ResultSet;
import controller.DB;
import beans.localpost;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Colorlib Villa</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Mukta+Mahee:200,300,400|Playfair+Display:400,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Theme Style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <header class=\"site-header\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-4 site-logo\" data-aos=\"fade\"><a href=\"welcome.jsp\"><em>Visit Sri Lanka</em></a></div>\n");
      out.write("          <div class=\"col-8\">\n");
      out.write("\n");
      out.write("            <div class=\"site-menu-toggle js-site-menu-toggle\"  data-aos=\"fade\">\n");
      out.write("              <span></span>\n");
      out.write("              <span></span>\n");
      out.write("              <span></span>\n");
      out.write("            </div>\n");
      out.write("            <!-- END menu-toggle -->\n");
      out.write("\n");
      out.write("            <div class=\"site-navbar js-site-navbar\">\n");
      out.write("              <nav role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <div class=\"row full-height align-items-center\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                      <ul class=\"list-unstyled menu\">\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 extra-info\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mb-5\">\n");
      out.write("                          <h3>Contact Info</h3>\n");
      out.write("                          <p>309 Dampe,Pitipana Rd <br> Hoamagama</p>\n");
      out.write("                          <p>webadmin@gmail.com</p>\n");
      out.write("                          <p>+94777777777</p>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <h3>Connect With Us</h3>\n");
      out.write("                          <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\">Twitter</a></li>\n");
      out.write("                            <li><a href=\"#\">Facebook</a></li>\n");
      out.write("                            <li><a href=\"#\">Instagram</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </nav>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- END head -->\n");
      out.write("\n");
      out.write("    <section class=\"site-hero overlay\" style=\"background-image: url(img/hero_1.jpg)\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row site-hero-inner justify-content-center align-items-center\">\n");
      out.write("          <div class=\"col-md-10 text-center\">\n");
      out.write("            <h1 class=\"heading\" data-aos=\"fade-up\">Welcome to <em>Sri Lanka</em></h1>\n");
      out.write("            <p class=\"sub-heading mb-5\" data-aos=\"fade-up\" data-aos-delay=\"100\">Discover our Local hotel &amp; restaurant </p>\n");
      out.write("            <p data-aos=\"fade-up\" data-aos-delay=\"100\"><a href=\"signup.jsp\" class=\"btn uppercase btn-primary mr-md-2 mr-0 mb-3 d-sm-inline d-block\">Sign Up</a> <a href=\"signin.jsp\" class=\"btn uppercase btn-outline-light d-sm-inline d-block\">Sign in</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- <a href=\"#\" class=\"scroll-down\">Scroll Down</a> -->\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- END section -->\n");
      out.write("\n");
      out.write("    <section class=\"section visit-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <h2 class=\"heading\" data-aos=\"fade-right\">You Can Visit</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("        <div class=\"row\">\n");
      out.write("          ");

            ArrayList<localpost> posts = (ArrayList<localpost>) request.getAttribute("progects");
            for (localpost post : posts) {
                                            
      out.write("\n");
      out.write("               <div class=\"col-lg-3 col-md-6 visit mb-3\" data-aos=\"fade-right\">\n");
      out.write("                    <a href=\"#\"><img src=\"resources/");
      out.print( post.getImage());
      out.write("\" height=\"250;\" width=\"250\" style=\"border-radius: 8px;\" /></a>\n");
      out.write("                    <h3><a href=\"#\">");
      out.print(post.getTitle());
      out.write("</a></h3>\n");
      out.write("                    <div class=\"reviews-star float-left\">\n");
      out.write("                     ");
      out.print(post.getDescription());
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"reviews-count float-right\">\n");
      out.write("                      3,239 reviews\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("               ");
 } 
      out.write(" \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- END section -->\n");
      out.write("\n");
      out.write("    <section class=\"section slider-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center text-center mb-5\">\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <h2 class=\"heading\" data-aos=\"fade-up\">A gorgeous place to enjoy your life.</h2>\n");
      out.write("            <p class=\"lead\" data-aos=\"fade-up\" data-aos-delay=\"100\">Set in the Indian Ocean in South Asia, the tropical island nation of Sri Lanka has a history dating back to the birth of time.  It is a place where the original soul of Buddhism still flourishes and where nature’s beauty remains abundant and unspoilt.Few places in the world can offer the traveller such a remarkable combination of stunning landscapes, pristine beaches, captivating cultural heritage and unique experiences within such a compact location.  Within a mere area of  65,610 kilometres lie 8 UNESCO World Heritage Sites, 1,330 kilometres of coastline - much of it pristine beach - 15 national parks showcasing an abundance of wildlife, nearly 500,000 acres of lush tea estates, 250 acres of botanical gardens, 350 waterfalls, 25,000 water bodies, to a culture that extends back to over 2,500 years. </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"home-slider major-caousel owl-carousel mb-5\" data-aos=\"fade-up\" data-aos-delay=\"10\">\n");
      out.write("              <div class=\"slider-item\">\n");
      out.write("                <img src=\"img/img- (1).jpg\" alt=\"Image placeholder\" class=\"img-fluid\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider-item\">\n");
      out.write("                <img src=\"img/img- (2).jpg\" alt=\"Image placeholder\" class=\"img-fluid\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider-item\">\n");
      out.write("                <img src=\"img/img- (3).jpg\" alt=\"Image placeholder\" class=\"img-fluid\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider-item\">\n");
      out.write("                <img src=\"img/img- (5).jpg\" alt=\"Image placeholder\" class=\"img-fluid\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider-item\">\n");
      out.write("                <img src=\"img/img- (69).jpg\" alt=\"Image placeholder\" class=\"img-fluid\">\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <!-- END slider -->\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-12 text-center\"><a href=\"#\" class=\"\">View More Photos</a></div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- END section -->\n");
      out.write("    \n");
      out.write("    <section class=\"section blog-post-entry bg-pattern\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center text-center mb-5\">\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <h2 class=\"heading\" data-aos=\"fade-up\">Recent Blog Post</h2>\n");
      out.write("            <p class=\"lead\" data-aos=\"fade-up\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. In dolor, iusto doloremque quo odio repudiandae sunt eveniet? Enim facilis laborum voluptate id porro, culpa maiores quis, blanditiis laboriosam alias. Sed.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-4 col-md-6 col-sm-6 col-12 post\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n");
      out.write("\n");
      out.write("            <div class=\"media media-custom d-block mb-4\">\n");
      out.write("              <a href=\"#\" class=\"mb-4 d-block\"><img src=\"img/img_1.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <span class=\"meta-post\">February 26, 2018</span>\n");
      out.write("                <h2 class=\"mt-0 mb-3\"><a href=\"#\">Five Reasons to Stay at Villa Resort</a></h2>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4 col-md-6 col-sm-6 col-12 post\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("            <div class=\"media media-custom d-block mb-4\">\n");
      out.write("              <a href=\"#\" class=\"mb-4 d-block\"><img src=\"img/img_2.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <span class=\"meta-post\">February 26, 2018</span>\n");
      out.write("                <h2 class=\"mt-0 mb-3\"><a href=\"#\">Five Reasons to Stay at Villa Resort</a></h2>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4 col-md-6 col-sm-6 col-12 post\" data-aos=\"fade-up\" data-aos-delay=\"300\">\n");
      out.write("            <div class=\"media media-custom d-block mb-4\">\n");
      out.write("              <a href=\"#\" class=\"mb-4 d-block\"><img src=\"img/img_3.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <span class=\"meta-post\">February 26, 2018</span>\n");
      out.write("                <h2 class=\"mt-0 mb-3\"><a href=\"#\">Five Reasons to Stay at Villa Resort</a></h2>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- END section -->\n");
      out.write("    <footer class=\"section footer-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row mb-4\">\n");
      out.write("          <div class=\"col-md-3 mb-5\">\n");
      out.write("            <ul class=\"list-unstyled link\">\n");
      out.write("              <li><a href=\"#\">About Us</a></li>\n");
      out.write("              <li><a href=\"#\">Terms &amp; Conditions</a></li>\n");
      out.write("              <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("              <li><a href=\"#\">Help</a></li>\n");
      out.write("             <li><a href=\"#\">Rooms</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 mb-5\">\n");
      out.write("            <ul class=\"list-unstyled link\">\n");
      out.write("              <li><a href=\"#\">Our Location</a></li>\n");
      out.write("              <li><a href=\"#\">The Hosts</a></li>\n");
      out.write("              <li><a href=\"#\">About</a></li>\n");
      out.write("              <li><a href=\"#\">Contact</a></li>\n");
      out.write("              <li><a href=\"#\">Restaurant</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 mb-5 pr-md-5 contact-info\">\n");
      out.write("            <p><span class=\"d-block\">Address:</span> <span> 309 Dampe,Pitipana Rd<br>Homagama</span></p>\n");
      out.write("            <p><span class=\"d-block\">Phone:</span> <span> +9477777777</span></p>\n");
      out.write("            <p><span class=\"d-block\">Email:</span> <span> webadmin@gmail.com</span></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 mb-5\">\n");
      out.write("            <p>Sign up for our newsletter</p>\n");
      out.write("            <form action=\"#\" class=\"footer-newsletter\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"email\" class=\"form-control\" placeholder=\"Your email...\">\n");
      out.write("                <button type=\"submit\" class=\"btn\"><span class=\"fa fa-paper-plane\"></span></button>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row bordertop pt-5\">\n");
      out.write("          <p class=\"col-md-6 text-left\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("            \n");
      out.write("          <p class=\"col-md-6 text-right social\">\n");
      out.write("            <a href=\"#\"><span class=\"fa fa-tripadvisor\"></span></a>\n");
      out.write("            <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("            <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <!-- <script src=\"js/jquery.waypoints.min.js\"></script> -->\n");
      out.write("    <script src=\"js/aos.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
