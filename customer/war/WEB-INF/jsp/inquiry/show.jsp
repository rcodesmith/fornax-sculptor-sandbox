<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
    <c:if test="${not empty inquiry}">
        <div id="inquiry_message">
            <label for="_message">Message:</label>
            <div class="box" id="_message">${inquiry.message}</div>
        </div>
        <br/>
        <c:if test="${showSend}">
        	<form:form action="/rest/inquiry/sendInquiry" method="POST" >
        		<input type="hidden" name="inquiryId" value="${inquiry.id.id}"/>
        		<input id="send" type="submit" value="Send to suppliers"/>
        	</form:form>
        </c:if>
    </c:if>
    <c:if test="${empty inquiry}">No Request found with this id.</c:if>
    
    <c:if test="${not empty offers && not empty inquiry}">
    <p>Offers:</p>
    <ul>
    <c:forEach items="${offers}" var="each">
    	<li><a href="<c:url value="/rest/inquiry/${inquiry.id.id}/offer/${each.id.id}" />">${each.supplierName}</a></li>
    </c:forEach>
    </ul>
    </c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
