<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
    <c:if test="${not empty result}">
    <table>
        <thead>
            <th>ID</th>
            <th>Message</th>
            <th>Customer</th>
            <th>Created</th>
            <th> </th>
        </thead>
	    <c:forEach items="${result}" var="inquiry">
            <tr>
                <td>
                    <a href="<c:url value="/rest/inquiry/${inquiry.id.id}" />">${inquiry.id.id}</a>
                </td>
                <td>
                    ${inquiry.message}
                </td>
                <td>
                    ${inquiry.customer}
                </td>
                <td>
                    ${inquiry.createdDate}
                </td>
                <td>
                <c:if test="${empty inquiry.offer.fee}">
                    <a href="/rest/inquiry/${inquiry.id.id}/offer/form">Create offer for inquiry</a>
                </c:if> 
                </td>
            </tr>
	            
	    </c:forEach>
        </table>
    </c:if>
    <c:if test="${empty result}">No Request found with this id.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
