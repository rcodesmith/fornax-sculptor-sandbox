<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
    <c:if test="${not empty result}">
    <table>
    	<thead>
    		<th>ID</th>
    		<th>Message</th>
    		<th>Created</th>
    		<th>Sent to suppliers</th>
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
    				${inquiry.createdDate}
    			</td>
    			<td>
    				${inquiry.sendDone}
    			</td>
    		</tr>
    	</c:forEach>
    </table>
    </c:if>
    <c:if test="${empty result}">There are no inquiries yet.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
