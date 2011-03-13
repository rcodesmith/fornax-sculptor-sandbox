<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
<p>
This sample application is developed with <a href="http://fornax-platform.org/cp/x/aAQ">Sculptor</a> on Google App Engine.
</p>
<p>
It illustrates interaction between <a href="http://avega-customer.appspot.com">customer</a> and 
<a href="http://avega-supplier.appspot.com">supplier</a> parties. A customer enters an inquiry, 
which the suppliers may answer to with an offer. It can be many 
<a href="http://avega-customer.appspot.com">customer applications</a> and many 
<a href="http://avega-supplier.appspot.com">supplier applications</a>. We have only deployed 
one of each so far. The applications communicate with a simple RESTful HTTP protocol.  
</p>
<p>
The interaction may look like this:
</p>
<p>
<img border="0" src="/images/customer_supplier.png" />
</p>
<table border="1" cellpadding="5" cellspacing="0" >
	<thead>
		<th>Customer</th>
		<th>Supplier</th>
	</thead>
	<tr>
		<td>1. A customer <a href="/rest/inquiry/form.html">enters an inquiry</a>, which is stored in the customer app.
		</td>
		<td>&nbsp;
		</td>
	</tr>
	<tr>
		<td>2. The inquiries are sent to the configured
			supplier applications in background tasks.
		</td>
		<td>&nbsp;
		</td>
	</tr>
	<tr>
		<td>&nbsp;
		</td>
		<td>3. Supplier app receives the inquiry and stores it. It also sends email
			to the configured salesmen.
		</td>
	</tr>
	<tr>
		<td>&nbsp;
		</td>
		<td>4. A salesman enters an offer in response to the inquiry. The offer is stored
			and sent back to the customer app.
		</td>
	</tr>
	<tr>
		<td>5. Customer app receives the offer and stores it. It also sends email to
			the customer who entered the original inquiry. The loop is closed.
		</td>
		<td>&nbsp;
		</td>
	</tr>
</table>
    
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
