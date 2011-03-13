<html>
<body>
<h2>Hello World!</h2>

<jsp:useBean id="service" class="org.fornax.cartridges.sculptor.examples.helloworld.milkyway.serviceproxy.PlanetServiceProxy" />

<%= service.sayHello(null, request.getParameter("planetName")) %>

</body>
</html>
