
<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>

<div>
<a href="<c:url value="/rest/salesman/form" />">New Salesman</a>
</div>

<div>
    <c:if test="${not empty result}">
    <table>
    	<thead>
	    	<th>Id</th>
    		<th>Name</th>
    		<th>EmailAddress</th>
    		<th/>
    		<th/>
    		<th/>
    	</thead>
    	<c:forEach items="${result}" var="each">
    		<tr>
    			<td>
    				<a href="<c:url value="/rest/salesman/${each.id.id}" />">${each.id.id}</a>
    			</td>
    			<td>
    				${each.name}
    			</td>
    			<td>
    				${each.emailAddress}
    			</td>
    			<td>
    				<a href="<c:url value="/rest/salesman/${each.id.id}" />">Show</a>
                </td>
    			<td>
    				<a href="<c:url value="/rest/salesman/${each.id.id}/form" />">Edit</a>
    			</td>
    			<td>
                    <form:form action="/rest/salesman/${each.id.id}" method="DELETE">
                    	<input id="delete" type="submit" value="Delete"/>
                    </form:form>
                </td>
    		</tr>
    	</c:forEach>
    </table>
    </c:if>
    <c:if test="${empty result}"><p>There are no Salesmans yet.</p></c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>

	