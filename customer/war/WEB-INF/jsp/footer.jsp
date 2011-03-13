<br/>
	  <table class="footer">
	    <tr>
	      <td><a href="<c:url value="/rest/front" />">Home</a></td>
	      <td><a href="<c:url value="/rest/inquiry/form.html" />">New Inquiry</a></td>
	      <td><a href="<c:url value="/rest/inquiry" />">All Inquiries</a></td>
	      <td><a href="<c:url value="/rest/supplier/form.html" />">New Supplier</a></td>
	    </tr>
	  </table>
	  <table class="footer">
        <tr>
	      <td colspan="2">
<%
	com.google.appengine.api.users.UserService userService = com.google.appengine.api.users.UserServiceFactory.getUserService();
	com.google.appengine.api.users.User user = userService.getCurrentUser();
    if (user != null) {
%>
<p>Hello, <%= user.getNickname() %>! (You can
<a href="<%= userService.createLogoutURL("/") %>">sign out</a>.)</p>
<%
    } else {
%>
<p>Hello!
<a href="<%= userService.createLoginURL("/") %>">Sign in.</a></p>
<%
    }
%>
          </td>
        </tr>
        <tr>
	      <td><a href="http://fornax-platform.org/cp/x/aAQ">
	      	<img src="<c:url value="/images/sculptor-logo.jpg" />" alt="Developed with Sculptor" border="0" /></a></td>
	      <td><a href="http://code.google.com/appengine/">
          	<img src="http://code.google.com/appengine/images/appengine-silver-120x30.gif" alt="Powered by Google App Engine" border="0" /></a></td>
	    </tr>
	  </table>

	</div>
  </div>
</body>

</html>
